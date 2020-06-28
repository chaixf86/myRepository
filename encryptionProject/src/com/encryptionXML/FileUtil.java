/**
 * @author Tiger , Create date Nov 18, 2009 
 */
package com.encryptionXML;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class FileUtil {
	protected static Log log = LogFactory.getLog(new FileUtil().getClass());

	public static Document getXmlDocumentByXmlPath(String xmlPath) {
		InputStream is = FileUtil.getInputStreamByRelativePath(xmlPath);
		Document document = null;
		SAXReader reader = new SAXReader();
		try {
			document = reader.read(is);
		} catch (DocumentException e) {
			log.error(e.getMessage());
			e.printStackTrace();
		} finally {
			FileUtil.closeInputStream(is);
		}

		return document;
	}

	public static InputStream getInputStream(String filePath) {
		return new FileUtil().getClass().getResourceAsStream(filePath);
	}

	public static InputStream getInputStreamByRelativePath(String relativePath) {
		String filePath = Constants.appAbsolutepath + relativePath;
		File file = new File(filePath);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			log.error(e.getMessage());
			e.printStackTrace();
		}
		return fis;
	}

	/**
	 * 判断文件父文件夹是否存在，如果不存在则创建路径
	 * 
	 * @param file
	 *            要判断的文件
	 */
	public static void mkParentDirs(File file) {
		File parent = file.getParentFile();
		if (!parent.exists()) {
			parent.mkdirs();
		}
	}

	public static void closeInputStream(InputStream is) {
		if (is != null) {
			try {
				is.close();
			} catch (IOException e) {
				log.error(e.getMessage());
				e.printStackTrace();
			}
		}
	}

	/**
	 * 将文件路径中的分隔符替换成系统合法的
	 * 
	 * @param s
	 *            原始路径
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static String ConvertPath(String s) {
		StringBuffer sbuf = new StringBuffer();
		int j = 0, k = 0;

		while (k < s.length()) {
			j = s.indexOf("\\", k);
			if (j < 0) {
				sbuf.append(s.substring(k, s.length()));
				k = s.length();
			} else {
				sbuf.append(s.substring(k, j));
				sbuf.append("/");
				k = j + "\\".length();
			}
		}

		return sbuf.toString();
	}

	private static StringBuffer readFileToString(File source) throws Exception {
		if (source != null && source.exists() && source.canRead()) {
			StringBuffer document = new StringBuffer();
			BufferedReader reader = null;
			InputStreamReader isReader = null;
			FileInputStream fiStream = null;

			try {
				fiStream = new FileInputStream(source);
				isReader = new InputStreamReader(fiStream, "ascii");
				reader = new BufferedReader(isReader);
				String tmp = null;
				while ((tmp = reader.readLine()) != null) {
					document.append(tmp);
				}
			} catch (Exception e) {
				throw e;
			} finally {
				if (reader != null) {
					reader.close();
				}
				if (isReader != null) {
					isReader.close();
				}
				if (fiStream != null) {
					fiStream.close();
				}
			}

			return document;
		}

		return null;
	}

	private static void writeFile(byte[] source, File outF) throws Exception {
		if (source == null)
			return;
		// 判断是否存在文件夹,并生成
		File parent = outF.getParentFile();
		if (!parent.exists()) {
			parent.mkdirs();
		}

		FileOutputStream out = null;
		try {
			out = new FileOutputStream(outF);
			out.write(source, 0, source.length);
			out.flush();
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
			}
		}
	}

	/**
	 * aes文件解密
	 * 
	 * @param sSrc
	 * @param sKey
	 * @param sFile
	 * @throws Exception
	 */
	public static boolean fileDecrypt(String sKey, String sIv, String sFile,
			OutputStream os) throws Exception {
		boolean resule = true;

		try {
			// 判断Key是否正确
			if (sKey == null) {
				System.out.print("Key为空null");
				return false;
			}
			// 判断Key是否为16位
			if (sKey.length() != 16) {
				System.out.print("Key长度不是16位");
				return false;
			}
			// 判断sIv是否正确
			if (sIv == null) {
				System.out.print("sIv为空null");
				return false;
			}
			// 判断sIv是否为16位
			if (sIv.length() != 16) {
				System.out.print("sIv长度不是16位");
				return false;
			}
			if (sFile == null || (sFile != null && "".equals(sFile.trim()))) {
				System.out.print("文件名不能为空");
				return false;
			}

			byte[] raw = sKey.getBytes("ASCII");
			SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			IvParameterSpec iv = new IvParameterSpec(sIv.getBytes());
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			File file = new File(ConvertPath(sFile));
			if (file != null && file.exists() && file.canRead()) {
				StringBuffer base64Encrypted = readFileToString(file);

				if (base64Encrypted != null) {
					byte[] encrypted1 = new BASE64Decoder()
							.decodeBuffer(base64Encrypted.toString());// 先用base64解密
					// 返回被加密的文件

					if (os != null) {
						os.write(cipher
								.update(encrypted1, 0, encrypted1.length));
						os.write(cipher.doFinal());
						os.flush();
					}
				}
			}
		} catch (Exception ex) {
			resule = false;
			throw ex;
		}

		return resule;
	}

	/**
	 * aes文件解密
	 * 
	 * @param sSrc
	 * @param sKey
	 * @param sFile
	 * @throws Exception
	 */
	public static boolean fileDecrypt(String sKey, String sIv, String sFile,
			String toFile) throws Exception {
		boolean resule = true;

		try {
			// 判断Key是否正确
			if (sKey == null) {
				System.out.print("Key为空null");
				return false;
			}
			// 判断Key是否为16位
			if (sKey.length() != 16) {
				System.out.print("Key长度不是16位");
				return false;
			}
			// 判断sIv是否正确
			if (sIv == null) {
				System.out.print("sIv为空null");
				return false;
			}
			// 判断sIv是否为16位
			if (sIv.length() != 16) {
				System.out.print("sIv长度不是16位");
				return false;
			}
			if (sFile == null || (sFile != null && "".equals(sFile.trim()))) {
				System.out.print("文件名不能为空");
				return false;
			}

			byte[] raw = sKey.getBytes("ASCII");
			SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			IvParameterSpec iv = new IvParameterSpec(sIv.getBytes());
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			File file = new File(ConvertPath(sFile));
			if (file != null && file.exists() && file.canRead()) {
				StringBuffer base64Encrypted = readFileToString(file);

				if (base64Encrypted != null) {
					byte[] encrypted1 = new BASE64Decoder()
							.decodeBuffer(base64Encrypted.toString());// 先用base64解密
					// 返回被加密的文件

					byte[] encrypted = cipher.doFinal(encrypted1);

					writeFile(encrypted, new File(ConvertPath(toFile)));

				}

			}
		} catch (Exception ex) {
			resule = false;
			throw ex;
		}

		return resule;
	}
	
	/**
	 * aes文件加密
	 * 
	 * @param sKey
	 * @param sourceFile
	 * @param toFile
	 * @return
	 * @throws Exception
	 */
	public static Boolean Encrypt(String sKey, String sIv, String sourceFile,
			String toFile) throws Exception {
		if (sKey == null) {
			System.out.print("Key为空null");
			return false;
		}
		// 判断Key是否为16位
		if (sKey.length() != 16) {
			System.out.print("Key长度不是16位");
			return false;
		}
		// 判断sIv是否正确
		if (sIv == null) {
			System.out.print("sIv为空null");
			return false;
		}
		// 判断sIv是否为16位
		if (sIv.length() != 16) {
			System.out.print("sIv长度不是16位");
			return false;
		}
		if (sourceFile == null
				|| (sourceFile != null && "".equals(sourceFile.trim()))) {
			System.out.print("源文件文件名不能为空");
			return false;
		}
		if (toFile == null || (toFile != null && "".equals(toFile.trim()))) {
			System.out.print("目标文件文件名不能为空");
			return false;
		}

		byte[] raw = sKey.getBytes();
		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");// "算法/模式/补码方式"
		IvParameterSpec iv = new IvParameterSpec(sIv.getBytes());// 使用CBC模式，需要一个向量iv，可增加加密算法的强度
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
		// 读文件
		File file = new File(ConvertPath(sourceFile)); // 创建文件实例，设置路径为方法参数
		if (file != null && file.exists() && file.canRead()) {
			byte[] buffer = readFileToBytes(file);

			if (buffer != null) {
				byte[] encrypted = cipher.doFinal(buffer);

				String base64Encrypted = new BASE64Encoder().encode(encrypted);// 此处使用BASE64做转码功能，同时能起到2次加密的作用。

				writeFile(base64Encrypted.getBytes(), new File(
						ConvertPath(toFile)));
			}

			return true;
		}

		return false;
	}

	private static byte[] readFileToBytes(File source) throws IOException {
		if (source != null && source.exists() && source.canRead()) {
			byte[] buffer = new byte[(int) source.length()];
			FileInputStream fiStream = null;

			try {
				fiStream = new FileInputStream(source);
				fiStream.read(buffer);
			} catch (FileNotFoundException e) {
				throw e;
			} catch (IOException e) {
				throw e;
			} finally {
				if (fiStream != null) {
					try {
						fiStream.close();
					} catch (IOException e) {
					}
				}
			}

			return buffer;
		}

		return null;
	}

	public static String trimLastFileSeparator(String filePath) {
		if (filePath != null && !"".equals(filePath.trim())) {
			while (filePath.trim().endsWith("/")) {
				filePath = filePath.substring(0, filePath.lastIndexOf("/"));
			}
		}

		return filePath;
	}

	/**
	 * 递归获取目录下所有文件夹和子文件夹
	 * 
	 * @param dir目录路径
	 * @param getDeep从第几层开始获取
	 * @param nowDeep当前层数
	 * @return
	 */
	public static List<File> getRecursionDirListIn(File dir) {
		List<File> dirList = new ArrayList();
		if (dir.exists() && dir.canRead() && dir.isDirectory()) {
			File[] child = dir.listFiles();
			Arrays.sort(child, new CompratorByLastModified());
			for (File file : child) {
				String name = file.getPath().substring(
						file.getPath().lastIndexOf(".") + 1,
						file.getPath().length());
				if (name.equals("zip")) {
					dirList.add(file);
				}
			}
		}
		return dirList;
	}

	public static void main(String[] arges) {
		try {
			//加密
//			FileUtil.Encrypt("678ILoveReamy789", "ILoveReamy123456","E:/ceshi/a1.xml","E:/ceshi/a2.xml");
			//解密
			FileUtil.fileDecrypt("678ILoveReamy789", "ILoveReamy123456","E:/ceshi/a2.xml","E:/ceshi/a3.xml");
//			fileDecrypt("abc1111111111111", "abc1111111111111",
//					"D:/ceshi/ofd/a.xml",
//					"D:/ceshi/ofd/a1.xml");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static class CompratorByLastModified implements Comparator<File> {	//安照文件修改顺序排序
		public int compare(File f1, File f2) {
			long diff = f2.lastModified() - f1.lastModified();
			if (diff > 0)
				return 1;
			else if (diff == 0)
				return 0;
			else
				return -1;
		}

		public boolean equals(Object obj) {
			return true;
		}
	}
}

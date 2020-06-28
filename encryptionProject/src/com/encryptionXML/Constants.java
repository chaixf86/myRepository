/**
  * @author Tiger , Create date Nov 19, 2009 
  */
package com.encryptionXML;

public class Constants {

	public static final int OP_SUCCESS = 1;//操作成功,存在
	public static final int OP_FAILURE = 0;//操作失败,不存在
	
	public static final String SIGN_KIND_WY = "wy";//网页签批
	public static final String SIGN_KIND_PBD = "pbd";//批办单签批
	
	public static String appAbsolutepath = "";//应用绝对路径
//	public static String appAbsolutepath = "F:\\jdls\\WebRoot\\UploadImages\\";//应用绝对路径
	public static final String UTF8_ENCODING = "UTF-8";
	public static final String GBK_ENCODING = "GBK";

	public static final String USER_SIGN_PATH = "image/user/";//用户信息图片PATH
	public static final String SIGN_H_PATH = "image/sign/h/";//用户历史签批图片PATH
	public static final String SIGN_O_PATH = "image/sign/o/";//用户签批原始图片PATH
	public static final String TEMP_FOLDER = "temp/";//临时文件存放位置
	
	public static final String DOC_PATH = "file/doc/";//上传word PATH
	public static final String PDF_PATH = "file/pdf/";//生成的PDF PATH
	public static final String WDL_PATH = "file/wdl/";//上传WDL PATH
	public static final String TIF_PATH = "file/tif/";//生成TIF PATH
	
	public static final String SIGN_DIRECT_SECRETARY = "secretary";//签批去向-秘书处
	public static final String SIGN_DIRECT_LEADER = "leader";//签批去向-领导
	
	public static final String FILE_EXTEND_DOC = "doc";//WORD后缀名
	public static final String FILE_EXTEND_PDF = "pdf";//PDF后缀名
	public static final String FILE_EXTEND_WDL = "wdl";//WDL后缀名
	public static final String FILE_EXTEND_TIF = "tif";//TIF后缀名
	public static final String FILE_EXTEND_JPG = "jpg";//JPG后缀名
	
	public static final String DEFAULT_XML_CONTENT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<his/>";
	
	public static final String DEFAULT_XML_FOLDER = "xml/";
	
	public static final String DEFAULT_DATE_TIME_TYPE = "yyyy-MM-dd HH:mm:ss";
	
	
	public static final String SHDAJOA_PATH="d:\\leaderPic\\";
//	public static String getAppAbsolutePath(){
//		String classPath = Constants.class.getResource("/").getFile();
//		return classPath.substring(1, classPath.indexOf("WEB-INF"));
//	}
	
}

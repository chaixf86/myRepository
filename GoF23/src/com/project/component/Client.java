package com.project.component;

public class Client {
	public static void main(String[] args) {
		Folder folderRoot,folder2;
		AbstractFile f1,f2,f3;
		
		folderRoot = new Folder("�ҵ��ղ�");
		folder2 = new Folder("С��Ƶ");
		
		f1 = new TextFile("xx�ı�.txt");
		f2 = new ImageFile("xxͼƬ.jpg");
		
		folderRoot.add(f1);
		folderRoot.add(f2);
		folderRoot.add(folder2);
		
		f3 = new VideoFile("xx��Ƶ.mp3");
		folder2.add(f3);
		
		folderRoot.killVirus();
	}
}

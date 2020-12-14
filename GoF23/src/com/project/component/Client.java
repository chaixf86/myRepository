package com.project.component;

public class Client {
	public static void main(String[] args) {
		Folder folderRoot,folder2;
		AbstractFile f1,f2,f3;
		
		folderRoot = new Folder("我的收藏");
		folder2 = new Folder("小视频");
		
		f1 = new TextFile("xx文本.txt");
		f2 = new ImageFile("xx图片.jpg");
		
		folderRoot.add(f1);
		folderRoot.add(f2);
		folderRoot.add(folder2);
		
		f3 = new VideoFile("xx视频.mp3");
		folder2.add(f3);
		
		folderRoot.killVirus();
	}
}

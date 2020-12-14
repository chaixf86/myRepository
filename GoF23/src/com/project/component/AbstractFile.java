package com.project.component;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
	void killVirus();
}

class ImageFile implements AbstractFile{
	private String name;
	public ImageFile(String name) {
		super();
		this.name = name;
	}
	@Override
	public void killVirus() {
		System.out.println("--ͼ���ļ���"+name+"���в�ɱ");
	}
}

class TextFile implements AbstractFile{
	private String name;
	public TextFile(String name) {
		super();
		this.name = name;
	}
	@Override
	public void killVirus() {
		System.out.println("--�ı��ļ���"+name+"���в�ɱ");
	}
}

class VideoFile implements AbstractFile{
	private String name;
	public VideoFile(String name) {
		super();
		this.name = name;
	}
	@Override
	public void killVirus() {
		System.out.println("--��Ƶ�ļ���"+name+"���в�ɱ");
	}
}


class Folder implements AbstractFile {
	private String name ;
	private List<AbstractFile> fileList = new ArrayList<>();
	public Folder(String name) {
		super();
		this.name = name;
	}
	
	public void add(AbstractFile file) {
		fileList.add(file);
	}
	
	public void remove(AbstractFile file) {
		fileList.remove(file);
	}
	
	public AbstractFile getChild(int index) {
		return fileList.get(index);
	}
	
	@Override
	public void killVirus() {
		System.out.println("--�ļ��У�"+name+"���в�ɱ");
		for(AbstractFile file : fileList) {
			file.killVirus();
		}
	}
	
}
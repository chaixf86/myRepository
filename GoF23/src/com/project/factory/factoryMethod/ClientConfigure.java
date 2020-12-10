package com.project.factory.factoryMethod;

public class ClientConfigure {
	public static String AUDI = "AudiFactory";
	public static String DABEN = "DabenFactory";
	private final static String packagePath = "com.project.factory.factoryMethod.";
	
	//新加的Byd只需要加个配置
	public static String BYD = "BydFactory";
	
	
	public static Object getObject(String carType){
		try {
			String className = packagePath + carType;
			Class<?> clazz = Class.forName(className);
			return clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

package com.project.factory.abstractFactory;

public class ClientConfigure {
	public static String LUXURYCAR = "LuxuryCarFactory";
	public static String LOWCAR = "LowCarFactory";
	private final static String packagePath = "com.project.factory.abstractFactory.";
	
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

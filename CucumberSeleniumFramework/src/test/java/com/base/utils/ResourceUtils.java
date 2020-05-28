package com.base.utils;

public class ResourceUtils {


	public static String getResourcePath(String resourcePath) {
		String path = getBasePath()+resourcePath;
		return path;
	}
	
	public static String getBasePath() {
		String path = ResourceUtils.class.getClassLoader().getResource(".").getPath();
		return path;
	}
}

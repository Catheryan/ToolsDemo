package com.yzh.android.tools;

import java.io.InputStream;
import java.util.Properties;

import android.content.Context;

import com.yzh.android.MApplication;

/**
 * 配置文件工具类
 * 
 * 
 */
public final class ToolProperties extends Properties {

	private static Properties property = new Properties();

	public static String readAssetsProp(String fileName, String key) {
		String value = "";
		try {
			InputStream in = MApplication.gainContext().getAssets().open(fileName);
			property.load(in);
			value = property.getProperty(key);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		return value;
	}
	
	public static String readAssetsProp(Context context,String fileName, String key) {
		String value = "";
		try {
			InputStream in = context.getAssets().open(fileName);
			property.load(in);
			value = property.getProperty(key);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		return value;
	}

	public static String readAssetsProp(String fileName, String key,String defaultValue) {
		String value = "";
		try {
			InputStream in = MApplication.gainContext().getAssets().open(fileName);
			property.load(in);
			value = property.getProperty(key, defaultValue);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		return value;
	}
	
	public static String readAssetsProp(Context context,String fileName, String key,String defaultValue) {
		String value = "";
		try {
			InputStream in = context.getAssets().open(fileName);
			property.load(in);
			value = property.getProperty(key, defaultValue);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		return value;
	}
}

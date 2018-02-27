package com.mk.smook.transformer;

public class SmookXmlTransformer {
	
	public <T> T transform(Class<T> clazz,String input) throws InstantiationException, IllegalAccessException {
		return clazz.newInstance();
	}
}

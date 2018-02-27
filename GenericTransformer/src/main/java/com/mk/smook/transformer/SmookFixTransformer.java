package com.mk.smook.transformer;

public class SmookFixTransformer {
	
	public <T> T transform(Class<T> clazz,String input) throws InstantiationException, IllegalAccessException {
		return clazz.newInstance();
	}
}

package com.mk.smook.transformer;

public abstract class SmookTransformer {
	public abstract <T> T transform(Class<T> clazz,String input) throws InstantiationException, IllegalAccessException;
}

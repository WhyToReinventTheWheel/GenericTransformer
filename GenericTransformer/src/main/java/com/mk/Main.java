package com.mk;

import com.mk.smook.transformer.SmookTransformer;

public class Main {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		SmookTransformer obj = new SmookTransformer();
		Object str= obj.transform(String.class,"Hello");
		System.out.println("Test:" + str.getClass());
	}

}

package com.mk.message.transformer;

import java.util.List;

import com.mk.smook.transformer.SmookTransformer;

class Request{
	
}

public abstract class MessageTransformer {
	private String securityType;
	private SmookTransformer smookTransformer;
	
	public abstract Request proccessData(Object data);
	
	public Request transformer(String input) {
		Object result = null;
		try {
			result = smookTransformer.transform(securityType.getClass(), input);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		Request request= proccessData(result);
		return request;
	}
}

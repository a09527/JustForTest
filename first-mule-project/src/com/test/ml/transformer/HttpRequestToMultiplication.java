package com.test.ml.transformer;


import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import org.mule.transformer.types.DataTypeFactory;

public class HttpRequestToMultiplication extends AbstractMessageTransformer{
	
	public HttpRequestToMultiplication(){
		super();
		registerSourceType(DataTypeFactory.OBJECT);
        setReturnDataType(DataTypeFactory.create(Integer.class));
	}
	@Override
	public Integer transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		Object obj = message.getInboundProperty("message");
		System.out.println(obj);
		return Integer.parseInt((String)obj);
	}

}

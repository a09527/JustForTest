package com.test.ml.transformer;

import java.util.Map;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
public class HttpRequest extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
	      Map<String,Object> num=(Map<String,Object>)message.getPayload();
	      
		String number=num.get("phrase").toString();
		if(number.matches("\\d+")){
			
			return Integer.parseInt(number);			
		}else{
		   	return number;
		}
		
	}

}

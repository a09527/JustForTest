package com.test.ml.multiplication;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class TextResponse extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		String  str="";
		if(src instanceof java.lang.Integer){
			str+=src;
		}else{
			System.out.println("wwwwwwwwww"+src);
			str+="输入内容必须为数字";
		}
		return str;
	}

}
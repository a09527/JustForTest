package com.test.ml.multiplication;

public class MultiplicationServiceImpl implements MultiplicationService {

	@Override
	public Integer doProcess(Integer i) {
		System.out.println(i);
		return i*100;
	}
	public String doProcess(String i){
		return i;
	}

}

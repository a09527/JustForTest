package com.test.ml.multiplication;

public interface MultiplicationService {
	static final String URL = "http://0.0.0.0:8777/services/catalog";
	public Integer doProcess(Integer i);
}

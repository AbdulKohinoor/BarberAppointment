package com.cj.exception;

public class No_Data_Found extends RuntimeException {


	  String msg;
	public No_Data_Found(String msg){
		super(msg);
		this.msg=msg;
	}

}

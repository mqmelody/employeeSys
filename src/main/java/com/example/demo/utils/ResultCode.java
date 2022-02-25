package com.example.demo.utils;

public enum ResultCode {
	
	//成功状态码
	SUCCESS(1,"成功"),
	
	//失败
	FAIL(0,"失败"),
	
	

	;
	
	private Integer code;
	private String message;
	
	private ResultCode(Integer code,String message) {
		this.code=code;
		this.message=message;
	}
	
	public Integer code() {
		return this.code;
	}
	
	public String message() {
		return this.message;
	}

}

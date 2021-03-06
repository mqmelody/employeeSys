package com.example.demo.utils;

import java.io.Serializable;

public class Result implements Serializable{
	
	private Integer code;
	private String message;
	private Object data;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Result() {
		super();
	}
	public Result(ResultCode resultCode,Object data) {
		this.code=resultCode.code();
		this.message=resultCode.message();
		this.data=data;
	}
	
	public void setResultCode(ResultCode resultCode) {
		this.code=resultCode.code();
		this.message=resultCode.message();
	}
	
	//返回成功，无消息体
	public static Result success() {
		Result result=new Result();
		result.setResultCode(ResultCode.SUCCESS);
		return result;
	}
	
	//返回成功，有消息体
	public static Result sucess(Object data) {
		Result result=new Result();
		result.setResultCode(ResultCode.SUCCESS);
		result.setData(data);
		return result;
	}
	
	//返回失败
	public static Result failure(ResultCode resultCode) {
		Result result=new Result();
		result.setResultCode(ResultCode.SUCCESS);
		return result;
	}
	
	//返回失败
		public static Result failure(ResultCode resultCode,Object data) {
			Result result=new Result();
			result.setResultCode(ResultCode.SUCCESS);
			result.setData(data);
			return result;
		}
		

}
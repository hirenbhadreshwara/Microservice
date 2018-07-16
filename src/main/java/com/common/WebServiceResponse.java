package com.common;

public class WebServiceResponse {
	private boolean isSucess;
	private boolean hasError;
	private Object returnObj;
	private String returnMessage;
	private String loginUserTempID;
	
	public boolean isSucess() {
		return isSucess;
	}
	public void setSucess(boolean isSucess) {
		this.isSucess = isSucess;
	}
	public boolean isHasError() {
		return hasError;
	}
	public void setHasError(boolean hasError) {
		this.hasError = hasError;
	}
	public Object getReturnObj() {
		return returnObj;
	}
	public void setReturnObj(Object returnObj) {
		this.returnObj = returnObj;
	}
	public String getReturnMessage() {
		return returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
	public String getLoginUserTempID() {
		return loginUserTempID;
	}
	public void setLoginUserTempID(String loginUserTempID) {
		this.loginUserTempID = loginUserTempID;
	}
	
	@Override
	public String toString() {
		return "WebServiceResponse [isSucess=" + isSucess + ", hasError="
				+ hasError + ", returnObj=" + returnObj + ", returnMessage="
				+ returnMessage + ", loginUserTempID=" + loginUserTempID
				+ ", toString()=" + super.toString() + "]";
	}
	
}

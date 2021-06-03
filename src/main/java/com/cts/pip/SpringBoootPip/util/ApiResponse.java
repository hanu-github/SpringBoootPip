package com.cts.pip.SpringBoootPip.util;

public class ApiResponse {
	
	private String status;
	
	private Object payLoad;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getPayLoad() {
		return payLoad;
	}

	public void setPayLoad(Object payLoad) {
		this.payLoad = payLoad;
	}

	public ApiResponse(Object payLoad, String status) {
		super();
		this.status = status;
		this.payLoad = payLoad;
	}
	
	

}

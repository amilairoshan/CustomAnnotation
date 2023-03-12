package com.annotation.CustomAnnotation.dto;

import java.io.Serializable;
import java.util.Map;

public class InputRequestInfo implements Serializable {

	private String request_type;
	private Map<String, Object> request_params;
	
	public String getRequest_type() {
		return request_type;
	}
	public void setRequest_type(String request_type) {
		this.request_type = request_type;
	}
	public Map<String, Object> getRequest_params() {
		return request_params;
	}
	public void setRequest_params(Map<String, Object> request_params) {
		this.request_params = request_params;
	}
	@Override
	public String toString() {
		return "InputRequestInfo [request_type=" + request_type + ", request_params=" + request_params + "]";
	}
	
	

}

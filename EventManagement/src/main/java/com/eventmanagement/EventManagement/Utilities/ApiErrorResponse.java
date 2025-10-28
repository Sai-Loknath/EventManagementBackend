package com.eventmanagement.EventManagement.Utilities;

public class ApiErrorResponse {
	
	private int status;
	private String message;
	private Long timestamp;
	private String errorCode;
	private String path;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public ApiErrorResponse(int status, String message, Long timestamp, String errorCode, String path) {
		super();
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
		this.errorCode = errorCode;
		this.path = path;
	}
	public ApiErrorResponse() {
		super();
	}
	
}

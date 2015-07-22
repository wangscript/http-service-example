package com.istock.base.httpService.model;

public class MessageInfo {

	private Integer id;
	private String content;
	private String sender;
	private String receiver;
	
	private TypeEnum type;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public TypeEnum getType() {
		return type;
	}
	public void setType(TypeEnum type) {
		this.type = type;
	}
}

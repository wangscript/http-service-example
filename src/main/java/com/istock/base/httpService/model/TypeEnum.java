package com.istock.base.httpService.model;


public enum TypeEnum {

	SUCCESS(1 , "成功")
	,FAIL(2 , "失败")
	;
	private Integer value;
	private String text;
	
	TypeEnum(Integer value , String text){
		this.value = value;
		this.text = text;
	}
	
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public static TypeEnum findByValue(Integer value){
		for(TypeEnum item : values()){
			if(item.getValue().intValue() == value){
				return item;
			}
		}
		return null;
	}
}

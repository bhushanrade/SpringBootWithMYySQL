package com.example.demo.pojo;

public class Rate {
    private String name;
    private String code;
    private Double rate;
    
    
    
	public Rate() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Rate(String name, String code, Double rate) {
		super();
		this.name = name;
		this.code = code;
		this.rate = rate;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public Double getRate() {
		return rate;
	}



	public void setRate(Double rate) {
		this.rate = rate;
	}
	
	
    
    
}

package com.onebill.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mobile")
@Scope(scopeName = "prototype")
public class Mobile {

	private String message;
	private String call;
	
	@Autowired(required = true)
	Charger charger;

	public Mobile(String message, String call, Charger charger) {
		super();
		this.message = message;
		this.call = call;
		this.charger = charger;
	}

	public Mobile() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	@Override
	public String toString() {
		return "mobile [message=" + message + ", call=" + call + ", charger=" + charger + "]";
	}
	
}

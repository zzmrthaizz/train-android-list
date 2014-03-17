package com.example.train_android_list;

import android.content.Intent;

public abstract class Employee {
	public Employee (){};
	private String id;
	private String name;
	public abstract int tinhluong();
	public String toString() {
		return this.id+"-"+this.name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	};
	
}

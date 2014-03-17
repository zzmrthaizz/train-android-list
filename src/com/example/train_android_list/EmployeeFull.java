package com.example.train_android_list;
import com.example.train_android_list.Employee;

public class EmployeeFull extends Employee{
	public EmployeeFull(){};
	
	public int tinhluong() {
		return 500;
	}
public String toString() {
	return super.toString()+"->Fulltime: "+tinhluong();
}
}

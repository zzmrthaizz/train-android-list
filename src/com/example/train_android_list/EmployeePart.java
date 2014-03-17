package com.example.train_android_list;
import com.example.train_android_list.Employee;

public class EmployeePart extends Employee{
	public EmployeePart(){};
	public int tinhluong() {
		return 150;
	}
public String toString() {
	return super.toString()+"->Parttime: "+tinhluong();
}
}
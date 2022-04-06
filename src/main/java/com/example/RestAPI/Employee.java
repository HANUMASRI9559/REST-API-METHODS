package com.example.RestAPI;

public class Employee {
String ename;
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
String eid;
public Employee(String ename, String eid) {
	super();
	this.ename = ename;
	this.eid = eid;
}
@Override
public String toString() {
	return "Employee [ename=" + ename + ", eid=" + eid + "]";
}
}

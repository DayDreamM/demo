package com.example.demo.entity;

public class MedicalService {
  private int id;
  private String url;
  private String name;
  private String uri;
 
  
public MedicalService(int id, String url, String name, String uri) {
	super();
	this.id = id;
	this.url = url;
	this.name = name;
	this.uri = uri;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUri() {
	return uri;
}
public void setUri(String uri) {
	this.uri = uri;
}
  
  
}

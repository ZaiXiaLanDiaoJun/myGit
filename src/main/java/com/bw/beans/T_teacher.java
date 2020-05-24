package com.bw.beans;

public class T_teacher {
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T_teacher(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "T_teacher [id=" + id + ", name=" + name + "]";
	}
	public T_teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

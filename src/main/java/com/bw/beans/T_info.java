package com.bw.beans;

public class T_info {
	private Integer id;
	private String name;
	private String uptime;
	private Integer status;
	
	//¡Ÿ ±
	private String tname;
	private Integer tc;
	
	public Integer getTc() {
		return tc;
	}

	public void setTc(Integer tc) {
		this.tc = tc;
	}

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

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public T_info(Integer id, String name, String uptime, Integer status, String tname) {
		super();
		this.id = id;
		this.name = name;
		this.uptime = uptime;
		this.status = status;
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "T_info [id=" + id + ", name=" + name + ", uptime=" + uptime + ", status=" + status + ", tname=" + tname
				+ "]";
	}

	public T_info() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

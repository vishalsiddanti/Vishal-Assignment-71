package com.hib.assign.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "typeofflower")
public class Flowers implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "FLOWER_ID")
	private int id;
	
	@Column(name = "FLOWER_NAME", length = 40)
	private String flowname;
	
	@Column(name = "FLOWER_TYPE", length = 40)
	private String flowtype;
	
	public Flowers() {}

	public Flowers(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getflowName() {
		return flowname;
	}

	public void setflowname(String flowname) {
		this.flowname = flowname;
	}

	public String getflowType() {
		return flowtype;
	}

	public void setflowType(String flowtype) {
		this.flowtype = flowtype;
	}

	@Override
	public String toString() {
		return "Flowers [id=" + id + ", name=" + name + ", type=" + type + "]";
	}

}

package com.hib.assign.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Managers1")
public class Manager implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "Man_Id")
	private int id;
	
	@Column(name = "MANAGERNAME", length = 25)
	private String mangername;
	
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "MANAGER_HIREDATE")
	private Date hireDate;
	
	public Manager() {}
	
	public Manager(String managername) {
		this.managername = managername;

	}

	public Manager(int id, String managername) {
		this.id = id;
		this.managername = managername;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getmanagername() {
		return managername;
	}

	public void setmanagername(String managername) {
		this.managername = managername;
	}



	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", managername=" + managername + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((managername == null) ? 0 : managername.hashCode());
		result = prime * result + id;

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (managername == null) {
			if (other.managername != null)
				return false;
		} else if (!managername.equals(other.managername))
			return false;
		if (id != other.id)
			return false;

		return true;
	}
	
	

}

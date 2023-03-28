package com.ait.main.Entity;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="Customer")
@Data
public class CustomerEntity {

	@Id
	private Integer id;
	@Column(length=10)
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Customer_Id")
	List<OrderEntity>lstorders;

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

	public List<OrderEntity> getLstorders() {
		return lstorders;
	}

	public void setLstorders(List<OrderEntity> lstorders) {
		this.lstorders = lstorders;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", lstorders=" + lstorders + "]";
	}
	
	
	
	
}

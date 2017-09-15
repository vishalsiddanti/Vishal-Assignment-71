package com.hib.assign.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SHOP1")
public class FlowerShop implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "SHOP_ID")
	private int id;
	
	@Column(name = "SHOP_NAME", length = 25)
	private String shopname;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Manager> managers;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Flowers> flowers = new LinkedList<Flowers>();
	
	@ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "FLOWERS", joinColumns = @JoinColumn(shopname = "SHOP_ID"))
    @MapKeyColumn(name = "FLOWER_NAME")
    @Column(name = "WEEKLY_SALES", length = 25)
    private Map<String, Float> weeklySales = new LinkedHashMap<String, Float>();
	
	public FlowerShop() {}

	public FlowerShop(String shopname) {
		this.shopname = shopname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getshopName() {
		return shopname;
	}

	public void setName(String shopname) {
		this.name = shopname;
	}

	public List<Manager> getManagers() {
		return managers;
	}

	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}

	public List<Flowers> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flowers> flowers) {
		this.flowers = flowers;
	}

	@Override
	public String toString() {
		return "FlowerShop [id=" + id + ", name=" + name + ", managers=" + managers + "]";
	}
	
	

}

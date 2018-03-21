package com.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="WinwCategory")
@Table(name="winecategory")

public class WineCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1502520594906540485L;
	
	@Id
	@GeneratedValue
	private long catId;
	private String categoryDescription;
	@OneToMany(cascade = CascadeType.ALL,targetEntity=com.models.Wine.class,
            fetch = FetchType.LAZY,
            mappedBy = "wineList")
	private java.util.Set<Wine> wineList= new HashSet<Wine>();
	
	public long getCatId() {
		return catId;
	}

	public void setCatId(long catId) {
		this.catId = catId;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public java.util.Set<Wine> getWineList() {
		return wineList;
	}

	public void setWineList(java.util.Set<Wine> wineList) {
		this.wineList = wineList;
	}

	public WineCategory() {
		super();
	}

	public WineCategory(long catId, String categoryDescription, Set<Wine> wineList) {
		super();
		this.catId = catId;
		this.categoryDescription = categoryDescription;
		this.wineList = wineList;
	}
	
	

}

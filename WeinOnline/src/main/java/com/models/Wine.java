package com.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity(name="Wine")
@Table(name="wine")
public class Wine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8186475807148688588L;
	/*
	 * Defining beans variables
	 * */
	@Id
	@Enumerated(EnumType.STRING)
	private String windeCode;
	@Enumerated(EnumType.STRING)
	private String wineCategory;
	
	private String wineName;
	private String wineDescription;
	private double wineUnitPrice;
	private double wineSize;
	private double alcoolContent;
	private int numberPerPackage;
	private String wineColor;
	
	/* Default Constructor*/
	public Wine() {
		super();
	}

	public Wine(String wineCategory, String windeCode, String wineName, String wineDescription, double wineUnitPrice,
			double wineSize, double alcoolContent, int numberPerPackage, String wineColor) {
		super();
		this.wineCategory = wineCategory;
		this.windeCode = windeCode;
		this.wineName = wineName;
		this.wineDescription = wineDescription;
		this.wineUnitPrice = wineUnitPrice;
		this.wineSize = wineSize;
		this.alcoolContent = alcoolContent;
		this.numberPerPackage = numberPerPackage;
		this.wineColor = wineColor;
	}

	public String getWineCategory() {
		return wineCategory;
	}

	public void setWineCategory(String wineCategory) {
		this.wineCategory = wineCategory;
	}

	public String getWindeCode() {
		return windeCode;
	}

	public void setWindeCode(String windeCode) {
		this.windeCode = windeCode;
	}

	public String getWineName() {
		return wineName;
	}

	public void setWineName(String wineName) {
		this.wineName = wineName;
	}

	public String getWineDescription() {
		return wineDescription;
	}

	public void setWineDescription(String wineDescription) {
		this.wineDescription = wineDescription;
	}

	public double getWineUnitPrice() {
		return wineUnitPrice;
	}

	public void setWineUnitPrice(double wineUnitPrice) {
		this.wineUnitPrice = wineUnitPrice;
	}

	public double getWineSize() {
		return wineSize;
	}

	public void setWineSize(double wineSize) {
		this.wineSize = wineSize;
	}

	public double getAlcoolContent() {
		return alcoolContent;
	}

	public void setAlcoolContent(double alcoolContent) {
		this.alcoolContent = alcoolContent;
	}

	public int getNumberPerPackage() {
		return numberPerPackage;
	}

	public void setNumberPerPackage(int numberPerPackage) {
		this.numberPerPackage = numberPerPackage;
	}

	public String getWineColor() {
		return wineColor;
	}

	public void setWineColor(String wineColor) {
		this.wineColor = wineColor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}

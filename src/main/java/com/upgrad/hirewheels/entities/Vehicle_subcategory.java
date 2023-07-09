package com.upgrad.hirewheels.entities;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="vehicle_subcategory")
public class Vehicle_subcategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="vehicle_subcategory_id", length=10)
	private int vehicleSubcategoryId;
	
	@Column(name="vehicle_subcategory_name", length=50, nullable=false, unique = true)
	private String vehicleSubcategoryName;
	
	@Column(name="price_per_day", length=10, precision = 2, nullable=false)
	private int pricePerDay;
	
	@ManyToOne
	@JoinColumn(name="vehicle_category_id", nullable=false)
	private Vehicle_category vehicleCategory;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "vehicleSubcategory")
	private Set<Vehicle> vehicleList;

	public int getVehicleSubcategoryId() {
		return vehicleSubcategoryId;
	}

	public void setVehicleSubcategoryId(int vehicleSubcategoryId) {
		this.vehicleSubcategoryId = vehicleSubcategoryId;
	}

	public String getVehicleSubcategoryName() {
		return vehicleSubcategoryName;
	}

	public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
		this.vehicleSubcategoryName = vehicleSubcategoryName;
	}

	public int getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(int pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public Vehicle_category getVehicleCategory() {
		return vehicleCategory;
	}

	public void setVehicleCategory(Vehicle_category vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}

	public Set<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(Set<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	@Override
	public String toString() {
		return "Vehicle_subcategory [vehicleSubcategoryId=" + vehicleSubcategoryId + ", vehicleSubcategoryName="
				+ vehicleSubcategoryName + ", pricePerDay=" + pricePerDay + ", vehicleCategory=" + vehicleCategory
				+ "]";
	}

	
}

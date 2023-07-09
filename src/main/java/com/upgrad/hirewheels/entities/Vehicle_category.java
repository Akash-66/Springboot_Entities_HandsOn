package com.upgrad.hirewheels.entities;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="vehicle_category")
public class Vehicle_category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="vehicle_category_id", length=10)
	private int vehicleCategoryId;
	
	@Column(name="vehicle_category_name", length=50, nullable=false, unique = true)
	private String vehicleCategoryName;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "vehicleCategory")
	private Set<Vehicle_subcategory> VehicleSubcategoryList;

	public int getVehicleCategoryId() {
		return vehicleCategoryId;
	}

	public void setVehicleCategoryId(int vehicleCategoryId) {
		this.vehicleCategoryId = vehicleCategoryId;
	}

	public String getVehicleCategoryName() {
		return vehicleCategoryName;
	}

	public void setVehicleCategoryName(String vehicleCategoryName) {
		this.vehicleCategoryName = vehicleCategoryName;
	}

	public Set<Vehicle_subcategory> getVehicleSubcategoryList() {
		return VehicleSubcategoryList;
	}

	public void setVehicleSubcategoryList(Set<Vehicle_subcategory> vehicleSubcategoryList) {
		VehicleSubcategoryList = vehicleSubcategoryList;
	}

	@Override
	public String toString() {
		return "Vehicle_category [vehicleCategoryId=" + vehicleCategoryId + ", vehicleCategoryName="
				+ vehicleCategoryName + "]";
	}

	
}

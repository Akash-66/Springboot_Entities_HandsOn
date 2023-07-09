package com.upgrad.hirewheels.entities;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="fuel_type")
public class Fuel_type {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="fuel_type_id", length=10)
	private int fuelTypeId;
	
	@Column(name="fuel_type", length=50, nullable=false, unique = true)
	private String fuelType;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "fuelType")
	private Set<Vehicle> vehicleList;

	public int getFuelTypeId() {
		return fuelTypeId;
	}

	public void setFuelTypeId(int fuelTypeId) {
		this.fuelTypeId = fuelTypeId;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public Set<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(Set<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	@Override
	public String toString() {
		return "Fuel_type [fuelTypeId=" + fuelTypeId + ", fuelType=" + fuelType + "]";
	}
	
	
}

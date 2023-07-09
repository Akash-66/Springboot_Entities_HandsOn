package com.upgrad.hirewheels.entities;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="vehicle")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="vehicle_id ",length=10, nullable=false)
	private int vehicleId;
	
	@Column(name="vehicle_model", length=50, nullable=false)
	private String vehicleModel;
	
	@Column(name="vehicle_number",length=10, nullable=false)
	private char vehicleNumber;
	
	@ManyToOne
	@JoinColumn(name="vehicle_subcategory_id")
	private Vehicle_subcategory vehicleSubcategory;
	
	@Column(name="color", length=50, nullable=false)
	private String color;
	
	@ManyToOne
	@JoinColumn(name="location_id ", nullable=false)
	private Location locations;
	
	@ManyToOne
	@JoinColumn(name="fuel_type_id ", nullable=false)
	private Fuel_type fuelType;
	
	@Column(name="availability_status", length=1, nullable=false)
	private int availabilityStatus;
	
	@Column(name="vehicle_image_url", length=500, nullable=false)
	private String vehicleImageUrl;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "vehicles")
	private Set<Booking> bookingList;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public char getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(char vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public Vehicle_subcategory getVehicleSubcategory() {
		return vehicleSubcategory;
	}

	public void setVehicleSubcategory(Vehicle_subcategory vehicleSubcategory) {
		this.vehicleSubcategory = vehicleSubcategory;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Location getLocations() {
		return locations;
	}

	public void setLocations(Location locations) {
		this.locations = locations;
	}

	public Fuel_type getFuelType() {
		return fuelType;
	}

	public void setFuelType(Fuel_type fuelType) {
		this.fuelType = fuelType;
	}

	public int getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(int availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	public String getVehicleImageUrl() {
		return vehicleImageUrl;
	}

	public void setVehicleImageUrl(String vehicleImageUrl) {
		this.vehicleImageUrl = vehicleImageUrl;
	}

	public Set<Booking> getBookingList() {
		return bookingList;
	}

	public void setBookingList(Set<Booking> bookingList) {
		this.bookingList = bookingList;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleModel=" + vehicleModel + ", vehicleNumber=" + vehicleNumber
				+ ", vehicleSubcategory=" + vehicleSubcategory + ", color=" + color + ", locations=" + locations
				+ ", fuelType=" + fuelType + ", availabilityStatus=" + availabilityStatus + ", vehicleImageUrl="
				+ vehicleImageUrl + "]";
	}
}

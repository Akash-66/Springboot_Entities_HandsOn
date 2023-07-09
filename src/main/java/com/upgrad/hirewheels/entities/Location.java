package com.upgrad.hirewheels.entities;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="location")
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="location_id ",length=10, nullable=false)
	private int locationId;
	
	@Column(name="location_name", length=50, nullable=false)
	private String locationName;
	
	@Column(name="address", length=100, nullable=false)
	private String address;
	
	@ManyToOne
	@JoinColumn(name="city_id ", nullable=false)
	private City citys;
	
	@Column(name="pincode", length=6, nullable=false)
	private char pincode;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "locations")
	private Set<Booking> bookingList;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "locations")
	private Set<Vehicle> vehicleList;

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public City getCitys() {
		return citys;
	}

	public void setCitys(City citys) {
		this.citys = citys;
	}

	public char getPincode() {
		return pincode;
	}

	public void setPincode(char pincode) {
		this.pincode = pincode;
	}

	public Set<Booking> getBookingList() {
		return bookingList;
	}

	public void setBookingList(Set<Booking> bookingList) {
		this.bookingList = bookingList;
	}

	public Set<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(Set<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName=" + locationName + ", address=" + address
				+ ", citys=" + citys + ", pincode=" + pincode + "]";
	}
	
	

}

package com.upgrad.hirewheels.entities;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="city")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="city_id ",length=10, nullable=false)
	private int cityId;
	
	@Column(name="city_name", length=50, nullable=false)
	private String cityName;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "citys")
	private Set<Location> locationList;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Set<Location> getLocationList() {
		return locationList;
	}

	public void setLocationList(Set<Location> locationList) {
		this.locationList = locationList;
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + "]";
	}
	
	

}

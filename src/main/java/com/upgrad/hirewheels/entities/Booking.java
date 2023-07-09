package com.upgrad.hirewheels.entities;

import java.time.LocalDateTime;

import javax.persistence.*;


@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="booking_id ",length=10, nullable=false)
	private int bookingId;
	
	@Column(name="pickup_date", nullable=false)
	private LocalDateTime pickupDate;
	
	@Column(name="dropoff_date", nullable=false)
	private LocalDateTime dropoffDate;
	
	@Column(name="booking_date", nullable=false)
	private LocalDateTime bookingDate;
	
	@Column(name="amount", length=10, precision = 2, nullable=false)
	private int amount;
	
	@ManyToOne
	@JoinColumn(name="location_id", nullable=false)
	private Location locations;
	
	@ManyToOne
	@JoinColumn(name="vehicle_id", nullable=false)
	private Vehicle vehicles;
	
	@ManyToOne
	@JoinColumn(name="user_id", nullable=false)
	private Users user;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDateTime getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(LocalDateTime pickupDate) {
		this.pickupDate = pickupDate;
	}

	public LocalDateTime getDropoffDate() {
		return dropoffDate;
	}

	public void setDropoffDate(LocalDateTime dropoffDate) {
		this.dropoffDate = dropoffDate;
	}

	public LocalDateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Location getLocations() {
		return locations;
	}

	public void setLocations(Location locations) {
		this.locations = locations;
	}

	public Vehicle getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicle vehicles) {
		this.vehicles = vehicles;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", pickupDate=" + pickupDate + ", dropoffDate=" + dropoffDate
				+ ", bookingDate=" + bookingDate + ", amount=" + amount + ", locations=" + locations + ", vehicles="
				+ vehicles + ", user=" + user + "]";
	}
	
	
}

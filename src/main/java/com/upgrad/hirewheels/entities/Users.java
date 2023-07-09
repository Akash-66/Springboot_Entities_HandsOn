package com.upgrad.hirewheels.entities;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id ",length=10, nullable=false)
	private int userId;
	
	@Column(name="first_name",length=50, nullable=false)
	private String firstName;
	
	@Column(name="last_name",length=50)
	private String lastName;
	
	@Column(name="password",length=50, nullable=false)
	private String password;
	
	@Column(name="email",length=50, nullable=false, unique=true)
	private String email;
	
	@Column(name="mobile_no",length=10, nullable=false, unique=true)
	private char mobileNo;
	
	@ManyToOne
	@JoinColumn(name="role_id", nullable=false)
	private Role roles;
	
	@Column(name="wallet_money",length=10, precision=2, columnDefinition = "numeric(10) default 10000.00")
	private int walletMoney;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Booking> bookingList;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(char mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Role getRoles() {
		return roles;
	}

	public void setRoles(Role roles) {
		this.roles = roles;
	}

	public int getWalletMoney() {
		return walletMoney;
	}

	public void setWalletMoney(int walletMoney) {
		this.walletMoney = walletMoney;
	}

	public Set<Booking> getBookingList() {
		return bookingList;
	}

	public void setBookingList(Set<Booking> bookingList) {
		this.bookingList = bookingList;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", email=" + email + ", mobileNo=" + mobileNo + ", roles=" + roles + ", walletMoney="
				+ walletMoney + "]";
	}
	
	

}

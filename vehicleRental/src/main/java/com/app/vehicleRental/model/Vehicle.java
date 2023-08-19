package com.app.vehicleRental.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vehicle_id;
	
	@Column(name = "vehicle_no")
	private int vehicle_no;
	
	@Column(name = "car_type")
	private String car_type;
	
	@Column(name = "car_model")
	private String car_model;
	
	@Column(name = "year")
	private int year;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "fuel_type")
	private String fuel_type;
	
	@Column(name = "insurance_id")
	private Long insurance_id;
	
	@Column(name = "pricing_per_day")
	private int pricing_per_day;
	
	@Column(name = "pricing_per_km")
	private int pricing_per_km;

	public Vehicle() {
		super();
	}

	public Vehicle(Long vehicle_id, int vehicle_no, String car_type, String car_model, int year, String status,
			String fuel_type, Long insurance_id, int pricing_per_day, int pricing_per_km) {
		super();
		this.vehicle_id = vehicle_id;
		this.vehicle_no = vehicle_no;
		this.car_type = car_type;
		this.car_model = car_model;
		this.year = year;
		this.status = status;
		this.fuel_type = fuel_type;
		this.insurance_id = insurance_id;
		this.pricing_per_day = pricing_per_day;
		this.pricing_per_km = pricing_per_km;
	}

	public Long getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(Long vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public int getVehicle_no() {
		return vehicle_no;
	}

	public void setVehicle_no(int vehicle_no) {
		this.vehicle_no = vehicle_no;
	}

	public String getCar_type() {
		return car_type;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}

	public String getCar_model() {
		return car_model;
	}

	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFuel_type() {
		return fuel_type;
	}

	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	public Long getInsurance_id() {
		return insurance_id;
	}

	public void setInsurance_id(Long insurance_id) {
		this.insurance_id = insurance_id;
	}

	public int getPricing_per_day() {
		return pricing_per_day;
	}

	public void setPricing_per_day(int pricing_per_day) {
		this.pricing_per_day = pricing_per_day;
	}

	public int getPricing_per_km() {
		return pricing_per_km;
	}

	public void setPricing_per_km(int pricing_per_km) {
		this.pricing_per_km = pricing_per_km;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicle_id=" + vehicle_id + ", vehicle_no=" + vehicle_no + ", car_type=" + car_type
				+ ", car_model=" + car_model + ", year=" + year + ", status=" + status + ", fuel_type=" + fuel_type
				+ ", insurance_id=" + insurance_id + ", pricing_per_day=" + pricing_per_day + ", pricing_per_km="
				+ pricing_per_km + "]";
	}
	
}

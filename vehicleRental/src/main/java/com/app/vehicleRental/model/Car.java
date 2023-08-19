package com.app.vehicleRental.model;

import com.app.vehicleRental.model.enums.CarStatus;
import com.app.vehicleRental.model.enums.CarType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long carId;
	
	@Column(name = "vehicle_id", nullable = false)
	private int vehicleId;
	
	@Column(name = "car_no", nullable = false)
	private int carNo;
	
	@Column(name = "car_type", nullable = false)
	private CarType carType;
	
	@Column(name = "car_model", nullable = false)
	private String carModel;
	
	@Column(name = "year", nullable = false)
	private int year;
	
	@Column(name = "status", nullable = false)
	private CarStatus carStatus;
	
	@Column(nullable = false)
    private int seats;
	
	@Column(name = "insurance_id", nullable = false)
	private Long insurance_id;
	
	@Column(name = "pricing_per_day", nullable = false)
	private int pricing_per_day;

	public Car() {
		super();
	}

	public Car(Long carId, int vehicleId, int carNo, CarType carType, String carModel, int year, CarStatus carStatus,
			int seats, Long insurance_id, int pricing_per_day) {
		super();
		this.carId = carId;
		this.vehicleId = vehicleId;
		this.carNo = carNo;
		this.carType = carType;
		this.carModel = carModel;
		this.year = year;
		this.carStatus = carStatus;
		this.seats = seats;
		this.insurance_id = insurance_id;
		this.pricing_per_day = pricing_per_day;
	}

	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public CarStatus getCarStatus() {
		return carStatus;
	}

	public void setCarStatus(CarStatus carStatus) {
		this.carStatus = carStatus;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
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
	
}

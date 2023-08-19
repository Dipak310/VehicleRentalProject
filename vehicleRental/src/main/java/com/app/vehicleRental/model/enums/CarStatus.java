package com.app.vehicleRental.model.enums;

public enum CarStatus {
	AVAILABLE("Car is available for renting"),
    RENTED("Car is currently rented"),
    UNDER_MAINTENANCE("Car is currently under maintenance");

    private final String description;

    CarStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

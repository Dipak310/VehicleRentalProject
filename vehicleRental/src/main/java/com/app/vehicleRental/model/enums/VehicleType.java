package com.app.vehicleRental.model.enums;

public enum VehicleType {
	CAR("Car"),
	BIKE("Bike");
	
	private final String displayName;

	VehicleType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

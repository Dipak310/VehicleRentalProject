package com.app.vehicleRental.model.enums;

public enum CarType {
	SEDAN("Sedan"),
    SUV("SUV"),
    COUPE("Coupe"),
    TRUCK("Truck"),
    VAN("Van");

    private final String displayName;

    CarType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

package io.github.Balu479.Service;

import java.util.List;
import io.github.Balu479.Entity.Vehicle;

public interface VehicleService {
	public void createVehicles(Vehicle vehicle[]);

	public List<Vehicle> getVehicles();
}

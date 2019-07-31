package io.github.Balu479.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.github.Balu479.Entity.Vehicle;
import io.github.Balu479.Service.VehicleService;

@RestController
public class VehicleController {
	@Autowired
	VehicleService service;
	@RequestMapping(method=RequestMethod.PUT, path="/vehicles")
	public void createVehicles(@RequestBody() Vehicle vehicle[]) {
		service.createVehicles(vehicle);
	}
	@RequestMapping(method=RequestMethod.GET, value="/")
	public List<Vehicle> getVehicles() {
		return service.getVehicles();
		
	}
}

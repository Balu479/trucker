package io.github.Balu479.Service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.Balu479.Entity.Vehicle;
import io.github.Balu479.Exception.BadRequestException;
import io.github.Balu479.Repository.VehicleRepository;
@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	VehicleRepository vehicleRepository;
	@Transactional
	public void createVehicles(Vehicle vehicle[]) {
		
            
			try {
					for(Vehicle v:vehicle)
		                vehicleRepository.save(v);
			} 
			catch (Exception e) {
				throw new BadRequestException("The request format was not supported !");
			}
           
		
	}
	@Transactional
	@Override
	public List<Vehicle> getVehicles() {
		// TODO Auto-generated method stub
		return vehicleRepository.findAll();
	}

}

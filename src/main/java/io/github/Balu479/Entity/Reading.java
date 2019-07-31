package io.github.Balu479.Entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reading {
	@Id
	private String vin;
	private double lattitude;
	private double speed;
	private int engineHp;
	private boolean checkEngineLightOn;
	private boolean engineCoolantLow;
	private boolean cruiseContorlOn;
	private int engineRpm;
	@Embedded
	private Tires tires;
	
	private double longitude;
	private String timestamp;
	private double fuelVolume;
	public String getVin() {
		return vin;
	}
	public void setVehicle(String vin) {
		this.vin = vin;
	}
	public double getLattitude() {
		return lattitude;
	}
	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public double getFuelVolume() {
		return fuelVolume;
	}
	public void setFuelVolume(double fuelVolume) {
		this.fuelVolume = fuelVolume;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getEngineHp() {
		return engineHp;
	}
	public void setEngineHp(int engineHp) {
		this.engineHp = engineHp;
	}
	public boolean isCheckEngineLightOn() {
		return checkEngineLightOn;
	}
	public void setCheckEngineLightOn(boolean checkEngineLightOn) {
		this.checkEngineLightOn = checkEngineLightOn;
	}
	public boolean isEngineCoolantLow() {
		return engineCoolantLow;
	}
	public void setEngineCoolantLow(boolean engineCoolantLow) {
		this.engineCoolantLow = engineCoolantLow;
	}
	public boolean isCruiseContorlOn() {
		return cruiseContorlOn;
	}
	public void setCruiseContorlOn(boolean cruiseContorlOn) {
		this.cruiseContorlOn = cruiseContorlOn;
	}
	public int getEngineRpm() {
		return engineRpm;
	}
	public void setEngineRpm(int engineRpm) {
		this.engineRpm = engineRpm;
	}
	public Tires getTires() {
		return tires;
	}
	public void setTires(Tires tires) {
		this.tires = tires;
	}
	

}

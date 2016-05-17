package Bobbee;

import java.util.ArrayList;

import lejos.hardware.sensor.SensorMode;
import lejos.hardware.sensor.SensorModes;

public class Sensor implements SensorModes{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sampleSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void fetchSample(float[] sample, int offset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<String> getAvailableModes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SensorMode getMode(int mode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SensorMode getMode(String modeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCurrentMode(int mode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCurrentMode(String modeName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCurrentMode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getModeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}

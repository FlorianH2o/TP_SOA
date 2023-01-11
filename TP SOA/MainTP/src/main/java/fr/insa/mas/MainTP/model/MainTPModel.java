package fr.insa.mas.MainTP.model;

public class MainTPModel {
	private int id;
	private String roomName ;
	private double temp;
	private boolean heat;
	
	public MainTPModel(int id, String roomName, double temp, boolean heat) {
		this.id = id;
		this.roomName = roomName;
		this.temp = temp;
		this.heat = heat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public boolean isHeat() {
		return heat;
	}

	public void setHeat(boolean heat) {
		this.heat = heat;
	}
	
	
}

package fr.insa.mas.MainTP.model;

public class TempModel {
	private int idRoom;
	private double temp;
	
	public TempModel() {};
	public TempModel(int idRoom, double temp) {
		super();
		this.idRoom = idRoom;
		this.temp = temp;
	}
	public int getIdRoom() {
		return idRoom;
	}
	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	
}

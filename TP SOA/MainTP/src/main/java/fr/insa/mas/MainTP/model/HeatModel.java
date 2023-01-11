package fr.insa.mas.MainTP.model;

public class HeatModel {
	private int idRoom;
	private boolean heat;
	
	public HeatModel() {};
	
	public HeatModel(int idRoom, boolean heat) {
		
		this.idRoom = idRoom;
		heat = heat;
	}

	public int getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}

	public boolean isHeat() {
		return heat;
	}

	public void setHeat(boolean heat) {
		heat = heat;
	}
	
	
	
}

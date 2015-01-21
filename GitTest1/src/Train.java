

public class Train {

	private int serial;
	private String name;
	private String model;
	
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getJSON() {
		// Fix
		//return name;
		return "{serial:" + serial + "name: " + name + "model: " + model +"}";


	}
}



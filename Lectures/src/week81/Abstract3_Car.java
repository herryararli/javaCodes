package week81;

public abstract class Abstract3_Car {
private int weight;
private String color;
private String model;

public Abstract3_Car() {
}

abstract int fuelPerHour();


public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}


}

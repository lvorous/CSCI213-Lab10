/**
 * Lab 10 Car Class
 * @author Lindsey Vorous
 *
 */
public class Car extends Vehicle {
	// instance variables
	private int doors;
	private int passengers;
	
	// constructor
	public Car(String inMake, String inModel, String inPlate, int inDoors, 
		int inPassengers) 
	{
		super(inMake, inModel, inPlate);
		this.doors = inDoors;
		this.passengers = inPassengers;
	}
	
	// getters
	
	public int getNumDoors() {
		return this.doors;
	}
	
	public int getNumPassengers() {
		return this.passengers;
	}
	
	// toString method
	public String toString() {
		return (this.doors + "-door " + this.getMake() + " " + this.getModel()
			+ " with license " + this.getPlate() + ".");
	}
	
	// equals method
	@Override
	public boolean equals(Object other) {
		// make sure other object is instance of Car
		if( !(other instanceof Car) ) {
			return false;
		}
		
		// cast to car type, other is confirmed to be a car type
		Car otherCar = (Car) other;
		
		// check doors, passengers, and super are equal
		if(this.doors == otherCar.doors && 
			this.passengers == otherCar.passengers)
		{
			return super.equals(otherCar);
		}
		return false;
	}
	
	// copy method
	public Car copy() {
		return new Car(this.getMake(), this.getModel(), this.getPlate(), 
			this.doors, this.passengers);
	}
	
	
} // end Car class



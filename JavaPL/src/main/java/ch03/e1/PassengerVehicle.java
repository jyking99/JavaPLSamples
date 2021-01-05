package ch03.e1;

public class PassengerVehicle extends Vehicle {
	private int seats;
	private int passengers;
	
	public int getSeats() {
		return seats;
	}
	
	public int getPassengers() {
		return passengers;
	}
	
	
	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public static void main(String args[]) {
		PassengerVehicle pv1 = new PassengerVehicle();
		PassengerVehicle pv2 = new PassengerVehicle();
		
		System.out.println(pv1);
		System.out.println(pv2);
	}
}

package test;

import java.util.Scanner;

interface Vehicle{
	void accelerate();
	void stop();
	void setStart();
}

class Car {
	String vin;
	String color;
	protected boolean isStart;
	
	public Car(String vin, String color, boolean isStart) {
		this.vin = vin;
		this.color = color;
		this.isStart = isStart;
	}
	
	public String vin() {
		return this.vin;
	}
	
	public String color() {
		return this.color;
	}
	
	public boolean isStart() {
		return this.isStart;
	}
}

class Train{
	String trainNumber;
	String departureStation;
	String arrivalStation;
	protected boolean isStart;
	
	public Train(String trainNumber, String departureStation, String arrivalStation, boolean isStart) {
		this.trainNumber = trainNumber;
		this.departureStation = departureStation;
		this.arrivalStation = arrivalStation;
		this.isStart = isStart;
	}
	
	public String trainNumber() {
		return this.trainNumber;
	}
	
	public String departureStation() {
		return this.departureStation;
	}
	
	public String arrivalStation() {
		return this.arrivalStation;
	}
	
	public boolean isStart() {
		return this.isStart;
	}
}

class ManualCar extends Car implements Vehicle{
	
	int gear;
	
	public ManualCar(String vin, String color, boolean isStart, int gear) {
		super(vin, color, isStart);
		this.gear = gear;
	}

	public void setGear() {
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("기어 입력(0~6): ");
		if (gear > 6 || gear < 0) {
			System.out.println("Invalid number!");
		} else {
			gear = scanner.nextInt();
		}
		
		System.out.println("현재 기어 상태: " + gear + " 단");

		scanner.close();
	}

	@Override
	public void accelerate() {
		System.out.println("수동 변속기 자동차가 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("수동 변속기 자동차가 정차합니다!");
	}

	@Override
	public void setStart() {
		isStart = !isStart;
		System.out.println(isStart);
	}
}

class AutomaticCar extends Car implements Vehicle{
	public AutomaticCar(String vin, String color, boolean isStart) {
		super(vin, color, isStart);
	}
	
	@Override
	public void accelerate() {
		System.out.println("자동 변속기 자동차가 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("자동 변속기 자동차가 정차합니다!");
	}

	@Override
	public void setStart() {
		isStart = !isStart;
		System.out.println(isStart);
	}
}

class PassengerTrain extends Train implements Vehicle{
	
	int passengerCount;
	
	public PassengerTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, int passengerCount) {
		super(trainNumber, departureStation, arrivalStation, isStart);
		this.passengerCount = passengerCount;
	}

	@Override
	public void accelerate() {
		System.out.println("여객 열차가 천천히 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("여객 열차가 천천히 정차합니다!");
	}

	@Override
	public void setStart() {
		isStart = !isStart;
		System.out.println(isStart);
	}
}

class FreightTrain extends Train implements Vehicle{
	
	double cargoWeight;
	
	public FreightTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, double cargoWeight) {
		super(trainNumber, departureStation, arrivalStation, isStart);
		this.cargoWeight = cargoWeight;
	}

	@Override
	public void accelerate() {
		System.out.println("화물 열차가 느리게 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("화물 열차가 느리게 정차합니다!");
	}

	@Override
	public void setStart() {
		isStart = !isStart;
		System.out.println(isStart);
	}
}

public class Test3 {

	public static void main(String[] args) {
		
		ManualCar car1 = new ManualCar("10가1234", "blue", false, 1);
		AutomaticCar car2 = new AutomaticCar("10가1234", "blue", false);
		PassengerTrain train1 = new PassengerTrain("KTX001", "서울", "부산", false, 200);
		FreightTrain train2 = new FreightTrain("Cargo001", "부산", "구미", true, 100.0);
		
		ManualCar car3 = (ManualCar) car1;
		System.out.println(car3.vin);
		System.out.println(car3.color);
		System.out.println(car3.isStart);
		System.out.println(car3.gear);
		car3.accelerate();
		car3.stop();
		car3.setStart();
		car3.setGear();
		
		AutomaticCar car4 = (AutomaticCar) car2;
		System.out.println(car4.vin);
		System.out.println(car4.color);
		System.out.println(car4.isStart);
		car4.accelerate();
		car4.stop();
		car4.setStart();
		
		PassengerTrain train3 = (PassengerTrain) train1;
		System.out.println(train3.trainNumber);
		System.out.println(train3.departureStation);
		System.out.println(train3.arrivalStation);
		System.out.println(train3.isStart);
		System.out.println(train3.passengerCount);
		train3.accelerate();
		train3.stop();
		train3.setStart();
		
		FreightTrain train4 = (FreightTrain) train2;
		System.out.println(train4.trainNumber);
		System.out.println(train4.departureStation);
		System.out.println(train4.arrivalStation);
		System.out.println(train4.isStart);
		System.out.println(train4.cargoWeight);
		train4.accelerate();
		train4.stop();
		train4.setStart();
		
	}

}

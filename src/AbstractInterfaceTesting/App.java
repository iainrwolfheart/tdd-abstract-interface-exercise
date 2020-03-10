package AbstractInterfaceTesting;

public class App {

	public static void main(String[] args) {
		
		//Example of passing interfaces as parameters in Car creation.
		//Each car uses a different "brand" of audio and satnav device.
		//Because both brands implement the same interface, it doesn't break!
		
		AppleAudio apple = new AppleAudio();
		TomTomSatNav tomTom = new TomTomSatNav();
		GarminSatNav garmin = new GarminSatNav();
		BoseAudio bose = new BoseAudio();

		Car car = new Car("Honda", "WF68 EET", apple, tomTom);
		Car car2 = new Car("Honda", "WF68 EET", bose, garmin);
		
		System.out.println(car.toString());
		System.out.println(car2.toString());
	}

}

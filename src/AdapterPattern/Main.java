package AdapterPattern;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Program Started");
		
		//Iphone charger
		//ChargerXYZ charger = new ChargerXYZ();
		
		AppleCharger charger = new AdapterCharger(new DKCharger());
		
		Iphone13 iphone13 = new Iphone13(charger);
		iphone13.chargeIphone();
	}

}

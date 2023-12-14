package Class;

import Interface.ThreeElectricOutlet;
import Interface.TwoElectricOutlet;

public class Application1 {

	public static void main(String[] args) {
		ThreeElectricOutlet threeOutlet;
		TwoElectricOutlet twoOutlet;
		Wash wash = new Wash();
		Tv tv = new Tv();
		ThreeAndTwoElectricAdapter adapter = new ThreeAndTwoElectricAdapter(wash, tv);
		
		threeOutlet = adapter;
		System.out.println("使用三相插座接通电流:");
		threeOutlet.connectElectricCurrent();
		
		twoOutlet = adapter;
		System.out.println("使用三相插座接通电流:");
		twoOutlet.connectElectricCurrent();
	}

}

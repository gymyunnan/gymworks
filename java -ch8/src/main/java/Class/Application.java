package Class;

import Interface.ThreeElectricOutlet;
import Interface.TwoElectricOutlet;

public class Application {
	public static void  main(String args[]) {
	
		ThreeElectricOutlet outlet;
		Wash wash = new Wash();
		outlet = wash;
		System.out.println("使用三相插座接通电流:");
		outlet.connectElectricCurrent();
		
		Tv tv = new Tv();
		ThreeElectricAdapter adapter = new ThreeElectricAdapter(tv);
		outlet = adapter;
		System.out.println("使用三相插座接通电流:");
		outlet.connectElectricCurrent();

	}
}

class Wash implements ThreeElectricOutlet{
	String name;
	
	public Wash() {
		name = "黄河洗衣机";
	}
	private void wash(String s) {
		name =s;
	}
	
	@Override
	public void connectElectricCurrent() {
		turnOn();
	}
	
	public void turnOn() {
		System.out.println(name+"开始洗衣服。");
	}
	
}

class Tv implements TwoElectricOutlet{

	String name;
	public Tv() {
		name = "长江电视机";
	}
	public Tv(String s) {
		name =s;
	}
	
	@Override
	public void connectElectricCurrent() {
		turnOn();
		
	}
	
	public void turnOn() {
		System.out.println(name+"开始播放节目。");
	}
	
}


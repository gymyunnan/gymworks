package Class;

import Interface.ThreeElectricOutlet;
import Interface.TwoElectricOutlet;

public class ThreeAndTwoElectricAdapter implements ThreeElectricOutlet,TwoElectricOutlet{
	
	TwoElectricOutlet twoElectricOutlet;
	ThreeElectricOutlet threeElectricOutlet;
	
	public ThreeAndTwoElectricAdapter(TwoElectricOutlet twoElectricOutlet, ThreeElectricOutlet threeElectricOutlet) {
		this.twoElectricOutlet = twoElectricOutlet;
		this.threeElectricOutlet = threeElectricOutlet;
	}

	public ThreeAndTwoElectricAdapter(ThreeElectricOutlet threeElectricOutlet, TwoElectricOutlet twoElectricOutlet) {
		this.twoElectricOutlet = twoElectricOutlet;
		this.threeElectricOutlet = threeElectricOutlet;
	}

	@Override
	public void connectElectricCurrent() {
		if(this instanceof ThreeElectricOutlet) {
			twoElectricOutlet.connectElectricCurrent();
		}
		if(this instanceof TwoElectricOutlet) {
			threeElectricOutlet.connectElectricCurrent();
		}
	}	
}

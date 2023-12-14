package Class;

import Interface.ThreeElectricOutlet;
import Interface.TwoElectricOutlet;

public class ThreeElectricAdapter implements ThreeElectricOutlet{
	
	TwoElectricOutlet outlet;
	
	public ThreeElectricAdapter(TwoElectricOutlet outlet) {
		this.outlet = outlet;
	}

	@Override
	public void connectElectricCurrent() {
		outlet.connectElectricCurrent();
	}
	
}

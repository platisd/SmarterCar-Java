package lib.sensor.distance.ir.sharp;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import lib.sensor.distance.MedianDistance;
import lib.sensor.distance.ir.InfraredSensor;

@objid ("13bff49b-c830-40c4-a930-64c329fc83e8")
public abstract class AnalogSharp extends MedianDistance implements InfraredSensor {
    @objid ("ee85f8a8-e408-49e3-b469-3bd96f61a5d1")
    private int pin;

    @objid ("266b2fed-0ad4-499d-9ada-c03737a7fe33")
    protected abstract int voltsToCentimeters(int volts);

    @objid ("06a1c376-6bd4-4479-bade-8c4b92afea57")
    public int attach(int pin) {
		return 0;
    }
    
    public int getDistance(){
    	return 0;
    }

}

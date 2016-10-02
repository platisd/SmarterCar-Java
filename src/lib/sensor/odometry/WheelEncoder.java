package lib.sensor.odometry;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0092f9f8-1d1f-44aa-b4dd-3db4aad5b5fe")
public class WheelEncoder implements OdometerSensor {
    @objid ("309aee65-ad89-4d8b-97f2-1cab413dccdf")
    public void begin() {
    }

    @objid ("04b9a75c-39fa-4724-8e73-80fccf972d19")
    public long getDistance() {
		return 0;
    }

    @objid ("501e00ed-6ec6-4fd4-a0b9-10ca92b9ef53")
    public double getSpeed() {
		return 0;
    }

    @objid ("fccc8e8a-a4ea-4b87-b9c5-5e0064c07125")
    public int attach(int pin) {
		return pin;
    }

}

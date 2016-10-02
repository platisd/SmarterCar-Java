package lib.sensor.distance.sonar.i2c;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import lib.sensor.distance.MedianDistance;
import lib.sensor.distance.sonar.UltrasonicSensor;

@objid ("c4a45687-2e64-4cb4-acee-e9367e7f8a4c")
public abstract class I2cUltrasonic extends MedianDistance implements UltrasonicSensor {
    @objid ("c8cb85bc-91b5-4832-97f1-1ddaba4ad6db")
    protected int address;

    @objid ("46f1743e-beba-4c2d-8052-2435d17499df")
    public int getAddress() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.address;
    }

    @objid ("100db21c-0973-4487-942c-c8eec8382117")
    public void setAddress(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.address = value;
    }

    @objid ("7eccb625-8c13-4297-b7b1-eae13a8939f9")
    protected abstract void ping();

    @objid ("e33528f4-d910-4666-a49f-4ceb09bf9ed2")
    public void attach(int address) {
    }

}

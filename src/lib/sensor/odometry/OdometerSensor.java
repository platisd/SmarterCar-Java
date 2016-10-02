package lib.sensor.odometry;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import lib.sensor.Sensor;

@objid ("c04cd94a-429b-4f82-991d-b44455c9a510")
public interface OdometerSensor extends Sensor {
    @objid ("ff6796c6-792b-4d77-9a10-8703782fc3bc")
    void begin();

    @objid ("5f9b98ae-377e-4407-878f-3b9a10e4afe2")
    long getDistance();

    @objid ("6c510edd-54cd-45db-9bbf-37710234fdd3")
    double getSpeed();

}

package lib.sensor.distance;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import lib.sensor.Sensor;

@objid ("52885bc9-dc30-4019-82ce-86e908fbba6b")
public interface RangeFinder extends Sensor {
    @objid ("a1922998-571a-47b2-9385-154b746da43a")
    int getDistance();

}

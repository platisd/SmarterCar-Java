package lib.sensor.heading;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import lib.sensor.Sensor;

@objid ("554396a5-707a-46cf-a50b-841d3213e63e")
public interface HeadingSensor extends Sensor {
    @objid ("a007372a-c74e-4cc1-940a-9a6798bd260c")
    void update();

    @objid ("3ad456ca-532d-476b-a201-fd645ef952b6")
    int getAngularDisplacement();

}

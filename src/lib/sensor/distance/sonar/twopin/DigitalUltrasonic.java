package lib.sensor.distance.sonar.twopin;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import lib.sensor.distance.MedianDistance;
import lib.sensor.distance.sonar.UltrasonicSensor;

@objid ("926d0ea6-9541-46ea-854e-9d02c2b77115")
public abstract class DigitalUltrasonic extends MedianDistance implements UltrasonicSensor {
    @objid ("33933609-7399-41cd-b47b-2e0c841f527d")
    protected int echoPin;

    @objid ("a565a198-674a-4fb4-ba77-300b56a9300c")
    protected int triggerPin;

    @objid ("20b62fee-e905-4630-8e0b-82315446d0a6")
    public int attach(int triggerPin, int echoPin) {
		return 0;
    }

    @objid ("68a4fff6-268b-49f1-8513-a8bc47e6393a")
    protected abstract void ping();

}

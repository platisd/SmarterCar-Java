package lib.sensor.heading;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("21e3c625-95fd-40a0-8243-ba68ac91792c")
public abstract class NormalizedReader implements HeadingSensor {
    @objid ("45ea21b6-ffaf-4311-905a-bbe357e66e20")
    protected int angularDisplacement;

    @objid ("2782579c-344d-448e-9369-ef4b9a061c3b")
    protected abstract void setAngularDisplacement(int displacement);

}

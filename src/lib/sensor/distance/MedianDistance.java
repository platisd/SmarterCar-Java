package lib.sensor.distance;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f4a6f859-a6da-49a6-adbf-fcd89d37d1a7")
public abstract class MedianDistance implements RangeFinder {
    @objid ("99a2dc28-eb79-4c9e-a96e-2a8dbf2b758d")
    private final int DEFAULT_ITERATIONS = 5;
    private int medianDelay;

    @objid ("2472f80b-3b15-4523-b14f-24f32027ecb8")
    public int getMedianDistance(int iterations) {
		return 0;
    }

    @objid ("4161a0ad-8833-4ca9-bf9f-d1cc19649d5b")
    public int getMedianDistance() {
		return getMedianDistance(DEFAULT_ITERATIONS);
    }

    @objid ("06f30bb9-0da6-454e-bf87-114355510c4f")
    protected abstract void setMedianDelay(int medianDelay);

}

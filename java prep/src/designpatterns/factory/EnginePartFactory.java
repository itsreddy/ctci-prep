package designpatterns.factory;

public class EnginePartFactory implements PartFactory{
    @Override
    public Engine selectPart(String partName) {
        switch (partName) {
            case "FlatPlaneV8":
                return new FlatPlanev8();
            case "TwinCamV6":
                return new TwinCamV6();
            case "FourCylinderBoxer":
                return new FourCylinderBoxer();
            case "InlineFour":
                return new InlineFour();
            default:
                return null;
        }
    }
}

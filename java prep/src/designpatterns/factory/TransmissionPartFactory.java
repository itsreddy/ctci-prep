package designpatterns.factory;

public class TransmissionPartFactory implements PartFactory {
    @Override
    public Transmission selectPart(String partName) {
        switch (partName) {
            case "ZFauto":
                return new ZFauto();
            case "XtracAuto":
                return new XtracAuto();
            case "SixSpeedManual":
                return new SixSpeedManual();
            case "CVTrans":
                return new CVTrans();
            default:
                return null;
        }
    }
}

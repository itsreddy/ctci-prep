package designpatterns.factory;

public class CarGarage {
    public static void main(String[] args) {
        Car car1 = BuildManager.buildCar("TrackCar", "FlatPlaneV8", "ZFauto");
        System.out.println(car1.toString());

        Car car2 = BuildManager.buildCar("RoadCar", "FourCylinderBoxer", "CVTrans");
        System.out.println(car2.toString());
    }
}

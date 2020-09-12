package designpatterns.factory;

public class CarFactory {
    public static Car buildCarBody(String carType){
        if (carType.equals("TrackCar")){
            return new TrackCar();
        }
        else if (carType.equals("RoadCar")){
            return new RoadCar();
        }
        return null;
    }
}

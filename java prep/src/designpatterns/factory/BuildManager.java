package designpatterns.factory;

public class BuildManager {

    public static Car buildCar(String carType, String engine, String trans) {
//        return
        Car car = CarFactory.buildCarBody(carType);

        EnginePartFactory enginePartFactory = new EnginePartFactory();
        if (car != null) {
            car.setEngine(enginePartFactory.selectPart(engine));
        }

        TransmissionPartFactory transmissionPartFactory = new TransmissionPartFactory();
        if (car != null) {
            car.setTransmission(transmissionPartFactory.selectPart(trans));
        }

        return car;
    }
}

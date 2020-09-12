package designpatterns.factory;

public class TrackCar extends Car {

    private Engine engine;
    private Transmission transmission ;

    @Override
    public Engine getEngine() {
        return this.engine;
    }

    @Override
    public void setEngine(Engine engineType) {
        this.engine = engineType;
    }

    @Override
    public Transmission getTransmission() {
        return this.transmission;
    }

    @Override
    public void setTransmission(Transmission transmissionType) {
        this.transmission = transmissionType;
    }

    @Override
    public String toString() {
        return "TrackCar{" +
                "engine=" + engine.getClass().getSimpleName() +
                ", transmission=" + transmission.getClass().getSimpleName() +
                '}';
    }
}

package designpatterns.factory;

public abstract class Car {
    private Engine engine;
    private Transmission transmission ;
//    public String tyres;
//    public String revLimit;

    public abstract Engine getEngine();
    public abstract void setEngine(Engine engineType);

    public abstract Transmission getTransmission();
    public abstract void setTransmission(Transmission transmissionType);

}

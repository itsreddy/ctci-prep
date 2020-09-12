package designpatterns.factory;

public class CVTrans implements Transmission {
    @Override
    public void run() {
        System.out.println("There are no gears cause CVT!");
    }
}

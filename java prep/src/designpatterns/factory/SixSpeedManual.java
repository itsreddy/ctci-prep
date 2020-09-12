package designpatterns.factory;

public class SixSpeedManual implements Transmission {
    @Override
    public void run() {
        System.out.println("Shifting gears with 6 Speed Manual!");
    }
}

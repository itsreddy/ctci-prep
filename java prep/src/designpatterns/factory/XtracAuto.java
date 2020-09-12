package designpatterns.factory;

public class XtracAuto implements Transmission {
    @Override
    public void run() {
        System.out.println("Shifting gears with XTrac Auto 10 Speed!");
    }
}

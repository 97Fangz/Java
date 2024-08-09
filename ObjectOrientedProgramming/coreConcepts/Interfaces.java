public interface Drivable {
    void start();
    void stop();
    void accelerate(int speed);
}

public class Car extends Vehicle implements Drivable {
    // ... other Car code ...

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Car accelerating to " + speed + " mph");
    }
}

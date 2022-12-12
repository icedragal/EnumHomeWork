package transport;

public class Bus extends Transport implements Competing{
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void start() {
        System.out.println("Автобус " + getBrand() + " " +getModel()+ " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус " + getBrand() + " " +getModel()+ " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " +getModel() + " прошел пит-стоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 20);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 90);
    }
}

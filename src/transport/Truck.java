package transport;

public class Truck extends Transport implements Competing{
    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void start() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " +getModel()+ " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " +getModel()+ " закончил движение");
    }

    public void pitStop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " +getModel() + " прошел пит-стоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 30);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 70);
    }
}

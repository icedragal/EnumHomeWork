package transport;

import java.time.LocalDate;
public class Car extends Transport implements Competing{
    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Легковой автомобиль " + getBrand() + " " +getModel()+ " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Легковой автомобиль " + getBrand() + " " +getModel()+ " закончил движение");
    }

    public void pitStop() {
        System.out.println("Легковой автомобиль " + getBrand() + " " +getModel() + " прошел пит-стоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 10);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 200);
    }
}


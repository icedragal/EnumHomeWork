
import transport.Bus;
import transport.Car;
import transport.Truck;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta",1.7F);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0F);
        Car bmw = new Car("BMW", "Z8", 3.0F);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 1.7F);

        Truck truck1 = new Truck("Урал-М", "55571-3121-80", 6.65F);
        Truck truck2 = new Truck("Урал-М", "4320-3171-80", 6.65F);
        Truck truck3 = new Truck("Урал", "6370 63704К-0111", 11.12F);
        Truck truck4 = new Truck("Урал", "Next", 6.65F);

        Bus bus1 = new Bus("ПАЗ", "3205", 10F);
        Bus bus2 = new Bus("ЛиАЗ", "677", 10F);
        Bus bus3 = new Bus("ЛиАЗ", "5292", 10F);
        Bus bus4 = new Bus("ПАЗ", "3292", 10F);

        DriverB kolya = new DriverB("Николай", true, 3);
        DriverC syoma = new DriverC("Семён", true, 7);
        DriverD evgen = new DriverD("Евгений", true, 5);

        kolya.startMoving(audi);
        kolya.finishMoving(audi);
        kolya.refill(audi);
        kolya.printInfo(audi);
    }

}
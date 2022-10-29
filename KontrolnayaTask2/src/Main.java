import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        BMW bmw1 = new BMW("red",200,120000,"mechanic", "X5",12);
        BMW bmw2 = new BMW("green",300,160000,"mechanic", "X6",20);
        Ferrari ferrari1 = new Ferrari("yellow",450,1670000,"mechanic", "Roma",13322);
        Ferrari ferrari2 = new Ferrari("black",380,198000,"mechanic", "Crossplay",12202);
        bmw1.Start(0,2);
        bmw1.Stop();
        bmw1.accelerate(80);
        bmw1.Stop();
        bmw1.yearUsing(3);
        bmw1.Stop();
        ferrari1.Start(0,2);
        ferrari1.Stop();
        ferrari1.accelerate(120);
        ferrari1.Stop();
        Garage garage = new Garage(10);
        garage.addInfo(2,bmw1);
        garage.addInfo(1,ferrari1);
        garage.info();
    }
}
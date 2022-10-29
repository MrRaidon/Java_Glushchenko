import java.lang.reflect.Array;
import java.util.*;

public class Garage {

    private int maxCol;
    HashMap<Car, Integer> carsInGarage;
    private String autoData;
    private ArrayList<Car> cars;

    public String getAutoData() { return this.autoData; }

    public int getMaxCol() { return this.maxCol; }

    public List getCars() { return this.cars; }

    public HashMap getCarsInGarage() { return this.carsInGarage; }


    public Garage(int maxCol){
        this.maxCol = maxCol;
        this.carsInGarage = new HashMap<>();
    }
    public void addInfo(int col, Car car) {
        this.carsInGarage.put(car, col);
    }
    public void info(){
        System.out.println("Информация о машинах" + this.carsInGarage);
    }
}

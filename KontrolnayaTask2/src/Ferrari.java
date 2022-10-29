import java.util.ArrayList;
import java.util.HashMap;

public class Ferrari extends Car{

    private String uniqueModels;

    private int serialNumber;
    private int issueYear;

    public String getUniqueModels() { return this.uniqueModels; }

    public void setUniqueModelsModel(String model) {
        this.uniqueModels = uniqueModels;
    }
    public int getIssueYear() { return this.issueYear; }

    public int getSerialNumber() { return this.serialNumber; }

    public Ferrari(String color, int maxSpeed, int cost, String typeTransmisson, String uniqueModels, int serialNumber){
        super(color, maxSpeed, cost, typeTransmisson);
        this.uniqueModels = uniqueModels;
        this.serialNumber = serialNumber;
    }

    @Override
    public void Stop() {
        super.Stop();

        HashMap<String, String> map =
                new HashMap<>();
        map.put("Roma", "15000");
        map.put("Portofino", "1820000");

        if (map.get(this.uniqueModels) != ""){
            System.out.println("В мире уникальных моделeй этого автомобиля "+ map.get(this.uniqueModels) + " Ваш номер: " + this.serialNumber);
        }
        else {
            System.out.println("Модель машины не явлется уникальной");
        }
    }

}

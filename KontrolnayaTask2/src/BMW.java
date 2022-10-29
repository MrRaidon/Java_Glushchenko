public class BMW extends Car{

    private String model;

    private int garanteePeriod;

    public String getModel() { return this.model; }

    public void setModel(String model) {
        this.model = model;
    }

    public BMW(String color, int maxSpeed, int cost, String typeTransmisson, String model, int garanteePeriod){
        super(color, maxSpeed, cost, typeTransmisson);
        this.garanteePeriod = garanteePeriod;
        this.model = model;
    }
    public int getGaranteePeriod() { return this.garanteePeriod; }


    @Override
    public void Stop() {
        super.Stop();
        if (this.garanteePeriod > 0){
            System.out.println("Оставшийся гарантийный период "+ this.garanteePeriod);
        }
        else {
            System.out.println("Гарантия окончена");
        }
    }
    public void yearUsing(int year) {

        this.garanteePeriod = this.garanteePeriod - year;

    }
}

public abstract class Car {

    private String color;
    private int maxSpeed;

    private int accel = 1;
    private int speed;

    private int cost;
    private String typeTransmisson;

    public String getColor() { return this.color; }

    public int getMaxSpeed() { return this.maxSpeed; }

    public String getTypeTransmisson() { return this.typeTransmisson; }

    public int getSpeed() { return this.speed; }

    public int getCost() { return this.cost; }

    public Car(String color, int maxSpeed, int cost, String typeTransmisson) {
       this.color = color;
       this.maxSpeed = maxSpeed;
       this.cost = cost;
       this.typeTransmisson = typeTransmisson;

    }

    public void Start(int startSpeed, int accel) {
        this.speed = startSpeed;
        this.accel = accel;
    }
    public void Stop() {
        if (this.speed < this.maxSpeed){
            System.out.println("\nТекущая скорость: " + this.speed + "\nМаксимальная скорость: " + this.maxSpeed);
        }
        else {
            System.out.println("\nТекущая скорость превышает максимальную, убедитесь в корректности коэффициента ускорения");
        }
    }
    public void accelerate(int speed) {

        this.speed = speed * this.accel;

    }
}

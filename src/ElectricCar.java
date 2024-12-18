public class ElectricCar extends Car {
    public double BatteryLevel;
    public double Range;

    public ElectricCar(String Brand, String Model, double Price, int CarId, double BatteryLevel, double Range) {
        super(Brand, Model, Price, CarId);
        this.BatteryLevel = BatteryLevel;
        this.Range = Range;

    }

    public void display() {
       // super.display();
        System.out.println("Brand:" +Brand + "Model:" + Model + "Price:" +Price + " CarId:" +CarId + " BatteryLevel:" + BatteryLevel + " Range:" + Range);
    }

}
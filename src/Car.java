public class Car implements ICar{
    public String Brand;
    public String Model;
    public double Price;
    public int CarId;


    public Car(String Brand, String Model,double Price, int CarId ){
        this.Brand = Brand;
        this.Model=Model;
        this.Price=Price;
        this.CarId=CarId;



    }
    public void display(){
        System.out.println("Brand:" +Brand + "Model:" + Model + "Price:" +Price + " CarId:" +CarId );

    }

    public String getBrand(){return this.Brand;}
    public String setBrand(String Brand){this.Brand = Brand;
        return Brand;
    }
    public String getModel(){return this.Model;}
    public String setModel(String setModel){this.Model = Model;
        return setModel;
    }
    public double getPrice(){return this.Price;}
    public double setPrice(double setPrice){this.Price = Price;
        return Price;
    }
    public int getCarId(){return this.CarId;}
    public int setCarId(int CarId){this.CarId = CarId;
        return CarId;
    }

    @Override
    public double getBatteryLevel() {
        return 0;
    }

    @Override
    public double setBatteryLevel(double BatteryLevel) {
        return 0;
    }

    @Override
    public double getRange() {
        return 0;
    }

    @Override
    public double setRange(double Range) {
        return 0;
    }


}

public class Truck implements Auto, Object{
    private String carModel;
    private String enginesType;
    private Float enginePower;
    private Float vehicleWeight;
    private Float mileageInKm;
    private Float liftingCapacity;
    private String bodyType;

    public Truck ()
    {
        carModel = "";
        enginesType = "";
        enginePower = 0F;
        vehicleWeight = 0F;
        mileageInKm = 0F;
        liftingCapacity = 0F;
        bodyType = "";

    }
    public Truck (String carModel, String enginesType, Float enginePower, Float vehicleWeight, Float mileageInKm,  Float liftingCapacity, String bodyType)
    {
        this.carModel = carModel;
        this.enginesType = enginesType;
        this.enginePower = enginePower;
        this.vehicleWeight = vehicleWeight;
        this.mileageInKm = mileageInKm;
        this.liftingCapacity = liftingCapacity;
        this.bodyType = bodyType;
    }
    public Truck( Truck t){ // создаине конструктора копирования
        this.carModel = t.carModel;
        this.enginesType = t.enginesType;
        this.enginePower = t.enginePower;
        this.vehicleWeight = t.vehicleWeight;
        this.mileageInKm = t.mileageInKm;
        this.liftingCapacity = t.liftingCapacity;
        this.bodyType = t.bodyType;
    }

    public String getCarModel () { return carModel; }
    public String getEnginesType () {return enginesType;}
    public Float getEnginePower () {return enginePower;}
    public Float getVehicleWeight () {return vehicleWeight;}
    public Float getMileageInKm () {return mileageInKm;}
    public Float getLiftingCapacity () {return liftingCapacity;}
    public String getBodyType () {return bodyType;}
    public void setCarModel (String carModel) { this.carModel = carModel; }
    public void setEnginesType (String enginesType) {this.enginesType = enginesType;}
    public void setEnginePower (Float enginePower) {this.enginePower = enginePower;}
    public void setVehicleWeight (Float vehicleWeight) {this.vehicleWeight = vehicleWeight;}
    public void setMileageInKm (Float mileageInKm) {this.mileageInKm = mileageInKm;}
    public void setLiftingCapacity (Float liftingCapacity) {this.liftingCapacity = liftingCapacity;}
    public void setBodyType (String bodyType) {this.bodyType = bodyType;}
    @Override
    public void Brand () {
        setCarModel("Грузовой автомобиль");
        System.out.println("Марка машины" +  getCarModel());
    }
    @Override
    public void print () {
        System.out.println("Модель машины          " + getCarModel() + "\n" + "Тип двигателя (карбюраторный или дизельный)          " + getEnginesType() + "\n" + "Мощность двигателя (кВт)          " + getEnginePower () + "\n" + "масса автомобиля          " + getVehicleWeight () + "\n" + "Пробег (км)          " + getMileageInKm () + "\n" + "грузоподъемность (тонны)          " + getLiftingCapacity ()  + "\n" + "тип кузова (открытый или закрытый)          " + getBodyType ());
    }
}

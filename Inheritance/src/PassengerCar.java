abstract public class PassengerCar implements Auto, Object {
    private String carModel;
    private String enginesType;
    private Float enginePower;
    private Float vehicleWeight;
    private Float mileageInKm;
    private Float fuelConsumption;
    private Float accelerationTime;
    public PassengerCar ()
    {
        carModel = "Легковой автомобиль";
        enginesType = "";
        enginePower = 0F;
        vehicleWeight = 0F;
        mileageInKm = 0F;
        fuelConsumption = 0F;
        accelerationTime = 0F;
    }
    public PassengerCar ( String carModel, String enginesType, Float enginePower, Float vehicleWeight, Float mileageInKm, Float fuelConsumption, Float accelerationTime )
    {
        this.carModel = carModel;
        this.enginesType = enginesType;
        this.enginePower = enginePower;
        this.vehicleWeight = vehicleWeight;
        this.mileageInKm = mileageInKm;
        this.fuelConsumption = fuelConsumption;
        this.accelerationTime = accelerationTime;
    }
    public PassengerCar( PassengerCar p){ // создаине конструктора копирования
        this.carModel = p.carModel;
        this.enginesType = p.enginesType;
        this.enginePower = p.enginePower;
        this.vehicleWeight = p.vehicleWeight;
        this.mileageInKm = p.mileageInKm;
        this.fuelConsumption = p.fuelConsumption;
        this.accelerationTime = p.accelerationTime;
    }

    public String getCarModel () { return carModel; }
    public String getEnginesType () {return enginesType;}
    public Float getEnginePower () {return enginePower;}
    public Float getVehicleWeight () {return vehicleWeight;}
    public Float getMileageInKm () {return mileageInKm;}
    public Float getFuelConsumption () {return fuelConsumption;}
    public Float getAccelerationTime () {return accelerationTime;}
    public void setCarModel (String carModel) { this.carModel = carModel; }
    public void setEnginesType (String enginesType) {this.enginesType = enginesType;}
    public void setEnginePower (Float enginePower) {this.enginePower = enginePower;}
    public void setVehicleWeight (Float vehicleWeight) {this.vehicleWeight = vehicleWeight;}
    public void setMileageInKm (Float mileageInKm) {this.mileageInKm = mileageInKm;}
    public void setFuelConsumption (Float fuelConsumption) {this.fuelConsumption = fuelConsumption;}
    public void setAccelerationTime (Float accelerationTime) {this.accelerationTime = accelerationTime;}
    @Override
    public void print () {
       System.out.println("Модель машины          " + getCarModel() + "\n" + "Тип двигателя (карбюраторный или дизельный)          " + getEnginesType() + "\n" + "Мощность двигателя (кВт)          " + getEnginePower () + "\n" + "масса автомобиля          " + getVehicleWeight () + "\n" + "Пробег в км          " + getMileageInKm () + "\n" + "расход топлива на 100 км          " + getFuelConsumption () + "\n" + "время разгона до 100 км/ч в секундах          " + getAccelerationTime ());
    }
}

public class Bus implements Auto, Object {
    private String carModel;
    private String enginesType;
    private Float enginePower;
    private Float vehicleWeight;
    private Float mileageInKm;
    private int numberOfSeats;
    public Bus ()
    {
        carModel = "";
        enginesType = "";
        enginePower = 0F;
        vehicleWeight = 0F;
        mileageInKm = 0F;
        numberOfSeats = 0;
    }
    public Bus ( String carModel, String enginesType, Float enginePower, Float vehicleWeight, Float mileageInKm, int numberOfSeats)
    {
        this.carModel = carModel;
        this.enginesType = enginesType;
        this.enginePower = enginePower;
        this.vehicleWeight = vehicleWeight;
        this.mileageInKm = mileageInKm;
        this.numberOfSeats = numberOfSeats;
    }
    public Bus( Bus b){ // создаине конструктора копирования
        this.carModel = b.carModel;
        this.enginesType = b.enginesType;
        this.enginePower = b.enginePower;
        this.vehicleWeight = b.vehicleWeight;
        this.mileageInKm = b.mileageInKm;
        this.numberOfSeats = numberOfSeats;
    }

    public String getCarModel () { return carModel; }
    public String getEnginesType () {return enginesType;}
    public Float getEnginePower () {return enginePower;}
    public Float getVehicleWeight () {return vehicleWeight;}
    public Float getMileageInKm () {return mileageInKm;}
    public int getNumberOfSeats () {return numberOfSeats;}
    public void setCarModel (String carModel) { this.carModel = carModel; }
    public void setEnginesType (String enginesType) {this.enginesType = enginesType;}
    public void setEnginePower (Float enginePower) {this.enginePower = enginePower;}
    public void setVehicleWeight (Float vehicleWeight) {this.vehicleWeight = vehicleWeight;}
    public void setMileageInKm (Float mileageInKm) {this.mileageInKm = mileageInKm;}
    public void setNumberOfSeats (int numberOfSeats) {this.numberOfSeats = numberOfSeats;}
    @Override
    public void Brand () {
        setCarModel("Автобус");
        System.out.println("Марка машины" +  getCarModel());
    }
    @Override
    public void print () {
        System.out.println("Модель машины          " + getCarModel() + "\n" + "Тип двигателя (карбюраторный или дизельный)          " + getEnginesType() + "\n" + "Мощность двигателя (кВт)          " + getEnginePower () + "\n" + "масса автомобиля          " + getVehicleWeight () + "\n" + "Пробег в км          " + getMileageInKm () + "\n" + "количество мест          " + getNumberOfSeats ());

    }

}

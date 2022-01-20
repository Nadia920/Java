public class Pickup extends PassengerCar {
    @Override
    public void Brand() {
        setCarModel ("Пикап");
    }
    @Override
    public void print () {
        System.out.println("Модель машины          " + getCarModel() + "\n" + "Тип двигателя (карбюраторный или дизельный)          " + getEnginesType() + "\n" + "Мощность двигателя (л.с.)          " + getEnginePower () + "\n" + "масса автомобиля(кг)          " + getVehicleWeight () + "\n" + "Пробег (км)          " + getMileageInKm () + "\n" + "расход топлива на 100 км(л)          " + getFuelConsumption () + "\n" + "время разгона до 100 км/ч (с)          " + getAccelerationTime ());
    }

}

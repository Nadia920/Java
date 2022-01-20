public class Main {
    public static void main(String[] args) {

        Pickup pickup = new Pickup();
        Minivan minivan = new Minivan();
        Truck  truck = new Truck();
        Bus bus = new Bus();

        pickup.setCarModel ("Пикап");
        pickup.setEnginesType ("Карбюраторный");
        pickup.setEnginePower (149.6F);
        pickup.setVehicleWeight (1970F);
        pickup.setMileageInKm (10F);
        pickup.setFuelConsumption (10F);
        pickup.setAccelerationTime (19F);

        minivan.setCarModel ("Минивен");
        minivan.setEnginesType ("Карбюраторный");
        minivan.setEnginePower (235F);
        minivan.setVehicleWeight (2195F);
        minivan.setMileageInKm (30F);
        minivan.setFuelConsumption (6.7F);
        minivan.setAccelerationTime (17.6F);

        truck.setCarModel ("Грузовой автомобиль");
        truck.setEnginesType ("Карбюраторный");
        truck.setEnginePower (500F);
        truck.setVehicleWeight (7850F);
        truck.setMileageInKm (80F);
        truck.setLiftingCapacity (5F);
        truck.setBodyType ("Закрытый");

        bus.setCarModel ("Автобус");
        bus.setEnginesType ("Дизельный");
        bus.setEnginePower (286F);
        bus.setVehicleWeight (18000F);
        bus.setMileageInKm (60F);
        bus.setNumberOfSeats (90);


        System.out.println("Информация об автомобилях");
        System.out.println("-----------------------------------------------------\n");
        System.out.println("\n");
        pickup.print();
        System.out.println("\n");
        minivan.print();
        System.out.println("\n");
        truck.print();
        System.out.println("\n");
        bus.print();
        System.out.println("-----------------------------------------------------\n");
    }
}

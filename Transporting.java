// Transport.java
class Transport {
    public void move() {
        System.out.println("The vehicle is moving.");
    }
}

// Bus.java
class Bus extends Transport {
    public void carryPassengers() {
        System.out.println("The bus is carrying passengers.");
    }
}

// Truck.java
class Truck extends Transport {
    public void carryGoods() {
        System.out.println("The truck is carrying goods.");
    }
}

// Main.java
public class Transporting {
    public static void main(String[] args) {
        Bus myBus = new Bus();
        Truck myTruck = new Truck();

        System.out.println("Bus object:");
        myBus.move();
        myBus.carryPassengers();

        System.out.println("\nTruck object:");
        myTruck.move();
        myTruck.carryGoods();
    }
}

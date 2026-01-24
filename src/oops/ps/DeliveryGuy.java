package oops.ps;

class DeliveryGuy extends Employee implements DeliveryService {

    public DeliveryGuy(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public void work() {
        System.out.println("Delivers Pizza");
    }

    @Override
    public void deliverPizza() {
        System.out.println("Delivered the pizza successfully");
    }
}


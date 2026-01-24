package oops.ps;

public class test {
    public static void main(String[] args) {

        Chef chef = new Chef("Mario", 101);
        Employee deliveryGuy = new DeliveryGuy("Luigi", 102);

        chef.work();
        deliveryGuy.work();

        DeliveryService d = (DeliveryService) deliveryGuy;
        d.deliverPizza();
    }
}


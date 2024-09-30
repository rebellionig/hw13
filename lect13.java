package bana1.tect_13_17.hw;

public class lect13 {
    public static void main(String[] args) {
        Human human = new Human("John");
        Car car = new Car(50);
        Horse horse = new Horse(30);
        Bicycle bicycle = new Bicycle();
        ATV atv = new ATV();

        human.mountTransport(car);
        human.travel("plains", 100);
        human.travel("dense forest", 50); // Should fail
        human.leaveTransport();

        human.mountTransport(horse);
        human.travel("plains", 50);
        human.travel("swamp", 10); // Should fail
        human.leaveTransport();

        human.mountTransport(bicycle);
        human.travel("plains", 30);
        human.travel("swamp", 20); // Should fail
        human.leaveTransport();

        human.mountTransport(atv);
        human.travel("swamp", 60); // Should succeed
        human.leaveTransport();
    }
}
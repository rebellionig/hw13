package bana1.tect_13_17.hw;

class Car extends Transport {
    private int gasoline;

    public Car(int gasoline) {
        this.gasoline = gasoline;
    }

    @Override
    public boolean travel(String area, int distance) {
        if (gasoline <= 0) {
            System.out.println("Out of gasoline!");
            return false;
        }
        if (area.equals("dense forest") || area.equals("swamp")) {
            System.out.println("Car cannot travel in " + area);
            return false;
        }
        gasoline -= distance / 10; // Assuming 10 units of distance per gasoline
        System.out.println("Car traveled " + distance + " units. Remaining gasoline: " + gasoline);
        return true;
    }
}

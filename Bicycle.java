package bana1.tect_13_17.hw;

class Bicycle extends Transport {
    @Override
    public boolean travel(String area, int distance) {
        if (area.equals("swamp")) {
            System.out.println("Bicycle cannot travel in " + area);
            return false;
        }
        System.out.println("Bicycle traveled " + distance + " units.");
        return true;
    }
}
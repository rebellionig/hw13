package bana1.tect_13_17.hw;

class ATV extends Transport {
    @Override
    public boolean travel(String area, int distance) {
        System.out.println("ATV traveled " + distance + " units.");
        return true;
    }
}
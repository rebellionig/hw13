package bana1.tect_13_17.hw;

class Horse extends Transport {
    private int stamina;

    public Horse(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public boolean travel(String area, int distance) {
        if (stamina <= 0) {
            System.out.println("Horse is out of stamina!");
            return false;
        }
        if (area.equals("swamp")) {
            System.out.println("Horse cannot travel in " + area);
            return false;
        }
        stamina -= distance / 5; // Assuming 5 units of distance per stamina
        System.out.println("Horse traveled " + distance + " units. Remaining stamina: " + stamina);
        return true;
    }
}

package bana1.tect_13_17.hw;

class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public void mountTransport(Transport transport) {
        this.currentTransport = transport;
        System.out.println(name + " mounted " + transport.getClass().getSimpleName());
    }

    public void leaveTransport() {
        if (currentTransport != null) {
            System.out.println(name + " left " + currentTransport.getClass().getSimpleName());
            currentTransport = null;
        } else {
            System.out.println(name + " is not on any transport.");
        }
    }

    public void travel(String area, int distance) {
        if (currentTransport != null) {
            boolean success = currentTransport.travel(area, distance);
            System.out.println(name + " attempted to travel " + distance + " units in a " + area + ": " + success);
        } else {
            // Travel by foot
            System.out.println(name + " is traveling by foot " + distance + " units in a " + area);
        }
    }
}
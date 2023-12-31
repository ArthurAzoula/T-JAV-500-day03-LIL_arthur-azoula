public class Astronaut {

    private String name;
    private int snacks;
    private String destination;
    private int id;
    private static int nextId = 0;

    public Astronaut(String name) {
        this.name = name;
        this.snacks = 0;
        this.destination = null;
        this.id = nextId;
        nextId++;
        System.out.println(this.name + " ready for launch!");
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSnacks() {
        return this.snacks;
    }

    public String getDestination() {
        return this.destination;
    }

    public void doActions(Object mars) {
        if(mars instanceof planet.Mars) {
            // cast mars to planet.Mars
            planet.Mars planetMars = (planet.Mars) mars;
            this.destination = planetMars.getLandingSite();
            System.out.println(this.name + ": Started a mission!");
        }
        else if (mars instanceof chocolate.Mars) {
            // cast mars to chocolate.Mars
            this.snacks++;
            chocolate.Mars chocolateMars = (chocolate.Mars) mars;
            System.out.println(this.name + ": Thanks for this mars number " + chocolateMars.getId());
            if (this.destination == null) {
                System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
            }

        } else if (mars instanceof planet.moon.Phobos) {
            // cast mars to planet.moon.Phobos
            planet.moon.Phobos phobos = (planet.moon.Phobos) mars;
            this.destination = phobos.getLandingSite();
            System.out.println(this.name + ": Started a mission!");
        }
    }

    public void doActions() {
        System.out.println(this.name + ": Nothing to do.");
        if (this.destination == null) {
            System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
        }
    }

}

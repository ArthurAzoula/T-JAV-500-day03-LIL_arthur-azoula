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

}

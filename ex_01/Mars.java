public class Mars {

    private static int nextId = 0;
    private int id;

    public Mars() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return this.id;
    }

}

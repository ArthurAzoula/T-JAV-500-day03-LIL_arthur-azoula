package planet;

public class Mars {

    private String landingSite;

    private static int nextId = 0;
    private int id;

    public Mars(String landingSite) {
        this.id = nextId;
        nextId++;
        this.landingSite = landingSite;
    }

    public int getId() {
        return this.id;
    }

    public String getLandingSite() {
        return this.landingSite;
    }

}

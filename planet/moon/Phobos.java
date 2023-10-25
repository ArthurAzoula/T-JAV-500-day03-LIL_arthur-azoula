package planet.moon;

public class Phobos {
    private planet.Mars mars;
    private String landingSite;

    public Phobos(planet.Mars mars, String landingSite) {
        if (mars == null) {
            System.out.println("No planet given.");
        } else {
            this.mars = mars;
            this.landingSite = landingSite;
            System.out.println("Phobos place in orbit.");
        }
    }

    public

    public String getLandingSite() {
        return this.landingSite;
    }

    public planet.Mars getMars() {
        return this.mars;
    }

}

import java.util.ArrayList;

public class Team {

    private String name;
    ArrayList<Astronaut> astronauts;

    public Team(String name) {
        this.name = name;
        this.astronauts = new ArrayList<Astronaut>();
    }

    public String getName() {
        return this.name;
    }

    public void add(Astronaut astronaut) {
        this.astronauts.add(astronaut);
    }

    public void remove(Astronaut astronaut) {
        this.astronauts.remove(astronaut);
    }

    public int countMembers() {
        return this.astronauts.size();
    }

    public void showMembers() {

        if (this.astronauts.isEmpty()) {
            return;
        }

        StringBuilder members = new StringBuilder();
        for (Astronaut astronaut : this.astronauts) {
            if (astronaut.getDestination() != null) {
                members.append(astronaut.getName() + " on mission, ");
            } else {
                members.append(astronaut.getName() + " on standby, ");
            }
        }

        System.out.println(this.name + ": " + members.substring(0, members.length() - 2) + '.');

    }



}

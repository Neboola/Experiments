package lambdas.music;

import java.util.List;

public class Musician {

    private String name;
    private List<Musician> members;
    private String origin;

    public Musician(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    public Musician(String name, List<Musician> members, String origin) {
        this.name = name;
        this.members = members;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Musician> getMembers() {
        return members;
    }

    public void setMembers(List<Musician> members) {
        this.members = members;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public boolean isFrom(String city) {
        return city.equals(origin);
    }

    @Override
    public String toString() {
        return "Musician{" +
                "name='" + name + '\'' +
                ", members=" + members +
                ", origin='" + origin + '\'' +
                '}';
    }
}

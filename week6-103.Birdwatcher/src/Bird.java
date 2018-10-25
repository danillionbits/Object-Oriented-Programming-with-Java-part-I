
public class Bird {

    private String name;
    private String Latin;
    private int observation;

    public Bird(String name, String Latin) {
        this.name = name;
        this.Latin = Latin;
        this.observation = 0;
    }

    public String getName() {
        return this.name;
    }

    public void Observed() {
        this.observation++;
    }

    public String toString() {
        return this.name + " (" + this.Latin + "): " + this.observation + " observations";
    }
}

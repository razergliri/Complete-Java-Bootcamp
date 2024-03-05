import java.util.Objects;

public class Fruit {
    private String name;
    Fruit(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Fruit)) {
            return false;
        }
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }
    public int hashCode() {
        return Objects.hash(name);
    }

}

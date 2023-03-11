package Homework3.drugs;

public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Components{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Component component = (Component) o;

        if (power != component.power) return false;
        if (!name.equals(component.name)) return false;
        return weight.equals(component.weight);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + weight.hashCode();
        result = 31 * result + power;
        return result;
    }
}

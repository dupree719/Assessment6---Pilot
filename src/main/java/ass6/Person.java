package ass6;

public abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Person {" +
                "Name='" + name + '\'' +
                '}';
    }
}

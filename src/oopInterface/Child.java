package oopInterface;

public class Child implements Parent {
    @Override
    public String name(String name) {
        System.out.println(name);
        return name;
    }
}

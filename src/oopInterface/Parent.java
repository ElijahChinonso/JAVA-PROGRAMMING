package oopInterface;

public interface Parent {

    default String name(String name){
        System.out.println("name");
        return name;
    }
}

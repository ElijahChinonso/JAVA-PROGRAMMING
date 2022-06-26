package notePad;

public class Company {

    private String name;
    private int localDateDateCreated;
    private Employee employee;
    private String getEmployee;

    public Company(String name, int localDateDateCreated, Employee employee, String getEmployee){
        this.name = name;
        this.localDateDateCreated = localDateDateCreated;
        this.employee = employee;
        this.getEmployee = getEmployee;
    }

    public String name(){
        return name;
    }

    public int localDateDateCreated(){
        return localDateDateCreated;
    }

    public Employee employee(){
        return employee;
    }

    public String getEmployee(){
        return getEmployee;
    }
}



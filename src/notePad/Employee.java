package notePad;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String companiesName;

    public Employee(String firstName, String lastName, int age, String companiesName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.companiesName = companiesName;
    }

    public String firstName(){
        return firstName;
    }

    public String lastName(){
        return lastName;
    }

    public int age(){
        return age;
    }

    public String companiesName(){
        return companiesName;
    }

    public void getEmployeesCompany(String EmployeesCompany){
        this.companiesName = EmployeesCompany;
    }
}
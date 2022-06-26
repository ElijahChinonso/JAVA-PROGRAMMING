package notePad;

public class EmployeeCompanyTest {

    public static void main(String[] args){

        Employee employ = new Employee("Joy", "Water", 25, "JW limited");
        System.out.printf("Employ firstName is: %s%n", employ.firstName());
        System.out.printf("Employ lastName is: %s%n", employ.lastName());
        System.out.printf("Employ age is: %d%n", employ.age());
        System.out.printf("Employ companiesName is: %s%n%n%n", employ.companiesName());

        Company employii = new Company("Camsy", 2021, employ, "Jake Stone");
        System.out.printf("employii name is: %s%n", employii.name());
        System.out.printf("employii localDateDateCreated is: %d%n", employii.localDateDateCreated());
        System.out.printf("employii Employee is: %s%n", employii.employee());
        System.out.printf("employii getEmployee is: %s%n", employii.getEmployee());
    }
}


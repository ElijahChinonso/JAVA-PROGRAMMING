package notePad;

public class DriverTest {

    public static void main(String[] args) {

        Driver oldDriver = new Driver("Stephen", 5.2, "Chocolate", 42);
        System.out.printf("oldDriver name is: %s%n", oldDriver.name());
        System.out.printf("oldDriver height is: %.1fft%n", oldDriver.height());
        System.out.printf("oldDriver complextion is: %s%n", oldDriver.complextion());
        System.out.printf("oldDriver age is: %d%n%n%n", oldDriver.age());

        Driver newDriver = new Driver("Jackson", 6.1, "Fair", 35);
        System.out.printf("newDriver name is: %s%n", newDriver.name());
        System.out.printf("newDriver height is: %.1fft%n", newDriver.height());
        System.out.printf("newDriver complextion is: %s%n", newDriver.complextion());
        System.out.printf("newDriver age is: %d%n%n", newDriver.age());

        System.out.println("Employer: Hello... yes Mr Jackson how're you doing today?");
        System.out.println("          I have good news, your application to our company for the post of 'A DRIVER' have been assigned to you.");
        System.out.println("          Your work start exactly at 7:00am on monday,");
        System.out.println("          Congratulation Mr. Jackson");
    }
}

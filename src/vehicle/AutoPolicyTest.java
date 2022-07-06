package vehicle;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy(2341-75, "Toyota camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(7845-72, "Ford egde", "ME");

        policuInNofaultState(policy1);
        policuInNofaultState(policy2);
    }

    public static void policuInNofaultState(AutoPolicy policy){
        System.out.println("The auto policy");
        System.out.printf("Account #: %d; car: %s;%nState %s %s a no-fault state%n%n", policy.getAccountNumber(),
                policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState() ? "is": "is not"));
    }
}

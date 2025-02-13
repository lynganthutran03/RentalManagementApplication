import java.util.Scanner;

public class Client {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter information (contract, property, tenant, rent amount): ");
        String contractID = sc.nextLine();
        String propertyID = sc.nextLine();
        String tenantID = sc.nextLine();
        int rentAmount = sc.nextInt();
        System.out.println("Choose 1: permanent, 2: long term or 3: short term: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
            ContractBuilder permanentBuilder = new PermanentContract();
            ContractDirector director = new ContractDirector(permanentBuilder);
            Contract contract = director.buildContract(contractID, propertyID, tenantID, rentAmount);
            System.out.println(contract);
            break;

            case 2:
            ContractBuilder longTermBuilder = new LongTermContract();
            ContractDirector director2 = new ContractDirector(longTermBuilder);
            Contract contract2 = director2.buildContract(contractID, propertyID, tenantID, rentAmount);
            System.out.println(contract2);
            break;

            case 3:
            ContractBuilder shortTermBuilder = new ShortTermContract();
            ContractDirector director3 = new ContractDirector(shortTermBuilder);
            Contract contract3 = director3.buildContract(contractID, propertyID, tenantID, rentAmount);
            System.out.println(contract3);
            break;

            default:
                throw new IllegalArgumentException("Invalid contract type");
        }
    }
}

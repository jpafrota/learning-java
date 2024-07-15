package interfaces;

import interfaces.services.ContractService;
import interfaces.services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter contract data: ");

        System.out.println("Contract Number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.println("Date (DD/MM/YYYY): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Total Value: ");
        double value = sc.nextDouble();
        sc.nextLine();

        Contract contract = new Contract(number, date, value);

        System.out.println("How many installments?");
        int installments = sc.nextInt();
        sc.nextLine();

        ContractService service = new ContractService(new PayPalService());
        service.processContract(contract, installments);

        contract.getInstallmentList().forEach(System.out::println);
    }

}

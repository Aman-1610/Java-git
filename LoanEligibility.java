import java.util.Scanner;

class LoanEligibility {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter account number: ");
    int accountNumber = scanner.nextInt();
    if (accountNumber < 1000 || String.valueOf(accountNumber).charAt(0) != '1') {
      System.out.println("Error: Account number must be 4 digits and start with '1'.");
      return;
    }

    System.out.print("Enter account balance: ");
    double accountBalance = scanner.nextDouble();
    if (accountBalance < 1000) {
      System.out.println("Error: Account balance must be at least $1000.");
      return;
    }

    System.out.print("Enter salary: ");
    double salary = scanner.nextDouble();

    System.out.print("Entper loan type (car, house, business): ");
    String loanType = scanner.next();

    double eligibleLoanAmount = 0;
    int maxNoOfEMIs = 0;
    switch (loanType) {
      case "car":
        eligibleLoanAmount = 500000;
        maxNoOfEMIs = 36;
        break;
      case "house":
        eligibleLoanAmount = 6000000;
        maxNoOfEMIs = 60;
        break;
      case "business":
        eligibleLoanAmount = 7500000;
        maxNoOfEMIs = 84;
        break;
      default:
        System.out.println("Error: Invalid loan type.");
        return;
    }

    if (salary <= 25000 && loanType.equals("car")) {
      System.out.println("Error: You do not meet the salary requirement for a car loan.");
      return;
    } else if (salary <= 50000 && loanType.equals("house")) {
      System.out.println("Error: You do not meet the salary requirement for a house loan.");
      return;
    } else if (salary <= 75000 && loanType.equals("business")) {
      System.out.println("Error: You do not meet the salary requirement for a business loan.");
      return;
    }

    System.out.print("Enter requested loan amount: ");
    double requestedLoanAmount = scanner.nextDouble();
    if (requestedLoanAmount > eligibleLoanAmount) {
      System.out.println("Error: Requested loan amount is higher than the eligible loan amount.");
      return;
    }

    System.out.print("Enter number of EMIs: ");
    int requestedNoOfEMIs = scanner.nextInt();
    if (requestedNoOfEMIs > maxNoOfEMIs) {
      System.out.println("Error: Requested number of EMIs is higher than the maximum number of EMIs allowed by the bank.");
      return;
    }

    System.out.println("Account number: " + accountNumber);
    System.out.println("Eligible loan amount: $" + eligibleLoanAmount);
    System.out.println("Requested loan amount: $" + requestedLoanAmount);
    System.out.println("Number of EMIs: " + requestedNoOfEMIs);

    System.out.println("Your loan application has been approved.");
  }
}
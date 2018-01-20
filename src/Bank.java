import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		LoanFactory loanFactory = new LoanFactory();
		Customer customer = new Customer();
		LoanCalculator loanCalculator = null;
		LoanStrategy loanStrategy = null;
		do
		{
			System.out.println("\n\nMENU - Types of Loans");
			System.out.println("1 - Personal Loan");
			System.out.println("2 - Home Loan");
			System.out.println("3 - Car Loan");
			System.out.println("4 - Exit");
			System.out.println("Please enter your choice : ");
			choice  = sc.nextInt();
			if(choice!=4)
			{
				System.out.println("Name : ");
				customer.setName(sc.next());				
	
				System.out.println("Age : ");
				customer.setAge(sc.nextInt());
	
				System.out.println("Gender: ");
				customer.setGender(sc.next());

				System.out.println("Loan Amount : ");
				customer.setLoan_amt(sc.nextFloat());

				System.out.println("Loan Tenure : ");
				customer.setTenure(sc.nextInt());
				

				loanStrategy = loanFactory.getLoanType(choice, customer);
				loanCalculator = new LoanCalculator(loanStrategy,customer);
				loanCalculator.calculateEMI();
			}
			else
			{
				System.out.println("Thank You For Using !");
			}
		}while(choice!=4);
		sc.close();
	}

}

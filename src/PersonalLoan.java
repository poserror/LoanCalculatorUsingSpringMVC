
public class PersonalLoan implements LoanStrategy 
{
	public double calInterestRate(Customer customer)
	{
		System.out.println("Calculating Interest Rate on Personal Loan");
		double loan_amt = customer.getLoan_amt();
		double interest_rate = 1;
		if(customer.getAge() > 16 && customer.getAge() < 64)
		{
			
			if(loan_amt > 100000 && loan_amt < 500000)//1 lakh to 5 lakh 14%
				interest_rate = 0.14;			
			else if(loan_amt > 500000.0)//above 5 lakhs 18%
				interest_rate = 0.18;
			else
				interest_rate = 1;		
		}
		else if(customer.getAge() > 65)
		{
			if(loan_amt > 100000 && loan_amt < 300000)//1 lakh to 3 lakh 14%
				interest_rate = 0.13;			
			else if(loan_amt > 300000.0)//above 5 lakhs 18%
				interest_rate = 17.5;
			else
				interest_rate = 0.1;					
		}
		return interest_rate;
	}
}

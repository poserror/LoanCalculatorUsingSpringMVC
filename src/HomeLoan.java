
public class HomeLoan implements LoanStrategy 
{
	public double calInterestRate(Customer customer)
	{
		System.out.println("Calculating Interest Rate on Home Loan");
		double loan_amt = customer.getLoan_amt();
		double interest_rate = 1;
		if(customer.getGender().equalsIgnoreCase("M"))
		{
			if(loan_amt>100000 && loan_amt<5000000)//1 lakhs to 50 lakhs 9.25
				interest_rate =  9.5/100;
			else if(loan_amt>5000000 && loan_amt<10000000)//50 lakh to 1 crore 9.5
				interest_rate =  9.5/100;
			else if(loan_amt>10000000)//above 1 crore 9.75
				interest_rate =  9.75/100;
			else
				interest_rate =  1;
		}
		else if(customer.getGender().equalsIgnoreCase("F"))
		{
			if(loan_amt > 100000 && loan_amt < 300000)//1 lakh to 1 crore 9.5%
				interest_rate = 9.5/100;			
			else if(loan_amt > 10000000.0)//above 1 crore 18%
				interest_rate = 9.75/100;
			else
				interest_rate = 1;					
		}
		return (double) interest_rate;
	}
}

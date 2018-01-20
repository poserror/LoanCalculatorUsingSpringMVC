public class LoanFactory 
{
	LoanStrategy getLoanType(int choice, Customer customer)
	{		
		LoanStrategy loanstrategy = null;
		switch(choice)
		{
		case 1:
			loanstrategy = new PersonalLoan();
			break;
		case 2:
			loanstrategy = new HomeLoan();
			break;
		case 3:
			loanstrategy = new CarLoan();
			break;
		default:
			break;
		}
		return loanstrategy;		
	}
}

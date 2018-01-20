
public class LoanCalculator 
{
	private LoanStrategy loanStrategy;
	Customer customer;
	LoanCalculator(LoanStrategy loanStrategy, Customer customer){
		this.loanStrategy = loanStrategy;
		this.customer = customer;
	}	
	public void calculateEMI()
	{
		customer.setInterestRate(loanStrategy.calInterestRate(customer));
		
		System.out.println(customer.toString());
		System.out.println("Interest Received : "+customer.getInterestRate());
		
		double temp1 = customer.getInterestRate() * Math.pow((1 + customer.getInterestRate()),customer.getTenure());
		double temp2 = Math.pow((1+customer.getInterestRate()),customer.getTenure()) - 1 ;
		
		customer.setEmi(customer.getLoan_amt() * (temp1/temp2));		
		
		System.out.println("\n\nSo Your EMI : "+customer.getEmi());
	}
}
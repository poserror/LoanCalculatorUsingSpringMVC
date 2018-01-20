
public class Customer 
{
	private String gender,name;
	private int tenure,age;
	private double emi;
	private double interest_rate, loan_amt;
	Customer()
	{
		this.name = null;
		this.gender = null;
		this.tenure = 0;
		this.age = 0;		
	}
	Customer(String name,String gender,int tenure,int age)
	{
		this.name = name;
		this.gender = gender;
		this.tenure = tenure;
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public double getInterestRate() {
		return interest_rate;
	}
	public void setInterestRate(double interest_rate) {
		this.interest_rate = interest_rate;
	}
	public double getLoan_amt() {
		return loan_amt;
	}
	public void setLoan_amt(double loan_amt) {
		this.loan_amt = loan_amt;
	}
	public String toString()
	{
		String msg = "Customer Details\nName : "+getName()+"\nAge : "+getAge()+"\nTenure : "+getTenure();
		return msg;
	}
}

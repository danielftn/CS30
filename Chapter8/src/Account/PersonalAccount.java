package Account;

public class PersonalAccount extends Account{
	
	public PersonalAccount(String fName, String lName, double bal, double depo,double with) 
	{
		super(fName,lName, bal, depo,with);
		deposit = depo;
		withdraw = with;
		
		
		
		if (balance < 100)
		{
			System.out.println("Two dollars will be charged");
			balance = (balance - 2);
		}
	}
	
	

	public String toString()
	{
		return(super.toString() + " your balance is now $" + balance);
	}

}


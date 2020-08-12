package OOPConceptPart2;

public class HSBCBank implements USBank {

	
	//if a class is implementing any Interface, then its mandatory to define/override all the method of Interface
	
	public void  credit() {
		System.out.println("hsbc credit");
	}

	@Override
	public void debit() {
		System.out.println("hsbc debit");
	}

	@Override
	public void transferMoney() {
		System.out.println("hsbc transfermoney");
	}
	
	public void educationalLoan() {
		System.out.println("hsbc edu loan");
	}
	
	
	public void carLoan() {
		
		System.out.println("hsbc carLoan");
	}
	
	
	
	
}

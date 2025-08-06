package java_project ;
		abstract class BankAccount {
		    abstract void calculateInterest();
		    public void showbalance() {
		    	System.out.println("showing balance");
		    }
		    
	}
	class SavingAccount extends BankAccount {
		 public void calculateInterest() {
				System.out.println("interest for saving account is 4%");
			}
		}
	class FixedDeposit extends BankAccount {
		public void calculateInterest() {
			System.out.println("interest for fixed deposit is 4%");
		}
	}
	public class Task11 {
		public static void main(String[] args) {
			BankAccount acc1 = new SavingAccount();
			BankAccount acc2 = new FixedDeposit();
			
			acc1.showbalance();
			acc1.calculateInterest();
			
			acc2.calculateInterest();
			acc2.showbalance();
			
			
			
		}
	}
	
	
	
		



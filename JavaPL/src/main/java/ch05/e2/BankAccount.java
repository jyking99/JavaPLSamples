package ch05.e2;

public class BankAccount {
	private long number;
	private long balance;
	private History history = new History();
	
	public class Action {
		private String act;
		private long amount;
		
		Action(String act, long amount) {
			this.act = act;
			this.amount = amount;
		}
		
		public String toString() {
			// identify our enclosing account
			return number + ": " + act + " " + amount;
		}
	}
	
	public class History {
		private Action action = null;
		private History next = null;
		
		public History() {
			
		}
		
		private History(Action action) {
			this.action = action;
		}
		
		public void add(Action action) {
			this.next = new History(this.action);
			this.action = action;
		}
	}
	
	public void deposit(long amount) {
		balance += amount;
		history.add(new Action("deposit", amount));
	}
	
	public void withdraw(long amount ) {
		balance -= amount;
		history.add(new Action("withdraw", amount));	
	}
}

import java.util.Date;

public class W_1and2_LQ2_ATM {

	public static void main(String[] args) {
		Account a = new Account();
		Account a1 = new Account(1122, 20000, 4.5, new Date(25 - 10 - 2003));

		a1.getMonthlyInterestRate();
		a1.getMonthlyInterest();
		a1.withdraw(2500);
		a1.deposite(3000);
		System.out.println("Update Balance ="+ a1.getBalance() );

	}

	public static class Account {
		private int id;
		private double balance;
		private double annualInterestRate;
		private Date dateCreated;
		private double mir;

		public Account() {

			this.id = 0;
			this.balance = 0;
			this.annualInterestRate = 0.1;
			this.dateCreated = dateCreated;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public double getAnnualInterestRate() {
			return annualInterestRate;
		}

		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}

		public Date getDateCreated() {
			return dateCreated;
		}

		public void setDateCreated(Date dateCreated) {
			this.dateCreated = dateCreated;
		}

		public Account(int id, double balance, double annualInterestRate, Date dateCreated) {
			super();
			this.id = id;
			this.balance = balance;
			this.annualInterestRate = annualInterestRate;
			this.dateCreated = dateCreated;
		}

		public void getMonthlyInterestRate() {
			double mir = annualInterestRate / (12 * 100);
			this.mir = mir;
			System.out.println("Monthly Interest Rate =" + mir);

		}

		public void getMonthlyInterest() {
			double mi = mir * balance;
			System.out.println("Monthly Interest = " + mi);
		}

		public void withdraw(int w) {
			balance -= w;
			System.out.println("Withdraw= " + w);
		}

		public void deposite(int d) {
			balance += d;
			System.out.println("Deposite= " + d);
		}

	}
}

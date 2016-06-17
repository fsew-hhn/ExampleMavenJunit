package ExampleMavenJunit.ExampleMavenJunitArtifactID;

public class bankaccount {
	private double balance = 0;
	
	public void deposit(double x) { 
		balance += x;
	}
	
	public void withdraw(double x) {
		if(x > balance){
			throw new RuntimeException("geht nicht");
		}
		balance -= x;
	}
	public double getBalance() {
		return balance;
	}
}

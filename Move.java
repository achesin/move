package move;
import java.util.ArrayList;

	
public class Move {
	private ArrayList<Account> accounts;
	
	public Move () {
		accounts = new ArrayList<Account>();
	}
	
	public void addAccount(Account newAccount) {
		accounts.add(newAccount);
	}
	
	public ArrayList <Account> getAccounts() {
		return accounts;
	}
	
	public void printAccounts() {
		for (Account p: accounts) {
			System.out.println(p.getUsername());
		}
	}
}


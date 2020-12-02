package assignment5;

import java.util.ArrayList;
import java.util.List;


public class AccountService {
	List<Account> accounts = new ArrayList<>();
	public void addAccount(Account a) throws AccountException{
		for (Account account : accounts) {
			if(account.getAccountNo()==a.getAccountNo())
				throw new AccountException();
		} 
		accounts.add(a);	
	}
	public void removeAccount(int num) throws AccountException1 {
		Account resaccount = null;
		for (Account account : accounts) {
			if(account.getAccountNo()==num)
				resaccount=account;
		}
		if(resaccount==null)
			throw new AccountException1();
		else {
			for (Account account : accounts) {
				if(account.getAccountNo()==num)
					accounts.remove(account);
			}}
		
	}
	public void getAccountByNo(int num) throws AccountException1 {
		Account resaccount = null;
		for (Account account : accounts) {
			if(account.getAccountNo()==num)
				resaccount=account;
		}if(resaccount==null)
			throw new AccountException1();
		else
			System.out.println(resaccount);
	}
	public void getAllaccounts() {
		accounts.stream().forEach(item->System.out.println(item));
	}
	public void getAccountswithLowBalnce() {
		accounts.stream().forEach(item->{if(item.getAccountBalance()<1000) System.out.println(item);});
	}

}

//package hw3;

import java.util.ArrayList;
import java.util.Collections;

public class BankAccountTest {
	public static void main(String[] args)
	{
		ArrayList<BankAccount> list = new ArrayList<>();
		BankAccount b1 = new BankAccount(1, 300); // call the second constructor
		BankAccount b2 = new BankAccount(2, 400);
		b1.deposit(105);
		
		BankAccount b3 = new BankAccount(3, 10);
		BankAccount b4 = new BankAccount(4, 300.64);
		BankAccount b5  = new BankAccount(5, 20.56);
		BankAccount b6 = new BankAccount(6, 500);

		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i).getbalance());
		
	}

}


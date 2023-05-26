package SolvedQuestions;

import java.util.Scanner;
public class MyBank {
	static String accname,str;
	static char acctype;
	static private int balance,dmoney,wmoney,accountid;
	public MyBank(int balance,int accnumber,String name,char c)
	{
		this.balance = balance;
		this.accountid = accnumber;
		this.accname = name;
		this.acctype = c;
	}

	public static void displayaccountinfo()
	{
		System.out.println("Your account name = "+accname);
		System.out.println("Your account number = "+accountid);
		System.out.println("S for saving c for current Account type ="+acctype);
		System.out.println("Your total balance = "+balance);
	}
	public static boolean checkbalance(int withdraw)
	{
		if(balance>withdraw)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static void depositmoney()
	{
		System.out.println("Your total balance ="+balance);
		System.out.println("Enter your deposit money");
		dmoney = new Scanner(System.in).nextInt();
		balance = balance+dmoney;
		System.out.println("Your total balance = "+balance);
		System.out.println("Deposit money sucessfully");
		
	}
	public static void withdrawmoney()
	{
		System.out.println("Enter your withdraw money");
		wmoney = new Scanner(System.in).nextInt();
		
		if(checkbalance(wmoney))
		{
			System.out.println("Your total balance = "+balance);
			balance = balance - wmoney;
			System.out.println("Your withdraw money = "+wmoney);
			System.out.println("Your total balance = "+balance);
			System.out.println("Withdraw money sucessfully");
		}
		else {
			System.out.println("Your withdraw money exceeds the total balance amount");
		}
	}
	public static void exit()
	{
		System.exit(0);
	}
	public static void main(String[] args) {
		MyBank b1 = new MyBank(10000,1001,"Kiran Ghimire",'s');
		do {
		System.out.println("Welcome to My Bank");
		System.out.println("Options");
		System.out.println("1. Deposit Money");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Display Account Information");
		System.out.println("4. Exit");
		System.out.println("Enter your option");
		int option = new Scanner(System.in).nextInt();
		switch(option)
		{
		case 1:
			depositmoney();
			break;
		case 2:
			withdrawmoney();
			break;
		case 3:
			displayaccountinfo();
			break;
		case 4:
			exit();
		default:
			System.out.println("Please have an correct option");
		}
		System.out.println("Do you want to continue");
		System.out.println("Press y for continue and other key for exit");
		str = new Scanner(System.in).nextLine();
	}while(str.equalsIgnoreCase("y"));//ch=='Y'||ch=='y
}
}

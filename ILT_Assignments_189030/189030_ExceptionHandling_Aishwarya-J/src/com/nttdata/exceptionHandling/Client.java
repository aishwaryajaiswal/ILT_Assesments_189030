package com.nttdata.exceptionHandling;
import java.util.ArrayList;
import java.util.Scanner;
public class Client {
	static Scanner scanner=new Scanner(System.in);
	
public static ArrayList<User> create_acct(ArrayList<User> userList) throws InsufficientAmount, ZeroBalance
	{
	System.out.println("Enter User Name");
	String userName=scanner.next();
	System.out.println("Enter User Address");
	String userAddress=scanner.next();
	System.out.println("Enter Account Id");
	int acctId=scanner.nextInt();
	System.out.println("Enter Account Balance");
	double acctBalance=scanner.nextDouble();
	System.out.println("Enter your SecretPin");
	int acctPin=scanner.nextInt();
	Account acct=new Account(acctId, acctBalance, acctPin);
	User user=new User(userName, userAddress, acct);
    userList.add(user);System.out.println(userList);
    System.out.println("Account created Successfully");
    System.out.println("press 1 to continue create acct 2 to amount transfer");int n=scanner.nextInt();
	if(n==1)
	{
		userList=create_acct(userList);
	}
	else
	{
		transfer_amount(userList);
	}
	return userList;
		
	}
public static void transfer_amount(ArrayList<User> userList) throws InsufficientAmount, ZeroBalance
{
	System.out.println("Enter your Choice\n1.Transfer amount\n2.quit");
	int input=scanner.nextInt();
	if(input==1)
	{
		System.out.println("Enter your Account ID");
		@SuppressWarnings("unused")
		int id=scanner.nextInt();
		System.out.println("Enter your Pin");
		int pin=scanner.nextInt();
		for(int i=0;i<userList.size();i++)
		{
			if(pin==((User) userList.get(i)).getAccount().getAccountPin())
			{
				User user1=new User(((User) userList.get(i)).getUserName(),((User) userList.get(i)).getUserAddress(), ((User) userList.get(i)).getAccount());
				System.out.println("Enter the Account ID the to be transfered");
				int id1=scanner.nextInt();
				System.out.println("Enter the amount to be transfered");
				double amount=scanner.nextDouble();
				for(int j=0;j<userList.size();j++)
				{
					if(id1==((User) userList.get(j)).getAccount().getAccountId())
					{
						User user2=new User(((User) userList.get(j)).getUserName(),((User) userList.get(j)).getUserAddress(), ((User) userList.get(j)).getAccount());
						Bank bank=new Bank();
						System.out.println("Before transfer");
						System.out.println(userList.get(i));
						System.out.println(userList.get(j));
						bank.transfer(user1, user2, amount);
						System.out.println("TRANSFER SUCCESSFULL!!!!!!!!!");
						System.out.println("After transfer");
						System.out.println(userList.get(i));
						System.out.println(userList.get(j));
					}
				}	
			}
		}
	}
}
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InsufficientAmount, ZeroBalance{
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO BANK APPLICATION");
		System.out.println("Press the following to get into it\n1.Create Account\n2.Amount Transfer\n3.Quit");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		ArrayList<User> userList=new ArrayList<>();
		
		if(choice==1)
		{
			System.out.println("Enter your choice\n1.Create Account\n2.Repeat Account Creation\n3.Quit");
			int input=scanner.nextInt();
			if(input==1)
			{
				userList=create_acct(userList);
			}
			else if(input==2)
			{
				main(args);
			}
			else if(input==3)
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid Choice..");
			}
		}
		else if(choice==2)
		{
			System.out.println("Create Account and then Proceed to Treansfer..");
			create_acct(userList);
		}
		else if(choice==3)
		{
			System.exit(0);
		}
		else {
			System.out.println("Invalid Choice...");
		}
	}

}

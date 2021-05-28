/**
 * this program use to help the employee to find the client and make sure from his account
 * and make the client put or take his account
 **/
package bank_system;

import java.util.Scanner;

/**
 *
 * @author  معتز محمد بنيامين محمد  20190550 &&همام رامي عطار 20160325
 * @version 15.3
 *  last edit 24/4/2021
 */
 
public class bankSystem 
{

    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in);
        Client client ;
        Account account ;
        String name, address, phone, nationalID ,companyName ,comercialID;
        int choice = 0, x = 10000;
        System.out.println("Enter the bank name ,address, and phone");
        name = enter.nextLine();
        address = enter.nextLine();
        phone = enter.nextLine();
        Bank bank = new Bank(name, address, phone);
        System.out.println(bank.toString());
        while (x != 0) 
        {
            
            System.out.println("1-Add Ordinary client"+"\n"+"2-ADD commerical client"+"\n"+"3-disposit "+"\n"+"4-withdraw"+"\n"
                    +"5-display all"+"\n"+"6-inform balance"+"\n"+"7-close");
            choice = enter.nextInt();
            switch (choice)
            {
                case 1: //          normal client
                    System.out.println("1- Normal account"+"\t"+"2- Special account");
                    choice = enter.nextInt();
                    switch (choice) 
                    {
                        case 1://normal account
                            account = new NormalAccount();
                            System.out.println("enter name, address, phone, nationalID");
                            enter.nextLine();
                            name = enter.nextLine();
                            address = enter.nextLine();
                            phone = enter.nextLine();
                            nationalID = enter.nextLine();
                            client = new Client(name, address, phone, nationalID, account);
                            bank.addElement(client, account);
                            System.out.println("your Account ID Is : "+account.getAccountNumber()+"\n");
                        break;
                        case 2: //Special account
                            account = new SpecialAccount();
                            System.out.println("enter name, address, phone and nationalID");
                            enter.nextLine();
                            name = enter.nextLine();
                            address = enter.nextLine();
                            phone = enter.nextLine();
                            nationalID = enter.nextLine();
                            client = new Client(name, address, phone, nationalID, account);
                            bank.addElement(client, account);
                            System.out.println("your Account ID Is : "+account.getAccountNumber()+"\n");
                        break;
                    }
                    break;
                case 2:     //          comercial Client
                    System.out.println("1- Normal account"+"\t"+"2- Special account");
                    choice = enter.nextInt();
                    switch (choice) 
                    {
                        case 1://normal account
                            account = new NormalAccount();
                            System.out.println("enter Company name, address, phone, ComercialID");
                            enter.nextLine();
                            companyName = enter.nextLine();
                            address = enter.nextLine();
                            phone = enter.nextLine();
                            comercialID = enter.nextLine();
                            client = new CommercialClient(companyName,address,phone,comercialID,account);
                            bank.addElement(client, account);
                            System.out.println("your Account ID Is : "+account.getAccountNumber()+"\n");
                            break;
                        case 2: //Special account
                            account = new SpecialAccount();
                            System.out.println("enter Company name, address, phone, ComercialID");
                            enter.nextLine();
                            companyName = enter.nextLine();
                            address = enter.nextLine();
                            phone = enter.nextLine();
                            comercialID = enter.nextLine();
                            client = new CommercialClient(companyName,address,phone,comercialID,account);
                            bank.addElement(client, account);
                            System.out.println("your Account ID Is : "+account.getAccountNumber()+"\n");
                            break;
                    }
                    break;
                case 3: // Deposit
                    System.out.println("ENTER account number and amount you want Depsit");
                    int accountNumber=enter.nextInt();
                    float amount =enter.nextInt();
                    if(bank.diposit(accountNumber,amount)==1)
                    {
                        System.out.println("Diposit Successed");
                        System.out.println("the Balance is : "+bank.informBalance(accountNumber)+"\n");
                    }
                    else if(bank.diposit(accountNumber,amount)==0)
                        System.out.println("Diposit failed , ");
                    else if(bank.diposit(accountNumber,amount)==-1)
                        System.out.println("Diposit failed , Account number is NOT correct");
                    break;
                case 4: // Withdraw
                    System.out.println("ENTER account number and amount you want Withdraw");
                    accountNumber=enter.nextInt();
                    float amount2 =enter.nextInt();
                    if(bank.withDraw(accountNumber,amount2)==1)
                    {
                        System.out.println("withdraw Successed");
                        System.out.println("the Balance is : "+bank.informBalance(accountNumber)+"\n");

                    }
                    else if(bank.withDraw(accountNumber,amount2)==0)
                        System.out.println("withdraw failed , you reached limit od withdraw ");
                    else if(bank.withDraw(accountNumber,amount2)==-1)
                        System.out.println("withdraw failed Account number is NOT correct");
                    break;
                case 5: // dispaly Accounts
                    bank.disPlay();
                    break;
                case 6://inform balance
                    System.out.println("ENTER account number to know Balance");
                    int AccountNumber = enter.nextInt();
                    float balance=bank.informBalance(AccountNumber);
                    if(balance!=-1)
                    System.out.println("the Balance is : "+balance);
                    else
                        System.out.println("Check your Account number");
                    break;
                case 7:
                    x=0;
                    break;
            }
        }
    }
}

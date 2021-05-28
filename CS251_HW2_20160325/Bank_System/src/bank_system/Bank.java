
package bank_system;


import java.util.ArrayList;

public class Bank 
{
    protected String name, address , phone;
    protected ArrayList<Client> clientArrayList = new ArrayList<Client>();
    protected ArrayList<Account> accountArrayList = new ArrayList<Account>();
    public Bank(String name, String address , String phone ) 
    {
        this.name=name;
        this.phone=phone;
        this.address=address;
    }

    /**
     *
     * @param client client object that will be add in client array
     * @param account account object  that will be add in account array
     */
    public void addElement(Client client ,Account account)
    {
        clientArrayList.add(client);
        accountArrayList.add(account);
    }
    /**
     *
     * @param accountNumber Account number , refer to the account that i want to diposit on that account's balance
     * @param amount the amount of money i want to diposit
     * @return return 1 if process completed , return 0 if some error happend , return -1 of the account number not exist
     */
    public int diposit (int accountNumber,float amount  )
    {
        for (int i=0;i<accountArrayList.size();i++)
            if(accountArrayList.get(i).accountNumber==accountNumber)
                return accountArrayList.get(i).deposit(amount)? 1 : 0; // cast boolean to int
        return -1;
    }

    /**
     *
     * @param accountNumber Account number , refer to the account that i want to withdraw on that account's balance
     * @param amount the amount of money i want to withdraw
     * @return return 1 if process completed , return 0 if the client reach to the limit of withdraw , return -1 of the account number not exist
     */
    public int withDraw (int accountNumber,float amount  )
    {
        for (int i=0;i<accountArrayList.size();i++)
            if(accountArrayList.get(i).accountNumber==accountNumber)
                 return accountArrayList.get(i).withDraw(amount)? 1 : 0; // cast boolean to int
        return -1;
    }
    /**
     *
     * @param accountNumber Account number , refer to the account that i want to inform his balance
     * @return the balance depend on account number
     */
    public float informBalance (int accountNumber)
    {
        for (int i=0;i<accountArrayList.size();i++)
            if(accountArrayList.get(i).accountNumber==accountNumber)
            return accountArrayList.get(i).getBalance();
        return -1;
    }
    /**
     * print all client with their accounts + print all accounts
     */
    public void disPlay()
    {
        System.out.println(clientArrayList);
        
    }

    /**
     *
     * @param Name enter name of bank
     */
     public void setName(String Name) 
    {
        name = Name;
    }

    /**
     *
     * @return return name of bank as String
     */
    public String getName() 
    {
        return name;
    }

    /**
     *
     * @param Add address of bank
     */
    public void setAddress(String Add) 
    {
        address = Add;
    }

    /**
     *
     * @return return address of bank
     */
    public String getAddress()
    {
        return address;
    }

    /**
     *
     * @param number set phone number of bank
     */
    public void setPhone(String number) 
    {
        phone = number;
    }

    /**
     *
     * @return return phone number of bank
     */
    public String getPhone()
    {
        return phone;
    }

    /**
     *
     * @return String of information of the bank
     */
    @Override
    public String toString() 
    {
        return " Bank Name =" + getName()+"Bank addres =" + getAddress()+" Bank phone =" + getPhone() ;
    }
} 

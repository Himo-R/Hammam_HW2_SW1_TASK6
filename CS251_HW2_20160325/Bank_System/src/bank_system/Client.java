/**
 * in this we will take the information about client 
 * and link it with his account
 */
package bank_system;

/**
 *
 * @author معتز محمد بنيامين محمد 20190550 
 * last edit 24/4
 */
public class Client 
{

    private String name, address;
    private String phone, nationalID;
    private Account account;
/**
 * here the client will initialize with unKnown if he not enter any in formation  
 */
    public Client() 
    {
        name = "unknown";
        address = "unknown";
        nationalID = "unknown";
        phone = "unknown";
    }
/**
 * 
 * @param person here the client has to enter his full name(ex,moataz mohamed benyamin)
 * @param address client has to enter it right because if any message the bank want to deliver 
 * @param phoneNumber here client enter his number in 11 digits 
 * @param nationalID he should enter 14 digits to make sure from his identity   
 * @param account to link client with his account
 */
    public Client(String person, String address, String phoneNumber, String nationalID,Account account) 
    {
        name = person;
        this.address = address;
        phone = phoneNumber;
        this.nationalID = nationalID;
       this. account=account;
    }
/**
 * 
 * @param Name here the client has to enter his full name
 */
    public void setName(String Name)
    {
        name = Name;
    }
    /**
 * 
 * @return client's name to save it
 */
    public String getName() 
    {
        return name;
    }
/**
 * 
 * @param Add client has to enter it right(ex,city,quarter,street,building number)
 */
    public void setAddress(String Add) 
    {
        address = Add;
    }
/**
 * 
 * @return client address in string 
 */
    public String getAddress() 
    {
        return address;
    }
/**
 * 
 * @param Id input 14 digits and he must enter them in number
 */
    public void setNationalID(String Id) 
    {
        nationalID = Id;
    }
/**
 * 
 * @return numbers that make client identify to the bank
 */
    public String getNationalID() 
    {
        return nationalID;
    }
/**
 * 
 * @param number enter 11 numbers
 */
    public void setPhone(String number) 
    {
        phone = number;
    }
/**
 * 
 * @return client's number 
 */
    public String getPhone() 
    {
        return phone;
    }
    /**
     * 
     * @param account link client with his account 
     */
    public void setAccount(Account account) 
    {
        this. account=account;
    }
/**
 * 
 * @return return account object   
 */
    public Account getAccount()
    {
        return account;
    }
    /*
     * this function make to polymorphism work will without abstract class
     */
     public void setCommercialID()
     {
     
     }
     /**
      * this function make to polymorphism work will without abstract class
      * @return initialize  CommercialID with zero 
      */
     public  String getCommercialID()
     {
         return "000000000000";
     }
    
   /**
    * 
    * @return display all private member in interface
    */
    @Override
   public String toString()
   {
        return  " Client Name= "+name+" "+" client phone= "+phone+" "+"Client addres= "+address+" "+"client NationalID= "+nationalID
                +"\n"+" Acount in formation :"+account+"\n";
   }
}
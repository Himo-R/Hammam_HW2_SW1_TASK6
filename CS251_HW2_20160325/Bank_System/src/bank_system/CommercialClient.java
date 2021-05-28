/**
 * here special type of client this kind handle with company account
 * it has same attribute so we use inheritance with client class 
 */
package bank_system;
/**
 * 
 * @author معتز محمد بنيامين محمد 20190550 
 */
public class CommercialClient extends Client
{

    private String commercialID;
/**
 * set variable with unknown value 
 */
    public CommercialClient() 
    {
        super();
        commercialID ="000000000000000";
    }
/**
 * 
 * @param company the manager enter the company full name 
 * @param address the manger enter the right address(ex,city,quarter,street,company number)
 * @param phoneNumber manger number or secretary 
 * @param companyID identifier number of company  
 * @param account link the balance and account number to client
 */
    public CommercialClient(String company, String address, String phoneNumber, String companyID,Account account)
    {
        super(company,address,phoneNumber,"000000000000000",account);
        commercialID = companyID;
    }
/**
 * 
 * @param Id set the identifier number of company
 */
    public void setCommercialID(String Id) 
    {
        commercialID = Id;
    }
/**
 * 
 * @return identifier number of company
 */
    public String getCommercialID() 
    {
        return commercialID;
    }
/**
 * 
 * @return faction value to show in interface 
 */
    @Override
    public String toString() 
    {
        return " Company Name =" + getName()+" Company phone =" + getPhone() +"Company addres =" + getAddress()
                +  " Company CommercialID =" + commercialID +"\n"+"Acount in formation :"+getAccount()+"\n" ;
    }

}

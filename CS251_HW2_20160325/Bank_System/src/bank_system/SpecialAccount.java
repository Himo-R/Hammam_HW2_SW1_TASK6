/**
*  SpecialAccount that inherits from class Account.
* Use polymorphism to override method withdraw to allow over drafting with maximum limit of 1000 LE 
 */
package bank_system;
/**
 * 
 * @author همام رامي عطار 20160325
 */
public class SpecialAccount extends Account 
{
     /**
     * 
     * @param balance it represent how much this client have now
     * @param accountNumber number make difference between accounts   
     */
    public SpecialAccount(float balance, int accountNumber) 
    {
        super(balance, accountNumber);
    }

    public SpecialAccount() 
    {
        super();
    }
/**
 * 
 * @param amount it represent how much client will take in his balance
 * @return  boolean to make sure this operation can be done or not
 */
    @Override
   public boolean withDraw(float amount) 
   {
        float result = this.balance - amount;
        if (result >= -1000) {
            this.balance = result;
            return true;
        }
        else return false;

    }
}

/**
 * here we deal with normal account 
 */
package bank_system;
/**
 * 
 * @author همام رامي عطار 20160325
 * 
 */

public class NormalAccount extends Account 
{
    /**
     * 
     * @param balance it represent how much this client have now
     * @param accountNumber number make difference between accounts
     */
    public NormalAccount(float balance, int accountNumber) 
    {
        super(balance, accountNumber);
    }

    public NormalAccount() 
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
        if (result >= 0) {
            this.balance = result;
            return true;
        }
        else return false;

    }
}
/**
 * this class is abstract 
 * we take account data from operation that client do like take or put many in account 
 */
package bank_system;
/**
 * 
 * @author همام رامي عطار 20160325
 */
public abstract class Account 
{
    protected float balance;
    protected int accountNumber;
    /**
     * 
     * @param balance it represent how much this client have now
     * @param accountNumber number make difference between accounts   
     */
    public Account(float balance, int accountNumber) 
    {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public Account()
    {
        this.balance = 1000.0F;
        this.accountNumber = (int)Math.floor(Math.random() * 1000.0D + 1.0D);
    }
/**
 * 
 * @return how much this client have now 
 */
    public float getBalance() 
    {
        return this.balance;
    }
/**
 * 
 * @param balance it use for if we will change the balance 
 */
    public void setBalance(float balance)
    {
        this.balance = balance;
    }
/**
 * 
 * @return account number 
 */
    public int getAccountNumber() 
    {
        return this.accountNumber;
    }
/**
 * 
 * @param accountNumber make user enter it by himself not random
 */
    public void setAccountNumber(int accountNumber) 
    {
        this.accountNumber = accountNumber;
    }
/**
 * 
 * @param amount it represent how much client will put in his balance  
 * @return boolean to make sure the operation done
 */
    public boolean deposit(float amount) 
    {
        try {
            this.balance += amount;
            return true;
        } catch (Exception var3) {
            return false;
        }
    }
/**
 * 
 * @param amount it represent how much client will take in his balance
 * @return  boolean to make sure this operation can be done or not
 */
    public abstract boolean withDraw(float amount);
/**
 * 
 * @return display all private member in interface
 */
    @Override
    public String toString() 
    {
        return "Account{balance=" + this.balance + ", accountNumber=" + this.accountNumber + "}";
    }
}

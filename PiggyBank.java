/*
 * 
 * 
 *
 */
package mysavings;
public class PiggyBank {
    private int numPennies;
    private int numNickels;
    private int numDimes;
    private int numQuarters;
    private double total; 
    
    public PiggyBank(){
        numPennies = 0;
        numNickels = 0;
        numDimes = 0;
        numQuarters = 0;
        total = 0;
    }
    
    public PiggyBank(int numPennies, int numNickels, int numDimes, int numQuarters){
        this.numPennies = numPennies;
        this.numNickels = numNickels;
        this.numDimes = numDimes;
        this.numQuarters = numQuarters;
    }
    
    public void setPennies(int numPennies){
        this.numPennies += numPennies;
    }
    
    public int getPennies(){
        return numPennies;
    }
    
    public void setNickels(int numNickels){
        this.numNickels += numNickels;
    }
    
    public int getNickels(){
        return numNickels;
    }
    
    public void setDimes(int numDimes){
        this.numDimes += numDimes;
    }
    
    public int getDimes(){
        return numDimes;
    }
    
    public void setQuarters(int numQuarters){
        this.numQuarters += numQuarters;
    }
    
    public int getQuarters(){
        return numQuarters;
    }
    
    public void setTotal(double addition){
        total += addition;
    }
    
    public double getTotal(){
        return total;
    }
    
    public String toString(){
        return "Total number of pennies: " + numPennies + "\nTotal number of nickels: " + numNickels + "\nTotal number of dimes: " + numDimes + "\nTotal number of quarters: " + numQuarters;  
    }
}
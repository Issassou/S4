
/**
 * Write a description of class Stock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stock
{
 /**
  * the quantity of stock .
  */
  private int quantity;
/** 
 * Builds a Stock , initially the stock is empty.
 */
  public Stock(){
    this.quantity = 0 ;
} 
/**
 * 
 */
  public Stock(int q){
    this.quantity = q;
    }
/** 
 * @return  the quantity of stock .
 */
  public int getQuantity(){
    return this.quantity;
    }
 /**
  * @param integer n 
  *  extends the stock's quantity .
  */
 public void add(int n){
      this.quantity += n;
    }
 /**
  * @param integer n
  * @return the removed quantity from the stock .
  */
 public int remove (int n){
    if (n>this.quantity) return this.quantity;
    return this.quantity -= n ;
    }
 /**
  * provide a string representation for this stock.
	 * @return  a string representation for this stock .
  */
 public String toString(){
    return "the Stock's quantity is" + this.quantity;
    }
}

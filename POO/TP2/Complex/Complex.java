
/**
 * Décrivez votre classe Complex ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */

public class Complex
{
 private double Re;
 private double Im;
 
 /**
  *Constructor of the complex
  *@param Re  the real part of the complex number
  *@param Im  the imaginary part of the complex number 
  */
  
  public Complex(double Re,double Im){
    this.Re=Re;
    this.Im=Im;
    }
 /**
 *allows to change the real part of the complex number 
 *@param r the new real part 
 */
  public void setRe(double r){
    this.Re=r;
    
    }
 /**
  *allows to change the imaginary part of the complex number 
  *@param i the new imaginary part 
  */
  public void setIm(double i){
    this.Im=i;
    
    }
    
 /**
  *allows to obtain the real part of the complex number 
  *@return  the  real part of the complex number  
  */
  public double getRe(){
    return this.Re;
    }
 /**
  *allows to obtain the imaginary part of the complex number 
  *@return the imaginary part of the complex number 
  */
  public double getIm(){
    return this.Im;
    }
 /**
   *allows to add two complex numbers
   *@param the complex number 
   *@return the new complex number  
   */
  public Complex add(Complex complex){
    return new Complex((this.Re+complex.Re),(this.Im+complex.Im));
    
    
    }
 /**
  *allows to obtain the conjugate number  
  *@return the conjugate number  
  */
  public Complex conjugate(){
    return new Complex(this.Re,-this.Im);
    
    }
 /**
  *allows to multiply two complex numbers 
  *@param complex the second complex number
  *@return the new complex number 
  */
  public Complex mult(Complex complex){
    return new Complex((this.Re*complex.Re),(this.Im*complex.Im));
    
    
    }
 /**
  *allows to calculate the absolute value of the complex number  
  *@return  the absolute value  
  */
  public double module(){
    return Math.sqrt(this.Re*this.Re+this.Im*this.Im);
    
    }
    
 /**
  *allows to check if they are equal  
  *@return  false if they are not equal ,true if they are equal 
  */
  public boolean equals(Object o){
    if (o instanceof Complex){
        Complex other=(Complex) o ;
        return other.Re==this.Re && this.Im==other.Im;
    }
    else{
        return false;
    }
      
}
    
}

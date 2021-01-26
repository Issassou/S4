
/**
 * Décrivez votre classe Intervalle ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Interval
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int rightBound;
    private int leftBound;

    /**
     * Constructeur d'objets de classe Intervalle
     */
    public Interval(int l,int r)
    {
        this.rightBound=r;
        this.leftBound=l;
    }
    

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public int getLeftbound()
    {
        
        return this.leftBound;
    }
    public int getRightbound()
    {
        return this.rightBound;
        
    }
    
    public int size()
    {
        return this.getRightbound()-this.getLeftbound();
    }
    public boolean contain(int value)
    {
        return (value>=this.getLeftbound())&&(value<=this.getRightbound());
    }
    public boolean is_Empty()
    {
        return this.size()==0;
    
    }
    public Interval extend(int i){
        if(this.is_Empty()) return this;
        return new Interval(this.leftBound,this.rightBound+i);
    }
    public Interval intersection(Interval i)
    {
        int x=Math.max(this.leftBound,i.leftBound);
        int y=Math.min(this.rightBound,i.rightBound);
        return new Interval(x,y);
    }
    public String to_string(){
     return "["+this.leftBound+","+this.rightBound+"]";   
    }
     public boolean equals(Object o){
         if (!(o instanceof Interval))
              return false;
         Interval i = (Interval)o;
         if(this.is_Empty()) return i.is_Empty();
         return this.leftBound==i.getLeftbound()&&this.rightBound==i.getRightbound();
    }
    public boolean is_disjoint(Interval i)
    {
        if(i.getLeftbound()>this.rightBound) return true;
        return false;
    
    
    
    }
    public Interval Merge_inter( Interval i)
    {
        int x=Math.min(this.leftBound,i.leftBound);
        int y=Math.max(this.rightBound,i.rightBound);
        return new Interval(x,y);
      
     }
    
    
    
}
   
        
    
    
    








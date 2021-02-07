
import java.util.ArrayList;

public abstract class Viaggio 
{
    protected String titolo;
    protected double costo;
    protected static int quotafissa = 10; 
    ArrayList<Giorno> contenitoregiorni = new ArrayList<Giorno>();
    
    public Viaggio(String titolo, double costo)
    {
        this.titolo = titolo; 
        this.costo = costo;
    }
    
    public void AggiungiGiorno(Giorno x)
    {
            contenitoregiorni.add(x);  
    }
    
    public void RimuoviGiorno(Giorno x)
    {
            contenitoregiorni.remove(x);  
    }
    public abstract double Prezzo();
    
     public ArrayList<Giorno> getContenitoregiorni()
     {
         return contenitoregiorni;
     }
     
    public String toString()
    {
        String str = "Il Titolo E' " + titolo + " Il Costo " + costo;
        
        return str;
    }
    
    public String getTitolo() 
    {
        return titolo;
    }

    public void setTitolo(String titolo) 
    {
        this.titolo = titolo;
    }

    public double getCosto() 
    {
        return costo;
    }

    public void setCosto(double costo)
    {
        this.costo = costo;
    }
}

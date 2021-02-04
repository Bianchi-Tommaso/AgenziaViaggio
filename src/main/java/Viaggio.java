
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
        int i = 0;
        
        for(i = 0; i < contenitoregiorni.size(); i++)
        if(x.getNumeroOrdine() == contenitoregiorni.get(i).getNumeroOrdine())
            System.out.println("Il Giorno E' Già Presente, Impossibile Aggiungere");
        else
            contenitoregiorni.add(x);  
    }
    
    public void RimuoviGiorno(Giorno x)
    {
        int i = 0;
        
        for(i = 0; i < contenitoregiorni.size(); i++)
        if(x.getNumeroOrdine() == contenitoregiorni.get(i).getNumeroOrdine())
            contenitoregiorni.remove(x);  
        else
            System.out.println("Il Giorno Non E' Presente");
    }
    public abstract double Prezzo();
    
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

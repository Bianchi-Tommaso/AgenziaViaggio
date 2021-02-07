public class ViaggioPerGruppi extends Viaggio
{
    private int componenti;
    public ViaggioPerGruppi(String titolo, double costo, int componenti) 
    {
        super(titolo, costo);
        this.componenti = componenti;
    }

    public double Prezzo() 
    {
         int i = 0;
         double costobase = 120;
         double importo = 0;
         
         
        return importo = costo + costobase + (25 * contenitoregiorni.size()) + (4 * componenti);        
    } 

    public int getComponenti() 
    {
        return componenti;
    }

    
}

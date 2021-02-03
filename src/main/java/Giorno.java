public class Giorno 
{
    private int numeroOrdine;
    private String luogo;
    private String descrizione;

    public Giorno(int numeroOrdine, String luogo, String descrizione) 
    {
        this.numeroOrdine = numeroOrdine;
        this.luogo = luogo;
        this.descrizione = descrizione;
    }

    public int getNumeroOrdine() 
    {
        return numeroOrdine;
    }

    public void setNumeroOrdine(int numeroOrdine) 
    {
        this.numeroOrdine = numeroOrdine;
    }

    public String getLuogo() 
    {
        return luogo;
    }

    public void setLuogo(String luogo) 
    {
        this.luogo = luogo;
    }

    public String getDescrizione() 
    {
        return descrizione;
    }

    public void setDescrizione(String descrizione) 
    {
        this.descrizione = descrizione;
    }
    
    
}

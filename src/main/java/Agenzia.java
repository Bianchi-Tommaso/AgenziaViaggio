
import java.util.ArrayList;

public class Agenzia 
{
    private String nome;
    private int elenco;
    private int componenti;
    
    ArrayList<Viaggio> contenitoreviaggio = new ArrayList<Viaggio>();
    
    public Agenzia(String nome, int elenco, int componenti) 
    {
        this.nome = nome;
        this.elenco = elenco;
        
    }
    
    public void AggiungiViaggio(Viaggio x)
    {
        int i = 0;
        
        for(i = 0; i < contenitoreviaggio.size(); i++)
        if(x.getTitolo() == contenitoreviaggio.get(i).getTitolo())
            System.out.println("Il Viaggio E' Già Presente, Impossibile Aggiungere");
        else
            contenitoreviaggio.add(x);  
    }
    
    public void RimuoviViaggio(Viaggio x)
    {
        int i = 0;
        
        for(i = 0; i < contenitoreviaggio.size(); i++)
        if(x.getTitolo() == contenitoreviaggio.get(i).getTitolo())
            contenitoreviaggio.remove(x);  
        else
            System.out.println("Il Viaggio Non E' Presente");
    }
    
    public void CalcoloViaggio(Viaggio x)
    {
        int i = 0;
        int j = 0;
        ViaggioPerSingoli vps = new ViaggioPerSingoli("", 0);
        ViaggioPerGruppi vpg = new ViaggioPerGruppi("", 0, 0);
        
        for(i = 0; i < contenitoreviaggio.size(); i++)
        {
            if(contenitoreviaggio.get(i) == x)
            {
                if(x instanceof ViaggioPerSingoli)
                {       
                   vps = (ViaggioPerSingoli) x;
                   System.out.println(vps.Prezzo());
                }
                else
                {
                   vpg = (ViaggioPerGruppi) x;
                   System.out.println(vpg.Prezzo());
                }
            }
        }                
    }
    
    public void ListaViaggi()
    {
        
    }
}

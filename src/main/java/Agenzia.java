
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
            contenitoreviaggio.add(x);  
    }
    
    public void RimuoviViaggio(Viaggio x)
    {
        contenitoreviaggio.remove(x);  
       
    }
    
    public String toString()
    {
        String str = "Il Nome E': " + nome + " L'elenco E': " + elenco + " Componenti: " + componenti;
        
        return str;
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
       int i = 0; 
       int j = 0; 
       int controllo = 100;
       Viaggio Elemento = null;
       ArrayList<Viaggio> viaggi = new ArrayList<Viaggio>();
       
       viaggi.removeAll(viaggi);
       
       for(i = 0; i < contenitoreviaggio.size(); i++)
       {   
           if(contenitoreviaggio.get(i).getCosto() <= controllo)
               viaggi.add(contenitoreviaggio.get(i));
       }
       
       for(i = 1; i < viaggi.size(); i++)
       {
        for(j = i; j > 0 && viaggi.get(j).getCosto() > viaggi.get(j - 1).getCosto(); j--)
        {
            if(viaggi.get(j).getCosto() > viaggi.get(j - 1).getCosto())
            {
               Elemento = (Viaggio) viaggi.get(j);
               viaggi.set(j, viaggi.get(j - 1));
               viaggi.set(j - 1, Elemento);
            }
        }
       }
       
       System.out.println("L'ordine COsto Dei Viaggi E' Il Seguente: ");
       
       for(i = 0; i < viaggi.size(); i++)
       {
                System.out.print("|" + viaggi.get(i).getCosto());
       }
            System.out.println("|");
    }  
    
    public void ListaViaggiSingoli()
    {
       int i = 0; 
       int j = 0; 

       Viaggio Elemento = null;
       Giorno x = new Giorno(0, "", "");
       ArrayList<Viaggio> viaggi = new ArrayList<Viaggio>();
       
       viaggi.removeAll(viaggi);
       
       for(i = 0; i < contenitoreviaggio.size(); i++)
       {   
           if(contenitoreviaggio.get(i) instanceof ViaggioPerSingoli)
               viaggi.add(contenitoreviaggio.get(i));
       }
       
       for(i = 1; i < viaggi.size(); i++)
       {
        for(j = i; j > 0 && viaggi.get(j).getTitolo().compareTo(viaggi.get(j - 1).getTitolo()) <= -1; j--)
        {
            if(viaggi.get(j).getTitolo().compareTo(viaggi.get(j - 1).getTitolo()) <= -1)
            {
               Elemento = (Viaggio) viaggi.get(j);
               viaggi.set(j, viaggi.get(j - 1));
               viaggi.set(j - 1, Elemento);
            }
        }
       }
       
       System.out.println("L'ordine Dei Titoli Di Viaggio E' Il Seguente: ");
       
       for(i = 0; i < viaggi.size(); i++)
       {
                System.out.print("|" + viaggi.get(i).getTitolo());
       }
            System.out.println("|");
    }  


    public void ListaViaggiGruppi()
    {
       int i = 0; 
       int j = 0; 

       Viaggio Elemento = null;
       ViaggioPerGruppi x = new ViaggioPerGruppi("", 0, 0);
       ArrayList<Viaggio> viaggi = new ArrayList<Viaggio>();
       
       viaggi.removeAll(viaggi);
       
       for(i = 0; i < contenitoreviaggio.size(); i++)
       {   
           if(contenitoreviaggio.get(i) instanceof ViaggioPerGruppi && x.getComponenti() >= 2)
               viaggi.add(contenitoreviaggio.get(i));
       }
       
       for(i = 1; i < viaggi.size(); i++)
       {
        for(j = i; j > 0 && viaggi.get(j).getTitolo().compareTo(viaggi.get(j - 1).getTitolo()) <= -1; j--)
        {
            if(viaggi.get(j).getTitolo().compareTo(viaggi.get(j - 1).getTitolo()) <= -1)
            {
               Elemento = (Viaggio) viaggi.get(j);
               viaggi.set(j, viaggi.get(j - 1));
               viaggi.set(j - 1, Elemento);
            }
        }
       }
       
       System.out.println("L'ordine Dei Titoli Di Viaggio E' Il Seguente: ");
       
       for(i = 0; i < viaggi.size(); i++)
       {
                System.out.print("|" + viaggi.get(i).getTitolo());
       }
            System.out.println("|");
    }
    
    public void ViaggioPiuCostoso()
    {
       int i = 0; 
       int j = 0; 
       Viaggio Elemento = null;
       ArrayList<Viaggio> viaggi = new ArrayList<Viaggio>();
       
       viaggi.removeAll(viaggi);
       
       for(i = 0; i < contenitoreviaggio.size(); i++)
       {   
               viaggi.add(contenitoreviaggio.get(i));
       }
       
       for(i = 1; i < viaggi.size(); i++)
       {
        for(j = i; j > 0 && viaggi.get(j).getCosto() > viaggi.get(j - 1).getCosto(); j--)
        {
            if(viaggi.get(j).getCosto() > viaggi.get(j - 1).getCosto())
            {
               Elemento = (Viaggio) viaggi.get(j);
               viaggi.set(j, viaggi.get(j - 1));
               viaggi.set(j - 1, Elemento);
            }
        }
       }
       
       System.out.println("Il Viaggio Più Costoso E' ");
                System.out.print("|" + viaggi.get(0).toString());
            System.out.println("|");
    }
    
    public void ViaggioPiuCostosoSingoli()
    {
       int i = 0; 
       int j = 0; 
       Viaggio Elemento = null;
       ArrayList<Viaggio> viaggi = new ArrayList<Viaggio>();
       
       viaggi.removeAll(viaggi);
       
       for(i = 0; i < contenitoreviaggio.size(); i++)
       {   
           if(contenitoreviaggio.get(i) instanceof ViaggioPerSingoli)   
           viaggi.add(contenitoreviaggio.get(i));
       }
       
       for(i = 1; i < viaggi.size(); i++)
       {
        for(j = i; j > 0 && viaggi.get(j).getCosto() > viaggi.get(j - 1).getCosto(); j--)
        {
            if(viaggi.get(j).getCosto() > viaggi.get(j - 1).getCosto())
            {
               Elemento = (Viaggio) viaggi.get(j);
               viaggi.set(j, viaggi.get(j - 1));
               viaggi.set(j - 1, Elemento);
            }
        }
       }
       
       System.out.println("Il Viaggio Per Singoli Più Costoso E' ");
                System.out.print("|" + viaggi.get(0).toString());
            System.out.println("|");
}
    
    public void ViaggioPiuCostosoGruppi()
    {
       int i = 0; 
       int j = 0; 
       Viaggio Elemento = null;
       ArrayList<Viaggio> viaggi = new ArrayList<Viaggio>();
       
       viaggi.removeAll(viaggi);
       
       for(i = 0; i < contenitoreviaggio.size(); i++)
       {   
           if(contenitoreviaggio.get(i) instanceof ViaggioPerGruppi)   
           viaggi.add(contenitoreviaggio.get(i));
       }
       
       for(i = 1; i < viaggi.size(); i++)
       {
        for(j = i; j > 0 && viaggi.get(j).getCosto() > viaggi.get(j - 1).getCosto(); j--)
        {
            if(viaggi.get(j).getCosto() > viaggi.get(j - 1).getCosto())
            {
               Elemento = (Viaggio) viaggi.get(j);
               viaggi.set(j, viaggi.get(j - 1));
               viaggi.set(j - 1, Elemento);
            }
        }
       }
       
       System.out.println("Il Viaggio Gruppi Più Costoso E' ");
                System.out.print("|" + viaggi.get(0).toString());
            System.out.println("|");
}
    public void ElencoGiorniComune(Giorno x)
    {
        int i = 0;
        
        System.out.println("Lista Viaggi In Comune Con Il Giorno ");
        
        for(i = 0; i < contenitoreviaggio.size(); i++)
        {
           // if(contenitoreviaggio.get(i).getContenitoregiorni().get(i).getNumeroOrdine() == x.getNumeroOrdine())
            {
                System.out.print("|" + contenitoreviaggio.get(i));
            }
        }
    }
}


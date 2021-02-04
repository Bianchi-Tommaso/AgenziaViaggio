
public class ProgAgenziaViaggi 
{
    public static void main(String[] args) 
    {
       Giorno g1 = new Giorno(2, "Parigi", "Boh");
       Giorno g2 = new Giorno(5, "Roma", "Boh");
       Giorno g3 = new Giorno(1, "Firenze", "Boh");
       ViaggioPerSingoli vps = new ViaggioPerSingoli("Roma", 170);
       ViaggioPerGruppi vpg = new ViaggioPerGruppi("Roma", 170, 5);
       Agenzia Viaggiapotente = new Agenzia("Agenzia A", 3, 2);
       
       vps.AggiungiGiorno(g1);
       vps.AggiungiGiorno(g2);
       vps.AggiungiGiorno(g3);
       
       vpg.AggiungiGiorno(g1);
       vpg.AggiungiGiorno(g2);
       vpg.AggiungiGiorno(g3);
       
       Viaggiapotente.AggiungiViaggio(vpg);
       Viaggiapotente.AggiungiViaggio(vps);
       Viaggiapotente.CalcoloViaggio(vpg);
    }
    
}

public class ProgAgenziaViaggi 
{
    public static void main(String[] args) 
    {
       Giorno g1 = new Giorno(2, "Roma", "Boh");
       Giorno g2 = new Giorno(5, "Roma", "Boh");
       Giorno g3 = new Giorno(1, "Roma", "Boh");
       ViaggioPerSingoli vps = new ViaggioPerSingoli("Jetpack", 60);
       ViaggioPerGruppi vpg = new ViaggioPerGruppi("Treno", 50, 5);
       ViaggioPerSingoli vps1 = new ViaggioPerSingoli("Treno", 95);
       ViaggioPerGruppi vpg1 = new ViaggioPerGruppi("Bus", 23, 5);
       ViaggioPerSingoli vps2 = new ViaggioPerSingoli("Tram", 32);
       ViaggioPerGruppi vpg2 = new ViaggioPerGruppi("Macchina", 99, 5);
       ViaggioPerSingoli vps3 = new ViaggioPerSingoli("Nave", 90);
       ViaggioPerGruppi vpg3 = new ViaggioPerGruppi("Cavallo", 86, 5);
       ViaggioPerSingoli vps4 = new ViaggioPerSingoli("Carrozza", 56);
       ViaggioPerGruppi vpg4 = new ViaggioPerGruppi("Aereo", 110, 5);
       Agenzia Viaggiapotente = new Agenzia("Agenzia A", 3, 2);
       
       vps.AggiungiGiorno(g1);
       vps.AggiungiGiorno(g2);
       vps.AggiungiGiorno(g3);
       
       vps1.AggiungiGiorno(g1);
       vps1.AggiungiGiorno(g2);
       vps1.AggiungiGiorno(g3);
       
       vps2.AggiungiGiorno(g1);
       vps2.AggiungiGiorno(g2);
       vps2.AggiungiGiorno(g3);
       
       vps3.AggiungiGiorno(g1);
       vps3.AggiungiGiorno(g2);
       vps3.AggiungiGiorno(g3);
       
       vps4.AggiungiGiorno(g1);
       vps4.AggiungiGiorno(g2);
       vps4.AggiungiGiorno(g3);
       
       vpg.AggiungiGiorno(g1);
       vpg.AggiungiGiorno(g2);
       vpg.AggiungiGiorno(g3);
       
       vpg1.AggiungiGiorno(g1);
       vpg1.AggiungiGiorno(g2);
       vpg1.AggiungiGiorno(g3);
       
       vpg2.AggiungiGiorno(g1);
       vpg2.AggiungiGiorno(g2);
       vpg2.AggiungiGiorno(g3);
       
       vpg3.AggiungiGiorno(g1);
       vpg3.AggiungiGiorno(g2);
       vpg3.AggiungiGiorno(g3);
       
       vpg4.AggiungiGiorno(g1);
       vpg4.AggiungiGiorno(g2);
       vpg4.AggiungiGiorno(g3);
       
       Viaggiapotente.AggiungiViaggio(vpg);
       Viaggiapotente.AggiungiViaggio(vps);
       Viaggiapotente.AggiungiViaggio(vpg1);
       Viaggiapotente.AggiungiViaggio(vps1);
       Viaggiapotente.AggiungiViaggio(vpg2);
       Viaggiapotente.AggiungiViaggio(vps2);
       Viaggiapotente.AggiungiViaggio(vpg3);
       Viaggiapotente.AggiungiViaggio(vps3);
       Viaggiapotente.AggiungiViaggio(vpg4);
       Viaggiapotente.AggiungiViaggio(vps4);
       Viaggiapotente.CalcoloViaggio(vpg);
       Viaggiapotente.ListaViaggi();
       Viaggiapotente.ListaViaggiSingoli();
       Viaggiapotente.ViaggioPiuCostoso();
       Viaggiapotente.ViaggioPiuCostosoSingoli();
       Viaggiapotente.ViaggioPiuCostosoGruppi();
       Viaggiapotente.ElencoGiorniComune(g3);
       vpg.toString();
    } 
}

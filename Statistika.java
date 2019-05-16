
package part5;

import javax.swing.JOptionPane;

public class Statistika 
{   
    static void ypologismos_statistikon()
    {
        int answer=Integer.parseInt(JOptionPane.showInputDialog("Επιλέξετε Είδος Στατιστικού:\n1.Στατιστικά Χονδρικών Πωλήσεων\n2.Στατιστικά Λιανικών Πωλήσεων\n3.Στατιστικά Αγορών"));
       
        if (answer==1)
            statistika_xondrikon_poliseon();
        else
             if (answer==2)
                statistika_lianikon_poliseon();
             else
                  if (answer==3)
                        statistika_agoron();
    }
    
    static void statistika_xondrikon_poliseon()
    {
        statistika_xondrikon_poliseon_synoliko_plithos_timologion_polisis();
        statistika_xondrikon_poliseon_mesi_axia_timologion_polisis();
        statistika_xondrikon_poliseon_synoliki_axia_timologion_polisis();   
    }
    
    static void statistika_lianikon_poliseon()
    {
        statistika_lianikon_poliseon_synoliko_plithos_apodeixeon_polisis();
        statistika_lianikon_poliseon_mesi_axia_apodeixeon_polisis();
        statistika_lianikon_poliseon_synoliki_axia_apodeixeon_polisis(); 
    }
     
    static void statistika_agoron()
    {
       statistika_agoron_synoliki_plithos_timologion_agoras();
       statistika_agoron_mesi_axia_timologion_agoras();
       statistika_agoron_synoliki_axia_timologion_agoras();
    }
    
    /////////////////////////////////
     static void statistika_agoron_mesi_axia_timologion_agoras()
     {
        System.out.println("Συνολική Αξία Παραστατικών Αγοράς ="+Parastatiko_Agoras.get_axiaagores());
     }
     
     static void statistika_agoron_synoliki_axia_timologion_agoras()
     {
         System.out.println("Μέση Αξία Παραστατικών Αγοράς ="+Parastatiko_Agoras.get_axiaagores()/Parastatiko_Agoras.get_agores());
     }
     
     static void statistika_agoron_synoliki_plithos_timologion_agoras()
     {
         System.out.println("Πλήθος Παραστατικών Αγοράς ="+Parastatiko_Agoras.get_agores());
     }
     //////////////////////////////////////////////
     
     
     //********************************************************************
    static void statistika_xondrikon_poliseon_synoliko_plithos_timologion_polisis()
    {
        System.out.println("Πλήθος Παραστατικών Χονδρικής Πώλησης="+Parastatiko_Xondrikis_Polisis.get_xondrikes());
    }
    
     static void  statistika_xondrikon_poliseon_mesi_axia_timologion_polisis()
     {
        System.out.println("Μέση αξία Παραστατικών Χονδρικής Πώλησης="+Parastatiko_Xondrikis_Polisis.get_axiaxondrikes()/Parastatiko_Xondrikis_Polisis.get_xondrikes());
     }
     
     static void statistika_xondrikon_poliseon_synoliki_axia_timologion_polisis()
     {
        System.out.println("Συνολική Αξία Παραστατικών Χονδρικής Πώλησης="+Parastatiko_Xondrikis_Polisis.get_axiaxondrikes());
     }
     //********************************************************************
     
     
    //----------------------------------------------------------------------
    static void statistika_lianikon_poliseon_synoliko_plithos_apodeixeon_polisis()
    {
        System.out.println("Πλήθος Παραστατικών Λιανικής Πώλησης="+Parastatiko_Lianikis_Polisis.get_lianikes());
    }
    
     static void  statistika_lianikon_poliseon_mesi_axia_apodeixeon_polisis()
     {
         System.out.println("Μέση αξία Παραστατικών Λιανικής Πώλησης="+Parastatiko_Lianikis_Polisis.get_axialianikes()/Parastatiko_Lianikis_Polisis.get_lianikes());
     }
     
     static void statistika_lianikon_poliseon_synoliki_axia_apodeixeon_polisis()
     {
         System.out.println("Συνολική Αξία Παραστατικών Λιανικής Πώλησης="+Parastatiko_Lianikis_Polisis.get_axialianikes());
     }
}

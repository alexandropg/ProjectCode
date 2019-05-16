
package part5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Paraggelia 
{
    private Date imer_para;
    private float axia_parag;
    private ArrayList <Eidos> eidh=new ArrayList <Eidos> ();
    private int pos_parag=0;
    
    Paraggelia()
    {
        imer_para=new Date();
        axia_parag=0;
        pos_parag=0;
    }
    
    void addEidos(int type)
    {
        Scanner sc=new Scanner(System.in);
        
        if (type==1)
        {
            System.out.println("Θα παραγγείλετε σίδηρο");
            System.out.println("Δώσε ποσότητα και αξία παραγγελίας σιδήρου");
            pos_parag=sc.nextInt();
            axia_parag=sc.nextFloat();
            Sidiros_Beton sid=new Sidiros_Beton(400,"ELLADA","XALYBOYRGIA ATHINAS","TONOS",20,10f,"022222222");
            eidh.add(sid);
        }
        
        if (type==2)
        {
            System.out.println("Θα παραγγείλετε Δομικό Πλέγμα");
            System.out.println("Δώσε ποσότητα και αξία παραγγελίας δομικού πλέγματος");
            pos_parag=sc.nextInt();
            axia_parag=sc.nextFloat();
            Domiko_Plegma dom=new Domiko_Plegma(200,"ELLADA","XALYBOYRGIA THESSALIAS","TEMAXIO",8,"KANONIKH","022222222");
            eidh.add(dom);
        }
    }
    
    
}

package part5;

import java.util.Date;
import java.util.*;
import javax.swing.JOptionPane;

public class Parastatiko_Agoras 
{
    //δήλωση ιδιωτικών μελών κλάσης Parastatiko_Agoras
    private int ar_da_timologiou;
    private Date imer_ekdosis;
    private float synoliki_axia;
    private float kathari_axia;
    private float pososto_fpa;
    private String tropos_paralavis;
    private String AFM; //Δήλωση μέλους AFM που αντιπροσωπεύει τον προμηθευτή από τον οποίο εκδίδεται το παρασταστικό αγοράς (ΔΑ-Τιμολόγιο)
    private static int agores=0; //Δήλωση στατικού μέλους agores που υπολογίζει το πλήθος των αγορών
    private static float axiaagores=0;//στατικός αθροιστής αξίας αγορών
    
    private ArrayList<Eidos> eidi_agoras=new ArrayList<Eidos> (); //Δήλωση μέλους eidi_agoras που αντιπροσωπεύει ένα δυναμικό πίνακα (ArrayList) με όλα τα είδη που περιλαμβάνει το τιμολόγιο αγοράς
    private ArrayList <Integer> posotita_eidous_agoras=new ArrayList<Integer> (); //δήλωση μέλους posotita_eidous_apodixis που αντιπροσωπεύει ένα δυναμικό πίνακα (ArrayList) με την ποσότητα κάθε είδους που περιλαμβάνει το τιμολόγιο αγοράς
 
    //Δημιουργός κλάσης Parastatiko_Agoras για αρχικοποίηση των ιδιωτικών μελών της
    Parastatiko_Agoras(int ar_da_timologiou,String AFM,Date imer_ekdosis,float pososto_fpa,String tropos_paralavis)
    {
        this.ar_da_timologiou=ar_da_timologiou;
        this.AFM=AFM;
        this.imer_ekdosis=imer_ekdosis;
        this.kathari_axia=0; //H αρχική καθαρή αξία του τιμολογίου αγοράς είναι μηδέν
        this.synoliki_axia=0;//H αρχική συνολική αξία του τιμολογίου αγοράς είναι μηδέν
        this.pososto_fpa=pososto_fpa;
        this.tropos_paralavis=tropos_paralavis;
        agores++; //σε κάθε νέα αγορά δηλ.σε κάθε καταχώριση ενός παραστατικού αγοράς ο μετρητής αυξάνεται κατά ένα
    }
   
   //Μέθδοι set που τροποποιούν τα ιδιωτικά μέλη της κλάσης Parastatiko_Agoras
   void set_ar_da_timologiou(int ar_da_timologiou)
   {
       this.ar_da_timologiou=ar_da_timologiou;
   }
   
   void set_AFM(String AFM)
   {
       this.AFM=AFM;
   }
   
   void set_imer_ekdosis(Date imer_ekdosis)
   {
        this.imer_ekdosis=imer_ekdosis;
   }
    
    void set_tropos_paralavis(String tropos_paralavis)
    {
        this.tropos_paralavis=tropos_paralavis;
    }
    
    void set_pososto_fpa(float pososto_fpa)
    {
        this.pososto_fpa=pososto_fpa;
    }
    
    //Μέθοδοι get που επιστρέφουν τα ιδιωτικά μέλη της κλάσης Parastatiko_Agoras 
    int get_ar_da_timologiou()
    {
        return this.ar_da_timologiou;
    }
    
    Date get_imer_ekdosis()
    {
        return this.imer_ekdosis;//Με το this αναφερόμαστε στα μέλη της κλάσης
    }
    
   
    float get_kathari_axia()
    {
        return this.kathari_axia;
    }
    
    String get_AFM()
    {
        return AFM;
    }
     
    float get_synoliki_axia()
    {
        return this.synoliki_axia;
    }
    
    float get_pososto_fpa()
    {
        return this.pososto_fpa;
    }
    
    String get_tropos_paralavis()
    {
        return this.tropos_paralavis;
    }
    
    ArrayList <Eidos> get_eidi_agoras()//H μέθοδος αυτή επιστρέφει όλο το ArrayList με τα είδη που περιλαμβάνει το παραστατικό αγοράς
    {
        return eidi_agoras;
    }
    
    static int get_agores()//Η static μέθοδος get_agores() επιστρέφει το πλήθος των αγορών
    {
        return agores;
    }
    
     //Μέθοδος print() που εκτυπώνει όλα τα μέλη της κλάσης Parastatiko_Agoras 
    void print()
    {
        String res="ARITHMOS TIMOLOGIOU:"+this.ar_da_timologiou+"\n";
        res+="AFM PROMHTHEYTH: "+this.AFM+"\n";
        res+="HMEROMHNIA EKDOSHS: "+this.imer_ekdosis+"\n";
        res+="POSOSTO FPA: "+this.pososto_fpa+"\n";
        res+="KATHARH AXIA:"+this.kathari_axia+"\n";;
        res+="SYNOLIKH AXIA: "+this.synoliki_axia+"\n";
        res+="TROPOS PARALABHS: "+this.tropos_paralavis+"\n";
        
        for (int i=0;i<eidi_agoras.size();i++)
            res+=eidi_agoras.get(i).toString()+"\n"; //H μέθοδος αυτή προσθέτει σε κάθε επανάληψη ένα είδος του Arraylist στη μεταβλητή res
      
        JOptionPane.showMessageDialog(null, res,"STOIXEIA TIMOLOGIOU AGORAS", JOptionPane.PLAIN_MESSAGE);
    }
    
     //Μέθοδος toString() που επιστρέφει όλα τα μέλη της κλάσης Parastatiko_Agoras  
    //συνενωμένα σε ένα String
    public String toString()
    {
       String res="ARITHMOS TIMOLOGIOU:"+this.ar_da_timologiou+"\n";
        res+="AFM PROMHTHEYTH: "+this.AFM+"\n";
        res+="HMEROMHNIA EKDOSHS: "+this.imer_ekdosis+"\n";
        res+="POSOSTO FPA: "+this.pososto_fpa+"\n";
        res+="KATHARH AXIA:"+this.kathari_axia+"\n";;
        res+="SYNOLIKH AXIA: "+this.synoliki_axia+"\n";
        res+="TROPOS PARALABHS: "+this.tropos_paralavis+"\n";
        
        for (int i=0;i<eidi_agoras.size();i++)
            res+=eidi_agoras.get(i).toString()+"\n"; //H μέθοδος αυτή προσθέτει σε κάθε επανάληψη ένα είδος του Arraylist στη μεταβλητή res
      
        return res;
    }
    
    //Λοιπές Μέθοδοι Κλάσης
    void add_eidos(Eidos e,Integer pos)//H μέθοδος αυτή προσθέτει ένα νέο είδος στο τιμολόγιο αγοράς μαζί με την ποσότητα του
    {
        eidi_agoras.add(e);//To νέο είδος προστίθεται στο ArrayList με τα είδη του τιμολογίου
        posotita_eidous_agoras.add(pos.intValue());//Η αντίστοιχη ποσόστητα πώλησης του είδους προστίθεται στο ArrayList με τις ποσότητες ειδών πώλησης του τιμολογίου
    }
    
    void add_eidh_posotites(ArrayList<Eidos> eidh,ArrayList <Integer> pos)//H μέθοδος αυτή λαμβάνει 2 ArrayList με τα είδη και τις ποσότητες τους και τα καταχωρεί στα αντίστοιχα μέλη
    {
        eidi_agoras=eidh;
        posotita_eidous_agoras=pos;
    }
    
    void ypologismos_axias_timologiou()//Η μέθοδος αυτή υπολογίζει την καθαρή και τη συνολική αξία του τιμολογίου αγοράς
    {
         for (int i=0;i<eidi_agoras.size();i++)
         {
              kathari_axia+=eidi_agoras.get(i).timi_polisis*posotita_eidous_agoras.get(i).intValue();//πολλαπλασιάζουμε την τιμή πώλησης κάθε είδους με την αντίστοιχη ποσότητα του
            
              //H ποσότητα του είδους αυξάνεται κατά την ποσότητα αγοράς
              eidi_agoras.get(i).increase_ypoloipo(posotita_eidous_agoras.get(i).intValue());
         }
         
         synoliki_axia+=kathari_axia*pososto_fpa;//Η συνολική αξία του τιμολογίου επιβαρύνεται με την αξία ΦΠΑ
         
          axiaagores+=synoliki_axia; 
    }
    
    static float get_axiaagores()
    {
        return axiaagores;
    }
}

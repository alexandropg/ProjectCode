package part5;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Parastatiko_Xondrikis_Polisis 
{
    //δήλωση ιδιωτικών μελών κλάσης Parastatiko_Xondrikis_Polisis
    private int ar_timologiou;
    private Date imer_ekdosis;
    private float synoliki_axia;
    private float kathari_axia;
    private float pososto_fpa; //το πεδίο αυτό είναι το ποσοστό pososto_fpa
    private String tropos_apostolis;
    private String AFM; //Δήλωση μέλους AFM που αντιπροσωπεύει τον πελάτη χονδρικής στον οποίο εκδίδεται το παρασταστικό χονδρικής (τιμολόγιο)
    private ArrayList<Eidos> eidi_timologiou=new ArrayList<Eidos> (); //δήλωση μέλους eidi_timologiou που αντιπροσωπεύει ένα δυναμικό πίνακα (ArrayList) με όλα τα είδη που περιλαμβάνει το τιμολόγιο πώλησης
    private ArrayList <Integer> posotita_eidous_timologiou=new ArrayList<Integer> (); //δήλωση μέλους posotita_eidous_timologiouπου αντιπροσωπεύει ένα δυναμικό πίνακα (ArrayList) με την ποσότητα κάθε είδους που περιλαμβάνει το τιμολόγιο πώλησης
    
    private static int xondrikes=0;//στατικός μετρητής χονδρικών πωλήσεων
    private static float axiaxondrikes=0;//στατικός αθροιστής αξίας χονδρικών πωλήσεων
    
    //Δημιουργός κλάσης Parastatiko_Xondrikis_Polisis για αρχικοποίηση των ιδιωτικών μελών της
    Parastatiko_Xondrikis_Polisis(int ar_timologiou,String AFM,Date imer_ekdosis,float pososto_fpa,String tropos_apostolis)
    {
       this.ar_timologiou=ar_timologiou;
       this.AFM=AFM;
       this.imer_ekdosis=imer_ekdosis;
       this.kathari_axia=0;//αρχικά το τιμολόγιο πώλησης έχει καθαρή αξία μηδέν
       this.synoliki_axia=0;//αρχικά το τιμολόγιο πώλησης έχει συνολική αξία μηδέν
       this.tropos_apostolis=tropos_apostolis;
       xondrikes++;//σε κάθε νέα πώληση χονδρικής δηλ.σε κάθε καταχώριση ενός παραστατικού χονδρικής πώλησης ο μετρητής αυξάνεται κατά ένα
    }
   
    //Μέθδοι set που τροποποιούν τα ιδιωτικά μέλη της κλάσης Parastatiko_Xondrikis_Polisis
    void set_ar_timologiou(int ar_timologiou)
    {
        this.ar_timologiou=ar_timologiou;
    }

    void set_AFM(String AFM)
    {
        this.AFM=AFM;
    }

    void set_imer_ekdosis(Date imer_ekdosis)
    {
         this.imer_ekdosis=imer_ekdosis;
    }
   
    void set_tropos_apostolis(String tropos_apostolis)
    {
        this.tropos_apostolis=tropos_apostolis;
    }
    
    void set_pososto_fpa(float pososto_fpa)
    {
        this.pososto_fpa=pososto_fpa;
    }
    
    //Μέθοδοι get που επιστρέφουν τα ιδιωτικά μέλη της κλάσης Parastatiko_Xondrikis_Polisis 
    int get_ar_timologiou()
    {
        return this.ar_timologiou;
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
    
    String get_tropos_apostolis()
    {
        return this.tropos_apostolis;
    }
    
    ArrayList <Eidos> get_eidi_timologiou()//H μέθοδος αυτή επιστρέφει όλο το ArrayList με τα είδη που περιλαμβάνει το τιμολόγιο πώλησης
    {
        return eidi_timologiou;
    }
    
    static int get_xondrikes()//Η static μέθοδος get_xondrikes() επιστρέφει το πλήθος των χονδρικών πωλήσεων
    {
        return xondrikes;
    }
    
     //Μέθοδος print() που εκτυπώνει όλα τα μέλη της κλάσης Parastatiko_Xondrikis_Polisis 
    void print()
    {
        String res="ARITHMOS TIMOLOGIOU:"+this.ar_timologiou+"\n";
        res+="AFM PELATH: "+this.AFM+"\n";
        res+="HMEROMHNIA EKDOSHS: "+this.imer_ekdosis+"\n";
        res+="FPA: "+this.pososto_fpa+"\n";
        res+="KATHARH AXIA:"+this.kathari_axia+"\n";;
        res+="SYNOLIKH AXIA: "+this.synoliki_axia+"\n";
        res+="TROPOS APOSTOLHS: "+this.tropos_apostolis+"\n";
        
        for (int i=0;i<eidi_timologiou.size();i++)
            res+=eidi_timologiou.get(i).toString()+"\n"; //H μέθοδος αυτή προσθέτει σε κάθε επανάληψη ένα είδος του Arraylist στη μεταβλητή res
     
        JOptionPane.showMessageDialog(null, res,"STOIXEIA TIMOLOGIOU XONDRIKHS", JOptionPane.PLAIN_MESSAGE);
    }
    
     //Μέθοδος toString() που επιστρέφει όλα τα μέλη της κλάσης Parastatiko_Xondrikis_Polisis  
    //συνενωμένα σε ένα String
    public String toString()
    {
        String res="ARITHMOS TIMOLOGIOU:"+this.ar_timologiou+"\n";
        res+="AFM PELATH: "+this.AFM+"\n";
        res+="HMEROMHNIA EKDOSHS: "+this.imer_ekdosis+"\n";
        res+="POSOSTO FPA: "+this.pososto_fpa+"\n";
        res+="KATHARH AXIA:"+this.kathari_axia+"\n";;
        res+="SYNOLIKH AXIA: "+this.synoliki_axia+"\n";
        res+="TROPOS APOSTOLHS: "+this.tropos_apostolis+"\n";
        
        for (int i=0;i<eidi_timologiou.size();i++)
            res+=eidi_timologiou.get(i).toString()+"\n"; //H μέθοδος αυτή προσθέτει σε κάθε επανάληψη ένα είδος του Arraylist στη μεταβλητή res
     
        return res;
    }
    
    //Λοιπές Μέθοδοι Κλάσης
    void add_eidos(Eidos e,Integer pos)//H μέθοδος αυτή προσθέτει ένα νέο είδος στο τιμολόγιο πώλησης μαζί με την ποσότητα του
    {
        eidi_timologiou.add(e);//To νέο είδος προστίθεται στο ArrayList με τα είδη του τιμολογίου
        posotita_eidous_timologiou.add(pos.intValue());;//Η αντίστοιχη ποσόστητα πώλησης του είδους προστίθεται στο ArrayList με τις ποσότητες ειδών πώλησης του τιμολογίου
    }
    
    void add_eidh_posotites(ArrayList<Eidos> eidh,ArrayList <Integer> pos)//H μέθοδος αυτή λαμβάνει 2 ArrayList με τα είδη και τις ποσότητες τους και τα καταχωρεί στα αντίστοιχα μέλη
    {
        eidi_timologiou=eidh;
        posotita_eidous_timologiou=pos;
    }
    
    void ypologismos_axion_timologiou()//Η μέθοδος αυτή υπολογίζει την καθαρή και τη συνολική αξία του τιμολογίου
    {
         for (int i=0;i<eidi_timologiou.size();i++)
         {
              kathari_axia+=eidi_timologiou.get(i).timi_polisis*posotita_eidous_timologiou.get(i).intValue();//πολλαπλασιάζουμε την τιμή πώλησης κάθε είδους με την αντίστοιχη ποσότητα του
            
              //Ελέγχεται ο τύπος του είδους και προστίθεται η αντίστοιχη επιβάρυνση 
              
              if (eidi_timologiou.get(i) instanceof Sidiros_Beton)
                   kathari_axia+=eidi_timologiou.get(i).metapoihsh("tserki");
              
              if (eidi_timologiou.get(i) instanceof Mandyas)
                   kathari_axia+=eidi_timologiou.get(i).ayxisi_timis_mandya();
              
              if (eidi_timologiou.get(i) instanceof Domiko_Plegma)
                   kathari_axia+=eidi_timologiou.get(i).epibarynsh();
              
              //H ποσότητα του είδους μειώνεται κατά την ποσότητα πώλησης
              eidi_timologiou.get(i).decrease_ypoloipo(posotita_eidous_timologiou.get(i).intValue());
         }
         
         synoliki_axia+=kathari_axia*pososto_fpa;//Η συνολική αξία του τιμολογίου επιβαρύνεται με την αξία ΦΠΑ
        
         axiaxondrikes+= synoliki_axia;//αθροίζεται στο στατικό αθροιστή axiaxondrikes η συνολική αξία του παραστατικού χονδρικής
    }
    
    static float get_axiaxondrikes()
    {
        return axiaxondrikes;
    }
}

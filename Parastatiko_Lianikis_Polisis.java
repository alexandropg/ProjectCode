
package part5;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Parastatiko_Lianikis_Polisis 
{
    //δήλωση ιδιωτικών μελών κλάσης Parastatiko_Lianikis_Polisis
    private int ar_apodixis;
    private Date imer_ekdosis;
    private float synoliki_axia;
    private String ADT; //Δήλωση μέλους ADT που αντιπροσωπεύει τον πελάτη Λιανικής/Ιδιώτη στον οποίο εκδίδεται το παρασταστικό λιανικής πώλησης (απόδειξη λιανικής πώλησης) 
  
    private ArrayList<Eidos> eidi_apodixis=new ArrayList<Eidos> (); //dήλωση μέλους eidi_timologiou που αντιπροσωπεύει ένα δυναμικό πίνακα (ArrayList) με όλα τα είδη που περιλαμβάνει η απόδειξη λιανικής πώλησης
    private ArrayList <Integer> posotita_eidous_apodixis=new ArrayList<Integer> (); //δήλωση μέλους posotita_eidous_apodixis που αντιπροσωπεύει ένα δυναμικό πίνακα (ArrayList) με την ποσότητα κάθε είδους που περιλαμβάνει η απόδειξη λιανικής πώλησης
   
    private static int lianikes=0;//στατικός μετρητής λιανικών πωλήσεων
    private static float axialianikes=0;//στατικός αθροιστής αξίας λιανικών πωλήσεων
    
    //Δημιουργός κλάσης Parastatiko_Lianikis_Polisis για αρχικοποίηση των ιδιωτικών μελών της
   Parastatiko_Lianikis_Polisis(int ar_apodixis,String ADT,Date imer_ekdosis,float synoliki_axia)
   {
       this.ar_apodixis=ar_apodixis;
       this.ADT=ADT;
       this.imer_ekdosis=imer_ekdosis;
       this.synoliki_axia=synoliki_axia;
       lianikes++;//σε κάθε νέα πώληση λιανικής δηλ.σε κάθε καταχώριση ενός παραστατικού λιανικής πώλησης ο μετρητής αυξάνεται κατά ένα
   }
   
   //Μέθδοι set που τροποποιούν τα ιδιωτικά μέλη της κλάσης Parastatiko_Lianikis_Polisis
   void set_ar_apodixis(int ar_apodixis)
   {
       this.ar_apodixis=ar_apodixis;
   }
   
   void set_ADT(String ADT)
   {
       this.ADT=ADT;
   }
   
   void set_imer_ekdosis(Date imer_ekdosis)
   {
        this.imer_ekdosis=imer_ekdosis;
   }
    
    void set_synoliki_axia(float synoliki_axia)
    {
        this.synoliki_axia=synoliki_axia;
    }
    
    //Μέθοδοι get που επιστρέφουν τα ιδιωτικά μέλη της κλάσης Parastatiko_Lianikis_Polisis 
    int get_apodixis()
    {
        return this.ar_apodixis;
    }
    
    Date get_imer_ekdosis()
    {
        return this.imer_ekdosis;//Με το this αναφερόμαστε στα μέλη της κλάσης
    }
    
    String get_ADT()
    {
        return ADT;
    }
     
    float get_synoliki_axia()
    {
        return this.synoliki_axia;
    }
    
    ArrayList <Eidos> get_eidi_apodixis()//H μέθοδος αυτή επιστρέφει όλο το ArrayList με τα είδη που περιλαμβάνει η απόδειξη λιανικής πώλησης
    {
        return eidi_apodixis;
    }
    
    static int get_lianikes()//Η static μέθοδος get_lianikes() επιστρέφει το πλήθος των λιανικών πωλήσεων
    {
        return lianikes;
    }
    
    //Μέθοδος print() που εκτυπώνει όλα τα μέλη της κλάσης Parastatiko_Lianikis_Polisis 
    void print()
    {
        String res="ARITHMOS APODEIXHS:"+this.ar_apodixis+"\n";
        res+="ADT PELATH: "+this.ADT+"\n";
        res+="HMEROMHNIA EKDOSHS: "+this.imer_ekdosis+"\n";
        res+="SYNOLIKH AXIA: "+this.synoliki_axia+"\n";
      
        for (int i=0;i<eidi_apodixis.size();i++)
            res+=eidi_apodixis.get(i).toString()+"\n"; //H μέθοδος αυτή προσθέτει σε κάθε επανάληψη ένα είδος του Arraylist στη μεταβλητή res
    
        JOptionPane.showMessageDialog(null, res,"STOIXEIA APOXEIXHS LIANIKHS", JOptionPane.PLAIN_MESSAGE);
    }
    
     //Μέθοδος toString() που επιστρέφει όλα τα μέλη της κλάσης Parastatiko_Lianikis_Polisis  
    //συνενωμένα σε ένα String
    public String toString()
    {
        String res="ARITHMOS APODEIXHS:"+this.ar_apodixis+"\n";
        res+="ADT PELATH: "+this.ADT+"\n";
        res+="HMEROMHNIA EKDOSHS: "+this.imer_ekdosis+"\n";
        res+="SYNOLIKH AXIA: "+this.synoliki_axia+"\n";
        
        for (int i=0;i<eidi_apodixis.size();i++)
            res+=eidi_apodixis.get(i).toString()+"\n"; //H μέθοδος αυτή προσθέτει σε κάθε επανάληψη ένα είδος του Arraylist στη μεταβλητή res
    
        return res;
    }
    
    //Λοιπές Μέθοδοι Κλάσης
    void add_eidos(Eidos e,Integer pos)//H μέθοδος αυτή προσθέτει ένα νέο είδος στην απόδειξη λιανικής πώλησης μαζί με την ποσότητα του
    {
        eidi_apodixis.add(e);//To νέο είδος προστίθεται στο ArrayList με τα είδη της απόδειξης λιανικής πώλησης
        posotita_eidous_apodixis.add(pos.intValue());;//Η αντίστοιχη ποσόστητα πώλησης του είδους προστίθεται στο ArrayList με τις ποσότητες ειδών πώλησης της απόδειξης λιανικής πώλησης
    }
    
    void add_eidh_posotites(ArrayList<Eidos> eidh,ArrayList <Integer> pos)//H μέθοδος αυτή λαμβάνει 2 ArrayList με τα είδη και τις ποσότητες τους και τα καταχωρεί στα αντίστοιχα μέλη
    {
        eidi_apodixis=eidh;
        posotita_eidous_apodixis=pos;
    }
    
    void ypologismos_axias_apodixis()//Η μέθοδος αυτή υπολογίζει την καθαρή και τη συνολική αξία της απόδειξης λιανικής πώλησης
    {
         for (int i=0;i<eidi_apodixis.size();i++)
         {
             synoliki_axia+=eidi_apodixis.get(i).timi_polisis*posotita_eidous_apodixis.get(i).intValue();//πολλαπλασιάζουμε την τιμή πώλησης κάθε είδους με την αντίστοιχη ποσότητα του
            
              //Ελέγχεται ο τύπος του είδους και προστίθεται η αντίστοιχη επιβάρυνση 
              
              if (eidi_apodixis.get(i) instanceof Sidiros_Beton)
                   synoliki_axia+=eidi_apodixis.get(i).metapoihsh("tserki");
              
              if (eidi_apodixis.get(i) instanceof Mandyas)
                   synoliki_axia+=eidi_apodixis.get(i).ayxisi_timis_mandya();
              
              if (eidi_apodixis.get(i) instanceof Domiko_Plegma)
                   synoliki_axia+=eidi_apodixis.get(i).epibarynsh();
              
              //H ποσότητα του είδους μειώνεται κατά την ποσότητα πώλησης
              eidi_apodixis.get(i).decrease_ypoloipo(posotita_eidous_apodixis.get(i).intValue());
         }
         
         axialianikes+=synoliki_axia; //αθροίζεται στο στατικό αθροιστή axialianikes η συνολική αξία του παραστατικού λιανικής
    }
    
    static float get_axialianikes()
    {
        return axialianikes;
    }
}

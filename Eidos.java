package part5;

import javax.swing.JOptionPane;

// H κλάση Eidos περιγράφει κάθε Είδος της εταιρείας Σιδήρου-Μπετόν
public class Eidos 
{
    //Δήλωση Μελών κλάσης Eidos
    protected int kodikos_eidous;
    protected String proeleysi;
    protected String kataskeyastis;
    protected String monada_metrisis;
    protected float timi_polisis;
    protected int ypoloipo; //Η ποσότητα που εκφράζει το τρέχον υπόλοιπο του είδους
    protected String AFM_Etaireias;//Το πεδίο αυτό είναι το AFM_Etaireias σιδήρου-μπετόν που εμπορεύεται το είδος
    
    //Δημιουργός κλάσης Eidos για αρχικοποίηση των μελών της
    Eidos(int kodikos_eidous,String proeleysi,String kataskeyastis,String monada_metrisis,float timi_polisis,String AFM_Etaireias)
    {
        this.kodikos_eidous=kodikos_eidous;
        this.proeleysi=proeleysi;
        this.kataskeyastis=kataskeyastis;
        this.monada_metrisis=monada_metrisis;
        this.timi_polisis=timi_polisis;
        this.AFM_Etaireias=AFM_Etaireias;
        ypoloipo=0;
    }
    
    Eidos()
    {
    }
    
    //Μέθοδοι set που τροποποιύν τα ιδιωτικά μέλη της κλάσης Eidos
    void set_kodikos_eidous(int kodikos_eidous)
    {
        this.kodikos_eidous=kodikos_eidous;
    }
    
    void set_proeleysi(String proeleysi)
    {
        this.proeleysi=proeleysi;
    }
   
    void set_kataskeyastis(String kataskeyastis)
    {
        this.kataskeyastis=kataskeyastis;
    }
    
    void set_monada_metrisis(String monada_metrisis)
    {
        this.monada_metrisis=monada_metrisis;
    }
    
    void set_timi_polisis(float timi_polisis)
    {
        this.timi_polisis=timi_polisis;
    }
     
    //Μέθοδοι get που επιστρέφουν τα ιδιωτικά μέλη της κλάσης Eidos
    int get_kodikos_eidous()
    {
        return kodikos_eidous;
    }
    
    String get_kataskeyastis()
    {
        return kataskeyastis;
    }
    
    String get_monada_metrisis()
    {
        return monada_metrisis;
    }
    
    float get_timi_polisis()
    {
        return timi_polisis;
    }
     
    //Μέθοδος print() που εκτυπώνει τα μέλη της κλάσης Eidos 
    void print()
    {
        String res="KODIKOS EIDOUS: "+kodikos_eidous+"\n";
        res+="PROELEYSH: "+proeleysi+"\n";
        res+="KATASKEYASTHS: "+kataskeyastis+"\n";
        res+="MONADA METRHSHS: "+monada_metrisis+"\n";
        res+="YPOLOIPO: "+ypoloipo+"\n";
    }
    
     //Μέθοδος toString() που επιστρέφει τα μέλη της κλάσης Eidos συνενωμένα ως ένα String
    public String toString()
    {
        String res="KODIKOS EIDOUS: "+kodikos_eidous+"\n";
        res+="PROELEYSH: "+proeleysi+"\n";
        res+="KATASKEYASTHS: "+kataskeyastis+"\n";
        res+="MONADA METRHSHS: "+monada_metrisis+"\n";
        res+="YPOLOIPO: "+ypoloipo+"\n";
          
        return res;
    }
    
    //Λοιπές Μέθοδοι
     void increase_ypoloipo(int posotita)
    {
        ypoloipo+=posotita; //To υπόλοιπο του είδους αυξάνεται κατά την ποσότητα αγοράς
    }
    
    void decrease_ypoloipo(int posotita)
    {
        ypoloipo-=posotita; //To υπόλοιπο του είδους μειώνεται κατά την ποσότητα πώλησης
    }
    
    //Οι επόμενες μέθοδοι υλοποιούνται στις παραγόμενες κλάσεις. Εδώ κάνουμε μια υποτειπώδη υλοποίηση ώστε η κλάση Eidos να μην δηλωθεί ως abstract
     float metapoihsh(String type)
     {
         return 0;
     }
     
     float epibarynsh()
     {
         return 0;
     }
     
     float ayxisi_timis_mandya()
     {
         return 0;
     }
}

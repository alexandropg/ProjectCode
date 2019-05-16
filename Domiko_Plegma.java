package part5;

import javax.swing.JOptionPane;

// H κλάση Domiko_Plegma περιγράφει το είδος Δομικό Πλέγμα
public class Domiko_Plegma extends Eidos
{
    //Δήλωση Μελών κλάσης Domiko_Plegma
   
    private float timi_agoras;//To Δομικό Πλέγμα αγοράζεται δεν παράγεται από την εταιρεία σιδήρου-μπετόν
    //και αυτό το πεδίο είναι η τιμή αγοράς του
   
    private String Diastasi;//Υπάρχουν πολλές διαστάσεις για δομικά πλέγματα
  
    private boolean topothetisi;//Το πεδίο αυτό παίρνει τις τιμές true/false ανάλογα με το το δομικο πλέγμα απαιτεί και
    //τοποθέτηση στην οικοδομή για την οποία προορίζεται (τιμή true) ή απλή μεταφορά (τιμή false)
    
    public static int ypoloipo_Domiko_Plegma=0;
  
    //Δημιουργός κλάσης Domiko_Plegma για αρχικοποίηση των μελών της
    Domiko_Plegma(int kodikos_eidous,String proeleysi,String kataskeyastis,String monada_metrisis,float timi_agoras,String Diastasi,String AFM_Etaireias)
    {
        //Καλείται ο δημιουργός της υπερκλάσης Eidos για να κατασκευάσει ανώνυμο στιγμιότυπο σε αυτή από το οποίο κληρονομείται το τρέχον στιμγιότυπο 
        super(kodikos_eidous, proeleysi,kataskeyastis,monada_metrisis,0,AFM_Etaireias);//To 0 είναι η αρχική τιμή πώλησης
        
        this.timi_agoras=timi_agoras;
        this.Diastasi=Diastasi;
        this.topothetisi=true; //Εξορισμού ένα δομικό πλέγμα απαιτεί και τοποθέτηση στην οικοδομή που μεταφέρεται
    }
    
    public Domiko_Plegma()
    {
    }
    
    //Μέθοδοι set που τροποποιύν τα ιδιωτικά μέλη της κλάσης Domiko_Plegma
    void set_timi_agoras(float timi_agoras)
    {
        this.timi_agoras=timi_agoras;
    }
    
    void set_Diastasi(String Diastasi)
    {
        this.Diastasi=Diastasi;
    }
    
    void set_topothetisi(boolean topothetisi)
    {
        this.topothetisi=topothetisi;
    }
   
    //Μέθοδοι get που επιστρέφουν τα ιδιωτικά μέλη της κλάσης Domiko_Plegma
    float get_timi_agoras()
    {
        return timi_agoras;
    }
    
    float get_timi_polisis()
    {
        return timi_polisis;
    }
    
    String get_Diastasi()
    {
        return Diastasi;
    }
    
    boolean get_topothesisi()
    {
        return topothetisi;
    }
    
    //Μέθοδος print() που εκτυπώνει τα μέλη της κλάσης Domiko_Plegma 
    void print()
    {
        String res="TIMH AGORAS: "+timi_agoras+"\n";
        res+="DIASTASH: "+Diastasi+"\n";
        res+="TOPOTHETHSH PLEGMATOS: "+topothetisi+"\n";
        res+="SYNOLIKH TIMH POLHSHS DOMIKOY PLEGMATOS: "+timi_polisis+"\n";
   
        JOptionPane.showMessageDialog(null, res,"STOIXEIA DOMIKOY PLEGMATOS", JOptionPane.PLAIN_MESSAGE);
    }
    
     //Μέθοδος toString() που επιστρέφει τα μέλη της κλάσης Domiko_Plegma 
    //συνενωμένα ως ένα String
    public String toString()
    {
        String res="TIMH AGORAS: "+timi_agoras+"\n";
        res+="DIASTASH: "+Diastasi+"\n";
        res+="TOPOTHETHSH PLEGMATOS: "+topothetisi+"\n";
        res+="SYNOLIKH TIMH POLHSHS DOMIKOY PLEGMATOS: "+timi_polisis+"\n";
   
        return res;
    }
    
    //Λοιπές Μέθοδοι
    float epibarynsh()//η μέθοδος αυτή αυξάνει την τιμή πώλησης του δομικού πλέγματος ανάλογα με το αν απαιτείται μόνο μεταφορά και/ή τοποθέτηση του στην οικοδομή
    {
        if (topothetisi==true)
            timi_polisis+=5.5f;//κάθε δομικό πλέγμα αυξάνεται στην τιμή πώλησης του κατά 5.5€ γιατί απαιτείται μεταφορά και τοποθέτηση του στην οικοδομή
        else
            timi_polisis+=2; //κάθε δομικό πλέγμα αυξάνεται στην τιμή πώλησης του κατά 2€ γιατί απαιτείται μόνο μεταφορά του στην οικοδομή
  
        return timi_polisis;
    }
    
}

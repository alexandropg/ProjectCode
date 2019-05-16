package part5;

import javax.swing.JOptionPane;

//H κλάση Sidiros_Beton περιγράφει το είδος Σϊδηρος-Μπετόν
public class Sidiros_Beton extends Eidos
{
    //Δήλωση Μελών κλάσης Sidiros_Beton
    private float timi_agoras;//Ο σίδηρος-μπετόν αγοράζεται ως Α ύλη και αυτό το πεδίο αντιπροσωπεύει την τιμή αγοράς του
   
    private float pososto_kerdous;//Το πεδίο αυτό αντιπροωπεύει το ποσοστό κέρδους του σιδήρου σε σχέση με την τιμή αγοράς και πώλησης του
   
    private boolean metapoihsh; //boolen μέλος του τιμές true/false που δείχνει αν ο σίδηρος-μπετόν απαιτεί μεταποίηση ή όχι (δηλ. να κοπεί σε συγκεκριμένο μέγεθος, να γίνει τσέρκι κ.λ.π.)
    
    public static int ypoloipo_Sidiros_Beton=0;
      
    //Δημιουργός κλάσης Sidiros_Beton για αρχικοποίηση των μελών της
    Sidiros_Beton(int kodikos_eidous,String proeleysi,String kataskeyastis,String monada_metrisis,float timi_agoras,float pososto_kerdous,String AFM_Etaireias)
    {        
        //Καλείται ο δημιουργός της υπερκλάσης Eidos για να κατασκευάσει ανώνυμο στιγμιότυπο σε αυτή από το οποίο κληρονομείται το τρέχον στιμγιότυπο 
        super(kodikos_eidous, proeleysi,kataskeyastis,monada_metrisis,0,AFM_Etaireias);//Το 0 είναι η αρχική τιμή πώλησης
        
        this.timi_agoras=timi_agoras;
        this.pososto_kerdous=pososto_kerdous;
        metapoihsh=false; //η εξορισμού τιμή είναι false που δηλώνει ότι αρχικά ο σίδηρος-μπετόν δεν απαιτεί κάποια μεταποίηση
    }
    
    Sidiros_Beton()
    {
        
    }
    
    //Μέθοδοι set που τροποποιύν τα ιδιωτικά μέλη της κλάσης Sidiros_Beton
    void set_timi_agoras(float timi_agoras)
    {
        this.timi_agoras=timi_agoras;
    }
    
    void set_metapoihsh(boolean metapoihsh)
    {
        this.metapoihsh=metapoihsh;
    }
    
    void set_timi_polisis(float timi_polisis)
    {
        this.timi_polisis=timi_polisis;
    }
   
    void set_pososto_kerdous(float pososto_kerdous)
    {
        this.pososto_kerdous=pososto_kerdous;
    }
    
    //Μέθοδοι get που επιστρέφουν τα ιδιωτικά μέλη της κλάσης Sidiros_Beton
    float get_timi_agoras()
    {
        return timi_agoras;
    }
    
    float get_timi_polisis()
    {
        return timi_polisis;
    }
    
    float get_pososto_kerdous()
    {
        return pososto_kerdous;
    }
    
    boolean gets_metapoihsh()
    {
        return metapoihsh;
    }
    
    //Μέθοδος print() που εκτυπώνει τα μέλη της κλάσης Sidiros_Beton 
    void print()
    {
        String res="TIMH AGORAS: "+timi_agoras+"\n";
        res+="TIMH POLHSHS: "+timi_polisis+"\n";
        res+="TZIROS SIDHROY: "+pososto_kerdous+"\n";
        res+="APAITEI METAPOIHSH: "+metapoihsh+"\n";
        res+="SYNOLIKH TIMH POLHSHS SIDHROY-BETON: "+timi_polisis+"\n";
   
        JOptionPane.showMessageDialog(null, res,"STOIXEIA SIDHROU-BETON", JOptionPane.PLAIN_MESSAGE);
    }
    
     //Μέθοδος toString() που επιστρέφει τα μέλη της κλάσης Sidiros_Beton 
    //συνενωμένα ως ένα String
    public String toString()
    {
        String res="TIMH AGORAS: "+timi_agoras+"\n";
        res+="TIMH POLHSHS: "+timi_polisis+"\n";
        res+="TZIROS SIDHROY: "+pososto_kerdous+"\n";
        res+="APAITEI METAPOIHSH: "+metapoihsh+"\n";
        res+="SYNOLIKH TIMH POLHSHS SIDHROY-BETON: "+timi_polisis+"\n";
    
        return res;
    }
    
    //Λοιπές Μέθοδοι
    float metapoihsh(String type)//ανάλογα με τη μεταποίηση που χρειάζεται ο σίδηρος αλλάζει η τιμή πώλησης του
    {
        if (type.equals("tserki"))
            timi_polisis+=1.5f;//κάθε κιλό σιδήρου-μπετόν αυξάνεται στην τιμή πώλησης του κατά 1.5€ γιατί απαιτείται κάθε βέργα να γίνει τσέρκι
        else
            if (type.equals("kopi"))
                timi_polisis+=2;//κάθε κιλό σιδήρου-μπετόν αυξάνεται στην τιμή πώλησης του κατά 2€ γιατί απαιτείται κοπή κάθε βέργας
            else
                 if (type.equals("gyrisma"))
                     timi_polisis+=5; //κάθε κιλό σιδήρου-μπετόν αυξάνεται στην τιμή πώλησης του κατά 5€ γιατί απαιτείται γύρισμα των άκρων κάθε βέργας
   
        return timi_polisis;
    }
   
}

package part5;

import javax.swing.JOptionPane;

// H κλάση Mandyas περιγράφει το είδος Μανδύας
public class Mandyas extends Eidos
{
    //Δήλωση Μελών κλάσης Mandyas
    private float mikos;//To μήκος του Μανδύα
   
    private float platos;//To πλάτος του Μανδύα
  
    private float kostos_kataskeyis;//Κόστος κατασκευής μανδύα
  
    private String yliko;//Το πεδίο αυτό περιγράφει το υλικό κατασκευής του μανδύα (ατσάλι, χάλυβας κ.λ.π.)
 
    //Δημιουργός κλάσης Mandyas για αρχικοποίηση των ιδιωτικών μελών της
    Mandyas(int kodikos_eidous,String proeleysi,String kataskeyastis,String monada_metrisis,float mikos,float platos,float kostos_kataskeyis,String yliko,String AFM_Etaireias)
    {
        //Καλείται ο δημιουργός της υπερκλάσης Eidos για να κατασκευάσει ανώνυμο στιγμιότυπο σε αυτή από το οποίο κληρονομείται το τρέχον στιμγιότυπο 
        super(kodikos_eidous, proeleysi,kataskeyastis,monada_metrisis,0,AFM_Etaireias);//Το 0 είναι η αρχική τιμή πώλησης

        this.mikos=mikos;
        this.platos=platos;
        this.kostos_kataskeyis=kostos_kataskeyis;
        this.yliko=yliko;
    }
    
    //Μέθοδοι set που τροποποιύν τα ιδιωτικά μέλη της κλάσης Mandyas
    void set_mikos(float mikos)
    {
        this.mikos=mikos;
    }
    
    void set_platos(float platos)
    {
        this.platos=platos;
    }
    
    void set_kostos_kataskeyis(float kostos_kataskeyis)
    {
        this.kostos_kataskeyis=kostos_kataskeyis;
    }
    
    void set_yliko(String yliko)
    {
        this.yliko=yliko;
    }
    
    //Μέθοδοι get που επιστρέφουν τα ιδιωτικά μέλη της κλάσης Mandyas
    float get_mikos()
    {
        return mikos;
    }
    
    float get_platos()
    {
        return platos;
    }
    
    float get_kostos_kataskeyis()
    {
        return kostos_kataskeyis;
    }
    
    String get_yliko()
    {
        return yliko;
    }
    
    //Μέθοδος print() που εκτυπώνει τα μέλη της κλάσης Mandyas 
    void print()
    {
        String res="PLATOS: "+platos+"\n";
        res+="MHKOS: "+mikos+"\n";
        res+="KOSTOS KATASKEYHS: "+kostos_kataskeyis+"\n";
        res+="YLIKO KATASKEYHS MANDYA: "+yliko+"\n";
        res+="SYNOLIKH TIMH POLHSHS MANDYA: "+timi_polisis+"\n";
     
       JOptionPane.showMessageDialog(null, res,"STOIXEIA MANDYA", JOptionPane.PLAIN_MESSAGE);
    }
    
     //Μέθοδος toString() που επιστρέφει όλα τα μέλη της κλάσης Mandyas συνενωμένα ως ένα String
    public String toString()
    {
        String res="PLATOS MANDYA: "+platos+"\n";
        res+="MHKOS MANDYA: "+mikos+"\n";
        res+="KOSTOS KATASKEYHS: "+kostos_kataskeyis+"\n";
        res+="YLIKO KATASKEYHS MANDYA: "+yliko+"\n";
        res+="SYNOLIKH TIMH POLHSHS MANDYA: "+timi_polisis+"\n";
        
        return res;
    }
    
    //Λοιπές Μέθοδοι
    float ayxisi_timis_mandya()//Η μέθοδος αυτή υπολογίζει την τιμή πώλησης του μανδύα προσθέτοντας τα στοιχεία που τον επιβαρύνουν
    {
        if (yliko.equals("Atsali"))
            timi_polisis+=0.5f; //Αν το υλικό κατασκευής του μανδύα είναι ατσάλι, το κόστος του επιβαρύνεται κατά 0.5€ το τεμάχιο
        else 
            if (yliko.equals("Xalibas"))
                timi_polisis+=0.3f; //Αν το υλικό κατασκευής του μανδύα είναι χάλυβας, το κόστος του επιβαρύνεται κατά 0.3€ το τεμάχιο
            else
                 timi_polisis+=0.2f; //Αν το υλικό κατασκευής του μανδύα είναι οποιοδήποτε άλλο εκτός από ατσάλι και χάλυβα, το κόστος του επιβαρύνεται κατά 0.2€ το τεμάχιο
         
        timi_polisis+=kostos_kataskeyis;//Η τιμή πώλησης του μανδύα επιβαρύνεται με το κόστος κατασκευής του
   
        return timi_polisis;
    }
}

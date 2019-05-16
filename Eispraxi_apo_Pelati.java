package part5;
import java.util.Date;
import javax.swing.JOptionPane;

//H Κλάση αυτή περιγράφει μια είσπραξη από πελάτη (είτε χονδρικής είτε λιανικής)
public class Eispraxi_apo_Pelati 
{
    //δήλωση ιδιωτικών μελών κλάσης Eispraxi_apo_Pelati
    private int arithmos_apodixis;
    private float poso_pliromis;
    private Date hmerominia_pliromis=new Date();
    private String tropos_pliromis;
    private int codep; //Κωδικός Πελάτη που κάνει την πληρωμή
    
     //Δημιουργός κλάσης Eispraxi_apo_Pelati για αρχικοποίηση των ιδιωτικών μελών της
    Eispraxi_apo_Pelati(int arithmos_apodixis,float poso_pliromis,Date hmerominia_pliromis,String tropos_pliromis,int codep)
    {
        this.arithmos_apodixis=arithmos_apodixis;
        this.poso_pliromis=poso_pliromis;
        this.hmerominia_pliromis=hmerominia_pliromis;
        this.tropos_pliromis=tropos_pliromis;
        this.codep=codep;
    }
    
    void set_codep(int codep)//Μέθδος που τροποποιεί τον κωδικό πελάτη που κάνει την πληρωμή
    {
        this.codep=codep;
    }
    
    void set_arithmos_apodixis(int arithmos_apodixis)
    {
         this.arithmos_apodixis=arithmos_apodixis;
    }
    
    void set_poso_pliromis(float poso_pliromis)
    {
         this.poso_pliromis=poso_pliromis;
    }
    
    void set_hmerominia_pliromis(Date hmerominia_pliromis)
    {
         this.hmerominia_pliromis=hmerominia_pliromis;
    }
     
    void set_tropos_pliromis(String tropos_pliromis)
    {
         this.tropos_pliromis=tropos_pliromis;
    } 
    
    int get_arithmos_apodixis()
    {
        return arithmos_apodixis;
    }
    
    int get_codep()//Μέθδος που επιστρέφει τον κωδικό πελάτη που κάνει την πληρωμή
    {
        return codep;
    }
    
    float get_poso_pliromis()
    {
        return poso_pliromis;
    }
    
    String get_hmerominia_pliromis()
    {
        return hmerominia_pliromis.toString();
    }
    
    String get_tropos_pliromis()
    {
        return tropos_pliromis;
    }
    
    //Μέθοδος print() που εκτυπώνει όλα τα μέλη της κλάσης Eispraxi_apo_Pelati
    void print()
    {
        String res="ARITHMOS APODEIXHS: "+arithmos_apodixis+"\n";
        res+="POSO PLHROMHS: "+poso_pliromis+"\n";
        res+="HMEROMHNIA PLHROMHS:"+hmerominia_pliromis.toString()+"\n";
        res+="TROPOS PLHROMHS: "+tropos_pliromis+"\n";
        res+="KODIKOS PELATH: "+codep+"\n";
        
        JOptionPane.showMessageDialog(null, res,"APODEIXH PLHROMHS PELATH", JOptionPane.PLAIN_MESSAGE);
    }
    
     //Μέθοδος toString() που επιστρέφει όλα τα μέλη της κλάσης Eispraxi_apo_Pelati 
    //συνενωμένα σε ένα String
    public String toString()
    {
       String res="ARITHMOS APODEIXHS: "+arithmos_apodixis+"\n";
        res+="POSO PLHROMHS: "+poso_pliromis+"\n";
        res+="HMEROMHNIA PLHROMHS:"+hmerominia_pliromis.toString()+"\n";
        res+="TROPOS PLHROMHS: "+tropos_pliromis+"\n";
        res+="KODIKOS PELATH: "+codep+"\n";
        
        return res;
    }
}

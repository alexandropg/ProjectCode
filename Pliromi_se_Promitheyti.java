
package part5;
import java.util.Date;
import javax.swing.JOptionPane;

//H Κλάση αυτή περιγράφει μια πληρωμή σε προμηθευτή
public class Pliromi_se_Promitheyti 
{
    //δήλωση ιδιωτικών μελών κλάσης Pliromi_se_Promitheyti
    private int arithmos_apodixis;
    private float poso_pliromis;
    private Date hmerominia_pliromis=new Date();
    private String tropos_pliromis;
    private String AFM; //ΑΦΜ Προμηθευτή στον οποίο γίνετυαι η πληρωμή
    
     //Δημιουργός κλάσης Pliromi_se_Promitheyti για αρχικοποίηση των ιδιωτικών μελών της
    Pliromi_se_Promitheyti(int arithmos_apodixis,float poso_pliromis,Date hmerominia_pliromis,String tropos_pliromis,String AFM)
    {
        this.arithmos_apodixis=arithmos_apodixis;
        this.poso_pliromis=poso_pliromis;
        this.hmerominia_pliromis=hmerominia_pliromis;
        this.tropos_pliromis=tropos_pliromis;
        this.AFM=AFM;
    }
    
    void set_AFM(String AFM)//Μέθoδος που τροποποιεί το ΑΦΜ του προμηθευτή στον οποίο γίνεται η πληρωμή
    {
        this.AFM=AFM;
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
    
    String get_AFM()//Μέθδος που επιστρέφει το ΑΦΜ του προμηθευτή στον οποίο γίνεται η πληρωμή
    {
        return AFM;
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
    
    //Μέθοδος print() που εκτυπώνει όλα τα μέλη της κλάσης Pliromi_se_Promitheyti
    void print()
    {
        String res="ARITHMOS APODEIXHS: "+arithmos_apodixis+"\n";
        res+="POSO PLHROMHS: "+poso_pliromis+"\n";
        res+="HMEROMHNIA PLHROMHS:"+hmerominia_pliromis.toString()+"\n";
        res+="TROPOS PLHROMHS: "+tropos_pliromis+"\n";
        res+="AFM PROMHTEYTH: "+AFM+"\n";
        
        JOptionPane.showMessageDialog(null, res,"APODEIXH PLHROMHS PROMITHEYTH", JOptionPane.PLAIN_MESSAGE);
    }
    
     //Μέθοδος toString() που επιστρέφει όλα τα μέλη της κλάσης Pliromi_se_Promitheyti 
    //συνενωμένα σε ένα String
    public String toString()
    {
        String res="ARITHMOS APODEIXHS: "+arithmos_apodixis+"\n";
        res+="POSO PLHROMHS: "+poso_pliromis+"\n";
        res+="HMEROMHNIA PLHROMHS:"+hmerominia_pliromis.toString()+"\n";
        res+="TROPOS PLHROMHS: "+tropos_pliromis+"\n";
        res+="AFM PROMHTEYTH: "+AFM+"\n";
        
        return res;
    }
}

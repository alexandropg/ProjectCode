package part5;

import javax.swing.JOptionPane;

// H κλάση Promitheytis περιγράφει κάθε Προμηθευτή της εταιρείας Σιδήρου-Μπετόν
public class Promitheytis 
{
    //Δήλωση Μελών κλάσης Promitheytis
    private String AFM;
    private String eponymia;
    private String phone;
    private String edra;
    private String email;
    private float balance;//υπόλοιπο προμηθευτή
    
    //Δημιουργός κλάσης Promitheytis για αρχικοποίηση των ιδιωτικών μελών της
    Promitheytis(String AFM,String eponymia,String edra,String phone,String email,float balance)
    {
        this.AFM=AFM;
        this.eponymia=eponymia;
        this.edra=edra;
        this.phone=phone;
        this.email=email;
        balance=0; //αρχικοπόιηση υπολοίπου προμηθευτή κατά τη δημιουργία του
    }
    
    //Μέθοδοι set που τροποποιύν τα ιδιωτικά μέλη της κλάσης Promitheytis
    void set_AFM(String AFM)
    {
        this.AFM=AFM;
    }
    
    void set_eponymia(String eponymia)
    {
        this.eponymia=eponymia;
    }
    
    void set_edra(String edra)
    {
        this.edra=edra;
    }
   
    void set_phone(String phone)
    {
        this.phone=phone;
    }
    
    void set_email(String email)
    {
        this.email=email;
    }
    
    void set_balance(float balance)
    {
        this.balance=balance;
    }
    
    //Μέθοδοι get που επιστρέφουν τα ιδιωτικά μέλη της κλάσης Promitheytis
    String get_AFM()
    {
        return AFM;
    }
    
    String get_eponymia()
    {
        return eponymia;
    }
    
    String get_phone()
    {
        return phone;
    }
    
    String get_edra()
    {
        return edra;
    }
    
    float get_balance()
    {
        return balance;
    }
    
    //Μέθοδος print() που εκτυπώνει τα μέλη της κλάσης Promitheytis 
    void print()
    {
        String res="AFM PROMHTHEYTH: "+AFM+"\n";
        res+="EPONYMIA PROMHTHEYTH: "+eponymia+"\n";
        res+="EDRA: "+edra+"\n";
        res+="THLEFONO: "+phone+"\n";;
        res+="EMAIL:"+email+"\n";;
        res+="YPOLOIPO:"+balance;
        
        JOptionPane.showMessageDialog(null, res,"STOIXEIA PROMITHEYTH", JOptionPane.PLAIN_MESSAGE);
    }
    
     //Μέθοδος toString() που επιστρέφει τα μέλη της κλάσης Promitheytis 
    //συνενωμένα ως ένα String
    public String toString()
    {
        String res="AFM PROMHTHEYTH: "+AFM+"\n";
        res+="EPONYMIA PROMHTHEYTH: "+eponymia+"\n";
        res+="EDRA: "+edra+"\n";
        res+="THLEFONO: "+phone+"\n";;
        res+="EMAIL:"+email+"\n";;
        res+="YPOLOIPO:"+balance;
        
        return res;
    }
    
    //Λοιπές Μέθοδοι
     //Μέθοδος increase_balance που αυξάνει το υπόλοιπο του Προμηθευτή μετά από 
    //κάθε αγορά από αυτόν
    void increase_balance(float poso)
    {
        balance+=poso;
    }
    
    //Μέθοδος decrease_balance που μειώνει το υπόλοιπο του Προμηθευτή μετά από 
    //κάθε πληρωμή σε αυτόν
    void decrease_balance(float poso)
    {
        balance-=poso;
    }
    
}

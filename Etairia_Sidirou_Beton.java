package part5;

import javax.swing.JOptionPane;

// H κλάση αυτή περιγράφει την εταιρεία σιδήρου-μπετόν
public class Etairia_Sidirou_Beton 
{
    //Δήλωση Μελών κλάσης Etairia_Sidirou_Beton
    private String eponymia;
    private String AFM_Etaireias;
    private String doy;
    private String email;
    private String phone;
    private String address;
    private float tziros;
    
    //Δημιουργός κλάσης Etairia_Sidirou_Beton για αρχικοποίηση των ιδιωτικών μελών της
    Etairia_Sidirou_Beton()
    {
        eponymia="Polisi kai Emporia Sidirou & Domikon Plegmaton";
        AFM_Etaireias="082105296";
        doy="C Patras";
        email="ironcompany@gmail.com";
        phone="2610355553";
        address="Akth dymaion Patras";
        tziros=0;
    }
    
    //Μέθοδοι set που τροποποιύν τα ιδιωτικά μέλη της κλάσης Etairia_Sidirou_Beton
    void set_eponymia(String eponymia)
    {
        this.eponymia=eponymia;
    }
    
    void set_AFM_Etaireias(String AFM_Etaireias)
    {
        this.AFM_Etaireias=AFM_Etaireias;
    }
    
    void set_doy(String doy)
    {
        this.doy=doy;
    }
    
    void set_email(String email)
    {
        this.email=email;
    }
    
    void set_phone(String phone)
    {
        this.phone=phone;
    }
    
    void set_address(String address)
    {
        this.address=address;
    }
    
    void set_tziros(float tziros)
    {
        this.tziros=tziros;
    }
    
    
    //Μέθοδοι get που επιστρέφουν τα ιδιωτικά μέλη της κλάσης Etairia_Sidirou_Beton
    String get_eponymia()
    {
        return eponymia;
    }
    
    String get_AFM_Etaireias()
    {
        return AFM_Etaireias;
    }
    
    String get_doy()
    {
        return doy;
    }
    
    String get_email()
    {
        return email;
    }
    
    String get_phone()
    {
        return phone;
    }
    
    String get_address()
    {
        return address;
    }
    
    float get_tziros()
    {
        return tziros;
    }
    
    //Μέθοδος update_tziros που ενημερώνει το τζίρο της εταιρείας
    void update_tziros(float poso)
    {
        tziros+=poso;
    }
    
    //Μέθοδος print() που εκτυπώνει όλα τα μέλη της κλάσης Etairia_Sidirou_Beton 
    void print()
    {
        String res="EPONYMIA ETAIREIAS: Polisi kai Emporia Sidirou & Domikon Plegmaton\n";
        res+="AFM ETAIREIAS: 082105296\n";
        res+="DOY: C Patras\n";
        res+="EMAIL: ironcompany@gmail.com\n";
        res+="THLEFONO: 2610355553\n";
        res+="DIEYTHYNSH: Akth dymaion Patras\n";
        res+="TZIROS:"+tziros;
        
        JOptionPane.showMessageDialog(null, res,"STOIXEIA ETAIREIAS SIDHROY BETON", JOptionPane.PLAIN_MESSAGE);
    }
    
    //Μέθοδος toString() που επιστρέφει όλα τα μέλη της κλάσης Etairia_Sidirou_Beton 
    //συνενωμένα σε ένα String
    public String toString()
    {
        String res="EPONYMIA ETAIREIAS: Polisi kai Emporia Sidirou & Domikon Plegmaton\n";
        res+="AFM ETAIREIAS: 082105296\n";
        res+="DOY: C Patras\n";
        res+="EMAIL: ironcompany@gmail.com\n";
        res+="THLEFONO: 2610355553\n";
        res+="DIEYTHYNSH: Akth dymaion Patras\n";
        res+="TZIROS:"+tziros;
        
        return res;
    }
}

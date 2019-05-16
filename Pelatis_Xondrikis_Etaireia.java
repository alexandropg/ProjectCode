package part5;


import java.io.Serializable;
import javax.swing.JOptionPane;

// H κλάση αυτή περιγράφει κάθε Πελατη Χονδρικής-Εταιρεία της εταιρείας Σιδήρου-Μπετόν
public class Pelatis_Xondrikis_Etaireia extends Pelatis implements Serializable
{
    //Δήλωση μελών AFM, Eponymia, Ypeythinos της κλάσης Pelatis_Xondrikis_Etaireia. 
    //Τα υπόλοιπα μέκη κληρονομούνται από την υπερκλάση Pelatis
    private String AFM;
    private String eponymia;
    private String ypeythinos;
    
    //Δημιουργός κλάσης Pelatis_Xondrikis_Etaireia για αρχικοποίηση των μελών της
    Pelatis_Xondrikis_Etaireia(int codep,String onoma,String eponymo,String phone,String city,String AFM,String eponymia,String ypeythinos,String AFM_Etaireias)
    {
        super(codep,onoma,eponymo,phone,city,AFM_Etaireias);
        this.AFM=AFM;
        this.eponymia=eponymia;
        this.ypeythinos=ypeythinos;
    }
    
    //Μέθοδοι set που τροποποιούν τα μέλη της κλάσης Pelatis_Xondrikis_Etaireia
    void set_AFM(String AFM)
    {
        this.AFM=AFM;
    }
    
    void set_eponymia(String eponymia)
    {
        this.eponymia=eponymia;
    }
     
    void set_ypeythinos(String ypeythinos)
    {
        this.ypeythinos=ypeythinos;
    }  
    
     
    //Μέθοδοι get που επιστρέφει τα μέλη της κλάσης Pelatis_Xondrikis_Etaireia
    String get_AFM()
    {
        return AFM;
    }
    
    String get_eponymia()
    {
        return eponymia;
    }
    
    String get_ypeythinos()
    {
        return ypeythinos;
    }
     
    //Μέθοδος print() που εκτυπώνει τα μέλη της κλάσης Pelatis_Xondrikis_Etaireia 
    void print()
    {
        String res="ONOMA PELATH: "+onoma+"\n";
        res+="EPONYMO: "+eponymo+"\n";
        res+="AFM: "+AFM+"\n";
        res+="EPONYMIA: "+eponymia+"\n";
        res+="YPEYTHINOS: "+ypeythinos+"\n";
        res+="THLEFONO: "+phone+"\n";;
        res+="POLH:"+city+"\n";;
        res+="YPOLOIPO:"+balance;
        
        JOptionPane.showMessageDialog(null, res,"STOIXEIA PELATH XONDRIKHS/ETAIREIAS", JOptionPane.PLAIN_MESSAGE);
    }
    
     //Μέθοδος toString() που επιστρέφει τα μέλη της κλάσης Pelatis 
    //συνενωμένα ως ένα String
    public String toString()
    {
        String res="ONOMA PELATH: "+onoma+"\n";
        res+="EPONYMO: "+eponymo+"\n";
        res+="AFM: "+AFM+"\n";
        res+="EPONYMIA: "+eponymia+"\n";
        res+="YPEYTHINOS: "+ypeythinos+"\n";
        res+="THLEFONO: "+phone+"\n";;
        res+="POLH:"+city+"\n";;
        res+="YPOLOIPO:"+balance;
        
        return res;
    }
}


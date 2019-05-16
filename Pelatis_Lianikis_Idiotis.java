package part5;

import java.io.Serializable;
import javax.swing.JOptionPane;

// H κλάση αυτή περιγράφει κάθε Πελατη Λιανικής-Ιδιώτη της εταιρείας Σιδήρου-Μπετόν
public class Pelatis_Lianikis_Idiotis extends Pelatis implements Serializable
{
    //Δήλωση μέλους ADT κλάσης Pelatis_Lianikis_Idiotis. Τα υπόλοιπα μέκη κληρονομούνται από
    //την κλάση Pelatis
    private String ADT;
     
    //Δημιουργός κλάσης Pelatis_Lianikis_Idiotis για αρχικοποίηση των μελών της
    Pelatis_Lianikis_Idiotis(int codep,String onoma,String eponymo,String phone,String city,String ADT,String AFM_Etaireias)
    {
        super(codep,onoma,eponymo,phone,city,AFM_Etaireias);
        this.ADT=ADT;
    }
    
    //Μέθοδος set που τροποποιεί το ιδιωτικό μέλος ADT της κλάσης Pelatis_Lianikis_Idiotis
    void set_ADT(String ADT)
    {
        this.ADT=ADT;
    }
     
    //Μέθοδος get που επιστρέφει το ιδιωτικό μέλος ADT της κλάσης Pelatis_Lianikis_Idiotis
    String get_ADT()
    {
        return ADT;
    }
   
    //Μέθοδος print() που εκτυπώνει τα μέλη της κλάσης Pelatis_Lianikis_Idiotis 
    void print()
    {
        String res="ONOMA PELATH: "+onoma+"\n";
        res+="EPONYMO: "+eponymo+"\n";
        res+="ADT: "+ADT+"\n";
        res+="THLEFONO: "+phone+"\n";;
        res+="POLH:"+city+"\n";;
        res+="YPOLOIPO:"+balance;
        
       JOptionPane.showMessageDialog(null, res,"STOIXEIA PELATH LIANIKHS/IDIOTH", JOptionPane.PLAIN_MESSAGE);
    }
    
     //Μέθοδος toString() που επιστρέφει τα μέλη της κλάσης Pelatis 
    //συνενωμένα ως ένα String
    public String toString()
    {
        String res="ONOMA PELATH: "+onoma+"\n";
        res+="EPONYMO: "+eponymo+"\n";
        res+="ADT: "+ADT+"\n";
        res+="THLEFONO: "+phone+"\n";;
        res+="POLH:"+city+"\n";;
        res+="YPOLOIPO:"+balance;
        
        return res;
    }
}


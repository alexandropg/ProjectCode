package part5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;

// H κλάση Pelatis περιγράφει κάθε Πελατη της εταιρείας Σιδήρου-Μπετόν
public class Pelatis implements Serializable
{
    //Δήλωση Μελών κλάσης Pelatis
    protected String onoma;
    protected String eponymo;
    protected String phone;
    protected String city;
    protected float balance;//υπόλοιπο πελάτη
    protected int codep; //Κωδικός πελάτη
    protected String AFM_Etaireias;//Το πεδίο αυτό είναι το AFM_Etaireias που εμπορε΄θυεται τα είδη
  
    //Δημιουργός κλάσης Pelatis για αρχικοποίηση των μελών της
    Pelatis(int codep,String onoma,String eponymo,String phone,String city,String AFM_Etaireias)
    {
        this.codep=codep;
        this.onoma=onoma;
        this.eponymo=eponymo;
        this.phone=phone;
        this.city=city;
        this.AFM_Etaireias=AFM_Etaireias;
        balance=0; //αρχικοπόιηση υπολοίπου πελάτη
    }
    
    //Μέθοδοι set που τροποποιύν τα ιδιωτικά μέλη της κλάσης Pelatis
    void set_codep(int codep)
    {
        this.codep=codep;
    }
    
    void set_onoma(String onoma)
    {
        this.onoma=onoma;
    }
    
    void set_eponymo(String eponymo)
    {
        this.eponymo=eponymo;
    }
   
    void set_phone(String phone)
    {
        this.phone=phone;
    }
    
    void set_city(String city)
    {
        this.city=city;
    }
    
    void set_balance(float balance)
    {
        this.balance=balance;
    }
    
    //Μέθοδοι get που επιστρέφουν τα ιδιωτικά μέλη της κλάσης Pelatis
    int get_codep()
    {
        return codep;
    }
    
    String get_onoma()
    {
        return onoma;
    }
    
    String get_phone()
    {
        return phone;
    }
    
    String get_city()
    {
        return city;
    }
    
    float get_balance()
    {
        return balance;
    }
    
    //Μέθοδος increase_balance που αυξάνει το υπόλοιπο του πελάτη
    void increase_balance(float poso)
    {
        balance+=poso;
    }
    
    //Μέθοδος decrease_balance που μειώνει το υπόλοιπο του πελάτη
    void decrease_balance(float poso)
    {
        balance-=poso;
    }
    
    //Μέθοδος print() που εκτυπώνει τα μέλη της κλάσης Pelatis 
    void print()
    {
        String res="KODIKOS PELATH: "+codep+"\n";
        res+="ONOMA PELATH: "+onoma+"\n";
        res+="EPONYMO: "+eponymo+"\n";
        res+="THLEFONO: "+phone+"\n";;
        res+="POLH:"+city+"\n";;
        res+="YPOLOIPO:"+balance;
       
    }
    
     //Μέθοδος toString() που επιστρέφει τα μέλη της κλάσης Pelatis 
    //συνενωμένα ως ένα String
    public String toString()
    {
        String res="KODIKOS PELATH: "+codep+"\n";
        res+="ONOMA PELATH: "+onoma+"\n";
        res+="EPONYMO: "+eponymo+"\n";
        res+="THLEFONO: "+phone+"\n";;
        res+="POLH:"+city+"\n";;
        res+="YPOLOIPO:"+balance;
        
        return res;
    }
    
    
    public void storePromitheytis(Promitheytis emp)
    {  
        OutputStream ops = null;
        
        ObjectOutputStream objOps = null;
        try 
        {
            ops = new FileOutputStream("PromitheytesFile.txt");
            objOps = new ObjectOutputStream(ops);
           
            objOps.writeObject(emp);
           
            objOps.flush();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(objOps != null) 
                    objOps.close();
            } 
            catch (Exception ex){}
        }
         
    }
     
    public void displayPromhtheytis()
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        Promitheytis emp=null;
    
        try 
        {
            fileIs = new FileInputStream("PromitheytesFile.txt");
            objIs = new ObjectInputStream(fileIs);
            emp = (Promitheytis) objIs.readObject();
            System.out.println(emp);
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if(objIs != null) 
                    objIs.close();
            }
            catch (Exception ex) {}
        }
    }
     
}

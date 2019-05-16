package part5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.*;
import java.text.*;
import javax.swing.JOptionPane;
import static part5.PelatisOperations.check_duplicate_ADT;

public class Part5 
{
    static Pelatis p,q;
    static Pelatis_Xondrikis_Etaireia px;
    static Pelatis_Lianikis_Idiotis pl;
    static Promitheytis pro,qro;
    
    public static void main(String[] args) 
    {
            Menu();
            
            Etairia_Sidirou_Beton company=new Etairia_Sidirou_Beton();//Στιγμιότυπο Εταιρείας ΣΙδήρου Μπετόν
            company.print();
            
            //Δηλώνουμε το στιγμιότυπο p τύπου Pelatis που αντιπροσωπεύει ένα πελάτη με
            //Όνομα Nikos, Επώνυμο Mathaiou, Τηλέφωνο 2610299100, Πόλη Patra της εταιρείας Σιδήρου-Μπετόν με ΑΦΜ 0999999999
            p=new Pelatis(1,"Nikos","Mathaiou","2610299100","Patra","082105296");
            
            //Δηλώνουμε το στιγμιότυπο q τύπου Pelatis που αντιπροσωπεύει ένα πελάτη με
            //Όνομα Anna, Επώνυμο Bagena, Τηλέφωνο 26107779100, Πόλη Patra της εταιρείας Σιδήρου-Μπετόν με ΑΦΜ 0999999999
            q=new Pelatis(2,"Anna","Bagena","26107779100","Patra","082105296");
          
            //Δηλώνουμε το στιγμιότυπο px τύπου Pelatis_Xondrikis_Etaireia που αντιπροσωπεύει ένα πελάτη Χονδρικής με
            //Όνομα Nikos, Επώνυμο Mathaiou, Τηλέφωνο 2610299100, Πόλη Patra, ΑΦΜ 0999999999, Επωνυμια ELPE και Υπεύθυνο Nikolaou
            px=new Pelatis_Xondrikis_Etaireia(1,"Nikos","Mathaiou","2610299100","Patra","0999999999","ELPE","Nikolaou","082105296");
            px.print();

            //Δηλώνουμε το στιγμιότυπο pl τύπου Pelatis_Lianikis_Idiotis που αντιπροσωπεύει ένα πελάτη Λιανικής με
            //Όνομα Anna, Επώνυμο Bagena, Τηλέφωνο 26107779100, Πόλη Patra, ΑΔΤ AE123456
            pl=new Pelatis_Lianikis_Idiotis(2,"Anna","Bagena","26107779100","Patra","AE123456","082105296");
            pl.print();
            
            //Δηλώνουμε το στιγμιότυπο pro τύπου Promitheytis που αντιπροσωπεύει ένα Προμηθευτή της Εταιρείας Σιδήρου-Μπετόν με
            //Επωνυμία EISAGOGIKH AE, Τηλέφωνο 2310456789, Πόλη THESSALONIKH, ΑΦΜ 022222222 και αρχικόυπόλοιπο σε αυτόν 500€
            pro=new Promitheytis("022222222","EISAGOGIKH AE","THESSALONIKH","2310456789","EISAG@HOTMAIL.COM",500);
            pro.print();
            
             //Δηλώνουμε το στιγμιότυπο qro τύπου Promitheytis που αντιπροσωπεύει ένα Προμηθευτή της Εταιρείας Σιδήρου-Μπετόν με
            //Επωνυμία EMPORIKH OE, Τηλέφωνο 261065432, Πόλη PATRA, ΑΦΜ 055555555 και αρχικό υπόλοιπο σε αυτόν 400€
            qro=new Promitheytis("055555555","EMPORIKH OE","PATRA","261065432`","EMPORIKH@GMAIL.COM",400);
            qro.print();
          
            SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
            Date d=new Date();  

            String input="2019-10-11";
            Date t=null;

            try 
            {
              t = ft.parse(input); 
              System.out.println(t); 
             } 
             catch (ParseException e) 
             { 
               System.out.println("Unparseable using " + ft); 
             } 

             //Eidos(int kodikos_eidous,String proeleysi,String kataskeyastis,String monada_metrisis,float timi_polisis,String AFM_Etaireias)
             Eidos e=new Eidos(200,"ELLADA","XALYBOYRGIA THESSALIAS","TEMAXIO",8,"022222222");
            
            //Δηλώνουμε 3 στιγμιότυπα των κλάσεων Domiko_Plegma, Mandyas και Sidiros_Beton αντίστοιχα

             //Δηλώνουμε το στιγμιότυπο dom της κλάσης Domiko_Plegma με κωδικο 200, Προέλευση ELLADA, Κατασκευαστή XALYBOYRGIA THESSALIAS, μονάδα μέτρησης ΤΕΜΑΧΙΟ, Τιμή Αγοράς 8€, Διάσταση ΚΑΝΟΝΙΚΗ από τον προμηθευτή με ΑΦΜ 022222222 
             Domiko_Plegma dom=new Domiko_Plegma(200,"ELLADA","XALYBOYRGIA THESSALIAS","TEMAXIO",8,"KANONIKH","022222222");
            
             //Δηλώνουμε το στιγμιότυπο man της κλάσης Mandyas με κωδικο 300, Προέλευση ELLADA, Κατασκευαστή XALYBOYRGIA THESSALIAS, Μήκος 1.2 και Πλάτος 1.5, Τιμή Αγοράς 3€, Υλικό Κατασκευής ATSALI από τον προμηθευτή με ΑΦΜ 022222222 
             Mandyas man=new Mandyas(300,"ELLADA","XALYBOYRGIA THESSALIAS","TEMAXIO",1.2f,1.5f,3,"ATSALI","022222222");
            
             //Δηλώνουμε το στιγμιότυπο sid της κλάσης  Sidiros_Beton με κωδικο 400, Προέλευση ELLADA, Κατασκευαστή XALYBOYRGIA ATHINAS, Μονάδα Μέτρησης ΤΟNOS, Τιμή Αγοράς 20€, Ποσοστό κέρδους 10% από τον προμηθευτή με ΑΦΜ 022222222 
             Sidiros_Beton sid=new Sidiros_Beton(400,"ELLADA","XALYBOYRGIA ATHINAS","TONOS",20,10f,"022222222");
             
             //Δηλώνουμετο στιμγιότυπο eidh_agoras στο οποίο θα καταχωρηθούν τα είδη αγοράς (Τιμολόγιο Αγοράς)
             ArrayList<Eidos> eidh_agoras=new  ArrayList<Eidos> ();
             eidh_agoras.add(dom);//Προστίθεται το είδος dom στο ArrayList eidh_agoras
             eidh_agoras.add(man);//Προστίθεται το είδος man στο ArrayList eidh_agoras
             eidh_agoras.add(sid);//Προστίθεται το είδος sid στο ArrayList eidh_agoras
             
             //Δηλώνουμε το στιγμιότυπο posotites_agoras στο οποίο θα καταχωρηθούν οι ποσότητες αγοράς των ειδών ενός τιμολογίου αγοράς
             ArrayList <Integer> posotites_agoras=new ArrayList<Integer> ();
             posotites_agoras.add(50);//Για το είδος dom προστίθεται η τιμή 50 (τεμάχια) στο ArrayList posotites_agoras
             posotites_agoras.add(70);//Για το είδος man προστίθεται η τιμή 70 (τεμάχια) στο ArrayList posotites_agoras
             posotites_agoras.add(100);//Για το είδος sid προστίθεται η τιμή 100 (τόνοι) στο ArrayList posotites_agoras
          
             
             ///Δηλώνουμε το στιγμιότυπο paragor  που αντιπροσωπεύει ένα τιμολογιο αγοράς από τον προμηθευτή με ΑΦΜ 022222222
             //Ποσοστό ΦΠΑ 36%, Τρόπο Παραλαβής APOSTOLH PROMHTHEYTH ME NTALIKA και ημερομηνία έκδοσης που βρίσκεται στη μεταβλητή t
             Parastatiko_Agoras paragor=new Parastatiko_Agoras(23,"022222222",t,0.36f,"APOSTOLH PROMHTHEYTH ME NTALIKA");
             paragor.add_eidh_posotites(eidh_agoras,posotites_agoras);//τα 2 ArrayList eidh_agoras και posotites_agoras καταχωρούνται στα αντίστοιχα ArrayList του στιγμιοτύπου paragor
             paragor.ypologismos_axias_timologiou();//Υπολίζεται η καθαρή και η συνολική αξία του τιμολογίου Αγοράς
             paragor.print();//Εμφανίζονται όλα τα στοιχεία του τιμιλογίου αγοράς (μαζί με τις αξίες του)

             //Δηλώνουμε το στιμγιότυπο eidh_polhshs στο οποίο θα καταχωρηθούν όλα τα είδη ενός τιμολογίου Χονδρικής (Τιμολόγιο Πώλησης)      
             ArrayList<Eidos> eidh_polhshs=new  ArrayList<Eidos> ();
             eidh_polhshs.add(dom);//Προστίθεται το είδος dom στο ArrayList eidh_polhshs.
             eidh_polhshs.add(man);//Προστίθεται το είδος man στο ArrayList eidh_polhshs.
             eidh_polhshs.add(sid);//Προστίθεται το είδος sid στο ArrayList eidh_polhshs.
             
             //Δηλώνουμε το στιγμιότυπο posotites_polisis στο οποίο θα καταχωρηθούν οι ποσότητες πώλησης των ειδών ενός τιμολογίου Χονδρικής Πώλησης
             ArrayList <Integer> posotites_polisis=new ArrayList<Integer> ();
             posotites_polisis.add(10);//Για το είδος dom προστίθεται η τιμή 10 (τεμάχια) στο ArrayList posotites_polisis
             posotites_polisis.add(15);//Για το είδος man προστίθεται η τιμή 15 (τεμάχια) στο ArrayList posotites_polisis
             posotites_polisis.add(20);//Για το είδος sid προστίθεται η τιμή 20 (τόνοι) στο ArrayList posotites_polisis
          
             //Δηλώνουμε το στιγμιότυπο pxp τύπου Parastatiko_Xondrikis_Polisis που εκδίδεται στον πελάτη Χονδρικής με ΑΦΜ 0999999999
             //με αριθμό τιμολογίου 29, Ποσοστό ΦΠΑ 18% και Τρόπο Αποστολής Paralabh Pelath και ημερομηνία έκδοσης που βρίσκεται στη μεταβλητή d
             Parastatiko_Xondrikis_Polisis pxp=new Parastatiko_Xondrikis_Polisis(29,"0999999999",d,0.18f,"Paralabh Pelath");        
             pxp.add_eidh_posotites(eidh_polhshs,posotites_polisis);//τα 2 ArrayList eidh_polhshs και posotites_polisis καταχωρούνται στα αντίστοιχα ArrayList του στιγμιοτύπου pxp
             pxp.ypologismos_axion_timologiou();//Υπολίζεται η καθαρή και η συνολική αξία του τιμολογίου
             pxp.print();

            
             //Δηλώνουμε 3 στιγμιότυπα των κλάσεων Domiko_Plegma, Mandyas και Sidiros_Beton αντίστοιχα
             //Δηλώνουμε το στιγμιότυπο dom2 της κλάσης Domiko_Plegma με κωδικο 210, Προέλευση ELLADA, Κατασκευαστή XALYBOYRGIA BOLOU, μονάδα μέτρησης ΤΕΜΑΧΙΟ, Τιμή Αγοράς 6€, Διάσταση EKTETAMENH από τον προμηθευτή με ΑΦΜ 022222222 
             Domiko_Plegma dom2=new Domiko_Plegma(210,"ELLADA","XALYBOYRGIA BOLOU","TEMAXIO",6,"EKTETAMENH","022222222");
             
            //Δηλώνουμε το στιγμιότυπο man2 της κλάσης Mandyas με κωδικο 310, Προέλευση ELLADA, Κατασκευαστή XALYBOYRGIA BOLOU, Μήκος 2.2 και Πλάτος 2.5, Τιμή Αγοράς 6€, Υλικό Κατασκευής XALYBAS από τον προμηθευτή με ΑΦΜ 022222222 
             Mandyas man2=new Mandyas(310,"ELLADA","XALYBOYRGIA BOLOU","TEMAXIO",2.2f,2.5f,6,"ΧΑΛΥΒΑΣ","022222222");
             
            //Δηλώνουμε το στιγμιότυπο sid2 της κλάσης  Sidiros_Beton με κωδικο 410, Προέλευση ELLADA, Κατασκευαστή XALYBOYRGIA ATHINAS, Μονάδα Μέτρησης ΤΟNOS, Τιμή Αγοράς 10€, Ποσοστό Κέρδους 20% από τον προμηθευτή με ΑΦΜ 022222222 
             Sidiros_Beton sid2=new Sidiros_Beton(410,"ELLADA","XALYBOYRGIA ATHINAS","TONOS",10,0.20f,"022222222");
           
             ArrayList<Eidos> eidh_polhshs2=new  ArrayList<Eidos> ();//δημιουργούμε ένα ArrayList με τα είδη πώλησης για παραστατικό λιανικής (Απόδειξη Λιανικής Πώλησης)
             
             //δημιουργούμε 3 στιγμιότυπα τύπου Integer που αντιπροσωπεύουν τις ποσότητες πώλησης
             Integer a=new Integer(8);
             Integer b=new Integer(11);
             Integer c=new Integer(22);
             
             //Δηλώνουμε το στιγμιότυπο plp τύπου Parastatiko_Lianikis_Polisis που εκδίδεται στον πελάτη Λιανικής με ΑΔΤ AE123456
             //με αριθμό Απόδειξης 67, συνολική αξία 380€ και ημερομηνία έκδοσης που βρίσκεται στη μεταβλητή d
             Parastatiko_Lianikis_Polisis plp=new Parastatiko_Lianikis_Polisis(67,"AE123456",d,380);
             
             //καλώντας τη μέθοδο add_eidos προσθέτουμε τα 3 είδη με τις ποσότητςς τους στa ArralyList eidi_apodixis και posotita_eidous_apodixis του στιγμιοτύπου plp
             plp.add_eidos(dom2,a);
             plp.add_eidos(man2,b);
             plp.add_eidos(sid2,c);
             
             plp.ypologismos_axias_apodixis();
             plp.print();
             
             //Δηλώνουμε το στιγμιότυπο eis1 τύπου Eispraxi_apo_Pelati που εκδίδεται στον πελάτη με Κωδικό 1
             //με αριθμό απόδειξης 14, συνολική αξία 240€ και Τρόπο πληρωμής cash και ημερομηνία έκδοσης που βρίσκεται στη μεταβλητή d
             Eispraxi_apo_Pelati eis1=new Eispraxi_apo_Pelati(14,240,d,"cash",1);//Στιγμιότυπο Είσπραξης από Πελάτη Χονδρική
             eis1.print();

             //Δηλώνουμε το στιγμιότυπο eis2 τύπου Eispraxi_apo_Pelati που εκδίδεται στον πελάτη με Κωδικό 1
             //με αριθμό απόδειξης 15, συνολική αξία 240€ και Τρόπο πληρωμής card και ημερομηνία έκδοσης που βρίσκεται στη μεταβλητή d
             Eispraxi_apo_Pelati eis2=new Eispraxi_apo_Pelati(15,200,d,"card",1);
             eis2.print();

            //Δηλώνουμε το στιγμιότυπο plr τύπου Pliromi_se_Promitheyti που εκδίδεται από τον προμηθευτή με ΑΦΜ 022222222
            //με αριθμό απόδειξης 35, συνολική αξία 100€ και Τρόπο πληρωμής Cash και ημερομηνία έκδοσης που βρίσκεται στη μεταβλητή t
            Pliromi_se_Promitheyti plr=new Pliromi_se_Promitheyti(35,100,t,"cash","022222222");      
         
    }
    
    static void Menu()
    {
        String info="Μενού Πρόγράμματος\n1.Καταχώριση Πελάτη Χονδρικής\n2.Καταχώριση Πελάτη Λιανικής\n3.Τροποποίηση Πελάτη Χονδρικής\n4.Τροποποίηση Πελάτη Λιανικής\n5.Διαγραφή Πελάτη Χονδρικής\n6.Διαγραφή Πελάτη Λιανικής \n7.Καταχώριση Προμηθευτή\n8.Τροποποίηση Προμηθευτή\n9.Διαγραφή Προμηθευτή\n10.Καταχώριση Είδους\n11.Τροποποίηση Είδους\n12.Διαγραφή Είδους\n13.καταχώριση Παραγγελίας\n14.Ενημέρωση Πελατών με μεγάλο υπόλοιπο\n15.Ενηλικίωση Υπολοίπου Πελατών\n16.Στατιστικά\n17.Τερματισμός Προγράμματος\n";
        int res=Integer.parseInt(JOptionPane.showInputDialog(info));
        
        Scanner sc=new Scanner(System.in);
        
        switch(res)
        {
           case 1: katax_pel_xond();
                    break;
                    
           case 2: katax_pel_lian();
                    break;
                    
           case 3:  trop_pel_xond();
                    break;  
                    
           case 4: trop_pel_lian();
                  break;
                  
           case 5: diag_pel_xond();
                   break;  
                    
           case 6: diag_pel_lian();
                  break;  
                  
           case 7: katax_prom();
                    break;
                    
           case 8: trop_prom();
                    break;
                    
           case 9: diag_prom();
                   break; 
                   
          case 10: katax_eidous();
                    break;
                    
           case 11: trop_eidous();
                    break;
                    
           case 12: diag_eidous();
                   break;
                   
           case 13: katax_parag();
                   break;
                   
          case 14: find_pelat();
                   break;
                   
         case 15: enilik_ypol();
                   break;
                   
         case 16: Statistika.ypologismos_statistikon();
                  return;
                  
         case 17: return;      
        }
    }
    
    static void statistika()
    {
        
    }
    
    static void enilik_ypol()
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        Pelatis emp=null;
    
        try 
        {
            fileIs = new FileInputStream("PelatesLianikisFile.txt");
            objIs = new ObjectInputStream(fileIs);
            emp = (Pelatis) objIs.readObject();
            Date d=new Date();
            
            if (d.after(enter_orio_hmerom()))
                send_email(emp.get_onoma());
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
       
        InputStream fileIs2 = null;
        ObjectInputStream objIs2 = null;
        Pelatis emp2=null;
    
        try 
        {
            fileIs2 = new FileInputStream("PelatesXondrikisFile.txt");
            objIs2 = new ObjectInputStream(fileIs);
            Date d=new Date();
            
            if (d.after(enter_orio_hmerom()))
                send_email(emp.get_onoma());
     
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
                if(objIs2 != null) 
                    objIs2.close();
            }
            catch (Exception ex) {}
        } 
    }
    
    static Date enter_orio_hmerom()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Δώσε Ημερομηνία γαι ενηλικίωση υπολοίπου πελατών");
        String orio=sc.next();
        Date d=new Date();
        return d;
    }
    
    
    static void find_pelat()
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        Pelatis emp=null;
    
        try 
        {
            fileIs = new FileInputStream("PelatesLianikisFile.txt");
            objIs = new ObjectInputStream(fileIs);
            emp = (Pelatis) objIs.readObject();
            
            if (emp.get_balance()>=enter_orio_pelaton())
                send_email(emp.get_onoma());
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
        
        
        InputStream fileIs2 = null;
        ObjectInputStream objIs2 = null;
        Pelatis emp2=null;
    
        try 
        {
            fileIs2 = new FileInputStream("PelatesXondrikisFile.txt");
            objIs2 = new ObjectInputStream(fileIs);
            emp2 = (Pelatis) objIs.readObject();
          
            if (emp2.get_balance()>=enter_orio_pelaton())
               send_email(emp2.get_onoma());
     
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
                if(objIs2 != null) 
                    objIs2.close();
            }
            catch (Exception ex) {}
        } 
    }
    
    static void send_email(String onom)
    {
       System.out.println("O πελάτης με όνομα "+onom+" έχει υπόλοιπο πάνω από το όριο και πρέπει να ειδοποιηθεί");
      
    }
    
    static float enter_orio_pelaton()
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Δώσε όριο υπολοίπου πελατών");
        float orio=sc.nextFloat();
        return orio;
    }
    ////////////////////////////////////////
    static void katax_parag()
    {  
        Scanner sc=new Scanner(System.in);
        Paraggelia parag=new Paraggelia();
        
        System.out.println("Δώσε 1 για παραγγελία σιδήρρου και 2 για παραγγελία δομικού πλέγματος");
        int type=sc.nextInt();
        
        int orio=enter_orio();

        if (type==1)
        {
            if (Domiko_Plegma.ypoloipo_Domiko_Plegma>=orio)
                System.out.println("To Δομικό Πλέγμα εχει επαρκές υπόλοιπο. Δεν χρειάζεται παραγγελία");
            else
                parag.addEidos(1);
        }
        else
        {
            if (Sidiros_Beton.ypoloipo_Sidiros_Beton>=orio)
                System.out.println("Ο Σϊδηρος-Μπετόν εχει επαρκές υπόλοιπο. Δεν χρειάζεται παραγγελία");
            else
                parag.addEidos(2);
        }
    }
    
    static int enter_orio()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Δώσε όριο παραγγελίας");
        int orio=sc.nextInt();
        return orio;
    }
    
    static void check_orio(int type,int orio)
    {
        if (type==1)
        {
            if (Domiko_Plegma.ypoloipo_Domiko_Plegma>=orio)
                System.out.println("To Δομικό Πλέγμα εχει επαρκές υπόλοιπο. Δεν χρειάζεται παραγγελία");
            else
            {
                Paraggelia parag=new Paraggelia();
                parag.addEidos(1);
            }
        }
        else
        {
             if (Sidiros_Beton.ypoloipo_Sidiros_Beton>=orio)
                System.out.println("Ο Σϊδηρος-Μπετόν εχει επαρκές υπόλοιπο. Δεν χρειάζεται παραγγελία");
            else
             {
                Paraggelia parag=new Paraggelia();
                parag.addEidos(2);
             }
        }
    }
    
   
    static void katax_pel_xond()
    {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Δώσε νέο όνομα,επώνυμο,τηλέφωνο,πόλη,επωνυμία,ΑΦΜ,υπεύθυνο,κωδικό");
        String on=sc.next();
        String epon=sc.next();
        String thl=sc.next();
        String city=sc.next();
        String eponymia=sc.next();
        String ypey=sc.next();
        int code=sc.nextInt();
        
        String afm=enter_afm();
        check_duplicate_AFM(afm); 
       
        enter_rest();
        
        Pelatis pl=new Pelatis_Xondrikis_Etaireia(code,on,epon,thl,city,afm,eponymia,ypey,"084102395");
        pl.print(); 
        
        storePelatisXondrikis(pl);
     }
    
     static void katax_pel_lian()
     {  
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Δώσε νέο κωδικό,όνομα,επώνυμο,τηλέφωνο,πόλη,ΑΔΤ");
        int code=sc.nextInt();
        String on=sc.next();
        String epon=sc.next();
        String thl=sc.next();
        String city=sc.next();
       
        String adt=enter_adt();
        enter_rest_lian();
 
        Pelatis pl=new Pelatis_Lianikis_Idiotis(code,on,epon,thl,city,adt,"082105296");
        pl.print();
       
        check_duplicate_ADT(adt);      
        storePelatisLianikis(pl);
     }
     
     static void katax_prom()
     {  
        Scanner sc=new Scanner(System.in);
     
        System.out.println("Δώσε ΑΦΜ, επωνυμία,έδρα,τηλέφωνο,email,αρχικό υπόλοιπο");
     
        enter_rest();
        
        String epon=sc.next();
        String edra=sc.next();
        String thl=sc.next();
        String email=sc.next();
        float bal=sc.nextFloat();
       
        String afm=enter_afm();
        check_duplicate_AFM(afm); 
        
        Promitheytis prom=new Promitheytis(afm,epon,edra,thl,email,bal);
    
        storePromitheytis(prom);
     }
     
      static void katax_eidous()
     {  
        Scanner sc=new Scanner(System.in);
     
        System.out.println("Δώσε Κωδικό Είδους,προέλευση,κατασκευαστή,μονάδα μέτρησης,τιμή αγοράς");
        enter_rest_eidous();
        
        String proe=sc.next();
        String kat=sc.next();
        String mon=sc.next();
        String diast=sc.next();
        float timi=sc.nextFloat();
        int code=enter_code();
        
        check_duplicate_code(code); 
        
       
        Domiko_Plegma dom=new Domiko_Plegma(code,proe,kat,mon,timi,diast,"022222222");
    
        storeEidos(dom);
     }
      /////////////////////////////////////////
     
      
      
     ////////////////////////////////////////////////
     static void trop_pel_xond()
     {  
        String afm=enter_afm();
        boolean res=find_AFM(afm);
        
        if (res==true)
            print_mess_found_afm();
        else
        {
            print_mess_not_found_afm();
            return;
        }
        
        Scanner sc=new Scanner(System.in);
        
        change_fields();
        
        System.out.println("Δώσε νέο κωδικό,όνομα, επώνυμο,τηλέφωνο,πόλη,επωνυμία,υπεύθυνο");
        int code=sc.nextInt();
        String on=sc.next();
        String epon=sc.next();
        String thl=sc.next();
        String city=sc.next();
        String eponymia=sc.next();
        String ypey=sc.next();
        
       
        Pelatis pl=new Pelatis_Xondrikis_Etaireia(code,on,epon,thl,city,afm,eponymia,ypey,"084102395");
        pl.print();     
        storePelatisXondrikis(pl);
     }
     
     static void trop_pel_lian()
     {  
        String adt=enter_adt();
        boolean res=find_ADT(adt);
           
        if (res==true)
            print_mess_found_adt();
        else
        {
            print_mess_not_found_adt();
            return;
        }
        
        Scanner sc=new Scanner(System.in);
        
        change_fields();
          
        System.out.println("Δώσε νέο κωδικό,όνομα, επώνυμο,τηλέφωνο,πόλη,ΑΔΤ");
        int cod=sc.nextInt();
        String on=sc.next();
        String epon=sc.next();
        String thl=sc.next();
        String city=sc.next();
       
        check_duplicate_ADT(adt); 
        
        Pelatis pl=new Pelatis_Lianikis_Idiotis(cod,on,epon,thl,city,adt,"082105296");
        pl.print();    
        
        storePelatisLianikis(pl);
     }
     
     static void trop_prom()
     {  
        String afm=enter_afm();
        boolean res=find_AFM(afm);
        
        if (res==true)
            print_mess_found_afm();
        else
        {
            print_mess_not_found_afm();
            return;
        }
        
        Scanner sc=new Scanner(System.in);
        
        change_fields();
        
        System.out.println("Δώσε ΑΦΜ, επωνυμία,έδρα,τηλέφωνο,email,αρχικό υπόλοιπο");
        int code=sc.nextInt();
       
        String epon=sc.next();
        String thl=sc.next();
        String edra=sc.next();
        String email=sc.next();
        float bal=sc.nextFloat();
        
        Promitheytis prom=new Promitheytis(afm,epon,edra,thl,email,bal);
        prom.print();
            
        storePromitheytis(prom);
     }
     
      static void trop_eidous()
     {  
        int code=enter_code();
        boolean res=find_code(code);
        
        if (res==true)
            print_mess_found_code();
        else
        {
            print_mess_not_found_code();
            return;
        }
        
        Scanner sc=new Scanner(System.in);
        
        change_fields();
        
        System.out.println("Δώσε Κωδικό Είδους,προέλευση,κατασκευαστή,μονάδα μέτρησης,τιμή αγοράς");
     
        enter_rest();
        
        String proe=sc.next();
        String kat=sc.next();
        String mon=sc.next();
        String diast=sc.next();
        float timi=sc.nextFloat();
        
        check_duplicate_code(code); 
        
       
        Domiko_Plegma dom=new Domiko_Plegma(code,proe,kat,mon,timi,diast,"022222222");
    
        storeEidos(dom);
     
     }
     //////////////////////////////////////////////
      
      
    ///////////////////////////////////////////////  
    static void diag_pel_xond()
    { 
        String afm=enter_afm();
        find_AFM(afm);
        delete_pelatis_xond(afm);
        
    }
                           
    static void diag_pel_lian()
    { 
        String adt=enter_adt();
        find_ADT(adt);
        delete_pelatis_lian(adt);
    }
    
    static void diag_prom()
    { 
        String adt=enter_adt();
        find_ADT(adt);
        delete_promitheytis(adt);
    }
    
    static void diag_eidous()
    { 
        int code=enter_code();
        find_code(code);
        delete_eidos(code);
    }
    
    /////////////////////////////////////////////
    
    
    //////////////////////////////////////////
    static void storePelatisXondrikis(Pelatis emp)
    {  
        OutputStream ops = null;
        
        ObjectOutputStream objOps = null;
        try 
        {
            ops = new FileOutputStream("PelatesXondrikisFile.txt");
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
    
    static void storePelatisLianikis(Pelatis emp)
    {  
        OutputStream ops = null;
        
        ObjectOutputStream objOps = null;
        try 
        {
            ops = new FileOutputStream("PelatesLianikisFile.txt");
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
    
    static void storeEidos(Domiko_Plegma dom)
    {  
        OutputStream ops = null;
        
        ObjectOutputStream objOps = null;
        try 
        {
            ops = new FileOutputStream("EidhFile.txt");
            objOps = new ObjectOutputStream(ops);
           
            objOps.writeObject(dom);
           
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
    /////////////////////////////////////
    
    
    
    
    ////////////////////////////////////
    static void displayPelatisXondrikis()
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        Pelatis emp=null;
    
        try 
        {
            fileIs = new FileInputStream("PelatesXondrikisFile.txt");
            objIs = new ObjectInputStream(fileIs);
            emp = (Pelatis) objIs.readObject();
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
      
    static void displayPelatisLianikis()
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        Pelatis emp=null;
    
        try 
        {
            fileIs = new FileInputStream("PelatesLianikisFile.txt");
            objIs = new ObjectInputStream(fileIs);
            emp = (Pelatis) objIs.readObject();
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
    
    static void displayPromitheytis()
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
     
    
    /////////////////////////////////////////
    static void delete_pelatis_xond(String afm)
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        Pelatis_Xondrikis_Etaireia emp=null;
    
        try 
        {
            fileIs = new FileInputStream("PelatesXondrikisFile.txt");
            objIs = new ObjectInputStream(fileIs);
            emp = (Pelatis_Xondrikis_Etaireia) objIs.readObject();
            
            if (emp.get_AFM()==afm)
            {
                 FileOutputStream ops = new FileOutputStream("PelatesXondrikisFile.txt");
                 ObjectOutputStream objOps = new ObjectOutputStream(ops);
                 emp=null;
                 objOps.writeObject(emp);
            }
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
    
    
     static void delete_pelatis_lian(String adt)
     {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        Pelatis_Lianikis_Idiotis emp=null;
    
        try 
        {
            fileIs = new FileInputStream("PelatesLianikisFile.txt");
            objIs = new ObjectInputStream(fileIs);
            emp = (Pelatis_Lianikis_Idiotis) objIs.readObject();
            
            if (emp.get_ADT()==adt)
            {
                 FileOutputStream ops = new FileOutputStream("PelatesLianikisFile.txt");
                 ObjectOutputStream objOps = new ObjectOutputStream(ops);
                 emp=null;
                 objOps.writeObject(emp);
            }
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
    
    static void delete_promitheytis(String afm)
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        Promitheytis emp=null;
    
        try 
        {
            fileIs = new FileInputStream("PromitheytesFile.txt");
            objIs = new ObjectInputStream(fileIs);
            emp = (Promitheytis) objIs.readObject();
            
            if (emp.get_AFM()==afm)
            {
                 FileOutputStream ops = new FileOutputStream("PromitheytesFile.txt");
                 ObjectOutputStream objOps = new ObjectOutputStream(ops);
                 emp=null;
                 objOps.writeObject(emp);
            }
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
  
  
     static void delete_eidos(int code)
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        Domiko_Plegma dom=null;
    
        try 
        {
            fileIs = new FileInputStream("EidhFile.txt");
            objIs = new ObjectInputStream(fileIs);
            dom = (Domiko_Plegma) objIs.readObject();
            
            if (dom.get_kodikos_eidous()==code)
            {
                 FileOutputStream ops = new FileOutputStream("EidhFile.txt");
                 ObjectOutputStream objOps = new ObjectOutputStream(ops);
                 dom=null;
                 objOps.writeObject(dom);
            }
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
     ///////////////////////////////
  
    //////////////////////////
    static void storePromitheytis(Promitheytis emp)
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
     
    static void check_duplicate_AFM(String a)
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
       
        try 
        {
            fileIs = new FileInputStream("PelatesXondrikisFile.txt");
            objIs = new ObjectInputStream(fileIs);
            Pelatis_Xondrikis_Etaireia emp = (Pelatis_Xondrikis_Etaireia) objIs.readObject();
            
            do
            {
                if (emp.get_AFM()==a)
                {
                     print_mess_not_unique_afm();
                     a=enter_afm();
                }
                else
                {
                     print_mess_unique_afm();
                     return;
                }
            }
            while (emp.get_AFM()==a);
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
    
    static void print_mess_not_unique_afm()
    {
        System.out.println("AFM is not unique");
    }
    
    static void print_mess_unique_afm()
    {
        System.out.println("AFM is unique");
    }
    
    static boolean find_AFM(String a)
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
       
        try 
        {
            fileIs = new FileInputStream("PelatesXondrikisFile.txt");
            objIs = new ObjectInputStream(fileIs);
            Pelatis_Xondrikis_Etaireia emp = (Pelatis_Xondrikis_Etaireia) objIs.readObject();
          
            if (emp.get_AFM()==a)
                     return true;
            
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
                else
                    return false;
            }
            catch (Exception ex) {}
        }
        return false;
    }
    
    static boolean find_ADT(String a)
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
       
        try 
        {
            fileIs = new FileInputStream("PelatesLianikisFile.txt");
            objIs = new ObjectInputStream(fileIs);
            Pelatis_Lianikis_Idiotis emp = (Pelatis_Lianikis_Idiotis) objIs.readObject();
          
            if (emp.get_ADT()==a)
                     return true;
            
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
                else
                    return false;
            }
            catch (Exception ex) {}
        }
        return false;
    }
    
    static boolean find_code(int a)
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
       
        try 
        {
            fileIs = new FileInputStream("EidhFile.txt");
            objIs = new ObjectInputStream(fileIs);
            Domiko_Plegma dom = (Domiko_Plegma) objIs.readObject();
          
            if (dom.get_kodikos_eidous()==a)
                     return true;
            
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
                else
                    return false;
            }
            catch (Exception ex) {}
        }
        return false;
    }
    
    static String enter_afm()
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        return a;
    }
    
    static String enter_adt()
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        return a;
    }
    
    static int enter_code()
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }
    
    static String enter_rest()
    {
        Scanner sc=new Scanner(System.in);
        String on=sc.next();
        String epon=sc.next();
        String thl=sc.next();
        String city=sc.next();
        String eponymia=sc.next();
        String ypey=sc.next();
        int code=sc.nextInt();
        
        return on+epon+thl+city+eponymia+ypey+code;
    }
    
     
    static String enter_rest_lian()
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Δώσε νέο κωδικό,όνομα,επώνυμο,τηλέφωνο,πόλη,ΑΔΤ");
        int code=sc.nextInt();
        String on=sc.next();
        String epon=sc.next();
        String thl=sc.next();
        String city=sc.next();
        String adt=sc.next();
        
        return code+on+epon+thl+city+adt;
    }
    
    static String enter_rest_eidous()
    {
        Scanner sc=new Scanner(System.in);
      
        String proe=sc.next();
        String kat=sc.next();
        String mon=sc.next();
        String diast=sc.next();
        float timi=sc.nextFloat();
        int code=enter_code();
        
        return code+proe+kat+mon+diast+timi;
    }
    
     static void change_fields()
     {
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Δώσε νέο κωδικό,όνομα, επώνυμο,τηλέφωνο,πόλη,επωνυμία,υπεύθυνο");
        int code=sc.nextInt();
        String on=sc.next();
        String epon=sc.next();
        String thl=sc.next();
        String city=sc.next();
        String eponymia=sc.next();
        String ypey=sc.next();
        
     }
    
    static void check_duplicate_ADT(String a)
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
       
        try 
        {
            fileIs = new FileInputStream("PelatesLianikisFile.txt");
            objIs = new ObjectInputStream(fileIs);
            Pelatis_Lianikis_Idiotis emp = (Pelatis_Lianikis_Idiotis) objIs.readObject();
            
            do
            {
                if (emp.get_ADT()==a)
                {
                     print_mess_not_unique_adt();
                     Scanner sc=new Scanner(System.in);
                     a=sc.next();
                }
                else
                {
                     print_mess_unique_adt();
                     return;
                }
            }
            while (emp.get_ADT()==a);
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
    
    static void print_mess_not_unique_adt()
    {
        System.out.println("ADT is not unique");
    }
    
    static void print_mess_unique_adt()
    {
        System.out.println("ADT is unique");
    }
     
     static void check_duplicate_code(int a)
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
       
        try 
        {
            fileIs = new FileInputStream("EidhFile.txt");
            objIs = new ObjectInputStream(fileIs);
            Domiko_Plegma dom = (Domiko_Plegma) objIs.readObject();
            
            do
            {
                if (dom.get_kodikos_eidous()==a)
                {
                     print_mess_not_unique_code();
                     Scanner sc=new Scanner(System.in);
                     a=sc.nextInt();
                }
                else
                {
                    print_mess_unique_code();
                    return;
                }
            }
            while (dom.get_kodikos_eidous()==a);
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
     
    static void print_mess_not_unique_code()
    {
        System.out.println("Code is not unique");
    }
    
    static void print_mess_unique_code()
    {
        System.out.println("Code is unique");
    } 
    
    static void print_mess_found_code()
    {
        System.out.println("Code found");
    }
    
    static void print_mess_not_found_code()
    {
        System.out.println("Code not found");
    } 
    
    static void print_mess_found_afm()
    {
        System.out.println("AFM found");
    }
    
    static void print_mess_not_found_afm()
    {
        System.out.println("AFM not found");
    } 
    
     static void print_mess_found_adt()
    {
        System.out.println("ADT found");
    }
    
    static void print_mess_not_found_adt()
    {
        System.out.println("ADT not found");
    } 
     
}


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
import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class PelatisOperations 
{
    public void storePelatis(Pelatis emp)
    {  
        OutputStream ops = null;
        
        ObjectOutputStream objOps = null;
        try 
        {
            ops = new FileOutputStream("PelatesFile.txt");
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
     
    public void displayPelatis()
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        Pelatis emp=null;
    
        try 
        {
            fileIs = new FileInputStream("PelatesFile.txt");
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
     
    public static void main(String a[])
    {
        String info="1.Πελάτης Χονδρικής 2.Πελάτης Λιανικής\n";
        int res=Integer.parseInt(JOptionPane.showInputDialog(info)); 
        
        menu_pelaton(res);
    }
    
    static void menu_pelaton(int r)
    {  
        PelatisOperations mof = new PelatisOperations();
        Scanner sc=new Scanner(System.in);
        
        do
        {
           String info="Μενού Πελατών\n1.Καταχώριση Πελάτη\n2.Εμφάνιση Πελάτη\n3.Τροποοίηση Πελάτη\n4.Διαγραφή Πελάτη\n5.Τερματισμός Μενού Πελατών\n";
           int res=Integer.parseInt(JOptionPane.showInputDialog(info)); 
           String ans;
           switch (res)
           {
               case 1:      if (r==1) 
                            {   
                                 Pelatis p=new Pelatis(1,"Nikos","Mathaiou","2610299100","Patra","082105296");
                                 Pelatis px=new Pelatis_Xondrikis_Etaireia(1,"Nikos","Mathaiou","2610299100","Patra","0999999999","ELPE","Nikolaou","082105296");
                                 px.print();
                                 check_duplicate_AFM("0999999999");
                                
                                 mof.storePelatis(px);
                            }
                            else
                            {
                                Pelatis pl=new Pelatis_Lianikis_Idiotis(2,"Anna","Bagena","26107779100","Patra","AE123456","082105296");
                                pl.print();
                                check_duplicate_ADT("AE123456");
                   
                                mof.storePelatis(pl);
                            }
                            
                            break;
                        
               case 2:   mof.displayPelatis();
                         break;
                            
               case 3:  if (res==1)
                         {
                            System.out.println("Δώστε νέο ΑΦΜ Πελάτη Χονδρικής");
                            String afm=sc.next();
                            Pelatis px=new Pelatis_Lianikis_Idiotis(2,"Anna","Bagena","26107779100","Patra",afm,"082105296");
                            mof.storePelatis(px);  //η τροποποιημένη εγγραφή καταχωρείται στο αρχείο
                         }
                         else
                         {
                            System.out.println("Δώστε νέο ΑΔΤ Πελάτη Λιανικής");
                            String adt=sc.next();
                            Pelatis pl=new Pelatis_Lianikis_Idiotis(2,"Anna","Bagena","26107779100","Patra",adt,"082105296");
                               
                            mof.storePelatis(pl);  //η τροποποιημένη εγγραφή καταχωρείται στο αρχείο
                         }
                        break;

               case 4:  if (res==1)
                        {
                            System.out.println("Δώστε ΑΦΜ Πελάτη χονδρικής για διαγραφή");
                            String afm=sc.next();
                            delete_pelatis(afm);
                        }
                        else
                        {
                            System.out.println("Δώστε ΑΦΔΤ Πελάτη Λιανικής για διαγραφή");
                            String adt=sc.next();
                            delete_pelatis(adt);
                        }
                        break;

               case 5: return;
            }    
        }
        while (1!=0);
    }
    
    static void check_duplicate_AFM(String a)
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
       
        try 
        {
            fileIs = new FileInputStream("PelatesFile.txt");
            objIs = new ObjectInputStream(fileIs);
            Pelatis_Xondrikis_Etaireia emp = (Pelatis_Xondrikis_Etaireia) objIs.readObject();
            
            do
            {
                if (emp.get_AFM()==a)
                {
                     System.out.println("AFM already exists");
                     a=enter_afm();
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
    
    static String enter_rest()
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        System.out.println("Δώσε όνομα, επωνυμία,  πόλη, τηλέφωνο");
        String on=sc.next();
        String epon=sc.next();
        String cit=sc.next();
        String ph=sc.next();
        
        return a+on+epon+ph;
    }
    
    static void check_duplicate_ADT(String a)
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
       
        try 
        {
            fileIs = new FileInputStream("PelatesFile.txt");
            objIs = new ObjectInputStream(fileIs);
            Pelatis_Lianikis_Idiotis emp = (Pelatis_Lianikis_Idiotis) objIs.readObject();
            
            do
            {
                if (emp.get_ADT()==a)
                {
                     System.out.println("To ΑΔΤ του νέου Πελάτη Λιανικής υπάρχει ήδη");
                     Scanner sc=new Scanner(System.in);
                     a=sc.next();
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
     
     static void delete_pelatis(String afm)
     {
         
     }
}
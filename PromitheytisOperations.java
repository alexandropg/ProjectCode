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

 
public class PromitheytisOperations 
{
    public void storeObject(Promitheytis emp)
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
     
    public void displayObjects()
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
     
    public static void main(String a[])
    {
        PromitheytisOperations mof = new PromitheytisOperations();
        Scanner sc=new Scanner(System.in);
        
        do
        {
           String info="Μενού Προμηθευτών\n1.Καταχώριση Προμηθευτή\n2.Εμφάνιση Προμηθευτή\n3.Τροποποίηση Προμηθευτή\n4.Διαγραφή Προμηθευτή\n5.Τερματισμός Μενού Πελατών\n";
           int res=Integer.parseInt(JOptionPane.showInputDialog(info)); 
           
           switch (res)
           {
               case 1:  Promitheytis pro=new Promitheytis("022222222","EISAGOGIKH AE","THESSALONIKH","2310456789","EISAG@HOTMAIL.COM",500);
                        check_duplicate_AFM("022222222");
                        mof.storeObject(pro); 
                        break;
                        
               case 2:  mof.displayObjects();
                        break;
                        
               case 3:  System.out.println("Δώστε νέο υπόλοιπο προμηθευτή");
                         float ypoloipo=sc.nextFloat();
                         pro=new Promitheytis("022222222","EISAGOGIKH AE","THESSALONIKH","2310456789","EISAG@HOTMAIL.COM",ypoloipo);//Τροποποιείται το υπόλοιπο του προμηθευτή
                         mof.storeObject(pro);  //η τροποποιημένη εγγραφή καταχωρείται στο αρχείο
                         break;

               case 4: System.out.println("Δώστε ΑΦΜ προμηθευτή για διαγραφή");
                        String afm=sc.next();
                        delete_promitheytis(afm);
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
            fileIs = new FileInputStream("PromitheytesFile.txt");
            objIs = new ObjectInputStream(fileIs);
            Promitheytis emp = (Promitheytis) objIs.readObject();
            
            do
            {
                if (emp.get_AFM()==a)
                {
                     System.out.println("To ΑΦΜ του νέου Προμηθευτή υπάρχει ήδη");
                     Scanner sc=new Scanner(System.in);
                     a=sc.next();
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
    
    static void delete_promitheytis(String afm)
    {
        
    }
}
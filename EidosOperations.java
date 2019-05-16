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
 
public class EidosOperations 
{
    public void storeObject(Eidos emp)
    {  
        OutputStream ops = null;
        
        ObjectOutputStream objOps = null;
        try 
        {
            ops = new FileOutputStream("EidiFile.txt");
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
        Eidos emp=null;
    
        try 
        {
            fileIs = new FileInputStream("EidiFile.txt");
            objIs = new ObjectInputStream(fileIs);
            emp = (Eidos) objIs.readObject();
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
        EidosOperations mof = new EidosOperations();
        Scanner sc=new Scanner(System.in);
        
        do
        {
           String info="Μενού Ειδών\n1.Καταχώριση Είδους\n2.Εμφάνιση Είδους\n3.Τροποοίηση Είδους\n4.Διαγραφή Είδους\n5.Τερματισμός Μενού Πελατών\n";
           int res=Integer.parseInt(JOptionPane.showInputDialog(info)); 
           
           switch (res)
           {
               case 1:   Eidos e=new Eidos(200,"ELLADA","XALYBOYRGIA THESSALIAS","TEMAXIO",8,"022222222");
                         Domiko_Plegma dom=new Domiko_Plegma(200,"ELLADA","XALYBOYRGIA THESSALIAS","TEMAXIO",8,"KANONIKH","022222222");
            
                         dom.print();
                         check_duplicate_code(200);
                         mof.storeObject(dom);
                         break;
                        
               case 2:   mof.displayObjects();
                         break; 
                         
               case 3:  System.out.println("Δώστε νέα τιμή αγοράς");
                        float timi=sc.nextFloat();
                        e=new Eidos(200,"ELLADA","XALYBOYRGIA THESSALIAS","TEMAXIO",timi,"022222222");
                        dom=new Domiko_Plegma(200,"ELLADA","XALYBOYRGIA THESSALIAS","TEMAXIO",timi,"KANONIKH","022222222");
                        break;
                        
               case 5: return;
            }    
        }
        while (1!=0);
    }
    
    static void check_duplicate_code(int a)
    {
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
       
        try 
        {
            fileIs = new FileInputStream("EidiFile.txt");
            objIs = new ObjectInputStream(fileIs);
            Eidos emp = (Eidos) objIs.readObject();
            
            do
            {
                if (emp.get_kodikos_eidous()==a)
                {
                     System.out.println("Ο Κωδικός του νέου Είδους υπάρχει ήδη! Δώστε νέο κωδικό Είδους");
                     Scanner sc=new Scanner(System.in);
                     a=sc.nextInt();
                }
            }
            while (emp.get_kodikos_eidous()==a);
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
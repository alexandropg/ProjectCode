
package part5;

import javax.swing.JOptionPane;


public class Menu
{
    String info;
    int res;
    
    Menu()
    {
        String info="Μενού Πρόγράμματος\n1.Μενού Πελατών\n2.Μενού Προμηθευτών\n3.Μενού Ειδών\nΤερματισμός Προγράμματος\n";
        int res=Integer.parseInt(JOptionPane.showInputDialog(info));
        
        switch(res)
        {
            case 1:   info="Μενού Πρόγράμματος\n1.Μενού Πελατών\n2.Μενού Προμηθευτών\n3.Μενού Ειδών\nΤερματισμός Προγράμματος\n";
                      res=Integer.parseInt(JOptionPane.showInputDialog(info));
        }
    }
            
}

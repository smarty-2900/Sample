
package Report;

import static db.dbConnect.connect;
import java.awt.Container;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Dilshan
 */
public class reportGen extends JFrame  {
    
    public reportGen(String filename, HashMap hash) throws ClassNotFoundException{
        try{
          Connection con =  connect();
          JasperPrint print = JasperFillManager.fillReport(filename, hash, con);
          JRViewer jr = new JRViewer(print);
          Container contain = getContentPane();
          contain.add(jr);
          setVisible(true);
          setBounds(10, 10, 800, 660);
            
        }catch(JRException e){
            System.out.println(e);
        }
    }
    
    public reportGen(String filename) throws ClassNotFoundException{
        try{
          Connection con =  connect();
          JasperPrint print = JasperFillManager.fillReport(filename, null, con);
          JRViewer jr = new JRViewer(print);
          Container contain = getContentPane();
          contain.add(jr);
          setVisible(true);
          setBounds(10, 10, 800, 660);
          
        }catch(JRException e){
            System.out.println(e);
        }
    }
}

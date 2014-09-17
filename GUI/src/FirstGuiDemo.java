
import javax.swing.JFrame;
import javax.swing.JWindow;

import edu.nvcc.kanchanawanchai.csc202.*;

public class FirstGuiDemo {
  public static void main(String[] args) {

    
    JFrame f = new JFrame("The Frame");
    f.setSize(300, 300);
    f.setLocation(100, 100);
    f.add(new FirstGui());
    
//    Help h = new Help(f,"TEST DIALOG");

    f.setVisible(true);
    f.pack();
  }
}
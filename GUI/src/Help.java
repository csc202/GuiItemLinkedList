import java.awt.Frame;
import java.io.File;
import java.io.IOException;

import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;

class Help extends JDialog {
  Help(Frame frame, String title) {
    super(frame, title);
    setModalExclusionType(JDialog.ModalExclusionType.APPLICATION_EXCLUDE);

    try {
      JEditorPane ep = new JEditorPane("file:///" + new File("").getAbsolutePath() + "/test.txt");
      ep.setEnabled(true);
      getContentPane().add(ep);
    } catch (IOException ioe) {
      JOptionPane.showMessageDialog(frame, "Unable to install editor pane");
      return;
    }
    setSize(200, 200);
    setLocationRelativeTo(frame);
    setVisible(true);
  }
}
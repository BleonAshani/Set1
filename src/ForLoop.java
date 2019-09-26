import javax.swing.*;
import java.awt.*;


public class ForLoop {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Yards Inches\n------  ------");
        for (int i=0;i<=10;i++){
            JOptionPane.showMessageDialog(null,i + (i*36));
        }
    }
}

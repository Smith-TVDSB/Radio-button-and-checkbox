import javax.swing.*; //import library 
import java.awt.event.*; //import for actionListener

public class Main {
  public static void main(String[] args) {
    // Declaring r1 and r2 as radio buttons
    JRadioButton r1 = new JRadioButton("A) Heads");
    JRadioButton r2 = new JRadioButton("B) Tails");

    
    // Set up the frame
    JFrame f;
    f = new JFrame();

    // Set locations for radio buttons
    r1.setBounds(75, 50, 100, 30);
    r2.setBounds(75, 100, 100, 30);

    // create a button group and add r1 and r2
    ButtonGroup bg = new ButtonGroup();
    bg.add(r1);
    bg.add(r2);

    // add elements to frame
    f.add(r1);
    f.add(r2);

    f.setSize(300, 300);
    f.setLayout(null);
    f.setVisible(true);
  }
}

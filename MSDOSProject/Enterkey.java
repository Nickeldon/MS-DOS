import javax.swing.*;
import static java.lang.System.out;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class Enterkey

{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame(); 

    JTextField textField = new JTextField(100);
    textField.addKeyListener(new KeyAdapter()
    {
      public void keyPressed(KeyEvent e)
      {
        if (e.getKeyCode() == KeyEvent.VK_ENTER)
        {
          out.println("ENTER key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP)
        {
          out.println("UP key pressed");
        }
      }
    });

    JTextField text5Field = new JTextField(20);
    text5Field.addKeyListener(new KeyAdapter()
    {
      public void keyPressed(KeyEvent e)
      {
        if (e.getKeyCode() == KeyEvent.VK_UP)
        {
          out.println("UP key pressed");
        }
      }
    });
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(textField);
    frame.pack();
    frame.setVisible(true);
  }
}
package ch02_observer.swing;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingObserverExample {

  JFrame frame;

  public static void main(String[] args) {
    new SwingObserverExample().go();
  }

  public void go() {
    EventQueue.invokeLater(() -> {
      frame = new JFrame();

      JButton button = new JButton("Should I do it?");
      button.addActionListener(e ->
          System.out.println("Don't do it, you might regret it!"));
      button.addActionListener(e -> System.out.println("Come on, do it!"));

      JPanel panel = new JPanel();
      panel.setPreferredSize(new Dimension(200, 200));
      panel.add(button);
      frame.add(panel);
      frame.pack();
      frame.setVisible(true);
    });
  }
}

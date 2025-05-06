import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyClass {

    public static void main(String[] args) {
        final Frame fr = new Frame("Key Event");

        final Label l = new Label("Press a key...");
        l.setBounds(50, 100, 200, 30);
        fr.setLayout(null);
        fr.add(l);

        fr.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {

            }

            public void keyReleased(KeyEvent e) {
                l.setText("Key released: " + KeyEvent.getKeyText(e.getKeyCode()));
                fr.setBackground(Color.WHITE);
            }

            public void keyPressed(KeyEvent e) {
                l.setText("Key pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
                fr.setBackground(Color.ORANGE);
            }
        });

        fr.setSize(500, 500);
        fr.setVisible(true);
    }
}


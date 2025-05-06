
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Practical2 {

    public static void main(String[] args) {

        final Frame f=new Frame("Mouse Event");

        final Label la=new Label("Label");
        la.setBounds(100,100,200,80);
        f.setLayout(null);
        f.add(la);

        f.addMouseListener(new MouseListener() {


            public void mouseReleased(MouseEvent e) {


            }


            public void mousePressed(MouseEvent e) {



            }


            public void mouseExited(MouseEvent e) {

//				f.setVisible(false);
                f.setBackground(Color.RED);
            }


            public void mouseEntered(MouseEvent e) {

                la.setText("Mouse Entered frame");
                f.setBackground(Color.blue);
            }


            public void mouseClicked(MouseEvent e) {
                la.setText("Mouse Click detected");
                f.setBackground(Color.cyan);
            }
        });


        f.setSize(500,500);
        f.setVisible(true);

    }

}


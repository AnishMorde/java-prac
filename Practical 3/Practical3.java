

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Practical3 {
    public static void main(String args[]) {
        Frame f1 = new Frame("Student Form");
        f1.setBounds(100, 100, 100, 100);
        f1.setLayout(new FlowLayout());

        JLabel l1, l2, l3, l4, l5, l6;
        JTextField t1, t2, t3, t4, t5, t6;
        JComboBox<String> c1;

        JButton b1, b2;

        l1 = new JLabel("Student Name");
        l2 = new JLabel("Roll No");
        l3 = new JLabel("Dept");
        l4 = new JLabel("CN");
        l5 = new JLabel("PDC");
        l6 = new JLabel("JAVA");

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t4 = new JTextField(20);
        t5 = new JTextField(20);
        t6 = new JTextField(20);

        String[] s1 = { "mech", "entc", "cs", "aids" };
        c1 = new JComboBox<>(s1);

        b1 = new JButton("Submit");
        b2 = new JButton("Close");

        // Add components to Frame f1
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(l4);
        f1.add(t4);
        f1.add(l5);
        f1.add(t5);
        f1.add(l6);
        f1.add(t6);
        f1.add(l3);
        f1.add(c1);
        f1.add(b1);
        f1.add(b2);

        // Submit button logic
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                String rollNo = t2.getText();
                String dept = (String) c1.getSelectedItem();
                int cnMarks = Integer.parseInt(t4.getText());
                int pdcMarks = Integer.parseInt(t5.getText());
                int javaMarks = Integer.parseInt(t6.getText());
                int total = cnMarks + pdcMarks + javaMarks;

                // New frame with vertical layout
                JFrame f2 = new JFrame("Student Details");
                f2.setSize(300, 300);
                f2.setLayout(new BoxLayout(f2.getContentPane(), BoxLayout.Y_AXIS));

                f2.add(new JLabel("Student Name: " + name));
                f2.add(new JLabel("Roll No: " + rollNo));
                f2.add(new JLabel("Department: " + dept));
                f2.add(new JLabel("CN Marks: " + cnMarks));
                f2.add(new JLabel("PDC Marks: " + pdcMarks));
                f2.add(new JLabel("JAVA Marks: " + javaMarks));
                f2.add(new JLabel("Total Marks: " + total));

                f2.setVisible(true);
            }
        });

        // Close button logic
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
            }
        });

        f1.setVisible(true);
        f1.setSize(500, 500);
    }
}


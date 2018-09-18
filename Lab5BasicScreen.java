package Lab5;
//purpose = create a gui

//buttons
import javafx.scene.layout.Background;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;


public class BasicScreen extends JFrame implements ActionListener, MouseListener
        {
            //attributes
            JButton b1;
            JButton b2;
            JTextField t1;

            //constructor
            BasicScreen(String title)
            {
                super(title);
                //set size and layout of the screen
                setSize(500, 500);
                setLayout(new FlowLayout());


                //first button
                b1 = new JButton("CLick Boi");
                add(b1);
                b1.addActionListener(this);

                //second button
                b2 = new JButton("Henlo");
                add(b2);
                b2.addActionListener(this);

                //create an icon
                ImageIcon img = new ImageIcon("icon.png");
                JLabel i1 = new JLabel("waRNING",img, JLabel.CENTER);
                add(i1);

                //add in a label
                JLabel l1 = new JLabel("ahem this is just for a testing purppose!", JLabel.CENTER);
                l1.setFont(new Font("Courier New",Font.ITALIC,12));
                l1.setForeground(Color.RED);
                add(l1);

                //jtextfield
                t1 = new JTextField("Name");
                add(t1);
                t1.addActionListener(this);
                t1.setToolTipText("Enter name!");

                //create a panel
                JPanel p1 = new JPanel();
                JLabel l2 = new JLabel("The panel is here");
                p1.setLayout(new FlowLayout());
                p1.setBackground(Color.RED);
                p1.add(l2);
                add(p1);
                p1.addMouseListener(this);


                //make these appear
                setVisible(true);
            }

            //method actionListener
            public void actionPerformed(ActionEvent Event1)
            {

                if (Event1.getSource() == b1)
                {
                    System.out.println("1");

                }
                else if (Event1.getSource() == b2)
                {
                    System.out.println("2");
                }
                else if (Event1.getSource() == t1)
                {
                    JOptionPane.showMessageDialog(this, t1);
                }

            }
            public void mouseExited(MouseEvent m)
            {
                JOptionPane.showMessageDialog(this, "Mouse left the panel");
            }
            public void mouseEntered(MouseEvent m)
            {
                JOptionPane.showMessageDialog(this, "Mouse entered the panel");
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseClicked(MouseEvent e) {
               /* JLabel lab = new JLabel();
                add(lab);

                if(e.getButton() == MouseEvent.BUTTON1) {
                    lab.setText("Left Click!");
                }
                else if(e.getButton() == MouseEvent.BUTTON2) {
                    lab.setText("Middle Click");
                }
                else if(e.getButton() == MouseEvent.BUTTON3) {
                    lab.setText("Right Click!");
                }

                setVisible(true);
*/
            }
        }




package lab7;

/*
    purpose: Build a Graphical user interface that contains, as shown,
         Two TextFields ;
         A button ;
         Add  this  functionality:  When  you  click  on  the  button, it  checks  if  the  character
         entered in the second text field is the first letter of the string you enter in the first textfield,  or  not
    date: 08/03/17




import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.lang.String;
import javax.swing.JTextField;

public class GUIandStrings extends JFrame implements ActionListener, MouseListener
{
    JButton b1;
    JButton b2;
    JButton b3;
    JLabel fileline;
    JTextField t1;
    JTextField t2;
    JTextField t3;

    //constructor
    //creating a screen
    GUIandStrings(String title)
    {
        super(title);
        setSize(500,500);
        setLayout(new FlowLayout());


        //create textfild 1
        t1 = new JTextField("Enter your text here");
        add(t1);
        t1.setToolTipText("Enter ur text here");
        t1.addActionListener(this);

        //create textfield 2
        t2 = new JTextField("Enter the character to check here");
        add(t2);
        t2.setToolTipText("Enter the character to check here");
        t2.addActionListener(this);

        //create first button
        b1 = new JButton("First Letter");
        add(b1);
        b1.addActionListener(this);

        //create textfild 3
        t3 = new JTextField("Enter a word to check here");
        add(t3);
        t3.setToolTipText("Enter a word to check here");
        t3.addActionListener(this);

        //create second button
        b2 = new JButton("Word contained?");
        add(b2);
        b2.addActionListener(this);

         //create a file button
        b3 = new JButton("Read File");
        add(b3);
        fileline = new JLabel("The file line will go here when read");
        b3.addActionListener(this);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e1)
    {
        //convert txtfield to string
        String str1 = t1.getText();
        String str2 = t2.getText();
        String str3 = t3.getText();

        if(e1.getSource() == b1)
        {

            //set chars
            char char1 = str1.charAt(0);
            char char2 = str2.charAt(0);

            System.out.println(char1);
            System.out.println(char2);

            if (char1 == char2)
            {
                JOptionPane.showMessageDialog(this,"The sAem");
            }
            else{
                JOptionPane.showMessageDialog(this,"The not sAem");
            }

        }
        else if (e1.getSource() == b2)
        {
            if (str1.contains(" ")&& !str3.contains(" ")) {
                //see if the word is in the first textfield
                if (str1.contains(str3)) {
                    JOptionPane.showMessageDialog(this, "contained");
                } else {
                    JOptionPane.showMessageDialog(this, " not contained");
                }
            }
        }
        else //option 3 thrid button
        {
            FileReader fileReader = new FileReader("textvalues.txt");

            fileReader.openfile();
            String line = fileReader.readline();
        }

       // JOptionPane.showMessageDialog(this,result);
        /*
        else if (e1.getSource() == t2)
        {
            String [] array = str1.trim().split(" ");
            if (array.length == 1)
            {

            }
            else
            {
                JoptionPane.showMessageDialog(this,"please enter only 1 word");
              }
        }
        else if (e1.getSource() == b3)
        {
            FileReader myfile = new FileReader("textvalues.txt");
            myfile.openfile();

        }

    }


}
*/

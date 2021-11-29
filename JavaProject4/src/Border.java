import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Border extends JFrame
{
    JPanel[] panel = new JPanel[12];
    public Border()
    {
        setLayout(new GridLayout(3,4));
        for(int i = 0 ; i < panel.length ; i++)
        {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            panel[i] = new JPanel();
            panel[i].setBackground(new Color(r,g,b));
            add(panel[i]);
        }
        panel[4].setLayout(new BorderLayout());
        panel[4].add(new JButton("one"),BorderLayout.WEST);
        panel[4].add(new JButton("two"),BorderLayout.EAST);
        panel[4].add(new JButton("three"),BorderLayout.SOUTH);
        panel[4].add(new JButton("four"),BorderLayout.NORTH);
        panel[4].add(new JButton("five"),BorderLayout.CENTER);
        panel[10].setLayout(new FlowLayout());

        setSize(800,500);
    }
    public static void main(String[]args)
    {
        new Border().setVisible(true);
    }
}

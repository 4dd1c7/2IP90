package HW.Week6.GOL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;


/**
 * Created by Johan van der Kallen
 */
class grid extends JPanel {

    public static void main(String[] args) { new grid().run(); }

        JFrame frame = new JFrame("Game Of Life");
        JButton next = new JButton("Next generation");
        JButton start = new JButton("Start!");
        JButton stop = new JButton("Stop!");
        JPanel buttons = new JPanel();
        Color hover = new Color(175,175,175);
        int SIZE = 800;

        void run() {
            frame.add(this);
            frame.add(buttons, BorderLayout.SOUTH);
            buttons.setLayout(new GridLayout(1, 3));
            buttons.add(next, BorderLayout.SOUTH);
            buttons.add(start, BorderLayout.SOUTH);
            buttons.add(stop, BorderLayout.SOUTH);
            //next.addActionListener(this);
            //start.addActionListener(this);
            //stop.addActionListener(this);
            frame.add(new Pane());
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(SIZE,SIZE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);


        }

    class Pane extends JPanel {

        public Pane() {
            int N = 10;//set width and height grid
            setLayout(new GridLayout(10,10));

            GridBagConstraints gbc = new GridBagConstraints();
            for (int row = 0; row < N; row++) {
                for (int col = 0; col < N; col++) {
                    gbc.gridx = col;
                    gbc.gridy = row;

                    CellPane cellPane = new CellPane();
                    Border border = null;
                    border = new MatteBorder(1, 1, 1, 0, Color.GRAY);
                    cellPane.setBorder(border);
                    cellPane.setBackground(Color.WHITE);

                    add(cellPane, gbc);
                }
            }
        }
    }

    public class CellPane extends JPanel  {

        private Color defaultBackground;

        public CellPane() {
            addMouseListener(new MouseAdapter() {
                /*@Override
                public void mouseEntered(MouseEvent e) {
                    defaultBackground = getBackground();
                    setBackground(hover);
                }*/

                @Override
                public void mousePressed(MouseEvent e) {
                    defaultBackground = getBackground();
                    if(defaultBackground.equals(Color.WHITE)){setBackground(Color.BLACK);}
                    else if(defaultBackground.equals(Color.BLACK)){setBackground(Color.WHITE);}
                    defaultBackground=getBackground();
                }

                /*@Override
                public void mouseExited(MouseEvent e) {
                    setBackground(defaultBackground);
                }*/
            });
        }
    }
    public void mouseReleased( MouseEvent e) { }
    public void mouseClicked( MouseEvent e) { }
    public void mouseEntered( MouseEvent e) { }
    public void mouseExited( MouseEvent e) { }
}

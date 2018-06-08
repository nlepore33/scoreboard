
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Scoreboard extends JPanel
{
    private static int numPlayers, sum1, sum2, sum3, sum4, type, count, end, p1s1, p1s2, p1s3, p1s4, p1s5, p1s6, p1s7, p1s8, p1s9, p2s1, p2s2, p2s3, p2s4, p2s5, p2s6, p2s7, p2s8, p2s9, p3s1, p3s2, p3s3, p3s4, p3s5, p3s6, p3s7, p3s8, p3s9, p4s1, p4s2, p4s3, p4s4, p4s5, p4s6, p4s7, p4s8, p4s9;
    private static String SnumPlayers, p1 = "", p2 = "", p3 = "", p4 = "", text = "";
    
    private static JTextField score1, score2, score3, score4;
    private Graphics d;
    
    private static JFrame frame;
    private static Scoreboard panel;
    
    public static void main(String[] args)
    {
        frame = new JFrame ("Golf Scorecard");
        panel = new Scoreboard();
        frame.setVisible(true);
        frame.setBounds(0,0,715,350);
        frame.setDefaultCloseOperation(3);
        frame.add(panel);
        frame.setResizable(false);
        getPlayers();
        panel.repaint();
        getScores();
    }
    
    public static void getPlayers()
    {
        SnumPlayers = JOptionPane.showInputDialog ("Welcome to Golf Scorecard! How many players are in your party? (Max is 4)");
        numPlayers = Integer.parseInt(SnumPlayers);
        int x = 1;
        if(numPlayers <= 4 && numPlayers > 0) {
            p1 = JOptionPane.showInputDialog ("Enter player one's name: ");
            frame.setBounds(0, 0, 715, 230);
            if(numPlayers > 1) {
                p2 = JOptionPane.showInputDialog ("Enter player two's name: ");
                frame.setBounds(0, 0, 715, 270);
            }
            if(numPlayers > 2) {
                p3 = JOptionPane.showInputDialog ("Enter player three's name: ");
                frame.setBounds(0, 0, 715, 310);
            }
            if(numPlayers > 3) {
                p4 = JOptionPane.showInputDialog ("Enter player four's name: ");
                frame.setBounds(0, 0, 715, 350);
            }
        }
    }
    
    public static void getScores()
    {
        for(int x = 1; x <= 9; x++)
        {
            count++;
            if(numPlayers > 0){
                text = JOptionPane.showInputDialog("Enter " + p1 + "'s score for hole " + count);
                if(count == 1)
                {
                    p1s1 = Integer.parseInt(text);
                }
                if(count == 2)
                {
                    p1s2 = Integer.parseInt(text);
                }
                if(count == 3)
                {
                    p1s3 = Integer.parseInt(text);
                }
                if(count == 4)
                {
                    p1s4 = Integer.parseInt(text);
                }
                if(count == 5)
                {
                    p1s5 = Integer.parseInt(text);
                }
                if(count == 6)
                {
                    p1s6 = Integer.parseInt(text);
                }
                if(count == 7)
                {
                    p1s7 = Integer.parseInt(text);
                }
                if(count == 8)
                {
                    p1s8 = Integer.parseInt(text);
                }
                if(count == 9)
                {
                    p1s9 = Integer.parseInt(text);
                }
                if(numPlayers > 1)
                {
                    text = JOptionPane.showInputDialog("Enter " + p2 + "'s score for hole " + count);
                    if(count == 1)
                {
                    p2s1 = Integer.parseInt(text);
                }
                if(count == 2)
                {
                    p2s2 = Integer.parseInt(text);
                }
                if(count == 3)
                {
                    p2s3 = Integer.parseInt(text);
                }
                if(count == 4)
                {
                    p2s4 = Integer.parseInt(text);
                }
                if(count == 5)
                {
                    p2s5 = Integer.parseInt(text);
                }
                if(count == 6)
                {
                    p2s6 = Integer.parseInt(text);
                }
                if(count == 7)
                {
                    p2s7 = Integer.parseInt(text);
                }
                if(count == 8)
                {
                    p2s8 = Integer.parseInt(text);
                }
                if(count == 9)
                {
                    p2s9 = Integer.parseInt(text);
                }
                }
                if(numPlayers > 2)
                {
                    text = JOptionPane.showInputDialog("Enter " + p3 + "'s score for hole " + count);
                    if(count == 1)
                {
                    p3s1 = Integer.parseInt(text);
                }
                if(count == 2)
                {
                    p3s2 = Integer.parseInt(text);
                }
                if(count == 3)
                {
                    p3s3 = Integer.parseInt(text);
                }
                if(count == 4)
                {
                    p3s4 = Integer.parseInt(text);
                }
                if(count == 5)
                {
                    p3s5 = Integer.parseInt(text);
                }
                if(count == 6)
                {
                    p3s6 = Integer.parseInt(text);
                }
                if(count == 7)
                {
                    p3s7 = Integer.parseInt(text);
                }
                if(count == 8)
                {
                    p3s8 = Integer.parseInt(text);
                }
                if(count == 9)
                {
                    p3s9 = Integer.parseInt(text);
                }
                }
                if(numPlayers > 3)
                {
                    text = JOptionPane.showInputDialog("Enter " + p4 + "'s score for hole " + count);
                    if(count == 1)
                {
                    p4s1 = Integer.parseInt(text);
                }
                if(count == 2)
                {
                    p4s2 = Integer.parseInt(text);
                }
                if(count == 3)
                {
                    p4s3 = Integer.parseInt(text);
                }
                if(count == 4)
                {
                    p4s4 = Integer.parseInt(text);
                }
                if(count == 5)
                {
                    p4s5 = Integer.parseInt(text);
                }
                if(count == 6)
                {
                    p4s6 = Integer.parseInt(text);
                }
                if(count == 7)
                {
                    p4s7 = Integer.parseInt(text);
                }
                if(count == 8)
                {
                    p4s8 = Integer.parseInt(text);
                }
                if(count == 9)
                {
                    p4s9 = Integer.parseInt(text);
                }
                }
            }   
            
            panel.repaint();
        }
    }

    public void paint(Graphics g)
    {
        super.paintComponents(g);
        
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1300, 1000);

        Color blue = new Color(77, 200, 255);
        Color lightBlue = new Color(153, 255, 255);
        g.setColor(blue);
        g.fillRect(0, 81, 1300, 39);
        g.setColor(lightBlue);
        g.fillRect(0, 121, 1300, 39);
        
        g.setColor(Color.black);
        g.drawLine(150, 0, 150, 1000);
        g.drawLine(200, 0, 200, 1000);
        g.drawLine(250, 0, 250, 1000);
        g.drawLine(300, 0, 300, 1000);
        g.drawLine(350, 0, 350, 1000);
        g.drawLine(400, 0, 400, 1000);
        g.drawLine(450, 0, 450, 1000);
        g.drawLine(500, 0, 500, 1000);
        g.drawLine(550, 0, 550, 1000);
        g.drawLine(600, 0, 600, 1000);
        
        g.drawLine(700, 0, 700, 1000);
        g.drawLine(750, 0, 750, 1000);
        g.drawLine(800, 0, 800, 1000);
        g.drawLine(850, 0, 850, 1000);
        g.drawLine(900, 0, 900, 1000);
        g.drawLine(950, 0, 950, 1000);
        g.drawLine(1000, 0, 1000, 1000);
        g.drawLine(1050, 0, 1050, 1000);
        g.drawLine(1100, 0, 1100, 1000);
        g.drawLine(1150, 0, 1150, 1000);
        g.drawLine(1212, 0, 1212, 1000);
        
        g.drawLine(0, 0, 1300, 0);
        g.drawLine(0, 40, 1300, 40);
        g.setFont(new Font ("Helvetica", 1, 20));
        g.drawString("HOLES                1      2       3       4      5       6      7      8      9         OUT", 6, 29);
        g.drawString("PAR                     4      4       5       4      3       4      3      4      5         36", 6, 70);
        g.drawLine(0, 80, 1300, 80);
        g.drawLine(0, 120, 1300, 120);
        g.drawString("BLUE                 314   447  485   379   175   462  209   374   526      3371", 6, 110);
        g.drawString("HANDICAP          13     3      11     5      17     1      15      9      7", 6, 150);
        g.drawLine(0, 160, 1300, 160);
        g.drawLine(0, 200, 1300, 200);
        g.drawLine(0, 240, 1300, 240);
        g.drawLine(0, 280, 1300, 280);
        g.drawLine(0, 320, 1300, 320);
        g.drawLine(0, 360, 1300, 360);
        g.drawLine(0, 400, 1300, 400);
        
        g.drawString(p1, 6, 190);
        g.drawString(p2, 6, 230);
        g.drawString(p3, 6, 270);
        g.drawString(p4, 6, 310);
        
        if(count > 0)
        {
            g.drawString(Integer.toString(p1s1), 170, 190);
            g.drawString(Integer.toString(p2s1), 170, 230);
            g.drawString(Integer.toString(p3s1), 170, 270);
            g.drawString(Integer.toString(p4s1), 170, 310);
        }
        if(count > 1)
        {
            g.drawString(Integer.toString(p1s2), 220, 190);
            g.drawString(Integer.toString(p2s2), 220, 230);
            g.drawString(Integer.toString(p3s2), 220, 270);
            g.drawString(Integer.toString(p4s2), 220, 310);
        }
        if(count > 2)
        {
            g.drawString(Integer.toString(p1s3), 270, 190);
            g.drawString(Integer.toString(p2s3), 270, 230);
            g.drawString(Integer.toString(p3s3), 270, 270);
            g.drawString(Integer.toString(p4s3), 270, 310);
        }
        if(count > 3)
        {
            g.drawString(Integer.toString(p1s4), 320, 190);
            g.drawString(Integer.toString(p2s4), 320, 230);
            g.drawString(Integer.toString(p3s4), 320, 270);
            g.drawString(Integer.toString(p4s4), 320, 310);
        }
        if(count > 4)
        {
            g.drawString(Integer.toString(p1s5), 370, 190);
            g.drawString(Integer.toString(p2s5), 370, 230);
            g.drawString(Integer.toString(p3s5), 370, 270);
            g.drawString(Integer.toString(p4s5), 370, 310);
        }
        if(count > 5)
        {
            g.drawString(Integer.toString(p1s6), 420, 190);
            g.drawString(Integer.toString(p2s6), 420, 230);
            g.drawString(Integer.toString(p3s6), 420, 270);
            g.drawString(Integer.toString(p4s6), 420, 310);
        }
        if(count > 6)
        {
            g.drawString(Integer.toString(p1s7), 470, 190);
            g.drawString(Integer.toString(p2s7), 470, 230);
            g.drawString(Integer.toString(p3s7), 470, 270);
            g.drawString(Integer.toString(p4s7), 470, 310);
        }
        if(count > 7)
        {
            g.drawString(Integer.toString(p1s8), 520, 190);
            g.drawString(Integer.toString(p2s8), 520, 230);
            g.drawString(Integer.toString(p3s8), 520, 270);
            g.drawString(Integer.toString(p4s8), 520, 310);
        }
        if(count > 8)
        {
            g.drawString(Integer.toString(p1s9), 570, 190);
            g.drawString(Integer.toString(p2s9), 570, 230);
            g.drawString(Integer.toString(p3s9), 570, 270);
            g.drawString(Integer.toString(p4s9), 570, 310);
        }
        if(count == 9)
        {
            sum1 = p1s1 + p1s2 + p1s3 + p1s4 + p1s5 + p1s6 + p1s7 + p1s8 + p1s9;
            sum2 = p2s1 + p2s2 + p2s3 + p2s4 + p2s5 + p2s6 + p2s7 + p2s8 + p2s9;
            sum3 = p3s1 + p3s2 + p3s3 + p3s4 + p3s5 + p3s6 + p3s7 + p3s8 + p3s9;
            sum4 = p4s1 + p4s2 + p4s3 + p4s4 + p4s5 + p4s6 + p4s7 + p4s8 + p4s9;
            
            g.drawString(Integer.toString(sum1), 620, 190);
            g.drawString(Integer.toString(sum2), 620, 230);
            g.drawString(Integer.toString(sum3), 620, 270);
            g.drawString(Integer.toString(sum4), 620, 310);
        }
    }
}

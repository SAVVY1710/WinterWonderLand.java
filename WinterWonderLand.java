/*
Sai Avula
7.18.24
WinterWonderLand,java
drawing depending on scanner inputs.
I added snow at the bottom to make it cooler, Please don't mind:(
Also, idk why but it asks for input again twice, when it does, put in the same things as the first time or it wont work, thank you:)
*/

import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
public class WinterWonderLand extends JFrame
{
    public WinterWonderLand ()
    {
        super ("WinterWonderLand");
        Panel pan = new Panel();
        setSize( 800, 800);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocation(200,100);
        setResizable(true);
        setContentPane(pan);
        setVisible(true);
    }

    public static void main (String [] args)
    {
        WinterWonderLand JoeBobKim = new WinterWonderLand ();
    }

}
class Panel extends JPanel
{
    int num;
    int num2;
    //Constructor to initialize variables
    public Panel()
    {
        setBackground(Color.pink);
        run();
    }
    public void run()
    {
        System.out.print("\n\n\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("How many snowmen would you like(1-4)? ");
        num = scan.nextInt();
        System.out.print("Would you like a moonlit night, yes(1), no(2)? ");
        num2 = scan.nextInt();

        System.out.println("Here is your winter wonderland with 3 snowmen and a moonlit night\n\n");
    }

    public void paintComponent(Graphics g)
    {
        if(num>=1)
        {
            int xn = 55;
            int yn = 260;
            Snowmen(g, xn, yn);

            for(int i = 0; i < num-1; i++)
            {
                xn += 150;
                Snowmen(g, xn, yn);
            }
        }
    }
    public void Stars(Graphics g2, int [] starx, int[]stary )	//passes in the graphics variable
    {
        g2.setColor(Color.WHITE);
        g2.fillPolygon(starx, stary,12);
    }
    public void drawMoon(Graphics g3)	//passes in the graphics variable
    {
        g3.setColor(Color.BLACK);
        ((Graphics2D)g3).setStroke(new BasicStroke(3));
        g3.drawArc(480, 0, 180, 150, 90, -180);
        g3.setColor(Color.WHITE);
        g3.fillArc(480, 0, 180, 150, 90, -180);

        g3.setColor(Color.BLACK);
        g3.drawArc(520, 0, 90, 150, 90, -180);
        g3.setColor(Color.PINK);
        g3.fillArc(520, 0, 90, 150, 90, -180);
    }
    public void Snowmen(Graphics g, int xn, int yn)
    {
        g.setColor(Color.WHITE);
        g.fillOval(xn, yn, 50, 40 );
        g.fillOval(xn-5, yn+38, 60, 62 );
        g.fillOval(xn-5, yn+99, 60, 62 );
        g.fillOval(xn-20, yn+159, 90, 62 );
        g.fillRect(0, 480, 800, 320);

        g.setColor(Color.BLACK);
        g.fillOval(xn + 10, yn + 10, 10, 10);
        g.fillOval(xn + 30, yn + 10, 10, 10);
        g.drawLine(xn +20, yn + 25, xn + 30, yn +25);
        g.fillOval(xn + 20, yn + 50, 10, 10);
        g.fillOval(xn + 20, yn + 65, 10, 10);
        g.fillOval(xn + 20, yn + 80, 10, 10);

        g.drawLine(xn+55, yn + 65, xn + 85, yn +110);
        g.drawLine(xn-5, yn + 65, xn -35, yn +110);
    }
}
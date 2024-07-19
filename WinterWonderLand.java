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
        
    }
    public void Stars(Graphics g2, int [] starx, int[]stary )	//passes in the graphics variable
    {
        

    }
    public void drawMoon(Graphics g3)	//passes in the graphics variable
    {
    }
    public void Snowmen(Graphics g, int xn, int yn)
    {
    }
}
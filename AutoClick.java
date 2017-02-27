/**
 * Created by soaresad on 11/3/2016.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Random;

public class AutoClick extends JFrame implements ActionListener{
    //Create elements of opening Frame
    public JPanel openingPanel = new JPanel();
    public GridLayout firstMenu = new GridLayout(2,2,50,50);
    public JButton alching = new JButton("High Alchemy");
    public JButton nmz = new JButton("Coming Soon!");
    public JButton ench = new JButton("Coming Soon!");
    public JButton splashy = new JButton("Coming Soon!");
    //public JLabel header = new JLabel("Pick Your Poison");
    //public JLabel westSide = new JLabel("       ");
    //public JLabel eastSide = new JLabel("       ");
    //public JLabel bottom = new JLabel("         ");
    public Font headerFont = new Font("Verdana", Font.BOLD,25);




    public AutoClick()
    {
        setVisible(true);
        setSize(1250,1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Instantiate Opening Panel
        openingPanel.setLayout(firstMenu);
        openingPanel.add(alching);
        openingPanel.add(splashy);
        openingPanel.add(ench);
        openingPanel.add(nmz);
      //  header.setFont(headerFont);
        add(openingPanel,BorderLayout.CENTER);
       // add(header,BorderLayout.NORTH);
        //add(westSide, BorderLayout.WEST);
        //add(eastSide, BorderLayout.EAST);
        //add(bottom,BorderLayout.SOUTH);

    }




    public  void actionPerformed(ActionEvent e)
    {

    }

    public void generateAlchemyData(int hours, int minutes)
    {

        int alchSleepAverage = 2335;
        try(Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(hours + "hr"+ minutes +"min" + "alchemy.ahk"), "utf-8"))) {

            alchSleepAverage = hours * 60 * (60 / alchSleepAverage);
            Random r = new Random();
            int cooldown = r.nextInt(750) + 600;
            int longCooldown = r.nextInt(1600) + 1720;
            for(int i = 0; i<alchSleepAverage;i++)
            {
                cooldown = r.nextInt(750) + 600;
                longCooldown = r.nextInt(1720) + 600;

                writer.write("Mouseclick, left \n Sleep, " + cooldown + "\n"


            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }








    public static void main(String[] ags)
    {
        AutoClick clicker = new AutoClick();
    }

}

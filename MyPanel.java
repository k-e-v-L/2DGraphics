import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Image image;
    MyPanel() {

        image = new ImageIcon("heart.png").getImage();
        this.setPreferredSize(new Dimension(400,400));

    }

    public void paint(Graphics g) {

        Graphics g2D = (Graphics2D) g;

        g2D.drawImage(image,5,5,null); //random background pic
        ////More recently drawn things overlap previous items


        ((Graphics2D) g).setPaint(Color.blue); //We set the color
        //((Graphics2D) g2D).setStroke(new BasicStroke(5)); //Define style and width
        //g2D.drawLine(0, 0, 500, 500);

        //g2D.setColor(Color.pink);
        //g2D.drawRect(0,0,100,200);
        //g2D.fillRect(0,0,200,300);

        //((Graphics2D) g2D).setPaint(Color.yellow); //color of oval
        //g2D.drawOval(0,0,200,300); //Yellow circle but is not filled
        //g2D.fillOval(0,0,200,300); //fills the circle

        ((Graphics2D) g2D).setPaint(Color.RED);
        g2D.drawArc(0,0,200,200,180,180);
        g2D.fillArc(0,0,200,200,0,180); //red half filled circle
        ((Graphics2D) g2D).setPaint(Color.white);
        ((Graphics2D) g2D).fillArc(0,0,200,200,180,180); //Another half filled white color

        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        ((Graphics2D) g2D).setPaint(Color.blue);
        //g2D.drawPolygon(xPoints,yPoints,3); //triangle
        g2D.fillPolygon(xPoints,yPoints,3); //fills triangle

        //((Graphics2D) g2D).setPaint(Color.CYAN);
        //g2D.setFont(new Font("Ink Free",Font.BOLD,54));
        //g2D.drawString("U R THE CHAMP", 50, 50); //Draws text

    }
}

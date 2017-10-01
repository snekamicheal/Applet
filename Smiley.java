import java .applet.*;
import java.awt.*;
public class Smiley extends Applet
{
public void paint(Graphics g)
{
g.drawOval(100,100,300,300);
g.fillOval(180,150,50,50);
g.fillOval(280,150,50,50);
g.drawLine(250,210,250,280);
g.drawArc(180,190,150,150,180,180);
g.drawArc(180,200,150,150,180,180);

}
}
//<applet code=Smiley width=500 height=500></applet>
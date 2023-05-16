import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
class mouse extends Frame implements MouseListener{
        mouse(){
        addMouseListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 30, 30);
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e ){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}

}
class key_e extends Frame implements KeyListener{
    Label l;
    TextArea area;
    key_e() {
        l = new Label();
        l.setBounds(20, 50, 200, 20);
        area = new TextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);
        add(l);
        add(area);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){
        String text = area.getText();
        String words[] = text.split("\\s");
        l.setText("Words:"+words.length+"Characters:"+text.length());
    }
    public void keyTyped(KeyEvent e){}
}
public class key_and_mouse_events {

public static void main(String[] args){
       System.out.println("Enter || 1.mouse events || 2.key events");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       switch(a)
       {
           case 1:
               new mouse();
               break;
           case 2:
               new key_e();
               break;
           default:
               System.out.println("Wrong Input");
               break;
       }
}
}
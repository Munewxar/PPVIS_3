import javax.swing.*;
import java.awt.*;

public class GraphicsPainter{

    JPanel drawPanel = new JPanel();
    JFrame mainFrame = new JFrame();

    class DrawingComponent extends JPanel {

        int[] a = {40,60,80,100,120,140,160,180,200,220};
        int[] b = {320,300,280,260,240,220,200,180,160,140};

        @Override
        protected void paintComponent(Graphics gh) {
            Graphics2D drp = (Graphics2D)gh;
            drp.drawLine(20, 340, 20, 20);
            drp.drawLine(20, 340, 460, 340);

            for(int i = 320; i>20; i-=20){
                drp.drawLine(15, i, 25, i);
            }

            for(int i = 40; i<440; i+=20){
                drp.drawLine(i, 345, i, 335);
            }

            drp.drawPolyline(a, b, 10);
        }
    }

    public JFrame buildFrame(){
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.add(drawPanel);
        mainFrame.add(new DrawingComponent());
        mainFrame.pack();
        return mainFrame;
    }


    public static void main(String[] args) {
        JFrame frame = new GraphicsPainter().buildFrame();

        frame.setVisible(true);
    }
}

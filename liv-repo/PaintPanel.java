import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class PaintPanel extends JPanel implements ActionListener {
    private static PaintPanel inst; //singleton instance
    private BufferedImage grid;
    private Graphics2D gc;


    // ACTION PERFORMED
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.draw();
    }//actionPerformed

    // GET INSTANCE
    public static PaintPanel getInstance(){
        if(inst == null)
            inst = new PaintPanel();
        return inst;
    }//getInstance

    // CONSTRUCTOR
    PaintPanel(){
    JButton button = new JButton("Draw");
    button.addActionListener(this);
    add(button);
    }//Constructor

    // PAINT COMPONENT
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
    if(grid == null){int w = this.getWidth();
    int h = this.getHeight();
    grid = (BufferedImage)(this.createImage(w,h));
    gc = grid.createGraphics();
}
        //if (image == null) {
            //image = (BufferedImage)createImage(getSize().width, getSize().height);

            //g2 = (Graphics2D) image.getGraphics();
            //g2.fillRect(100, 100, 100, 200);

        g2.drawImage(grid, null, 0, 0);
    }//paintComponent
    // DRAW
    public void draw(){
       // Graphics2D g = (Graphics2D)getGraphics();
        Random r = new Random();
       int x1 = 0;
       int y1 = r.nextInt(500);
       int x2 = 500;
       int y2 = r.nextInt(500);

    //gc.setColor(Color.YELLOW);
    gc.drawLine(x1, y1, x2, y2);
    repaint();
    }//draw
}

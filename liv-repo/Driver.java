import javax.swing.*;

public class Driver extends JFrame {
    public static Driver inst;

    public static void main(String[] args){
        Driver.getInstance();
    }//main
public static  Driver getInstance(){
    if(inst == null)
        inst = new Driver();
    return inst;
    }//getInstance

    private Driver(){
        super("In Class Demo");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(new PaintPanel().getInstance());
        setVisible(true);
    }//constructor
}

package electricity_billing_system;

import java.awt.Image;
import javax.swing.*;

public class Splash extends JFrame implements Runnable {

    Thread t;

    Splash() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i2 = i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        setVisible(true);

        int x = 1;
        for (int i = 2; i < 600; i += 4) {
            setSize(i + x, i);
            setLocation(700 - ((i + x) / 2), 400 - (i / 2));
            try {
                Thread.sleep(4);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Start the thread after the animation completes
        t = new Thread(this);
        t.start();
    }

    public static void main(String args[]) {
        new Splash();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            setVisible(false);
            
            //login frame
            new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

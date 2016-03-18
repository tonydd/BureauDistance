/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.sun.awt.AWTUtilities;
import static com.sun.awt.AWTUtilities.setWindowOpacity;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import static java.awt.GraphicsDevice.WindowTranslucency.TRANSLUCENT;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Thomas STOCKER
 */
public class ScreenScanner extends JFrame {

    public ScreenScanner() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        
        GraphicsEnvironment ge = 
            GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();

        //If translucent windows aren't supported, exit.
        if (!gd.isWindowTranslucencySupported(TRANSLUCENT)) {
            System.err.println(
                "Translucency is not supported");
                System.exit(0);
        }
        
        
        Insets scnMax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int taskBarSize = scnMax.bottom;
        this.setLocation(screenSize.width - getWidth(), screenSize.height - /*taskBarSize -*/ getHeight());
        this.setSize(screenSize);
        this.setUndecorated(true);
        
        this.setTitle("ScreenScanner");
        this.setOpacity(0.55f);
        //setWindowOpacity(ScreenScanner.this, 0.0f);
        //this.setBackground(new Color(0,0,0,0));
        setBackground(new Color(0, 0, 0, 0));
        
        /*setContentPane(new ContentPane());
getContentPane().setBackground(new Color(255,255,255,255));//Color.BLACK);
setLayout(new BorderLayout());*/
        
        this.setVisible(true);
        this.setAlwaysOnTop(true);
        //AWTUtilities.setWindowOpacity(this, );
        //available size of the screen 
        //height of the task bar
    }

}

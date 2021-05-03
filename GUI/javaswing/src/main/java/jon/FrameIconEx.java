package jon;

import java.awt.*;
import javax.swing.JFrame;
import javax.imageio.*;
import java.io.*;

public class FrameIconEx extends JFrame {

    public FrameIconEx() {
        
        initUI();
    
    }

    private void initUI() {
        
        // this didnt show the icon, the second one did due to absolute path, need to figure out relative
        // var webIcon = new ImageIcon("src/resources/web.png");
        // setIconImage(webIcon.getImage());
        
        try {
            // The read(), static method of ImageIO class
            // takes InputStream object pointing to the image file
            //ImageIcon is used to create the icon
            setIconImage(ImageIO.read(new FileInputStream("C:/Users/Jon/Desktop/helsinki/java/GUI/javaswing/src/resources/chief.png")));
        } catch(Exception e) {
            System.out.println(e);
        }

        setTitle("Icon");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {

            var ex = new FrameIconEx();
            ex.setVisible(true);

        });
    }
    
}

package jon;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SimpleMenuEx extends JFrame {
    
    public SimpleMenuEx() {
        initUI();
    }

    private void initUI() {

        createMenuBar();
        setTitle("Simple menu");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {

        // a menubar is created with JMenuBar
        var menuBar = new JMenuBar();
        
        // An exit icon is is made and resized
        ImageIcon exitIcon = new ImageIcon("C:/Users/Jon/Desktop/helsinki/java/GUI/javaswing/src/resources/close.png");
        Image image = exitIcon.getImage();
        Image newImage = image.getScaledInstance(10, 10,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        exitIcon = new ImageIcon(newImage);  

        // A menu object is created with the JMenu class, the menu can be access via keyboard as well
        // To bind a menu to a particular key, we use setMnemonic()
        // Menu can be opened with alt + F
        var fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        // A menu object consists of menu items, a menu item is crated with the JMenuItem class
        // A menu item has its own mnemonic, that can be activated with alt+f+e
        var eMenuItem = new JMenuItem("Exit", exitIcon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);

        // creates a tooltip for the menu item
        eMenuItem.setToolTipText("Exit applicaiton");

        // JMenuItem is a special kind of a button component, add an action listener to it, that terminates the application
        eMenuItem.addActionListener((event) -> System.exit(0));

        // Menu item is added to the menu object and the menu object is inserted into the menubar
        fileMenu.add(eMenuItem);
        menuBar.add(fileMenu);

        // sets the menubar for the JFrame Container
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new SimpleMenuEx();
            ex.setVisible(true);
        });
    }
}

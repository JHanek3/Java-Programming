package jon;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.EventQueue; 

public class QuitButtonEx extends JFrame {
    
    public QuitButtonEx() {
        initUI();
    }

    private void initUI() {

        // Create the button component, takes a string label as the parameter
        var quitButton = new JButton("Quit");

        // Plug an action listener to the button, the action terminates the application by calling system.exit
        quitButton.addActionListener((event) -> System.exit(0));

        // child components need to be  placed into containers, delegate the task to the createLayout method
        createLayout(quitButton);

        setTitle("quitButton");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void createLayout(JComponent... arg) {

        // Content pane of a JFrame is an area where child components are placed
        // Children organized by specialised non-visible compnents called layout managers
        // Default layour manager of a content pane is the BorderLayout manager
        // This tutorial GroupLayout more powerful and flexible        
        var pane = getContentPane();
        var gl = new GroupLayout(pane);
        pane.setLayout(gl);

        // Creates gap between components and the edges of the container, important part of design
        gl.setAutoCreateContainerGaps(true);

        // Group Layout defines the layout for each dimension independently
        // layout components along the horizontal axis, and the other along the vertical axis
        // Both layouts can be ordered sequentially or parallel
        // In horizontal layout, a row of components is called a sequential group and a column of components is called a parallel group
        // In vertical, a column of components is called a sequential group and a row of components is called a parallel gorup
        
        gl.setHorizontalGroup(gl.createSequentialGroup()
            // Simple layout, each dimension we call the addComponent with the button as a parameter
            // Each child component must be added for both dimensions
            .addComponent(arg[0])
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
        );
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            var ex = new QuitButtonEx();
            ex.setVisible(true);
        });
    }
}

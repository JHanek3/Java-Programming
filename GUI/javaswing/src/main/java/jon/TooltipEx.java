package jon;

import java.awt.EventQueue;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TooltipEx extends JFrame {
    public TooltipEx() {
        initUI();
    }

    private void initUI() {

        var btn = new JButton("Button");
        //Enables tooltip
        btn.setToolTipText("A button component");

        createLayout(btn);

        setTitle("Tooltip");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {

        // Content pane is an instance of a JPanel component
        // getContentPane returns a Container Type
        // Setting a tooltip requires a JComponent instance, we cast the object to a JPanel
        var pane = (JPanel) getContentPane();
        var gl = new GroupLayout(pane);
        pane.setLayout(gl);

        // tooltip set for the content pane
        pane.setToolTipText("Content pane");

        gl.setAutoCreateContainerGaps(true);

        // Add gap for horizontal and vertical dimensions, it creates some space to the right and to the bottom of the button
        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
            .addGap(200)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
            .addGap(120)
        );

        // pack automatically sizes JFrame based on the size of its components
        // takes defined space into account too
        pack();
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            var ex = new TooltipEx();
            ex.setVisible(true);
        });
    }
}

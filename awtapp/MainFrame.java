package awtapp ;
import java.awt.Frame ;
//import java.awt.Panel ;
import java.awt.Button ;

public class MainFrame extends Frame {

    public MainFrame (){
        super() ;
        init();

    }
    private void init() {
        
        this .setTitle("My AWT Application") ;
        Button b = new Button("Click Me") ;
        // Button sizButton = new Button("Size") ;  
        // sizButton .setBounds(50, 100, 80, 30) ; setBounds is used to set the position and size of the button
        // this .add(sizButton) ;

        //Panel p = new Panel() ; this has been replaced by Button b
        this .add(b) ;
        this .setSize(400, 300) ;
        //this .setExtendedState(MAXIMIZED_BOTH); // this is for full screen
        this .setVisible(true) ;
        // make the window exit
        this .addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });

    }

    
}
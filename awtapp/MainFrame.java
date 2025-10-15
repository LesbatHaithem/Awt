package awtapp ;
import java.awt.Frame ;
import java.awt.Panel ;
import java.awt.Button ;
import java.awt.event.* ;


public class MainFrame extends Frame  {

    public MainFrame (){
        super() ;
        init();

    }
    private void init() {
        
        this .setTitle("My AWT Application") ;
        Panel p = new Panel() ; // this has been replaced by Button b
        this .add(p) ;
        this .setSize(400, 300) ;


        Button b = new Button("Click Me") ;
        p .add(b) ;
        b .addActionListener(new MyActionListener()) ;
        Button c = new Button("Cancel") ;
        p .add(c) ;    //another action listener for cancel button
        c .addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Cancel Button Clicked");
                e.getSource();
            }
        }) ;


        // Button sizButton = new Button("Size") ;  
        // sizButton .setBounds(50, 100, 80, 30) ; setBounds is used to set the position and size of the button
        // this .add(sizButton) ;

       
        //this .setExtendedState(MAXIMIZED_BOTH); // this is for full screen
        this .setVisible(true) ;
        // this.addButtonListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent e) {
        //         System.out.println("Button Clicked");
        //     }
        // });
        // make the window exit
        this .addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {

                System.exit(0);
            }
        });

    }

    
}
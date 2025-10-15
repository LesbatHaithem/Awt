package awtapp ;
import java.awt.* ;
// import java.awt.Panel ;
// import java.awt.Button ;
// import java.awt.event.* ;
// import java.awt.Label;
// import java.awt.TextField;



public class MainFrame extends Frame  {
    Label lbl ;

    public MainFrame (){
        super() ;
        init();

    }
    private void init() {
        
        this .setTitle("My AWT Application") ;
        Panel p = new Panel() ; // this has been replaced by Button b
        this .add(p) ;
        this .setSize(400, 300) ;
        lbl = new Label("Hello AWT") ;
        p .add(lbl) ;  


        Button b = new Button("Click Me") ;
        p .add(b) ;

        // b .addActionListener(new MyActionListener()) ;
        
        // lambda expression to handle button click event and optimize the code
        b.addActionListener((e)->{ lbl.setText("Button Clicked");}) ;


        Button c = new Button("Cancel") ;
        p .add(c) ;    //another action listener for cancel button

        // another way to add action listener without implementing the interface with using anonymous class
        c .addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                lbl.setText("Cancel Button Clicked");
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
package awtapp;

public class MyActionListener implements java.awt.event.ActionListener {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        System.out.println("Button Clicked");
        e.getSource();
    }
    
}

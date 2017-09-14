import java.awt.Color;

import javax.swing.JFrame;

public class Controller extends Model {
    //Make frame, loop on repaint and wait
    public static void main(String[] args) {
    	View view = new View();
    	JFrame frame = new JFrame();
    	frame.getContentPane().add(view);
    	frame.setBackground(Color.gray);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(frameWidth, frameHeight);
    	frame.setVisible(true);
    	for(int i = 0; i < 1000; i++){
    		frame.repaint();
    		try {
    			Thread.sleep(100);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
    }

}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class View extends Controller implements ImageObserver {
	BufferedImage[] pics0;
	BufferedImage[] pics1;
	BufferedImage[] pics2;
	BufferedImage[] pics3;
	Model model = new Model();
	public void paint(Graphics g){
		model.Moves();
		if(model.direction == 1){
			g.drawImage(pics1[model.picNum], model.xloc, model.yloc, Color.gray, this);
		}
		else if(model.direction == 3){
			g.drawImage(pics3[model.picNum], model.xloc, model.yloc, Color.gray, this);
		}
		else if(model.direction == 0){
			g.drawImage(pics0[model.picNum], model.xloc, model.yloc, Color.gray, this);
		}
		else if(model.direction == 2){
			g.drawImage(pics2[model.picNum], model.xloc, model.yloc, Color.gray, this);
		}


	}
  //Constructor: get image, segment and store in array
    public View(){ //public Animation()
    	BufferedImage img = createImage(0);
    	pics0 = new BufferedImage[10];
    	for(int i = 0; i < frameCount; i++) {
    		pics0[i] = img.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
    	}
    	BufferedImage img1 = createImage(1);
    	pics1 = new BufferedImage[10];
    	for(int i = 0; i < frameCount; i++) {
    		pics1[i] = img1.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
    	}
    	BufferedImage img2 = createImage(2);
    	pics2 = new BufferedImage[10];
    	for(int i = 0; i < frameCount; i++) {
    		pics2[i] = img2.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
    	}
    	BufferedImage img3 = createImage(3);
    	pics3 = new BufferedImage[10];
    	for(int i = 0; i < frameCount; i++) {
    		pics3[i] = img3.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
    	}
    }
    // TODO: Change this constructor so that at least eight orc animation pngs are loaded
    //Read image from file and return
    private BufferedImage createImage(int n){
    	BufferedImage bufferedImage;
    	if(n==0) {
    		try {
    			bufferedImage = ImageIO.read(new File("images/orc/orc_forward_southeast.png"));
    			return bufferedImage;
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		return null;
    	}
    	else if(n==1) {
    		try {
    			bufferedImage = ImageIO.read(new File("images/orc/orc_forward_southwest.png"));
    			return bufferedImage;
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		return null;
    	}
    	else if(n==2) {
    		try {
    			bufferedImage = ImageIO.read(new File("images/orc/orc_forward_northwest.png"));
    			return bufferedImage;
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		return null;
    	}
    	else if(n==3) {
    		try {
    			bufferedImage = ImageIO.read(new File("images/orc/orc_forward_northeast.png"));
    			return bufferedImage;
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    		return null;
    }
	@Override
	public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		return false;
	}
}
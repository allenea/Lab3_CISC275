import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Model extends JPanel {
	final int frameCount = 10;
	int picNum = 0;
	int xloc = 0;
	int yloc = 0;
	final int xIncr = 8;
	final int yIncr = 2;
	final static int frameWidth = 500;
	final static int frameHeight = 300;
	final static int imgWidth = 165;
	final static int imgHeight = 165;
	public int direction = 0;
	// Override this JPanel's paint method to cycle through picture array and
	// draw images
	public void Moves() {
		if (direction == 0) {
			if (xloc > frameWidth - imgWidth && yloc < frameHeight - imgHeight) {
				direction = 1;
				picNum = (picNum + 1) % frameCount;
			} else if (xloc < frameWidth - imgWidth && yloc > frameHeight - imgHeight) {
				direction = 3;
				picNum = (picNum + 1) % frameCount;
			} else {
				picNum = (picNum + 1) % frameCount;
				xloc += xIncr;
				yloc += yIncr;
			}
		} else if (direction == 1) {
			if (yloc > frameHeight - imgHeight && xloc > 0) {
				direction = 2;
				picNum = (picNum + 1) % frameCount;

			} else if (yloc < frameHeight - imgHeight && xloc < 0) {
				direction = 0;
				picNum = (picNum + 1) % frameCount;
			} else {
				picNum = (picNum + 1) % frameCount;
				xloc -= xIncr;
				yloc += yIncr;
			}
		} else if (direction == 2) {
			if (xloc < 0 && yloc > 0) {
				direction = 3;
				picNum = (picNum + 1) % frameCount;
			} else if (xloc > 0 && yloc < 0) {
				direction = 1;
				picNum = (picNum + 1) % frameCount;
			} else {
				picNum = (picNum + 1) % frameCount;
				xloc -= xIncr;
				yloc -= yIncr;
			}
		} else if (direction == 3) {
			if (yloc < 0 && xloc < frameWidth - imgWidth) {
				direction = 0;
				picNum = (picNum + 1) % frameCount;
			} else if (xloc > frameWidth - imgWidth && yloc > 0) {
				direction = 2;
				picNum = (picNum + 1) % frameCount;
			} else {
				picNum = (picNum + 1) % frameCount;
				xloc += xIncr;
				yloc -= yIncr;
			}
		}
	}
}

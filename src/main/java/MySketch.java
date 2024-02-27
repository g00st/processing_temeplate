import processing.core.PApplet;

public class MySketch extends PApplet {
	public void setup() {
		this.getSurface().setResizable(true);
	}

	public void settings() {
		size(500, 500);
	}

	public void frameResized(int w, int h) {

	}

	public void draw(){
		background(64);
		ellipse(mouseX, mouseY, 20, 20);
	}
}

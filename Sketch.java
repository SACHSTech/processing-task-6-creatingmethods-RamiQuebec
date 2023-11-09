import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	    
	// sample code, delete this stuff

    // Walls & Roof
    
    stroke(0);
    fill(200,0,255);
    rect(100, 200, 200, 300);
    triangle(200,100,300,200,100,200);

    // Windows
    
    fill(128,128,128);
    rect(230, 220, 50, 50);
    rect(115, 220, 50, 50);

    // Door

    fill(150,75,0);
    rect(170, 280, 50, 180);
    fill(255,255,0);
    ellipse(180, 320, 10, 10);

    // Clouds

    fill(255,255,255);
    ellipse(300, 100, 100, 50);
    ellipse(160, 50, 100, 50);
    ellipse(60, 100, 100, 50);
    
    // Grass

    fill(0,255,130);
    rect(0, 350, 400, 100);
  }
  
  //public void drawClouds(int x, int y, int width, int height, boolean ) {

  //}

}

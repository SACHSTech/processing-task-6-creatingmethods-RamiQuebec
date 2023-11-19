import processing.core.PApplet;

/**
 * Main class to execute sketch
 * @author Rami Kabak
 * A sketch to draw various different objects using custom made methods, as well as a method which will return a boolean
 * to change the color of the house based on the location of the users mouse on the door.
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}
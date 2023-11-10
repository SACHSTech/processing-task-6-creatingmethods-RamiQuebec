import processing.core.PApplet;

public class Sketch extends PApplet {
  /**
   * Declare house x and y variables, it is important to change these and not the x and y in the drawHouse method parameter
   * because these variables are needed to detect the door position to change the color of the house if user is hovering on door
   */ 
  int houseX = 100;
  int houseY = 200;
  
  // Called once at the beginning of execution, put your size all in this method
  public void settings() {
    // put your size call here
    size(400, 400);
  }

  // Called once at the beginning of execution. Add initial set up values here i.e background, stroke, fill etc.
  public void setup() {
    background(135, 206, 235);
  }

  // Called repeatedly, anything drawn to the screen goes here
  public void draw() {
    // Calls drawGrass method to draw grass in the location based on the corresponding x, y, width and height parameters entered
    drawGrass(0, 350, 400, 100);

    /** 
     * Calls drawCloud method to draw cloud in the location based on the corresponding x, y, width and height parameters entered
     * Additionally, the method also takes a boolean paremeter which will make the cloud gray or white based on if the boolean is true or false
     */ 
    drawCloud(300, 100, 100, 50, true);
    drawCloud(160, 50, 100, 50, false);
    drawCloud(60, 100, 100, 50, true);

    // Calls mouseHoveringCheck method with house co-ordinates to determine whether mouse is hovering the door
    if (mouseHoveringCheck(houseX, houseY, mouseX, mouseY)) {
      drawHouse(houseX, houseY, 0, 0, 0);
    } else {
      drawHouse(houseX, houseY, 255, 255, 255);
    }
  }

  // Draw grass method, takes x and y parameters as well as width and height to change the positioning of the grass on the screen
  public void drawGrass(int x, int y, int width, int height) {
    fill(0, 255, 130);
    rect(x, y, width, height);
  }

  /**
   * Draw cloud method, takes parameters such as x and y to move cloud accordingly, also takes width and height parameters
   * Additionally, it takes a true or false boolean which will make the clouds gray or not if it is set to true or false
   */
  public void drawCloud(int x, int y, int width, int height, boolean gray) {
    if (gray) {
      fill(70, 70, 70);
    } else {
      fill(255, 255, 255);
    }
    ellipse(x, y, width, height);
  }

  // Draw house method, takes parameters such as x and y and moves house accordingly, also takes RGB of house walls and roof
  public void drawHouse(int x, int y, int wallR, int wallG, int wallB) {
    // Walls & Roof
    fill(wallR, wallG, wallB);
    rect(x, y, 200, 150);
    triangle(x + 100, y - 100, x + 200, y, x, y);

    // Windows
    fill(128, 128, 128);
    rect(x + 130, y + 20, 50, 50);
    rect(x + 15, y + 20, 50, 50);

    // Door
    fill(150, 75, 0);
    rect(x + 70, y + 80, 50, 70);
    fill(255, 255, 0);
    ellipse(x + 80, y + 120, 10, 10);
  }
  
  // Boolean method, takes x and y parameters and mouse x and y parameters to detect if the user is hovering over something
  public boolean mouseHoveringCheck(int x, int y, int mouseX, int mouseY) {
    return (mouseX > x + 70 && mouseX < x + 120 && mouseY > y + 80 && mouseY < y + 150);
  }
}
import processing.core.PApplet;
import java.util.Random;
import processing.core.PFont;

public class Sketch extends PApplet {

  public void settings() {
	// put your size call here
    size(500, 500);
  }

  public void setup() {
    background(135, 206, 235);
  }

    // random generator
    Random sunRandom = new Random();

    // randomized x and y coordinates for location of sun
    int randomSunPositionX = sunRandom.nextInt(500);
    int randomSunPositionY = sunRandom.nextInt(500); 

  public void draw() {  

    if (randomSunPositionY <= 125){
      background(137,207,240);
    } 

    else if (randomSunPositionY <= 250 && randomSunPositionY >= 125){
      background(0,0,255);
    }

    else if (randomSunPositionY <= 375 && randomSunPositionY >= 250){
      background (255,255,0);
    }

    else {
      background (204,85,0);
    }
  
    // draw sun now
    fill(255,191,0);
    ellipse(randomSunPositionX,randomSunPositionY,100,100);

    // stem
    stroke(53,94,59);
    strokeWeight(15);
    line(250,350,250,500);
    
    // change strokeweight back to normal
    strokeWeight(1);
    stroke(0);

    // petals
    fill(255,254,224);
    ellipse(300,300,100,100);
    ellipse(200,300,100,100);
    ellipse(300,400,100,100);
    ellipse(200,400,100,100);

    // middle of flower
    fill(254,229,86);
    ellipse(250,350,100,100);

    // font
    PFont myFont = createFont("Arial Bold", 17);
    textFont(myFont, 17);

    // display date
    fill (0,0,0);
    text(year() + "/" + month() + "/" + day(), 375,400);
    text(hour() + " : " + minute() + " : " + second(), 375, 450);
 
  }
  
  
}
import com.educative.graphics.*;

class SmileyFactored {
  static Canvas c;

  public static void drawOutline() {
    c.fill("yellow");
    c.stroke("black");
    c.circle(100, 100, 50);
  }

  public static void drawMouth() {
    c.stroke("black");
    c.fill("yellow");
    c.circle(100, 100, 30);
    c.stroke("yellow");
    c.rect(68, 68, 62, 40);
  }

  public static void drawEyes() {
    c.stroke("black");
    c.fill("black");
    c.circle(100 - 20, 100 - 10, 5);
    c.circle(100 + 20, 100 - 10, 5);
  }

  public static void main(String[] args) {
    c = new Canvas(200, 200);
    
    drawOutline();
    drawMouth();
    drawEyes(); 
    c.draw();
  }
}

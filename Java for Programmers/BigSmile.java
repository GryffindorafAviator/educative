import com.educative.graphics.*;

class BigSmile {
  public static void main(String[] args) {
	  Canvas c;
    c = new Canvas(200, 200);
     
    int x;
    int y;
    double scale;

    x = 100;
    y = 100;
    scale = 0.5;

    // Draw the outline of the face
    c.fill("yellow");
    c.stroke("black");
    c.circle(x, y, 50 * scale);

    // draw the mouth
    c.stroke("black");
    c.fill("yellow");
    c.circle(x, y, 30 * scale);
    c.stroke("yellow");
    c.rect(x - 32 * scale, y - 32 * scale, 62 * scale, 40 * scale);

    // draw the eyes
    c.stroke("black");
    c.fill("black");
    c.circle(x - 20 * scale, y - 10 * scale, 5 * scale);
    c.circle(x + 20 * scale, y - 10 * scale, 5 * scale);

  }
}

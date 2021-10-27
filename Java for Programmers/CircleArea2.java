class CircleArea {

  private static double circleArea(double radius) {
    return Math.PI * radius * radius;
  }
  
  public static void main(String[] args) {
    System.out.println("A circle of radius two has area " + circleArea(2));
    
  }
}

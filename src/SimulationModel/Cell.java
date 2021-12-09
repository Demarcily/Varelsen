package SimulationModel;

import Shapes.Point;
import Shapes.Shape;

public class Cell {
  private int x;
  private int y;

  public Cell(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Shape getShape() {
    return new Point(x,y);
  }

  public void update() {

  }

  public String toString() {
    return "Cell: " + y + "" + x + "\nx: " + x + "\ny: " + y;
  }
}

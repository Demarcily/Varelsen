package SimulationModel;

import Shapes.Scene;
import Shapes.Shape;

import java.util.ArrayList;

public class SimulationModel {
  Scene scene;
  Cell[] c;
  int i;
  int j;
  public SimulationModel(int width, int height, int scale) {
    c = new Cell[(width/scale) * (height/scale)];
    int i = 0;
    while (i < height/scale) {
      int j = 0;
      while(j < width/scale) {
        c[i*(height/scale) + j] = new Cell(j,i);
        System.out.println(c[i*(height/scale) + j]);
        j++;
      }
      i++;
    }
  }

  public void update() {
    i = 0;
    while (i < c.length) {
      c[i].update();
      i++;
    }
  }

  public ArrayList<Shape> getShapes() {
    i = 0;
    ArrayList<Shape> shapes = new ArrayList<>();
    while (i < c.length) {
      shapes.add(c[i].getShape());
      i++;
    }
    return shapes;
  }
}
package GPI.exercice.pile;

import GPI.projet.geom.Rectangle;
import java.util.ArrayList;

public class PileDeRectangle {

  public PileDeRectangle() {
    private ArrayList<Rectangle> lesRectangles;
  }

  public boolean estVide() {
    if (lesRectangles.size() == 0){
      return true;
    }
    else {
      return false;
    }
  }

  public void empiler(Rectangle unRectangle){
    lesRectangles.add(unRectangle);
  }

  public Rectangle depiler(){
    if (this.estVide()) {
      throw new Error("La liste ne peut pas etre depile, elle est vide");
    }
    else {
      Rectangle r = lesRectangles.get(lesRectangles.size()-1);
      lesRectangles.remove(lesRectangles.size()-1);
      return r;
    }
  }

}

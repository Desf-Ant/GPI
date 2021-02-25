package GPI.projet.geom;

public class Coordonnees {
  private double x;
  private double y;

  public Coordonnees (double x,double y){
    this.x = x;
    this.y = y;
  }

  public Coordonnees (){
    this(0,0);
  }

  // Guetteurs et Mutateurs
  public double getX (){
    return this.x;
  }

  public double getY(){
    return this.y;
  }

  public void setX(double x){
    this.x = x;
  }

  public void setY(double y){
    this.y = y;
  }


  // Méthodes
  public String toString(){
    return "x: "+this.x+"; y: "+this.y;
  }

  public void deplacerDe(double deltaX, double deltaY){
    this.x += deltaX ;
    this.y += deltaY ;
  }

  public double distanceVers (Coordonnees coords){
    double x2 = coords.getX();
    double y2 = coords.getY();
    return Math.sqrt(Math.pow(this.x-x2,2)+Math.pow(this.y-y2,2));
  }

  public double angleVers(Coordonnees coords){
    double x2 = coords.getX();
    double y2 = coords.getY();
    double xR = this.getX() - x2;
    double yR = this.getY() - y2;

    return 360-Math.atan(yR/xR)*180/Math.PI;
  }

}

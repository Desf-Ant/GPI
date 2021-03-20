package fr.eseo.poo.projet.artiste.modele;

public class Coordonnees {
  private double x;
  private double y;
  private static double	ABSCISSE_PAR_DEFAUT = 0;
  private static double ORDONNEE_PAR_DEFAUT = 0;

  public Coordonnees (double x,double y){
    this.x = x;
    this.y = y;
  }

  public Coordonnees (){
    this(ABSCISSE_PAR_DEFAUT,ORDONNEE_PAR_DEFAUT);
  }
  
  public Coordonnees(Coordonnees c) {
	  this.x = c.getX();
	  this.y = c.getY();
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
  
  public void deplacer(Coordonnees c) {
	  this.x = c.getX();
	  this.y = c.getY();
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

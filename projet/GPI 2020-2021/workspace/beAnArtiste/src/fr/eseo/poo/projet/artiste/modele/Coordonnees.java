package fr.eseo.poo.projet.artiste.modele;

public class Coordonnees {
  private double x;
  private double y;
  public static final double	ABSCISSE_PAR_DEFAUT = 0;
  public static final double ORDONNEE_PAR_DEFAUT = 0;

  public Coordonnees (double x,double y){
    this.x = x;
    this.y = y;
  }

  public Coordonnees (){
    this(ABSCISSE_PAR_DEFAUT,ORDONNEE_PAR_DEFAUT);
  }
  
  public Coordonnees(Coordonnees c) {
	  this.x = c.getAbscisse();
	  this.y = c.getOrdonnee();
  }

  // Guetteurs et Mutateurs
  public double getAbscisse (){
    return this.x;
  }
  

  public double getOrdonnee(){
    return this.y;
  }
  

  public void setAbscisse(double x){
    this.x = x;
  }
  

  public void setOrdonnee(double y){
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
  
  public void deplacerVers(double x,double y) {
	  this.x = x;
	  this.y = y;
  }
  
  public void deplacer(Coordonnees c) {
	  this.x = c.getAbscisse();
	  this.y = c.getOrdonnee();
  }

  public double distanceVers (Coordonnees coords){
    double x2 = coords.getAbscisse();
    double y2 = coords.getOrdonnee();
    return Math.sqrt(Math.pow(this.x-x2,2)+Math.pow(this.y-y2,2));
  }

  public double angleVers(Coordonnees coords){
    double x2 = coords.getAbscisse();
    double y2 = coords.getOrdonnee();
    double xR = this.getAbscisse() - x2;
    double yR = this.getOrdonnee() - y2;

    return 360-Math.atan(yR/xR)*180/Math.PI;
  }

}

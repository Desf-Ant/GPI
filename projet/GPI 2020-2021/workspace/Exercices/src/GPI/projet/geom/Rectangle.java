package GPI.projet.geom;

import GPI.projet.geom.Coordonnees;

public class Rectangle {

  private static double LONGUEUR_PAR_DEFAUT = 5;
  private static double LARGEUR_PAR_DEFAUT = 7;
  private static Coordonnees POSITION_PAR_DEFAUT = new Coordonnees(3,3);
  private double largeur;
  private double longueur;
  private Coordonnees position;

  // Constructeur
  public Rectangle (double longu, double larg, Coordonnees coords){
    this.largeur = larg;
    this.longueur = longu;
    this.position = coords;
  }

  public Rectangle (double longu, double larg){
    this(longu,larg,new Coordonnees(0,0));
  }

  public Rectangle(Coordonnees coords){
    this(Rectangle.LONGUEUR_PAR_DEFAUT, Rectangle.LARGEUR_PAR_DEFAUT,coords);
  }

  public Rectangle(){
    this(Rectangle.LONGUEUR_PAR_DEFAUT, Rectangle.LARGEUR_PAR_DEFAUT,Rectangle.POSITION_PAR_DEFAUT);
  }

  // Accesseurs
  public double getLargeur(){
    return this.largeur;
  }
  public double getLongueur(){
    return this.longueur;
  }
  public Coordonnees getPosition(){
    return this.position;
  }

  public void setLargeur(double l) {
    this.largeur = l;
  }
  public void setLongueur(double l){
    this.longueur = l;
  }

  // Methode
  public double calculAir(){
    return this.getLargeur() * this.getLongueur();
  }

  public double calculPerimetre(){
    return this.getLargeur()*2 +this.getLongueur()*2;
  }

  public void deplacerDe(double deltaX, double deltaY){
    this.position.deplacerDe(deltaX,deltaY);
  }

  public String toString(){
    String s = new String();
    s += "Rectangle coords: "+this.getPosition();
    s += "/ largeur: "+this.getLargeur();
    s += "/ longueur: "+this.getLongueur();
    return s;
  }

}

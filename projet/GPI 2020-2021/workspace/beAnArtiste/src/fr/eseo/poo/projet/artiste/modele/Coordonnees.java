package fr.eseo.poo.projet.artiste.modele;

import java.text.DecimalFormat;
import java.util.Locale;

public class Coordonnees {
  private double x;
  private double y;
  public static final double ABSCISSE_PAR_DEFAUT = 0;
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
	DecimalFormat df = new DecimalFormat("0.0#");
	String xx = df.format(this.x);
	String yy = df.format(this.y);
	Locale langue = Locale.getDefault();
	
	if (langue.getLanguage().equals(new Locale("fr").getLanguage())) {
		xx = xx.replace('.',',');
		yy = yy.replace('.',',');
	}
    return "("+xx+" , "+yy+")";
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
    double xR = x2-this.getAbscisse();
    double yR = y2-this.getOrdonnee();
    
    if (yR == 0)
    	return 0;
    return (yR/Math.abs(yR)) * Math.acos(xR/Math.sqrt(Math.pow(xR, 2)+Math.pow(yR, 2)));   
  }
  
  @Override
  public boolean equals(Object o) {
	  if (o == this)
		  return true;
	  
	  if (!(o instanceof Coordonnees)) {
          return false;
      }
	  
	  Coordonnees c = (Coordonnees) o;
	  
	  if (this.getAbscisse() != c.getAbscisse() || this.getOrdonnee() != c.getOrdonnee()) {
		  return false;
	  }
	  
	  return true;
	  
  }

}

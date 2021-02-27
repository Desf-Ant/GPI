package GPI.exercices.complexe.cartesien;

public class Complexe{
  private double reelle;
  private double imaginaire;

  // Constructeurs
  public Complexe(){
    this(0,0,false);
  }

  /*
  * Si estPolaire == true
  * arg1 est le module et arg2 est l'argument
  * du complexe à cr é er
  * sinon
  * arg1 est la partie réelle et
  * arg2 est la partie imaginaire
  * du complexe à créer
  */
  public Complexe(double r, double i, boolean estPolaire ){
    if (!estPolaire) {
      this.reelle = r;
      this.imaginaire = i;
    }
    else {
      this.reelle = r*Math.cos(i);
      this.imaginaire = r*Math.sin(i);
    }
  }

  // Accesseurs
  public double getImaginaire(){
    return this.imaginaire;
  }
  public void setImaginaire(double i){
    this.imaginaire = i;
  }

  public double getReelle() {
    return this.reelle;
  }
  public void setReelle(double r){
    this.reelle = r;
  }

  public double getModule(){
    return Math.sqrt(Math.pow(this.getReelle(),2)+Math.pow(this.getImaginaire(),2));
  }
  public void setModule(double m){
    double O = this.getArgument();
    this.setReelle(m*Math.cos(O));
    this.setImaginaire(m*Math.sin(O));
  }

  public double getArgument (){
    return Math.atan(this.getImaginaire()/this.getReelle());
  }
  public void setArgument(double O) {
    double m = this.getModule();
    this.setReelle(m*Math.cos(O));
    this.setImaginaire(m*Math.sin(O));
  }


  // Méthodes
  public Complexe plus(Complexe c){
    return new Complexe(this.getReelle()+c.getReelle(),this.getImaginaire()+c.getImaginaire(),false);
  }

  public Complexe fois(Complexe com){
    double a = this.getReelle();
    double b = this.getImaginaire();
    double c = com.getReelle();
    double d = com.getImaginaire();
    return new Complexe(a*c-b*d,a*d+b*c,false);
  }

  public String formeCanonique (){
    String s = new String();
    s += ""+this.getReelle();
    s += " i"+this.getImaginaire();
    return s;
  }

  public void afficheInfo (){
    System.out.println(this.formeCanonique());
  }


}

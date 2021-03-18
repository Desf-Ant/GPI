package GPI.exercices.complexe.polaire;

public class Complexe {
  private double module;
  private double argument;

  // Constructeurs
  public Complexe(double m, double a, boolean estPolaire){
    if (estPolaire){
      this.module = m;
      this.argument = a;
    }
    else {
      this.module = Math.sqrt(Math.pow(m,2)+Math.pow(a,2));
      this.argument = Math.atan(a/m);
    }
  }
  public Complexe(){
    this(0,0,true);
  }

  // Accesseurs
  public double getModule(){
    return this.module;
  }
  public void setModule(double m){
    this.module = m;
  }

  public double getArgument(){
    return this.argument;
  }
  public void setArgument(double a ){
    this.argument = a;
  }

  public double getReelle(){
    return this.getModule()*Math.cos(this.getArgument());
  }
  public void setReelle(double r){
    double b = this.getImaginaire();
    this.setArgument(Math.atan(b/r));
    this.setImaginaire(Math.sqrt(Math.pow(r,2)+Math.pow(b,2)));
  }

  public double getImaginaire(){
    return this.getModule()*Math.sin(this.getArgument());
  }
  public void setImaginaire(double i){
    double a = this.getReelle();
    this.setArgument(Math.atan(i/a));
    this.setModule(Math.sqrt(Math.pow(a,2)+Math.pow(i,2)));
  }

  public Complexe plus(Complexe c){
      return new Complexe(this.getReelle()+c.getReelle(),this.getImaginaire()+c.getImaginaire(),false);
  }

  public Complexe fois(Complexe c){
    return new Complexe(this.getModule()*c.getModule(),this.getArgument()+c.getArgument(),true);
  }

  public String formeCanonique(){
    String s = new String();
    s += ""+this.getModule();
    s += "e^("+this.getArgument();
    s += ")";
    return s;
  }

  public void afficheInfo(){
    System.out.println(this.formeCanonique());
  }


}

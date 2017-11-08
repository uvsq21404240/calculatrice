package java;

public class Pile {
	 
	public int[] v;
	 public int taillemax=1000;
	 public int sommet;
	 public Pile(){
	     v=new int[taillemax];
	     sommet=0;
	 }
	 public Pile(int n){
	     taillemax=n;
	     v=new int[taillemax];
	     sommet=0;
	 }
 
	  public boolean estVide(Pile v){
		 return sommet==0;
	  }
 
	  public void depiler(){
		 v[sommet]=0;
	     sommet = sommet-1;
	  }
 
	  public void empiler(int o){
	     v[sommet++]=o;
	     sommet = sommet+1; ;
	  }
}
 
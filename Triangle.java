
public class Triangle extends Figure {

	private double base;
	private double hauteur;
	
	public Triangle(int x, int y, double b, double h) {
		super(x,y);
		base = b;
		hauteur = h;
	}
	
	public void affiche() {
		System.out.println("Coordonnées du centre de la figure : "+this.getPosX()+";"+this.getPosY()+" longueur de la base : "+base+", longueur de la hauteur"+hauteur);
	}

	public double surface(){
		double surface = (this.base*this.hauteur)/2;
		return surface;
	}
}

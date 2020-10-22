
public class Rectangle extends Figure implements Deformable {
	
	private final double largeur;
	private final double hauteur;
	
	public Rectangle(int x, int y, double l, double h) {
		super(x, y);
		this.largeur= l;
		this.hauteur=h;
		
	}
	
	public void affiche() {
		System.out.println("Coordonnées du centre de la figure : "+this.getPosX()+";"+this.getPosY()+", largeur : "+largeur+", hauteur : "+hauteur);
	}
	
	public Figure deformation(double coeffH, double coeffV) {
		double nouvelleLargeur = this.largeur*coeffH;
		double nouvelleHauteur = this.hauteur*coeffV;
		Figure f = new Rectangle(this.getPosX(), this.getPosY(),nouvelleLargeur, nouvelleHauteur);
		return f;
	}
	
}

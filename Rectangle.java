
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
		Figure f = new Rectangle(this.getPosX(), this.getPosY(),nouvelleLargeur, nouvelleHauteur); //création nouvel objet, position identique, dimension * coeffs
		return f; //renvoie l'objet créé
	}
	
	public double surface(){
		double surface = this.largeur*this.hauteur; //calcul de surface
		return surface;
	}

	public Figure deplacement(int x, int y){
        int newPosX = getPosX() + x;
		int newPosY = getPosY() + y;
        Figure F = new Rectangle(newPosX, newPosY, this.largeur, this.hauteur); // création d'un nouvel objet Figure avec de nouvelles coordonnées 
        return(F); //renvoie l'objet créé
    }
}

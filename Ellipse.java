
public class Ellipse extends Figure implements Deformable {

	private final double rayonhori;
	private final double rayonverti;
	
	public Ellipse(int x, int y, double bigr, double smallr) {
		super(x,y);
		rayonhori = bigr;
		rayonverti= smallr;
	}
	public void affiche() {
	System.out.println("Coordonnées du centre de la figure : "+this.getPosX()+";"+this.getPosY()+", grand horizontal : "+rayonhori+", rayon vertical : "+rayonverti);

	}
	
	public Figure deformation(double coeffH, double coeffV) {
		double nouveauRayonH = this.rayonhori*coeffH;
		double nouveauRayonV = this.rayonverti*coeffV;
		Figure f = new Rectangle(this.getPosX(), this.getPosY(),nouveauRayonH, nouveauRayonV);
		return f;
	}
	
	
}


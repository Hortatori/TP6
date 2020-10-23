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
		Figure f = new Ellipse(this.getPosX(), this.getPosY(),nouveauRayonH, nouveauRayonV);
		return f;
	}

	public double surface(){
		double surface = Math.PI*this.rayonhori*this.rayonverti; //prend rayon horizontal x rayon vertical x pi (package Math)
		return surface;
	}

	public Figure deplacement(int x,int y){
		int newPosX = getPosX() + x;
		int newPosY = getPosY() + y;
		Figure F = new Ellipse(newPosX, newPosY, this.rayonhori, this.rayonverti);
		return (F);
	}
}


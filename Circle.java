
public class Circle extends Ellipse {

	private final double ray;
	
	public Circle(int x, int y, double rayon) {
		super(x, y,rayon, rayon);
		ray= rayon;
	}
	
	public void affiche() {
	System.out.println("Coordonnées du centre de la figure : "+this.getPosX()+";"+this.getPosY()+", rayon : "+ray);

	}
	
}

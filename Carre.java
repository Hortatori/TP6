
public class Carre extends Rectangle {

	private final double cote;
	
	public Carre(int x, int y, double c) {
		super(x, y, c, c);
		cote = c;
	}
	public void affiche() {
		System.out.println("Coordonnées du centre de la figure : "+this.getPosX()+";"+this.getPosY()+", côté : "+cote);
	}
}

// Dans le constructeur du Triangle, pas besoin de hauteur

abstract public class Figure {
	private int posX;
	private int posY;
	
	public Figure(int x, int y) {
		// coordonnées du centre approximatif de la figure
		posX=x;
		posY=y;
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	public abstract void affiche();
	
}

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

	public double estDistantDe(Figure fig){
	int figX = fig.getPosX();
	int figY = fig.getPosY();
	int distanceX = this.posX - figX;
	int distanceY = this.posY - figY;
		//pas sûre : est ce que ce n'est pas deux fois la même variable?
	double diagonale = Math.sqrt((distanceX^2)*(distanceY^2));
	return diagonale;
	}

	public abstract double surface();

	public abstract Figure deplacement();
}

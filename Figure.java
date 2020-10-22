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
	figX = getPosX();
	figY = getPosY();
	int distanceX = this.posX - figX;
	int distanceY = this.posY - figY;
		//pas sûre : est ce que ce n'est pas deux fois la même variable?
	System.out.println("distance X : "+ distanceX +"distance Y : "+ distanceY);
	//return(distanceX,distanceY);
	}
	abstract double surface();	
}

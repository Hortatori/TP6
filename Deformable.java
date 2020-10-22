
public interface Deformable {

	public Figure deformation(double coeffH, double coeffV);
	// Les figures qui implémenteront Deformable seront Rectangle et Ellipse et donc à carré et cercle par héritage.
	// La valeur de retour sera dans : carré -> rectangle, rectangle -> rectangle, ellipse -> ellipse, cercle -> ellipse, triangle -> triangle
	
}

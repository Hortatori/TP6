public interface Triable {
// échange les éléments en positions i et j
void echange(int i, int j);
// retourne vrai si l’élément de position i est plus grand que
// l’élément de position j
boolean plusGrand(int i, int j);
// nombre d’éléments à trier
int taille();
static void triBulles(Triable t){
    boolean change = false;
    do {
    change = false;
        for (int i=0; i<tab.length - 1; i++) {

            if (tab[i] > tab [i+1]) {
            int tmp = tab[i+1];
            tab[i+1] = tab[i];
            tab[i] = tmp;
            change = true;
            }
        }
    } while (change);
}
}
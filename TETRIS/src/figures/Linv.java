package figures;

import components.Matrix;
import components.Piece;

/**
 * Piece de type: frome en 'S' inversee.
 */
public class Linv extends Piece {
	public Linv(int posX, int posY) {
		super(posX, posY);
		this.mat = new Matrix(3);
		int couleur = (int) (Math.random() * 4.0);
		this.mat.setVal(1, 0, couleur);
		this.mat.setVal(1, 1, couleur);
		this.mat.setVal(1, 2, couleur);
		this.mat.setVal(0, 2, couleur);
	}
}

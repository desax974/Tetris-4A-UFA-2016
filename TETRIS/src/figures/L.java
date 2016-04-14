package figures;

import components.Matrix;
import components.Piece;

/*
 * Decompiled with CFR 0_114.
 */
public class L extends Piece {
	public L(int posX, int posY) {
		super(posX, posY);
		this.mat = new Matrix(3);
		int couleur = (int) (Math.random() * 4.0);
		this.mat.setVal(1, 0, couleur);
		this.mat.setVal(1, 1, couleur);
		this.mat.setVal(1, 2, couleur);
		this.mat.setVal(2, 2, couleur);
	}
}

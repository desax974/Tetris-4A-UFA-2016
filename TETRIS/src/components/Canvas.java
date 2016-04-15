package components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

import javax.swing.JComponent;

import data.dataClass;

public class Canvas extends JComponent implements Runnable {
	private Image[] image;
	private MediaTracker MT;
	private Game game;
	private int timer;
	private Thread thread;
	private Tetris tetris;
	private int niveau;

	public Canvas(Tetris tetris) {
		this.game = null;
		this.tetris = tetris;
		this.image = new Image[10];
		this.MT = new MediaTracker((Component) (this));
		try {			this.image[0] = Toolkit
					.getDefaultToolkit()
					.getImage( dataClass.class.getResource("tetris.png")
							);
			this.image[1] = Toolkit
					.getDefaultToolkit()
					.getImage(
							dataClass.class.getResource("tetris.png"));
			this.image[2] = Toolkit
					.getDefaultToolkit()
					.getImage(dataClass.class.getResource("tetris.png"));
			this.image[3] = Toolkit
					.getDefaultToolkit()
					.getImage(
							dataClass.class.getResource("tetris.png"));
			this.image[4] = Toolkit
					.getDefaultToolkit()
					.getImage(
							dataClass.class.getResource("tetris.png"));
			this.image[5] = Toolkit
					.getDefaultToolkit()
					.getImage(
							dataClass.class.getResource("tetris.png"));
			this.image[6] = Toolkit
					.getDefaultToolkit()
					.getImage(
							dataClass.class.getResource("tetris.png"));
			this.image[7] = Toolkit
					.getDefaultToolkit()
					.getImage(
							dataClass.class.getResource("tetris.png"));
			this.image[8] = Toolkit
					.getDefaultToolkit()
					.getImage(
							dataClass.class.getResource("tetris.png"));
			this.image[9] = Toolkit
					.getDefaultToolkit()
					.getImage(
							dataClass.class.getResource("tetris.png"));
		} catch (Exception v0) {
		}
		this.MT.addImage(this.image[0], 0);
		this.MT.addImage(this.image[1], 1);
		this.MT.addImage(this.image[2], 2);
		this.MT.addImage(this.image[3], 3);						
		try {
			this.MT.waitForAll();
		} catch (InterruptedException v1) {
		}
		this.niveau = 1;
		this.timer = 1000;
		this.game = new Game(12, 20, tetris.getCps());
		this.start();
	}

	public Game getJeu() {
		return this.game;
	}

	@Override
	public Dimension getMinimumSize() {
		return new Dimension(290, 482);
	}

	@Override
	public Dimension getPreferredSize() {
		return this.getMinimumSize();
	}

	@Override
	public void paint(Graphics g) {
		if (this.MT.statusID(this.niveau - 1, false) == 8) {
			g.drawImage(this.image[this.niveau - 1], 1, 1,
					(ImageObserver) (this));
		}
		g.setColor(Color.black);
		g.drawRect(0, 0, 289, 481);
		this.game.draw(g);
	}

	@Override
	public void run() {
		do {
			try {
				Thread.sleep(this.timer);
			} catch (InterruptedException v0) {
			}
			if (!this.game.play()) {
				this.game.testScore();
				this.tetris.setEnabledMenuOptions();
				this.thread.suspend();
			}
			this.tetris.setLabelScore(this.game.getScore());
			this.tetris.setLabelLigne(this.game.getLigne());
			int nouveauNiveau = this.game.getNiveau();
			this.tetris.setLabelLevel(nouveauNiveau);
			if (nouveauNiveau != this.niveau) {
				this.timer = (int) (1000.0 * Math.pow(0.6666666865348816,
						nouveauNiveau - 1));
				this.niveau = nouveauNiveau;
			}
			this.repaint();
		} while (true);
	}

	public void setJeu(Game jeu) {
		this.game = jeu;
	}

	public void start() {
		this.thread = new Thread(this);
		this.thread.start();
	}

	

	public void stopThread() {
		this.thread.stop();
	}

	public void testKey(int code) {
		this.game.testKey(code);
		this.repaint();
	}

	@Override
	public void update(Graphics g) {
		this.paint(g);
	}
}

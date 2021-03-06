package components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Tetris extends JFrame implements KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2598473050933938018L;
	private JPanel panel;
	private MenuBar menubar;
	public JLabel labelApercu;
	public JLabel labelScore;
	private JLabel labelLevel;
	private JLabel labelLigne;
	private Canvas canvas;
	private NextPiece cps;

	public Tetris() {
		this.setTitle("Tetris - ESIEA 4A-CFA");
		this.setResizable(false);
		this.setSize(555, 550);
		try {
			UIManager.setLookAndFeel(UIManager
					.getCrossPlatformLookAndFeelClassName());
		} catch (Exception v0) {
		}
		/* Gestion de la fermeture de cette frame. */
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); // On ferme la fenetre.
				System.exit(1);
			}
		});
		this.panel = new JPanel();
		this.panel.setBackground(new Color(200, 200, 200));
		this.panel.setLayout(null);
		this.menubar = new MenuBar(this);
		this.setJMenuBar(this.menubar);
		this.addKeyListener(this);
		this.cps = new NextPiece();
		this.cps.setBounds(350, 45, 162, 162);
		this.panel.add((Component) (this.cps));
		this.canvas = new Canvas(this);
		this.canvas.setBounds(17, 13, 290, 482);
		this.labelApercu = new JLabel();
		this.labelApercu.setText("Next Piece");
		this.labelApercu.setForeground(Color.black);
		this.labelApercu.setFont(new Font("dialog", 1, 24));
		this.labelApercu.setBounds(320, 5, 270, 32);
		this.panel.add(this.labelApercu);
		this.labelLevel = new JLabel("NIVEAU : 1 ");
		this.labelLevel.setForeground(Color.red);
		this.labelLevel.setFont(new Font("dialog", 1, 24));
		this.labelLevel.setBounds(350, 230, 250, 36);
		this.panel.add(this.labelLevel);
		this.labelScore = new JLabel("SCORE  : 0 ");
		this.labelScore.setForeground(Color.black);
		this.labelScore.setFont(new Font("dialog", 1, 24));
		this.labelScore.setBounds(350, 280, 250, 36);
		this.panel.add(this.labelScore);
		this.labelLigne = new JLabel("LIGNE   : 0 ");
		this.labelLigne.setForeground(Color.black);
		this.labelLigne.setFont(new Font("dialog", 1, 24));
		this.labelLigne.setBounds(350, 340, 250, 36);
		this.panel.add(this.labelLigne);
		
		this.panel.add((Component) (this.canvas));
		this.getContentPane().add(this.panel);
		
		this.setVisible(true);
	}

	public Canvas getCanvas() {
		return this.canvas;
	}

	public NextPiece getCps() {
		return this.cps;
	}

	public JLabel getLabelApercu() {
		return this.labelApercu;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		this.canvas.testKey(e.getKeyCode());
		this.canvas.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	public static void main(String[] args) {
		new Tetris();
	}

	public void setEnabledMenuOptions() {
		this.menubar.setEnabledMenuOptions(true);
	}

	public void setLabelLevel(int level) {
		this.labelLevel.setText("NIVEAU : " + level);
	}

	public void setLabelLigne(int ligne) {
		if (ligne > 1) {
			this.labelLigne.setText("LIGNES : " + ligne);
		} else {
			this.labelLigne.setText("LIGNE   : " + ligne);
		}
	}

	public void setLabelScore(int score) {
		this.labelScore.setText("SCORE  : " + score);
	}

}

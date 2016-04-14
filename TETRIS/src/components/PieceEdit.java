package components;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class PieceEdit extends JPanel implements MouseListener, ActionListener {
	private Matrix mat;
	private Game game;
	private static JFrame frame;
	private static PieceEditCanvas canvas;
	private static JComboBox listColors;
	private static JComboBox listTailles;
	private static JButton buttonSave;
	private static JButton buttonLoad;
	private static JButton buttonAjouter;
	private static JButton buttonAnnuler;

	public PieceEdit(int size, Game jeu) {
		this.mat = new Matrix(size);
		this.game = jeu;
		try {
			UIManager.setLookAndFeel(UIManager
					.getCrossPlatformLookAndFeelClassName());
		} catch (Exception v0) {
		}
		frame = new JFrame("Editeur de pieces");
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				PieceEdit.access$frame().dispose();
			}
		});
		this.setLayout(new BorderLayout());
		canvas = new PieceEditCanvas(this.mat.getSize());
		canvas.setMat(this.mat);
		canvas.repaint();
		canvas.addMouseListener(this);
		this.add((Component) (canvas), "Center");
		JPanel statPanel = new JPanel();
		statPanel.setLayout(new BorderLayout());
		JPanel pan1 = new JPanel();
		listTailles = new JComboBox();
		int i = 0;
		while (i < 5) {
			listTailles.addItem("" + (i + 1) + " x " + (i + 1));
			++i;
		}
		listTailles.setSelectedIndex(size - 1);
		listTailles.setActionCommand("TailleMat");
		listTailles.addActionListener(this);
		pan1.add(new JLabel("Taille: "));
		pan1.add(listTailles);
		statPanel.add(pan1, "North");
		JPanel pan2 = new JPanel();
		listColors = new JComboBox();
		int i2 = 0;
		while (i2 < Couleur.getSize()) {
			listColors.addItem(Couleur.getNomCouleur(i2));
			++i2;
		}
		listColors.setSelectedIndex(0);
		pan2.add(new JLabel("Couleur: "));
		pan2.add(listColors);
		statPanel.add(pan2, "Center");
		this.add(statPanel, "East");
		JPanel pan3 = new JPanel();
		buttonSave = new JButton("Sauver");
		buttonSave.addActionListener(this);
		pan3.add(buttonSave);
		buttonLoad = new JButton("Charger");
		buttonLoad.addActionListener(this);
		pan3.add(buttonLoad);
		buttonAnnuler = new JButton("Annuler");
		buttonAnnuler.addActionListener(this);
		pan3.add(buttonAnnuler);
		buttonAjouter = new JButton("Ajouter au jeu");
		buttonAjouter.addActionListener(this);
		pan3.add(buttonAjouter);
		this.add(pan3, "South");
		frame.getContentPane().add("Center", (Component) (this));
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		File file;
		if (e.getActionCommand().equals("Charger")) {
			JFileChooser fileChooser = new JFileChooser();
			if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			  file = fileChooser.getSelectedFile();
			  // load from file
				if(chargerMat(file)) JOptionPane.showMessageDialog(this, "Le fichier a ete charge avec succes", "Info", JOptionPane.ERROR_MESSAGE);

			}
		} else if (e.getActionCommand().equals("Sauver")) {
			JFileChooser fileChooser = new JFileChooser();
			if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
			  file = fileChooser.getSelectedFile();
			  // load from file
				this.sauverMat(file, this.mat);

			}
		} else if (e.getActionCommand().equals("Annuler")) {
			frame.dispose();
		} else if (e.getActionCommand().equals("Ajouter au jeu")) {
			frame.dispose();
			this.game.addUserPiece(this.mat);
		} else if (e.getActionCommand().equals("TailleMat")) {
			this.setSizeMat(listTailles.getSelectedIndex() + 1);
		}
	}
	public void sauverMat(File nomFic, Matrix mat) {
		FileOutputStream fic;
		ObjectOutputStream out;

		try {
			fic = new FileOutputStream(nomFic.getPath());
		} catch (IOException v0) {

			JOptionPane.showMessageDialog(this, "Impossible d'ouvrir le fichier en \u00e9criture "
					+ nomFic + " !", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		try {
			out = new ObjectOutputStream(fic);
		} catch (IOException v1) {
			System.out.println("Impossible d'ouvrir le flux !");
			return;
		}
		try {
			out.writeObject(mat);
		} catch (Exception e) {
			System.out.println("Impossible d'ecrire dans le flux !");
		}
		try {
			out.close();
		} catch (IOException v3) {
			System.out.println("Impossible de fermer le flux !");
			return;
		}
	}
	public boolean chargerMat(File nomFic) {
		FileInputStream fic;
		ObjectInputStream in;
		try {
			fic = new FileInputStream(nomFic);
		} catch (IOException v0) {
			return false;
		}
		try {
			in = new ObjectInputStream(fic);
		} catch (IOException v1) {
			return false;
		}
		try {
			this.mat = (Matrix) in.readObject();
			setMatrix(this.mat);
			
		} catch (Exception v2) {
			return false;
		}
		try {
			in.close();
		} catch (IOException v3) {
			return false;
		}
		return true;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (this.mat.getVal(e.getX() / 24, e.getY() / 24) != listColors
				.getSelectedIndex()) {
			this.mat.setVal(e.getX() / 24, e.getY() / 24,
					listColors.getSelectedIndex());
		} else {
			this.mat.setVal(e.getX() / 24, e.getY() / 24, -1);
		}
		canvas.setMat(this.mat);
		canvas.repaint();
	}

	public void setMatrix(Matrix mat) {
		this.mat = mat;
		listTailles.setSelectedIndex(mat.getSize() - 1);
		canvas.setMat(mat);
		this.repaint();
	}

	public void setSizeMat(int size) {
		Matrix mat = new Matrix(size);
		int miyeu1X = mat.getSize() / 2;
		int miyeu1Y = mat.getSize() / 2;
		int miyeu2X = this.mat.getSize() / 2;
		int miyeu2Y = this.mat.getSize() / 2;
		int x = 0;
		while (x < this.mat.getSize()) {
			int y = 0;
			while (y < this.mat.getSize()) {
				mat.setVal(x + miyeu1X - miyeu2X, y + miyeu1Y - miyeu2Y,
						this.mat.getVal(x, y));
				++y;
			}
			++x;
		}
		this.mat = mat;
		canvas.setMat(this.mat);
		canvas.repaint();
	}

	static JFrame access$frame() {
		return frame;
	}

}

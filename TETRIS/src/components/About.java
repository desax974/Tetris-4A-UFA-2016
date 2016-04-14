package components;

import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Constructor;
import java.net.*;
import javax.swing.*;

public class About extends JDialog implements ActionListener {
	private JButton ivjJButton1;
	private JPanel ivjJDialogContentPane;
	private JLabel ivjJLabel1;

	static Class class_name;

	public About() {
		this.ivjJButton1 = null;
		this.ivjJDialogContentPane = null;
		this.ivjJLabel1 = null;


		this.initialize();
		this.setModal(true);
		try {
			Class[] arrclass;
			Class class_;
			Class aCloserClass;
			aCloserClass = Class.forName("com.ibm.uvm.abt.edit.WindowCloser");
			arrclass = new Class[1];
			class_ = class_name;
			if (class_ == null) {
				try {
					class_ = About.class_name = Class
							.forName("java.awt.Window");
				} catch (ClassNotFoundException v3) {
					throw new NoClassDefFoundError(v3.getMessage());
				}
			}
			arrclass[0] = class_;
			Class[] parmTypes = arrclass;
			Object[] parms = new Object[] { this };
			Constructor aCtor = aCloserClass.getConstructor(parmTypes);
			aCtor.newInstance(parms);
		} catch (Throwable v4) {
		}
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.getJButton1()) {
			this.connEtoC1(e);
		}
	}

	private void connEtoC1(ActionEvent arg1) {
		try {
			this.jButton1_ActionPerformed(arg1);
		} catch (Throwable ivjExc) {
			this.handleException(ivjExc);
		}
	}

	private JButton getJButton1() {
		if (this.ivjJButton1 == null) {
			try {
				this.ivjJButton1 = new JButton();
				this.ivjJButton1.setName("JButton1");
				this.ivjJButton1.setText("Fermer");
				this.ivjJButton1.setBounds(100, 100, 122, 32);
			} catch (Throwable ivjExc) {
				this.handleException(ivjExc);
			}
		}
		return this.ivjJButton1;
	}

	private JPanel getJDialogContentPane() {
		if (this.ivjJDialogContentPane == null) {
			try {
				this.ivjJDialogContentPane = new JPanel();
				this.ivjJDialogContentPane.setName("JDialogContentPane");
				this.ivjJDialogContentPane.setLayout(null);
				this.ivjJDialogContentPane.setBackground(new Color(189, 211,
						211));
				this.getJDialogContentPane().add(this.getJButton1(),
						this.getJButton1().getName());
				this.getJDialogContentPane().add(this.getJLabel1(),
						this.getJLabel1().getName());

			} catch (Throwable ivjExc) {
				this.handleException(ivjExc);
			}
		}
		return this.ivjJDialogContentPane;
	}

	private JLabel getJLabel1() {
		if (this.ivjJLabel1 == null) {
			try {
				this.ivjJLabel1 = new JLabel();
				this.ivjJLabel1.setName("JLabel1");
				this.ivjJLabel1
						.setText("TETRIS - 4A-CFA");
				this.ivjJLabel1.setForeground(Color.red);
				this.ivjJLabel1.setHorizontalTextPosition(0);
				this.ivjJLabel1.setFont(new Font("dialog", 1, 14));
				this.ivjJLabel1.setBounds(35, 18, 393, 15);
				this.ivjJLabel1.setHorizontalAlignment(0);
			} catch (Throwable ivjExc) {
				this.handleException(ivjExc);
			}
		}
		return this.ivjJLabel1;
	}



	private void handleException(Throwable exception) {
	}

	private void initConnections() {
		this.getJButton1().addActionListener(this);
	}

	private void initialize() {
		this.setName("Apropos");
		this.setDefaultCloseOperation(2);
		this.setSize(428, 242);
		this.setContentPane(this.getJDialogContentPane());
		this.initConnections();
	}

	public void jButton1_ActionPerformed(ActionEvent actionEvent) {
		this.dispose();
	}

}

package network;

import java.io.*;
import java.net.*;

import views.ServeurFrame;

public class Serveur implements Runnable {
	private ServeurFrame serveurFrame;
	private static final int PORT = 10004;
	private Thread thread;
	private ServerSocket socketServeur;
	public Serveur(ServeurFrame serveurFrame) {
		this.serveurFrame = serveurFrame;
		this.thread = new Thread(this);
		serveurFrame.setThread(this.thread);
		this.thread.start();
	}

	@Override
	public void run() {
		
		try {
			socketServeur = new ServerSocket(PORT, 5);
		} catch (IOException v0) {
			this.serveurFrame.setSocket(null);
			return;
		}
		Socket socket = null;
		try {
			socket = socketServeur.accept();
		} catch (IOException v1) {
			socket = null;
		}
		this.serveurFrame.setSocket(socket);
	}
}

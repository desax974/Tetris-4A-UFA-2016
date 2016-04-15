PROJET TETRIS 
=============
![alt tag](http://imageshack.com/a/img924/7203/qJFuV6.png)
HAFOUD Mohammed Amine - DESCHASEAUX Ramaye Axel – LOUCARID Nadia (4A-CFA)

Build 
==================

Fonctionnalités
===============

- Interface Graphique
- Création de tetriminos
- Multijoueur (Client/Serveur)
- Scores (top 5 - Nb lignes)
- Niveaux - Obstacles


Comment Jouer : 
=======================

    1. Le Jeu en Solitaire :
- Pour jouer il faut utiliser les flèches pour tourner les pièces et les faire descendre dans l'endroit choisit. Dès qu'une ligne est cassée (100 points) ainsi qu'à chaque tetrimino (10 pts), le score s'incrémente. 
Lorsque 10 lignes sont remplis, le niveau monte (vitesse) 

Se déplacer à gauche : Flèche gauche
Se déplacer à droite : Flèche droite
Tourner la pièce : Flèche haute
Accélerer la descente : Flèche bas

	2. Mutlijoueur :

- Ce Tetris peut être joué seul mais aussi en mode multijoueur :

Menu : Option > 2 joueurs : J1 appel J2 avec l'adresse ip de J2, J2 attend l'appel >> Connexion établie
Lors d'une partie en multijoueur, au bout de 10 lignes supprimmées l'adversaire obtiens un malus, qui est l'ajout d'1 ligne aléatoire malus 1 puis 2, etc.


Exercice Design Pattern / Solid
===============================


•	Illustrez trois principes SOLID ou design pattern en utilisant vos propres classes.

- Nous avons appliqué le principe SRP : SINGLE RESPONSABILITY PRINCIPLE 
"Un composant = une responsabilité"

Application :
Pour lancer le jeu on utilise la classe starter, qui a pour responsabilité d'appeler une nouvelle instance de la classe tetris.
Nous avons appliqué le principe SRP : SINGLE RESPONSABILITY PRINCIPLE 
Un composant = une responsabilité: 

	`package components;

	public class Starter {
		public static void main(String[] args) {
			new Tetris();
		}
	}`


- Open / Close Responsability :
Ce principe nous a permis mettre en place la création de pièces sans modifier les classes des tetriminos existants mais en créant un fichier propre à la pièce créée.


- Lock/Mutex: Méchanisme de Synchronisation 

public synchronized void ajoutClient(ThreadServeur t) { System.out.println("L''utilisateur " +t.getId() +" est maintenant connecté ..."); Serveur.clients.add(t); }


Architecture :
==============

Nous avons composé notre projets sur une architecture MVC 

Packages :
- Component : Composants du jeu
- Figures : Tetriminos
- network : Jeu en réseau : Server / Client 
- views (bibliothèque swing) : Contenant les différentes vues à afficher

Des tests ont été réalisés : Junit(Unitaire), CodePro(Audit, TestCases) 



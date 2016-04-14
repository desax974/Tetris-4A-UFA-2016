PROJET TETRIS 
=============
![alt tag](http://imageshack.com/a/img924/7203/qJFuV6.png)
HAFOUD Mohammed Amine - DESCHASEAUX Ramaye Axel – LOUCARID Nadia (4A-CFA)

BUILD DU PROGRAMME 
==================

Les consignes du jeu : 
=======================
- Pour jouer il faut utiliser les flèches pour tourner les pièces et les faire descendre dans l'endroit choisit. Dès qu'une ligne est cassée (100 points) ainsi qu'à chaque tetrimino (10 pts), le score s'incrémente.

Se déplacer à gauche : Flèche gauche
Se déplacer à droite : Flèche droite
Tourner la pièce : Flèche haute
Accélerer la descente : Flèche bas

- Ce Tetris peut être joué seul mais aussi en mode multijoueur :

Menu : Option > 2 joueurs : J1 appel J2 avec l'adresse ip de J2, J2 attend l'appel >> Connexion établie
Lors d'une partie en multijoueur, au bout de 10 lignes supprimmées l'adversaire obtiens un malus, qui est l'ajout d'1 ligne aléatoire malus 1.


Exercice Design Pattern / Solid
===============================


•	Illustrez trois principes SOLID ou design pattern en utilisant vos propres classes.

- Nous avons appliqué le principe SRP : SINGLE RESPONSABILITY PRINCIPLE 
"Un composant = une responsabilité"

Application :
Pour lancer le jeu on utilise la classe starter, qui a pour responsabilité d'appeler une nouvelle instance de la classe tetris.
Nous avons appliqué le principe SRP : SINGLE RESPONSABILITY PRINCIPLE 
Un composant = une responsabilité: 

package components;

public class Starter {
	public static void main(String[] args) {
		new Tetris();
	}
}


- Open / Close Responsability :
Ce principe nous a permis mettre en place la création de pièces sans modifier les classes des tetriminos existants mais en créant un fichier propre à la pièce créée.


- Lock/Mutex: Méchanisme de Synchronisation 

public synchronized void ajoutClient(ThreadServeur t) { System.out.println("L''utilisateur " +t.getId() +" est maintenant connecté ..."); Serveur.clients.add(t); }


•	Pourquoi avez-vous utilisé ce design pattern / principe ? Qu'est-ce que cela vous a apporté ? Et comment l'avez-vous appliqué ?
La classe ci dessus à pour rôle de lancer le jeu. Le Design pattern Lock/Mutex: Méchanisme de Synchronisation public synchronized void ajoutClient(ThreadServeur t) { System.out.println("L''utilisateur " +t.getId() +" est maintenant connecté ..."); Serveur.clients.add(t); }
Nous avons utilisé 
MVC : 

swing : 





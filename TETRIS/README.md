PROJET TETRIS 
=============
HAFOUD Mohammed Amine - DESCHASEAUX Ramaye Axel – LOUCARID Nadia (4A-CFA)

Les consignes du jeu : 
=======================
- Ce Tetris pourra être joué seul mais aussi en mode multijoueur.
- Pour jouer il faut utiliser les flèches pour tourner les pièces et les faire descendre dans l'endroit choisit. Dès qu'une ligne est cassée, le score s'incrémente.

Exercice Design Pattern / Solid


•	Illustrez trois principes SOLID ou design pattern en utilisant vos propres classes.

- Nous avons appliqué le principe SRP : SINGLE RESPONSABILITY PRINCIPLE 
"Un composant = une responsabilité"

Application :
Pour lancer le jeu on utilise la classe starter, qui a pour responsabilité d'appeler une nouvelle instance de la classe tetris.

public class Lanceur {
public static void main(string[] args) {
Jeu jeu = new Jeu("Tetris",230,300) ;
jeu.start() ;
}
}

- Open / Close Responsability :
Ce principe nous a permis mettre en place la création de pièces sans modifier les classes des tetriminos existants mais en créant un fichier propre à la pièce créée.






- Lock/Mutex: Méchanisme de Synchronisation 

public synchronized void ajoutClient(ThreadServeur t) { System.out.println("L''utilisateur " +t.getId() +" est maintenant connecté ..."); Serveur.clients.add(t); }




Nous avons utilisé MVC et swing pour la vue. 




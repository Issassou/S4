AUTEURS : BEKKOUCHE Inas et AIT ALI BELKACEM Azzedine .
********
TITRE DU PROJET: pfc
****************

Le projet consiste à créer un jeu appelé "pfc".

 ce jeu oppose deux joueurs, Les deux joueurs choisissent simultanément un des trois coups possibles (pierre,papier,ciseaux).
 les ciseaux battent le papier, le papier bat la pierre et la pierre bat les ciseaux. à chaque coup gagnant le joueur remporte 2 points, si c'est un coup null les joueurs remporte 1 point chaqu'un.

 pour ce faire: on à créer une classe Player qui contient les deux joueurs définis par leurs noms, et leurs startegie.

 une classe Game qui va permettre à l'utilisateur de choisir le nombre de parties à jouer et qui retourne le gagnant.

 pour pouvoir gérer les startegie des joueurs on à créer une interface "strategie" implémenté par différente classes de strategies.

 Par défaut dans ce jeu l'utilisateur joue contre la machine, il peut choisir le coup à jouer tandis que la machine utilise une strategie aléatoire,
 Après chaque tour de jeux les résultats de la manche sont afficher à l'écran, et à la fin du jeux on annonce le nom du vainqueur s'il existe.




OBJECTIFS:
**********
          - Se familiariser avec les classes et la notion d'objet
          - Apprendre à organiser son code en utilisant les paquetages
          - Adopter une méthodologie rigoureuse basée sur les tests unitaires
          - Manipulation des énumérations  
          - Manipulation des interfaces
          - creation d'un jar executable

*****************************************************************************
*****************************************************************************
  POUR RÉCUPÉRER CE PROJET VEUILLEZ SUIVRE LES INSTRUCTIONS CI-DESSOUS:
=====================================================================


Si vous avez déjà cloné ce projet:


          1_Positionnez vous dans le répertoire où se trouve le projet en utilisant la commande "cd".


          2_Vous devez télécharger le contenu du répertoire git et mettre à jour le répertoire local en utilisant la commande "git pull".

Sinon, commencez par cloner le projet en utilisant la commande "git clone"
--------------------------------------------------------------

Génération de la doc :
======================
Pour générer la documentation il faut se placer dans le répertoire "src" et exécuter la commande:

`javadoc -author  -d ../docs -subpackages pfc`

Compilation des sources du projet:
===================================

Se positionner dans src puis tapez la commande:

`javac pfc/Main.java -d ../classes`

 à l'issue de cette commande tous les fichiers .java seront compilés et les .class générés. Ils se trouvent dans le dossier classes à la racine du projet.

 Compilation et exécution des tests:
 ===================================

 Copiez "test-1.7.jar" du répertoire "test" à la racine du projet.
 Positionnez vous également à la racine du projet puis:

 * PlayerTest.java
   - Pour compiler tapez la commande : `javac -classpath test-1.7.jar test/PlayerTest.java`

   - Pour lancer les tests toujours étant à la racine du projet tapez la commande : `java -jar test-1.7.jar PlayerTest`


 * shapeTest.java
   - Pour compiler tapez la commande : `javac -classpath test-1.7.jar test/ShapeTest.java`

   - Pour lancer les tests toujours étant à la racine du projet tapez la commande : `java -jar test-1.7.jar ShapeTest`


 * GameTest.java
   - Pour compiler tapez la commande : `javac -classpath test-1.7.jar test/GameTest.java`

   - Pour lancer les tests toujours étant à la racine du projet tapez la commande : `java -jar test-1.7.jar GameTest`


 Génération du fichier .jar:
 ============================
 * Placez vous dans à la racine du projet.  


 * Copiez y le fichier manifest-ex (fourni sur le portail, figure dans les fichiers fournis pour le TP4) qui est un exemple de fichier de définition de manifest.

 * Ouvrez le vous y trouverez cette ligne "Main-Class: example.Robot" écrivez à la place "Main-Class: pfc.Main".

 * Placez vous dans le dossier classes,  exécutez la commande `jar cvfm ../appli.jar ../manifest-ex pfc`

 Exécution du programme:
 ========================
   * Sans le jar exécutable :
     - Placez vous dans le dossier classes
     - Tapez la commande `java pfc/Main`

   * Avec le jar exécutable :
     - Placez vous à la racine du projet
     - Tapez la commande :  `java -jar appli.jar`

AUTEURS: BEKKOUCHE Inas , AIT ALIBELKACEM Azzedine
********

TITRE DU PROJET: Bataille Navale
****************



Le projet consiste à créer un jeu appelé "Bataille Navale".

Le plateau de jeu est représenté par une grille rectangulaire de cases sur lesquelles on peut poser des bateaux.


Les bateaux sont larges d’une case et longs d’un nombre variable de cases.  Ils peuvent être poses verticalement ou horizontalement sur le plateau.


Dans ce projet le joueur est un "attaquant", il devra deviner les cases où se trouvent les bateaux et les faire couler.


Initialement toutes les cases sont représentées par "." (non visés)


Le joueur propose une position du plateau.  Si cette position n’est pas occupée par un bateau la case est maintenant représentée par "~", sinon par une étoile.



OBJECTIFS:
**********
          - Se familiariser avec les classes et la notion d'objet
          - Apprendre à organiser son code en utilisant les paquetages
          - Adopter une méthodologie rigoureuse basée sur les tests unitaires
          - Manipulation des énumérations  

*****

*****************************************************************************
  POUR RÉCUPÉRER CE PROJET VEUILLEZ SUIVRE LES INSTRUCTIONS CI-DESSOUS:
  =====================================================================


Si vous avez déjà cloné ce projet:


1_Positionnez vous dans le répertoire où se trouve le projet en utilisant la commande "cd".


2_Vous devez télécharger le contenu du répertoire git et mettre à jour le répertoire local en utilisant la commande "git pull".

Sinon, commencez par cloner le projet en utilisant la commande "git clone"

--------------------------------------------------------------
Option rajoutée:
-----------------
*****************
  - Création d'une énumération "Level"

  - Le joueur choisi un niveau de difficulté: Easy, Medium, Hard, chaque niveau présente un certain nombre de tentatives  


Génération de la doc :
======================
Pour générer la documentation il faut se placer dans le répertoire "src" et exécuter la commande:
    `javadoc -author  -d ../docs -subpackages battleship`
à l'issue de cette commande tous les fichiers .java seront compilés et les .class générés. Ils se trouvent dans le dossier classes à la racine du projet.

Example :
---------
ubuntu@ubuntu-Inspiron-15-3567:~/Bureau/S4/POO/aitalibelkacem_bekkouche_poo/battleship/src$ javadoc -author  -d ../docs -subpackages battleship
Loading source files for package battleship...
Constructing Javadoc information...
Creating destination directory: "../docs/"
Standard Doclet version 11.0.6
Building tree for all the packages and classes...
Generating ../docs/battleship/Answer.html...
Generating ../docs/battleship/Cell.html...
Generating ../docs/battleship/Game.html...
Generating ../docs/battleship/Sea.html...
Generating ../docs/battleship/Ship.html...
Generating ../docs/battleship/util/Level.html...
Generating ../docs/battleship/util/Position.html...
Generating ../docs/battleship/package-summary.html...
Generating ../docs/battleship/package-tree.html...
Generating ../docs/battleship/io/package-summary.html...
Generating ../docs/battleship/io/package-tree.html...
Generating ../docs/battleship/util/package-summary.html...
Generating ../docs/battleship/util/package-tree.html...
Generating ../docs/constant-values.html...
Building index for all the packages and classes...
Generating ../docs/overview-tree.html...
Generating ../docs/index-all.html...
Building index for all classes...
Generating ../docs/allclasses-index.html...
Generating ../docs/allpackages-index.html...
Generating ../docs/deprecated-list.html...
Building index for all classes...
Generating ../docs/allclasses.html...
Generating ../docs/allclasses.html...
Generating ../docs/index.html...
Generating ../docs/overview-summary.html...
Generating ../docs/help-doc.html...

Compilation et exécution des tests:
===================================
Se positionner dans src puis tapez la commande:

`javac battleship/Main.java -d ../classes`
 à l'issue de cette commande tous les fichiers .java seront compilés et les .class générés. Ils se trouvent dans le dossier classes à la racine du projet.

 Copiez "test-1.7.jar" du répertoire "test" à la racine du projet.

* Main.java
  -Pour tester notre programme  il suffit de se positionner à la racine du projet et de taper la commande suivante :
`java -classpath classes battleship.Main`

JAR Executable:
===============
Placez vous dans le dossier classes,  exécutez la commande `jar cvfm ../appli.jar ../manifest-ex battleship io`
replacez vous dans la racine et exécutez la commande `java -jar appli.jar`


Example :
---------
$ java -classpath classes battleship.Main
This game is named "Battleship" you have to guess the location of the 4 ships on the sea and shoot them, once you have destroyed all of them you win.
The cooredinates of the cells starts from ZERO, see the x and y axes below :
0 --------------------------------> Y
|
|
|
|
|
|
|
|
v
X
 Choose a level by entering the corresponding letter: (E:Easy)(M:Medium)(H:Hard) e
Level: EASY
Attempts: 25
~ ~ ~ ~ ~
. . ~ . ~
~ ~ ~ . ~
. . . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 1
1
remaining attempt: 24
~ ~ ~ ~ ~
. * ~ . ~
~ ~ ~ . ~
. . . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 1
0
remaining attempt: 23
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
. . . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 1
1
remaining attempt: 22
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
. . . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 1
1
remaining attempt: 21
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
. . . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 1
12
java.lang.ArrayIndexOutOfBoundsException: 12
You entred a wrong value, by default you shoot the cell (0,0)
remaining attempt: 20
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
. . . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 12
0
java.lang.ArrayIndexOutOfBoundsException: 12
You entred a wrong value, by default you shoot the cell (0,0)
remaining attempt: 19
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
. . . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 3
0
remaining attempt: 18
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 4
3
remaining attempt: 17
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * .
Enter the X and Y coordinate of the cell you want to shoot : ? 4
4
remaining attempt: 16
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 5
1
java.lang.ArrayIndexOutOfBoundsException: 5
You entred a wrong value, by default you shoot the cell (0,0)
remaining attempt: 15
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 1
2
remaining attempt: 14
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 1
13
java.lang.ArrayIndexOutOfBoundsException: 13
You entred a wrong value, by default you shoot the cell (0,0)
remaining attempt: 13
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 13
12
java.lang.ArrayIndexOutOfBoundsException: 13
You entred a wrong value, by default you shoot the cell (0,0)
remaining attempt: 12
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 12
14
java.lang.ArrayIndexOutOfBoundsException: 12
You entred a wrong value, by default you shoot the cell (0,0)
remaining attempt: 11
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 15
13
java.lang.ArrayIndexOutOfBoundsException: 15
You entred a wrong value, by default you shoot the cell (0,0)
remaining attempt: 10
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 13
123
java.lang.ArrayIndexOutOfBoundsException: 13
You entred a wrong value, by default you shoot the cell (0,0)
remaining attempt: 9
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 12
12
java.lang.ArrayIndexOutOfBoundsException: 12
You entred a wrong value, by default you shoot the cell (0,0)
remaining attempt: 8
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 12
12
java.lang.ArrayIndexOutOfBoundsException: 12
You entred a wrong value, by default you shoot the cell (0,0)
remaining attempt: 7
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 12
12
java.lang.ArrayIndexOutOfBoundsException: 12
You entred a wrong value, by default you shoot the cell (0,0)
remaining attempt: 6
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 12
0
java.lang.ArrayIndexOutOfBoundsException: 12
You entred a wrong value, by default you shoot the cell (0,0)
remaining attempt: 5
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 3
0
remaining attempt: 4
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 1
3
remaining attempt: 3
~ ~ ~ ~ ~
* * ~ * ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 1
4
remaining attempt: 2
~ ~ ~ ~ ~
* * ~ * ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 3
0
remaining attempt: 1
~ ~ ~ ~ ~
* * ~ * ~
~ ~ ~ . ~
* . . ~ ~
~ ~ ~ * *
Enter the X and Y coordinate of the cell you want to shoot : ? 3
1
remaining attempt: 0

 END

~ ~ ~ ~ ~
* * ~ * ~
~ ~ ~ . ~
* * . ~ ~
~ ~ ~ * *

  YOU LOSE :(
      --------------------------------
bekkouche@a16p17:~/Desktop/S4/POO/aitalibelkacem_bekkouche_poo/battleship$ java -classpath classes battleship.Main
This game is named "Battleship" you have to guess the location of the 4 ships on the sea and shoot them, once you have destroyed all of them you win.
The cooredinates of the cells starts from ZERO, see the x and y axes below :
0 --------------------------------> Y
|
|
|
|
|
|
|
|
v
X
 Choose a level by entering the corresponding letter: (E:Easy)(M:Medium)(H:Hard) e
Level: EASY
Attempts: 25
~ ~ ~ ~ ~
. . ~ . ~
~ ~ ~ . ~
. . . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 1
0
remaining attempt: 24
~ ~ ~ ~ ~
* . ~ . ~
~ ~ ~ . ~
. . . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 1
1
remaining attempt: 23
~ ~ ~ ~ ~
* * ~ . ~
~ ~ ~ . ~
. . . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 1
3
remaining attempt: 22
~ ~ ~ ~ ~
* * ~ * ~
~ ~ ~ . ~
. . . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 2
3
remaining attempt: 21
~ ~ ~ ~ ~
* * ~ * ~
~ ~ ~ * ~
. . . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 3
0
remaining attempt: 20
~ ~ ~ ~ ~
* * ~ * ~
~ ~ ~ * ~
* . . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 3
1
remaining attempt: 19
~ ~ ~ ~ ~
* * ~ * ~
~ ~ ~ * ~
* * . ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 3
2
remaining attempt: 18
~ ~ ~ ~ ~
* * ~ * ~
~ ~ ~ * ~
* * * ~ ~
~ ~ ~ . .
Enter the X and Y coordinate of the cell you want to shoot : ? 4
3
remaining attempt: 17
~ ~ ~ ~ ~
* * ~ * ~
~ ~ ~ * ~
* * * ~ ~
~ ~ ~ * .
Enter the X and Y coordinate of the cell you want to shoot : ? 4
4
remaining attempt: 16

 END

~ ~ ~ ~ ~
* * ~ * ~
~ ~ ~ * ~
* * * ~ ~
~ ~ ~ * *

 CONGRATULATION YOU WIN :D

----------------------------------------------------------
Positionnez vous également à la racine du projet puis:
et mettez le test-1.7.jar dans la racine de projet

* CellTest.java
  - Pour compiler tapez la commande : `javac -classpath test-1.7.jar test/CellTest.java`

  - Pour lancer les tests toujours étant à la racine du projet tapez la commande : `java -jar test-1.7.jar CellTest`


* ShipTest.java
  - Pour compiler tapez la commande : `javac -classpath test-1.7.jar test/ShipTest.java`

  - Pour lancer les tests toujours étant à la racine du projet tapez la commande : `java -jar test-1.7.jar ShipTest`


* SeaTest.java
  - Pour compiler tapez la commande : `javac -classpath test-1.7.jar test
  /SeaTest.java`

  - Pour lancer les tests toujours étant à la racine du projet tapez la commande : `java -jar test-1.7.jar SeaTest`

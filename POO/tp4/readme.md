authors: Inas BEKKOUCHE Et Azzedine AIT ALI BELKACEM

Résumé
=======

Ce TP avait pour objectif de pouvoir manipuler les différentes étapes de la création d'un projet (à part coder les classes). Ce tp couvre les paquetages, la compilation, la génération de documentation, l'exécution des programmes et les archives JAR (exécutables et non exécutables)

La Documentation
=================

Pour générer la documentation il faut se placer dans le répertoire "src" et exécuter la commande `javadoc -d ../docs -subpackages example`

et la commande `javadoc -d ../docs -subpackages date` pour date


Pour voir la documentation générée il suffit de consulter le fichier "index.html" dans le répertoire docs résultant de la commande précédente.


Compilation des Classes
==========================

* Pour compiler et générer les fichiers .class du packtage example, placez-vous dans le répertoire src et exécutez la commande `javac example/Robot.java -d ../classes`. Les classes Box et ConveyerBelt sont compilées automatiquement et les fichiers .class seront mit dans le fichier classes.

* Pour compiler et générer les fichiers .class du packtage date, placez-vous dans le répertoire src et exécutez la commande `javac date/Date.java -d ../classes`,pour compiler la class Date

 * et la commande`javac date/Month.java -d ../classes`pour compiler la class Month. et les fichiers .class seront mit dans le fichier classes.


* Pour créer une archive .jar exécutable, placez vous dans la racine du projet et exécuez la commande:
      * pour le package example `jar cvfm appli.jar manifest-ex -C classes example`

      * pour le package date `jar cvfm appli.jar manifest-ex -C classes date`


Compilation et execution des Tests
===================================

Déplacez le fichier "test-1.7.jar" du répertoire "test" à la racine du projet. Et placez vous également dans la racine du projet.

* BoxTest.java :

    * Compiler grâce à la commande `javac -classpath test-1.7.jar test/BoxTest.java`

    * Lancer grâce à la commande `java -jar test-1.7.jar BoxTest`

* RobotTest.java :

    * Compiler grâce à la commande `javac -classpath test-1.7.jar test/RobotTest.java`

    * Lancer grâce à la commande `java -jar test-1.7.jar RobotTest`

* DateTest.java :
    * Compiler grâce à la commande `javac -classpath test-1.7.jar test/dateTest.java`

    * Lancer grâce à la commande `java -jar test-1.7.jar dateTest`

* TestMonth.java :
    * Compiler grâce à la commande `javac -classpath test-1.7.jar test/MonthTest.java`

    * Lancer grâce à la commande `java -jar test-1.7.jar MonthTest`


Exécution
==========
pour compiler la classe DateMain
* Placez vous dans classes et tapez la commande: `jar cvfm ../appli.jar ../manifest-ex date`
* Dans le cas du jar exécutable: placez-vous dans la racine du projet et exécutez la commande : `java -jar appli.jar`

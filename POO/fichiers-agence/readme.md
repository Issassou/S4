AUTEURS: Inas BEKKOUCHE ,Azzedine AIT ALI BELKACEM
********

TITRE DU PROJET: Agence de location
****************

Le projet consiste à créer une agence de location de véhicules.
Une agence de location de véhicules offre à ses clients la possibilité de choisir le véhicule loué en fonction de différents filtres.

Les véhicules sont définis par une marque (brand), un nom de modèle (model), une année de production (productionyear)  et  un  prix  de  location  à  la  journée  (daily  rental  price).
On peut trouver comme véhicules:
- Des voitures (cars), qui au plus des attributs cités ci-dessus sont définies par le nombre de passagers (passengers)
- Des motos (Motorbikes), qui au plus des attributs cités ci-dessus sont définis par la cylindrée (cubic capacity)

Il y a deux types d'agence de location:
- RentalAgency
- SuspiciousRentalAgency qui applique un surcoût de 10% sur les prix de location pour les conducteurs dont l'âge est inférieur à 25 ans.


OBJECTIFS:
**********
          - Manipuler les collections, maps
          - Comprendre la notion d'héritage et mettre en pratique ce qui a été vu en cour.

*****************************************************************************
POUR RÉCUPÉRER CE PROJET VEUILLEZ SUIVRE LES INSTRUCTIONS CI-DESSOUS:
=====================================================================

      Si vous avez déjà cloné ce projet:

          1_Positionnez vous dans le répertoire où se trouve le projet en utilisant la commande "cd" (le projet se trouve dans le dossier rental_agency).


          2_Vous devez télécharger le contenu du répertoire git et mettre à jour le répertoire local en utilisant la commande "git pull".

      Sinon, commencez par cloner le projet en utilisant la commande "git clone"

--------------------------------------------------------------

Génération de la doc :
======================
    Pour générer la documentation il faut se placer dans le répertoire "src" et exécuter la commande:

          `javadoc -author  -d ../docs -subpackages rental`

    Pour voir la documentation générée il suffit de consulter le fichier "index.html" dans le répertoire docs résultant de la commande précédente.

Compilation des sources du projet:
===================================

    Se positionner dans src puis tapez les commandes:

      `javac rental/Main.java -d ../classes`

      `javac rental/Main2.java -d ../classes`

    à l'issue de ces deux commandes tous les fichiers .java seront compilés et les .class générés. Ils se trouvent dans le dossier classes à la racine du projet.

Compilation et exécution des tests:
===================================
    Copiez "test-1.7.jar" du répertoire "test" à la racine du projet.
    Positionnez vous également à la racine du projet puis:

    * BrandFilterTest.java
      - Pour compiler tapez la commande : `javac -classpath test-1.7.jar test/rental/BrandFilterTest.java`

      - Pour lancer les tests toujours étant à la racine du projet tapez la commande : `java -jar test-1.7.jar rental.BrandFilterTest`


    * ClientTest.java
      - Pour compiler tapez la commande : `javac -classpath test-1.7.jar test/rental/ClientTest.java`

      - Pour lancer les tests toujours étant à la racine du projet tapez la commande : `java -jar test-1.7.jar rental.ClientTest`


    * MaxPriceFilterTest.java
      - Pour compiler tapez la commande : `javac -classpath test-1.7.jar test/rental/MaxPriceFilterTest.java`

      - Pour lancer les tests toujours étant à la racine du projet tapez la commande : `java -jar test-1.7.jar rental.MaxPriceFilterTest`

    * RentalAgencyTest.java
      - Pour compiler tapez la commande : `javac -classpath test-1.7.jar test/rental/RentalAgencyTest.java`

      - Pour lancer les tests toujours étant à la racine du projet tapez la commande : `java -jar test-1.7.jar rental.RentalAgencyTest`

    * SuspiciousRentalAgencyTest.java
      - Pour compiler tapez la commande : `javac -classpath test-1.7.jar test/rental/SuspiciousRentalAgencyTest.java`

      - Pour lancer les tests toujours étant à la racine du projet tapez la commande : `java -jar test-1.7.jar rental.SuspiciousRentalAgencyTest`

    * VehicleTest.java
      - Pour compiler tapez la commande : `javac -classpath test-1.7.jar test/rental/VehicleTest.java`

      - Pour lancer les tests toujours étant à la racine du projet tapez la commande : `java -jar test-1.7.jar rental.VehicleTest`

Génération du fichier .jar:
============================
    * Placez vous dans à la racine du projet.  


    * Copiez y le fichier manifest-ex (fourni sur le portail, figure dans les fichiers fournis pour le TP4) qui est un exemple de fichier de définition de manifest.

    * Ouvrez le vous y trouverez cette ligne "Main-Class: example.Robot" écrivez à la place "Main-Class: rental.Main" ou "Main-Class: rental.Main2" selon le main pour lequel vous voulez créer un jar exécutable.

    * Placez vous dans le dossier classes,  exécutez la commande `jar cvfm ../appli.jar ../manifest-ex rental`

Exécution du programme:
========================
    * Sans le jar exécutable :
        - Placez vous dans le dossier classes
        - Tapez la commande `java rental/Main` ou `java rental/Main2`
          selon le main que vous voulez executer

      * Avec le jar exécutable :
        - Placez vous à la racine du projet
        - Tapez la commande :  `java -jar appli.jar`

Labo 6 : TDD
=====

Objectifs
* Mettre en pratique le Test Driven Development (TDD)

L'objectif de cette démonstration est de vous initier au TDD à l'aide de JUnit. Vous implémenterez un peu de logique d'affaire après avoir écrit les tests unitaires associés.


Étapes classiques du TDD :

1. Rédiger un test unitaire pour une fonctionnalité qui n'existe pas.
2. Faire une implémentation dans le but de faire compiler le test et de le faire échouer.
3. Rédiger une première vraie implémentation de la fonctionnalité, sans se préoccuper de la qualité du code ou du design.
4. Faire du refactoring jusqu'à l'obtention d'un design satisfaisant.

Commencez par récupérer le projet GitHub suivant [INF2015-TDD](https://github.com/hugoscurti/INF2015-TDD) .

### Exercice 1 : Ajout d'une fonctionnalité à la classe _Membre_

La classe **Membre** représente un membre du centre sportif. On y stocke son nom, prénom et sa date d'inscription.
Nous voulons une fonctionnalité qui permet d'obtenir le numéro d'un membre. 

**REMARQUE** : Le numéro d'un membre est composé des trois premières lettres de son nom de famille suivi de la première lettre de son prénom (tout ça en majuscule), suivi de sa date d'inscription (en format AAMMJJ).

Exemple: Pour le membre *Hugo Scurti*, inscrit *le 04 mars 2012*, son numéro de membre est *SCUH120304*.

1. Dans la classe MembreTest, nous créerons un test pour cette fonctionnalité. Appelons ce test _**testObtenirNumeroMembre()**_.
    * Comme nous devrons instancier des dates, je vous ai mis dans la classe de test un objet _SimpleDateFormat_ qui vous sera utile pour les tests de la classe _Membre_.
2. Dans la classe Membre, écrivez la fonction **ObtenirNumeroMembre()** et faite-la retourner une valeur qui fera échouer le test (par exemple, retourner une chaîne vide).
    * Vérifiez que le test échoue réellement.
3. Implémentez pour vrai la fonction **ObtenirNumeroMembre()** pour que le test réussisse.
4. Refactorez la fonctionnalité jusqu'à temps que vous êtes satisfait du design!
    * Dans le cas de la fonction **ObtenirNumeroMembre()**, une possibilité de refactoring serrait de calculer la valeur du numero de membre lors de l'instanciation et de la stocker dans une variable, puis simplement retourner la valeur stocké lors de l'appel de la fonction.

### Exercice 2 : Ajout d'une autre fonctionalités de la classe _Membre_

C'est à votre tour d'implémenter la fonctionnalités suivante (en utilisant la méthode TDD, bien sûr!) :

**Obtenir le nombre d'années que le membre est inscrit au centre sportif.**

Cette fonctionnalité permet de calculer le nombre d'années que le membre est inscrit au centre sportif.
Par exemple, pour un membre qui est inscrit depuis le 12 mars 2013, ce fera un an qu'il est inscrit à partir du 12 mars 2014(On peu comme on calcule l'âge de quelqu'un en fonction de sa date de naissance).
* Allez-y avec les mêmes étapes qu'à l'exercice 1.
* Conseil : pour comparer des dates, vous pouvez vous instancier deux Objets Calendar, puis comparer les années, les mois et les jours de chacun.


### Exercice 3 : Ajout de fonctionalités de la classe _Cours_
On désire implémenter des fonctionnalités à la classe **Cours**. Cette classe représente un cours qui se donne au centre sportif (Par exemple, du Yoga!). Familiarisez-vous d'abord avec le code.

Ensuite, on désire implémenter les fonctionnalités suivantes : 

1. Ajouter un membre au cours
2. Retirer un membre au cours
3. Calculer la moyenne d'ancienneté des membres inscrits au cours
4. Vérifier si un membre est inscrit au cours

Comme aux exercices précédents, utilisez le TDD pour implémenter chaque fonctionnalité.


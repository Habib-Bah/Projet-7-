# Projet-7-
Système d'information d'une bibliothèque

## Organisation du répertoire

* scr/main/java : répertoire relatif au code source de l'application

* scr/main/ressouces : répertoire relatif au fichier presistance.xml qui nous fournit la configuration minimale requise pour Hibernate.


## Environnement de développement

Il comporte :

*   une base de données _PostgreSQL_ contenant un jeu de données de démo (`jdbc:postgresql://localhost:5432/bibliotheque`)

* Un Web Service dont l'adresse est : (`http://localhost:8686/BibliotequeVilleWS?wsdl`)

* Un Client qui consomme le Web Service

## Deploiement de l'application

Pour deployer l'application, placez vous sur le repertoire racine de l'application puis faites un maven clean puis install.
Recupéré le war généré dans le fichier target puis rajouter le dans la racine de votre serveur.
Lancer l'application à partir de votre serveur.
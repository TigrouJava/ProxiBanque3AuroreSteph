	************************************
*****         ProxiBanque3AuroreSteph	       *****
	************************************

Concepteurs/développeurs:

	Aurore LIONS
	Stéphanie WOERNER

Date : 17 aout 2017

Version : version 3 de ProxiBanque


	************************************ 
*****      	     Livrables  	        *****
	************************************

Les documents livrés sont :


1) Le dossier "conception" contenant les diagrammes de cas d'utilisation, classes, déploiement ainsi que le diagramme du modèle en couche.

2) Le lien github permettant de récupérer le projet : https://github.com/Lionaur/ProxiBanque3AuroreSteph.git.

3) Le dossier "javadoc".

4) Le fichier ProxiBanque3AuroreSteph.sql, qui est le script permettant la création de la base de données nécessaire au fonctionnement de l'application

5) Le fichier ProxiBanque3AuroreSteph.war

6) La base de données ProxiBanque3AuroreSteph.sql

7) Le fichier readme.txt



	************************************
*****  	    Description de l'application:   	*****
	************************************

ProxibanqueSI est une application bancaire.
Après connexion à ProxibanqueSI, le conseiller de clientèle peut créer, lire ou modifier les informations relatives à un client. Le logiciel permet également au conseiller de récupérer une liste de clients.


	************************************
*****  	          Documentation:	        *****
	************************************

Pour avoir accès à la documentation veuillez suivre les indications suivantes :

1) Ouvrez le dossier 'javadoc'.

2) Double cliquez sur 'index.html'.




	************************************
*****  	          Installation de Git:	        *****
	************************************

Il est nécessaire d'installer Git afin de récupérer le projet sur github.

1) Télécharger git : https://git-scm.com
2) Installer git.



	************************************
*****  	         Récupération sur GitHub	*****
	************************************

Pour récupérer l'application sur Github à partir du lien github, vous devez procéder de la sorte :

1) Ouvrir la console Git Bash.

2) Cloner le projet :
	
	a) Se placer à l'endroit où vous voulez récupérer le projet et créer un dossier (par exemple pour se mettre sur le disque C: et y faire un dossier "test") vous devez taper sur la console : 
		cd C:
		entrée
		mkdir test
		entrée

	b) Cloner le projet depuis le lien donné ci dessus (le lien sera nommer url par la suite) :
	 	git clone url
		git add .



	*****************************************
*****  	  Installation du serveur d'application    *****
	*****************************************

Un serveur d'application est nécessaire pour que fonctionne ProxibanqueSI. Il assure le lien entre les parties Java, base de données et web de ProxibanqueSI.

1) Télécharger le serveur d'application Tomcat version 8.0.45 sur le site suivant : http://tomcat.apache.org/
Pour le téléchargement, choisissez l'option zip dans la liste Core. Une fois le téléchargement effectué, dézippez l'archive zip.

2) Mettez à jour la variable d'environnement de la JDK : 
- Menu Démarrer, clic droit sur Ordinateur, clic gauche sur le champ "propriétés"
- Clic gauche sur le champ Paramètres système avancés, puis sur le bouton Variables d'environnement
- Sous le champ Variables utilisateur, clic gauche sur le bouton Nouvelle...
- Dans le champ Nom de la variable, entrez JAVA_HOME
- Dans le champ Valeur de la variable, entrez le chemin d'accès à la JDK.

3) Double-cliquez sur le fichier bin/startup.bat : la console s'ouvre, et Tomcat démarre.

4) Intégration de Tomcat dans l'interface Eclipse Entreprise :
- Cliquez sur l'onglet File, sélectionnez l'option New puis l'option Other
- Choisir Server/Server puis cliquez sur Next
- Choisir Apache/Tomcat v8.0 Server, puis cliquez sur Next
- Cliquez sur Browse puis naviguez jusqu'au répertoire d'installation de Tomcat
- Cliquez sur Finish.


	************************************
*****  	    Importer la base de données   	*****
	************************************

Pour importer la base de données de ProxiBanque3AuroreSteph, veuillez suivre les étapes suivantes :

1) Enregistrez le fichier proxibanque3auroresteph.sql sur votre PC.

Télécharger la version du logiciel Xampp correspondant à votre système d'exploitation (Windows, Linux...) à l'adresse suivante : https://www.apachefriends.org/fr/index.html

2) Installer Xampp, en sélectionnant les modules Apache, MySQL, Tomcat, FileZilla et Mercury.

3) Ouvrir Xampp, et démarrer les modules Apache et MySQL.

4) Appuyez sur le bouton Admin du module MySQL, une page de gestion des bases de données s'ouvre dans votre navigateur par défaut.

5) Importer la base de donnée ProxiBanque3AuroreSteph.sql

	
	************************************
***** 	     Execution de l'application:    	*****
	************************************

Veuillez suivre les indications suivantes:
	
1) Copier le fichier ProxiBanque3AuroreSteph.war dans le dossier de déploiement de Tomcat (apache-tomcat\webapps). 

2) Par défaut le login et mot de passe sont "tomcat" et "tomcat". 
(s'il y a un probleme il faut reconfigurer le role tomcat (ctrl+shift+r sous eclipse)
Selectionner tomcat-user.xml
Changer les password par "tomcat")
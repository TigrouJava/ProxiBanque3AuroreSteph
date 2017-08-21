	************************************
*****         ProxiBanque3AuroreSteph	       *****
	************************************

Concepteurs/d�veloppeurs:

	Aurore LIONS
	St�phanie WOERNER

Date : 17 aout 2017

Version : version 3 de ProxiBanque


	************************************ 
*****      	     Livrables  	        *****
	************************************

Les documents livr�s sont :


1) Le dossier "conception" contenant les diagrammes de cas d'utilisation, classes, d�ploiement ainsi que le diagramme du mod�le en couche.

2) Le lien github permettant de r�cup�rer le projet : https://github.com/Lionaur/ProxiBanque3AuroreSteph.git.

3) Le dossier "javadoc".

4) Le fichier ProxiBanque3AuroreSteph.sql, qui est le script permettant la cr�ation de la base de donn�es n�cessaire au fonctionnement de l'application

5) Le fichier ProxiBanque3AuroreSteph.war

6) La base de donn�es ProxiBanque3AuroreSteph.sql

7) Le fichier readme.txt



	************************************
*****  	    Description de l'application:   	*****
	************************************

ProxibanqueSI est une application bancaire.
Apr�s connexion � ProxibanqueSI, le conseiller de client�le peut cr�er, lire ou modifier les informations relatives � un client. Le logiciel permet �galement au conseiller de r�cup�rer une liste de clients.


	************************************
*****  	          Documentation:	        *****
	************************************

Pour avoir acc�s � la documentation veuillez suivre les indications suivantes :

1) Ouvrez le dossier 'javadoc'.

2) Double cliquez sur 'index.html'.




	************************************
*****  	          Installation de Git:	        *****
	************************************

Il est n�cessaire d'installer Git afin de r�cup�rer le projet sur github.

1) T�l�charger git : https://git-scm.com
2) Installer git.



	************************************
*****  	         R�cup�ration sur GitHub	*****
	************************************

Pour r�cup�rer l'application sur Github � partir du lien github, vous devez proc�der de la sorte :

1) Ouvrir la console Git Bash.

2) Cloner le projet :
	
	a) Se placer � l'endroit o� vous voulez r�cup�rer le projet et cr�er un dossier (par exemple pour se mettre sur le disque C: et y faire un dossier "test") vous devez taper sur la console : 
		cd C:
		entr�e
		mkdir test
		entr�e

	b) Cloner le projet depuis le lien donn� ci dessus (le lien sera nommer url par la suite) :
	 	git clone url
		git add .



	*****************************************
*****  	  Installation du serveur d'application    *****
	*****************************************

Un serveur d'application est n�cessaire pour que fonctionne ProxibanqueSI. Il assure le lien entre les parties Java, base de donn�es et web de ProxibanqueSI.

1) T�l�charger le serveur d'application Tomcat version 8.0.45 sur le site suivant : http://tomcat.apache.org/
Pour le t�l�chargement, choisissez l'option zip dans la liste Core. Une fois le t�l�chargement effectu�, d�zippez l'archive zip.

2) Mettez � jour la variable d'environnement de la JDK : 
- Menu D�marrer, clic droit sur Ordinateur, clic gauche sur le champ "propri�t�s"
- Clic gauche sur le champ Param�tres syst�me avanc�s, puis sur le bouton Variables d'environnement
- Sous le champ Variables utilisateur, clic gauche sur le bouton Nouvelle...
- Dans le champ Nom de la variable, entrez JAVA_HOME
- Dans le champ Valeur de la variable, entrez le chemin d'acc�s � la JDK.

3) Double-cliquez sur le fichier bin/startup.bat : la console s'ouvre, et Tomcat d�marre.

4) Int�gration de Tomcat dans l'interface Eclipse Entreprise :
- Cliquez sur l'onglet File, s�lectionnez l'option New puis l'option Other
- Choisir Server/Server puis cliquez sur Next
- Choisir Apache/Tomcat v8.0 Server, puis cliquez sur Next
- Cliquez sur Browse puis naviguez jusqu'au r�pertoire d'installation de Tomcat
- Cliquez sur Finish.


	************************************
*****  	    Importer la base de donn�es   	*****
	************************************

Pour importer la base de donn�es de ProxiBanque3AuroreSteph, veuillez suivre les �tapes suivantes :

1) Enregistrez le fichier proxibanque3auroresteph.sql sur votre PC.

T�l�charger la version du logiciel Xampp correspondant � votre syst�me d'exploitation (Windows, Linux...) � l'adresse suivante : https://www.apachefriends.org/fr/index.html

2) Installer Xampp, en s�lectionnant les modules Apache, MySQL, Tomcat, FileZilla et Mercury.

3) Ouvrir Xampp, et d�marrer les modules Apache et MySQL.

4) Appuyez sur le bouton Admin du module MySQL, une page de gestion des bases de donn�es s'ouvre dans votre navigateur par d�faut.

5) Importer la base de donn�e ProxiBanque3AuroreSteph.sql

	
	************************************
***** 	     Execution de l'application:    	*****
	************************************

Veuillez suivre les indications suivantes:
	
1) Copier le fichier ProxiBanque3AuroreSteph.war dans le dossier de d�ploiement de Tomcat (apache-tomcat\webapps). 

2) Par d�faut le login et mot de passe sont "tomcat" et "tomcat". 
(s'il y a un probleme il faut reconfigurer le role tomcat (ctrl+shift+r sous eclipse)
Selectionner tomcat-user.xml
Changer les password par "tomcat")
# Exercice technique L'argus
## Build:

S'assurer que [java 8](https://www.oracle.com/fr/java/technologies/javase/javase-jdk8-downloads.html) et [maven](https://maven.apache.org/download.cgi) sont bien installé sur votre machine.
* Sous le dossier argus exécuter la commande suivante mvn spring-boot:run .
* L'application va tourner sur le port 8080 s'assurer qu'il est libre.

## Dépendences:
	Dans cet projet, j'ai utilisé differents dépendences/librairies.
	Je me suis basé sur le framework springboot, 
	c'est un framework open-source qui se base sur les principes 
	de l'injection de dépendence et de l'inversion de controle.
[ Documentation Spring boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
	
* [Swagger](https://swagger.io/docs/) : C'est une dépendence qui sert à documenter les apis
* [Junit](https://junit.org/junit5/docs/current/user-guide/): C'est une dépendence pour les tests
* [JavaMelody](https://github.com/javamelody/javamelody/wiki/UserGuide): C'est une dépendence qui permet d'avoir des
statistiques sur les differents requettes http.

## URLs:

* GET http://localhost:8080/api/v1/fizzbuzz?firstVal=2&secondVal=5&limit=10&firstStr=fizz&secondStr=buzz

	Ceci est la premiere méthode pour implémenter la solution

* POST http://localhost:8080/api/v1/fizzbuzz

	Ceci est la deuxieme méthode pour implémenter la solution

* Pour accéder à la documentation et tester les APIs consulter http://localhost:8080/swagger-ui.html

* Pour accéder au réquetes les plus fréquents consultez http://localhost:8080/monitoring 

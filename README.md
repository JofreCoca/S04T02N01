Descripció - Enunciat de Tasca S4.02 Api Rest amb Spring boot

Exercici 1 nivell 1

Aquesta tasca consisteix en la creació d’una API RESTful que implementi operacions CRUD (Create, Read, Update, Delete) sobre una entitat anomenada Fruita, utilitzant Spring Boot i la base de dades H2. També es treballarà amb els verbs HTTP i la gestió dels codis de resposta.

Fases de l’exercici:

Creació del projecte Spring Boot
Accedir a Spring Initializr i generar un projecte amb les següents característiques:
Gestor de dependències: Maven o Gradle

Llenguatge: Java
Spring Boot: Darrera versió estable
Metadades del projecte:
Group: cat.itacademy.s04.t02.n01
Artifact/Name/Description: S04T02N01
Package name: cat.itacademy.s04.t02.n01
Packaging: Jar
Java: Mínim versió 11
Dependències:
Spring Boot DevTools
Spring Web
Spring Data JPA
H2 Database
Definició de l'entitat Fruita

Crear una classe Fruita amb els següents atributs:
int id
String nom
int quantitatQuilos
Persistir aquesta entitat en H2 utilitzant Spring Data JPA.
Estructura de packages MVC
Seguint el patró Model-View-Controller (MVC), es crearan els següents packages:
controllers → Per gestionar les peticions HTTP.
model → Contindrà la classe Fruita.
services → Per gestionar la lògica de negoci.
repository → Per comunicar-se amb la base de dades.
exception → Per gestionar errors personalitzats.
Implementació del CRUD a FruitaController
Es crearan els següents endpoints en FruitaController:
POST /fruita/add → Afegir una nova fruita.
PUT /fruita/update → Actualitzar una fruita existent.
DELETE /fruita/delete/{id} → Eliminar una fruita per ID.
GET /fruita/getOne/{id} → Consultar una fruita per ID.
GET /fruita/getAll → Obtenir totes les fruites.

Aquest exercici permetrà consolidar coneixements en Spring Boot, bases de dades H2, el patró MVC, i les operacions CRUD utilitzant Spring Data JPA.
Tecnologies Utilitzades

IntelliJ, Spring boot, base de datos H2, postman, Git and GitHub

Requisits Nothing

Instal·lació 

Postman

Execució Nothing

Desplegament Nothing

-Contribucions

Nothing

# Student Tracker

## Présentation
Student Tracker est une API REST développée avec Spring Boot dans le cadre du TP04.

Cette application permet de consulter des informations sur des étudiants et de gérer les erreurs liées aux requêtes HTTP.

## Technologies utilisées
- Java 25
- Spring Boot
- Spring Web
- Maven

## Fonctionnalités
- Vérifier le fonctionnement de l'API avec `/api/hello`.
- Afficher la liste des étudiants avec `GET /api/students`.
- Consulter un étudiant par son identifiant avec `GET /api/students/{studentId}`.
- Gérer les étudiants introuvables avec une réponse HTTP 404.
- Gérer les autres erreurs avec une réponse HTTP 400.
- Centraliser la gestion des exceptions avec `@ControllerAdvice`.

## Lancement du projet

Cloner le dépôt :

```bash
git clone URL_DU_DEPOT
```

Accéder au dossier :

```bash
cd student-tracker
```

Lancer l'application sous Windows :

```powershell
.\mvnw.cmd spring-boot:run
```

L'application sera accessible à l'adresse :

`http://localhost:8080`

## Endpoints

| Méthode | URL | Description |
|---|---|---|
| GET | `/api/hello` | Message de bienvenue |
| GET | `/api/students` | Liste des étudiants |
| GET | `/api/students/{studentId}` | Consulter un étudiant |

## Gestion des erreurs
- 404 : étudiant introuvable.
- 400 : requête incorrecte.

## Auteur
Projet réalisé dans le cadre du TP04 — API REST et gestion des exceptions.
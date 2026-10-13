# StartupMeu Task Manager (React + Java + Spring Boot + MySQL)

Beginner-friendly CRUD app: add, list, edit, delete, and complete tasks. React uses fetch() to call Spring Boot REST APIs; Spring Data JPA stores data in MySQL.

## Requirements
- JDK 17+
- Node.js + npm
- MySQL Server and MySQL Workbench

## 1. Database
In MySQL Workbench run:
```sql
CREATE DATABASE startupmeu_tasks;
```

## 2. Backend
Edit `backend/src/main/resources/application.properties` and replace `YOUR_MYSQL_PASSWORD` with your local MySQL password. Keep it private.
Open terminal in `backend` and run `mvn spring-boot:run` (Maven must be installed). API: http://localhost:8080. Spring Boot creates the `tasks` table automatically.

## 3. Frontend
Open a second terminal in `frontend` and run:
```bash
npm install
npm run dev
```
Open the URL shown, usually http://localhost:5173.

## API
- GET `/api/tasks` list
- POST `/api/tasks` create
- PUT `/api/tasks/{id}` update
- PATCH `/api/tasks/{id}/toggle` complete/pending
- DELETE `/api/tasks/{id}` delete

## Test
Add task, submit empty title, edit, toggle status, delete, refresh, then check `tasks` in MySQL Workbench.

## GitHub
Create a public repo and run from project root:
```bash
git init
git add .
git commit -m "Build React Spring Boot task manager"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/startupmeu-task-manager.git
git push -u origin main
```
Replace URL with your own. Never commit passwords.

## Code0 requirement
StartupMeu asks you to use Code0 and document 3–5 real tasks. Install the extension and actually use it before claiming you did. Suggested tasks: explain entity/repository; review title validation; trace API errors; review edit/delete handlers; suggest responsive CSS improvement. Test its suggestions and update this README with your actual experience.

**Important:** This uses Java/Spring Boot/MySQL instead of the MongoDB/Express/Node backend requested in the email. Ask the recruiter whether this alternative stack is acceptable before submitting.
# StartupMeu Task Manager

A full-stack Task Management application built using React.js, Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL. This project provides a simple interface to create, view, update, delete, and complete tasks.

## Features

- Add tasks with a title and description.
- View all tasks.
- Edit existing tasks.
- Delete tasks.
- Mark tasks as completed or pending.
- Display total, completed, and pending task counts.
- Store task data in a MySQL database.
- Communicate between the frontend and backend using REST APIs.

## Technology Stack

**Frontend**

- React.js
- JavaScript
- HTML5
- CSS3
- Vite

**Backend**

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven

**Database**

- MySQL
- MySQL Workbench

## Project Structure

```text
startupmeu-java-mysql-task-manager/
├── backend/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com/startupmeu/taskmanager/
│   │       │       ├── controller/
│   │       │       ├── model/
│   │       │       ├── repository/
│   │       │       └── TaskManagerApplication.java
│   │       └── resources/
│   │           └── application.properties
│   └── pom.xml
├── frontend/
│   ├── src/
│   │   ├── App.jsx
│   │   ├── main.jsx
│   │   └── style.css
│   ├── index.html
│   └── package.json
├── .gitignore
└── README.md
```

## Prerequisites

Install the following software:

- Java JDK 17 or the version required by the project.
- Node.js and npm.
- MySQL Server.
- MySQL Workbench.
- Git.

## Database Setup

1. Start MySQL Server.
2. Open MySQL Workbench and connect to your local MySQL instance.
3. Create the database:

```sql
CREATE DATABASE startupmeu_task;
```

4. Open `backend/src/main/resources/application.properties`.
5. Configure the database name, username, and password to match your MySQL setup.

Example configuration:

```properties
server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/startupmeu_task
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Replace `YOUR_MYSQL_PASSWORD` with your actual local MySQL password. Never upload real credentials to GitHub.

**Note:** The database name in this example must match the database name configured in your actual project.

## How to Run the Application

### 1. Start the Backend

Open a terminal in the main project directory and execute:

```bash
cd backend
mvn spring-boot:run
```

Backend URL:

http://localhost:8080

### 2. Start the Frontend

Open a second terminal and execute:

```bash
cd frontend
npm install
npm run dev
```

Open the application in your browser:

**Frontend URL:** http://localhost:5173

Make sure Vite is running on port 5173. If it selects another port, use the URL displayed in the terminal.

## REST API Endpoints

The backend provides task management APIs under `/api/tasks`.

| HTTP Method | Endpoint          | Description             |
| ----------- | ----------------- | ----------------------- |
| GET         | `/api/tasks`      | Retrieve all tasks      |
| POST        | `/api/tasks`      | Create a new task       |
| PUT         | `/api/tasks/{id}` | Update an existing task |
| DELETE      | `/api/tasks/{id}` | Delete a task           |

Base API URL:

http://localhost:8080/api/tasks

## Database Model

Task records contain the following information:

- **id:** Unique task identifier.
- **title:** Task title.
- **description:** Optional task description.
- **completed:** Indicates whether the task is completed.
- **createdAt:** Timestamp indicating when the task was created.

The exact schema and field types depend on the entity class and JPA configuration in the project.

## Error Handling and Connectivity

- Ensure MySQL Server is running before starting the backend.
- Verify that the database credentials are correct.
- Ensure Spring Boot starts successfully on port 8080.
- Ensure the React frontend uses the correct backend API URL.
- Configure CORS to allow requests from `http://localhost:5173`.

## GitHub Repository

Source code:

https://github.com/jagadeesh17409/startupmeu-java-mysql-task-manager

## Future Improvements

- Add user authentication.
- Introduce task deadlines and priorities.
- Improve validation and error messages.
- Deploy the application for public access.

## Author

**Jagadeesh**

Full-Stack Development Project

## License

This project is intended for learning and demonstration purposes.

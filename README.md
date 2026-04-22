# 🧾 Task Manager API (Spring Boot)

A backend REST API for managing tasks using Spring Boot and PostgreSQL.

---

## 🚀 Features

- Create Task (POST /tasks)
- Get All Tasks (GET /tasks)
- Update Task (PUT /tasks/{id})
- Delete Task (DELETE /tasks/{id})
- Validation using @NotBlank
- Global Exception Handling

---

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

---

## 📌 API Endpoints

### ➕ Create Task
POST /tasks

```json
{
  "title": "Learn Spring",
  "description": "Practice project",
  "priority": "HIGH"
}

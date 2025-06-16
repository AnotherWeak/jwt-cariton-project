
<div align="center">

# 🔐 API Segura com Spring Boot e JWT

Um projeto acadêmico voltado para o desenvolvimento de uma API RESTful com autenticação e autorização utilizando JSON Web Tokens (JWT). O objetivo é construir uma aplicação back-end segura e eficiente com as tecnologias do ecossistema Spring.

<img src="https://img.shields.io/badge/Spring_Boot-3.3.0-6DB33F?style=for-the-badge&logo=spring-boot" />
<img src="https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=openjdk" />
<img src="https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql" />
<img src="https://img.shields.io/badge/Status-Concluído-4CAF50?style=for-the-badge" />
</div>

---

## 📌 Visão Geral

Este projeto foi desenvolvido para aplicar conceitos de segurança em APIs, permitindo que usuários com diferentes permissões interajam com o sistema. A autenticação é feita via JWT, desde o registro do usuário até o controle de acesso por papéis. Envolve desde a configuração inicial até o deploy local com banco de dados MySQL.

---

## 🧰 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Security**
- **JWT (JSON Web Tokens)**
- **MySQL 8.0**
- **Maven**

---

## ⚙️ Passo a Passo para Rodar

Siga os passos abaixo para executar o projeto localmente:

```bash
# Clone este repositório
git clone https://github.com/seu-usuario/seu-repositorio.git

# Acesse o diretório do projeto
cd nome-do-projeto

# Configure o arquivo application.properties com:
# - Dados do seu banco MySQL
# - Uma chave secreta para o JWT

# Execute com o Maven
mvn spring-boot:run

# A API ficará disponível em: http://localhost:8080
```

---

## 🔗 Endpoints Disponíveis

### 📥 Registro de Usuário

`POST /api/auth/register`  
Registra um novo usuário.  
**Acesso:** Público  
**Exemplo de JSON:**
```json
{
  "name": "Cáriton Vilasanti",
  "email": "cvilasanti@email.com",
  "password": "senha123",
  "role": "ROLE_USER"
}
```

---

### 🔓 Login

`POST /api/auth/login`  
Realiza a autenticação e retorna o token JWT.  
**Acesso:** Público  
**Exemplo de JSON:**
```json
{
  "email": "cvilasanti@email.com",
  "password": "senha123"
}
```

---

### 👤 Perfil do Usuário

`GET /api/users/me`  
Retorna as informações do usuário autenticado.  
**Acesso:** USER ou ADMIN  
**Requer:** Header com token JWT válido

---

### 👥 Listagem de Usuários (Admin)

`GET /api/admin/users`  
Lista todos os usuários cadastrados.  
**Acesso:** Apenas ADMIN  
**Requer:** Token JWT de administrador

---

> Desenvolvido por **Cáriton Vilasanti**

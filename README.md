# 📚 Sistema de Livros – API REST

Projeto desenvolvido utilizando Java e Spring Boot, com o objetivo de construir uma API REST para gerenciamento de autores e livros.

O desenvolvimento será dividido em três partes, acompanhando a evolução da aplicação e a implementação de novas funcionalidades.

## 🚀 Parte 01 – CRUD de Autores

Nesta primeira etapa, foi desenvolvida a entidade `Autor` e implementada uma API REST com operações CRUD (Create, Read, Update e Delete), permitindo o gerenciamento dos registros de autores.

### Funcionalidades

- Testar a comunicação com a API;
- Cadastrar autores;
- Listar todos os autores;
- Buscar autor por ID;
- Atualizar informações de um autor;
- Excluir autores.

### 🛠️ Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- H2 Database

### 📌 Estrutura da entidade Autor

| Atributo | Descrição |
|---|---|
| id | Identificador gerado automaticamente |
| nome | Nome do autor |

### 📍 Endpoints

Todos os endpoints utilizam o prefixo `/autor`.

| Método HTTP | Endpoint | Descrição | Resposta |
|---|---|---|---|
| GET | `/autor/teste` | Testar a API | 200 OK |
| POST | `/autor` | Cadastrar autor | 201 Created |
| GET | `/autor` | Listar autores | 200 OK |
| GET | `/autor/{id}` | Buscar autor por ID | 200 OK / 404 Not Found |
| PUT | `/autor/{id}` | Atualizar autor | 200 OK / 404 Not Found |
| DELETE | `/autor/{id}` | Excluir autor | 204 No Content / 404 Not Found |

### 🎥 Vídeo da Parte 01

Confira o desenvolvimento desta etapa no YouTube:

[Assistir ao vídeo – Criando API REST | Sistema de Livros – Parte 01](https://youtu.be/SSyVOuQ1EoQ?si=weo_70NjpqjIwppR)

### 📖 Próximas etapas

- **Parte 01:** Criação da entidade Autor e implementação do CRUD.
- **Parte 02:** Criação da entidade Livro e implementação do relacionamento entre autores e livros.
- **Parte 03:** Migração do banco de dados H2 para PostgreSQL.

### 🎯 Objetivo

Praticar conceitos de desenvolvimento Backend, construção de APIs REST, persistência de dados e relacionamento entre entidades utilizando o ecossistema Java.

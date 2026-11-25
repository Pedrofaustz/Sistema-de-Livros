# 📚 Sistema de Livros – API REST

Projeto desenvolvido utilizando Java e Spring Boot para praticar a construção de uma API REST para gerenciamento de autores e livros.

O projeto foi desenvolvido em duas partes, acompanhando a implementação das funcionalidades e a evolução do banco de dados.

##  Parte 01 – CRUD de Autores

Nesta primeira etapa, criei a entidade `Autor` e desenvolvi as operações CRUD (Create, Read, Update e Delete).

### Funcionalidades

- Testar a comunicação com a API;
- Cadastrar autores;
- Listar todos os autores;
- Buscar autor por ID;
- Atualizar informações de um autor;
- Excluir autores.

###  Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- H2 Database

###  Estrutura da entidade Autor

| Atributo | Descrição |
|---|---|
| id | Identificador gerado automaticamente |
| nome | Nome do autor |

###  Endpoints

Todos os endpoints utilizam o prefixo `/autor`.

| Método HTTP | Endpoint | Descrição | Resposta |
|---|---|---|---|
| GET | `/autor/teste` | Testar a API | 200 OK |
| POST | `/autor` | Cadastrar autor | 201 Created |
| GET | `/autor` | Listar autores | 200 OK |
| GET | `/autor/{id}` | Buscar autor por ID | 200 OK / 404 Not Found |
| PUT | `/autor/{id}` | Atualizar autor | 200 OK / 404 Not Found |
| DELETE | `/autor/{id}` | Excluir autor | 204 No Content / 404 Not Found |

###  Vídeo da Parte 01

[Assistir ao vídeo – Criando API REST | Sistema de Livros – Parte 01](https://youtu.be/SSyVOuQ1EoQ?si=weo_70NjpqjIwppR)

---

##  Parte 02 – Livros, Relacionamento e PostgreSQL

Na segunda parte, criei a entidade `Livro` e implementei as mesmas operações CRUD da entidade `Autor`.

Comecei testando as funcionalidades com o H2 Database. Depois, fiz a migração para PostgreSQL e implementei o relacionamento entre autores e livros, finalizando a aplicação com tudo funcionando no novo banco de dados.

### Funcionalidades

- Criar e cadastrar livros;
- Listar todos os livros;
- Buscar livro por ID;
- Atualizar informações de um livro;
- Excluir livros;
- Relacionar livros aos seus respectivos autores;
- Migrar do H2 Database para PostgreSQL.

###  Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- PostgreSQL
- Git e GitHub

### Relacionamento entre as entidades

Foi implementado um relacionamento **One-to-Many (1:N)**:

- Um autor pode ter vários livros;
- Cada livro pertence a um autor.

###  Vídeo da Parte 02

[Assistir ao vídeo – Sistema de Livros | Parte 02](https://youtu.be/jcxlKPzr2ZY)

---

## Etapas

- **Parte 01:** CRUD de Autores.
- **Parte 02:** CRUD de Livros, relacionamento entre autores e livros e migração para PostgreSQL.

## Objetivo

Praticar desenvolvimento Backend com Java e Spring Boot, trabalhando com APIs REST, operações CRUD, relacionamentos entre entidades e bancos de dados.

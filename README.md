# Documentação da API RESTful para Gerenciamento de Calopsitas

Esta API permite operações CRUD (Create, Read, Update, Delete) para gerenciamento de registros de calopsitas.

## Base URL

https://sua-url.com/api/calopsitas

shell
Copy code

## Endpoints

### Listar todas as Calopsitas

GET /api/calopsitas

csharp
Copy code

Retorna uma lista de todas as calopsitas registradas.

#### Parâmetros da Consulta

Nenhum.

#### Resposta de Sucesso

- **Código:** 200 OK
- **Corpo:**
  ```json
  [
    {
      "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
      "nome": "Polly",
      "idade": 2,
      "cor": "verde"
    },
    {
      "id": "7f9f00e1-2f5d-4cbb-927c-bc15610c10e5",
      "nome": "Paco",
      "idade": 1,
      "cor": "azul"
    }
    ...
  ]
Obter uma Calopsita por ID
bash
Copy code
GET /api/calopsitas/{id}
Retorna os detalhes de uma calopsita específica pelo seu ID.

Parâmetros de Rota
id (string): O ID único da calopsita.
Resposta de Sucesso
Código: 200 OK
Corpo:
json
Copy code
{
"id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
"nome": "Polly",
"idade": 2,
"cor": "verde"
}
Criar uma nova Calopsita
bash
Copy code
POST /api/calopsitas
Cria uma nova entrada de calopsita.

Parâmetros do Corpo
nome (string, obrigatório): Nome da calopsita.
idade (integer, obrigatório): Idade da calopsita.
cor (string, obrigatório): Cor da calopsita.
Resposta de Sucesso
Código: 201 Created
Corpo:
json
Copy code
{
"id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
"nome": "Polly",
"idade": 2,
"cor": "verde"
}
Atualizar uma Calopsita
bash
Copy code
PUT /api/calopsitas/{id}
Atualiza os detalhes de uma calopsita existente pelo seu ID.

Parâmetros de Rota
id (string): O ID único da calopsita.
Parâmetros do Corpo
Pode incluir qualquer combinação dos seguintes campos:

nome (string): Nome atualizado da calopsita.
idade (integer): Idade atualizada da calopsita.
cor (string): Cor atualizada da calopsita.
Resposta de Sucesso
Código: 200 OK
Corpo:
json
Copy code
{
"id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
"nome": "Polly",
"idade": 3,
"cor": "azul"
}
Deletar uma Calopsita
bash
Copy code
DELETE /api/calopsitas/{id}
Remove uma calopsita específica pelo seu ID.

Parâmetros de Rota
id (string): O ID único da calopsita.
Resposta de Sucesso
Código: 204 No Content
Dependências Utilizadas
Spring Boot
Maven
UUID
Flyway
Lombok
PostgreSQL
Autor
Esta API foi desenvolvida por Matheus Alves Barroso (matheus.alvsbarroso@gmail.com).

RESTful API Documentation for Cockatiel Management
This API allows CRUD (Create, Read, Update, Delete) operations for managing cockatiel records.

Base URL
arduino
Copy code
https://your-url.com/api/cockatiels
Endpoints
List All Cockatiels
bash
Copy code
GET /api/cockatiels
Returns a list of all registered cockatiels.

Query Parameters
None.

Success Response
Code: 200 OK
Body:
json
Copy code
[
{
"id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
"name": "Polly",
"age": 2,
"color": "green"
},
{
"id": "7f9f00e1-2f5d-4cbb-927c-bc15610c10e5",
"name": "Paco",
"age": 1,
"color": "blue"
}
...
]
Get Cockatiel by ID
bash
Copy code
GET /api/cockatiels/{id}
Returns details of a specific cockatiel by its ID.

Route Parameters
id (string): The unique ID of the cockatiel.
Success Response
Code: 200 OK
Body:
json
Copy code
{
"id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
"name": "Polly",
"age": 2,
"color": "green"
}
Create a New Cockatiel
bash
Copy code
POST /api/cockatiels
Creates a new cockatiel entry.

Request Body Parameters
name (string, required): The name of the cockatiel.
age (integer, required): The age of the cockatiel.
color (string, required): The color of the cockatiel.
Success Response
Code: 201 Created
Body:
json
Copy code
{
"id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
"name": "Polly",
"age": 2,
"color": "green"
}
Update a Cockatiel
bash
Copy code
PUT /api/cockatiels/{id}
Updates details of an existing cockatiel by its ID.

Route Parameters
id (string): The unique ID of the cockatiel.
Request Body Parameters
Can include any combination of the following fields:

name (string): Updated name of the cockatiel.
age (integer): Updated age of the cockatiel.
color (string): Updated color of the cockatiel.
Success Response
Code: 200 OK
Body:
json
Copy code
{
"id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
"name": "Polly",
"age": 3,
"color": "blue"
}
Delete a Cockatiel
bash
Copy code
DELETE /api/cockatiels/{id}
Deletes a specific cockatiel by its ID.

Route Parameters
id (string): The unique ID of the cockatiel.
Success Response
Code: 204 No Content
Dependencies Used
Spring Boot
Maven
UUID
Flyway
Lombok
PostgreSQL
Author
This API was developed by Matheus Alves Barroso (matheus.alvsbarroso@gmail.com).

Repositório do Frontend
Frontend Repository

go
Copy code

Substitua `sua-url.com`, `seu-usuario` e `nome-do-repositorio` pelos valores adequados para sua aplicação.





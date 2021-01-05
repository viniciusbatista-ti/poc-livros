# poc-livros
POC usando Spring Boot e Data


Essa POC foi criada para realizar um cadastro de livros. Abaixo segue informações sobre as requisições:

Cadastrar Livro:
  Rota: /livros
  Método: POST
  Body: {
          "titulo": String,
          "autor": String,
          "genero": String
        }
  Retorno com sucesso: 201
  
Listar Livros:
  Rota: /livros
  Método: GET
  Retorno com sucesso: 200
  
Atualizar Livro:
  Rota: /livros
  Método: PUT
  Parametro: "id" - Int
  Body: {
          "titulo": String,
          "autor": String,
          "genero": String
        }
  Retorno com sucesso: 201
  
Excluir Livro:
  Rota: /livros
  Método: DELETE
  Retorno com sucesso: 200

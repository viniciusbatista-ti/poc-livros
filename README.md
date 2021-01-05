# poc-livros
POC usando Spring Boot e Data


Essa POC foi criada para realizar um cadastro de livros. Abaixo segue informações sobre as requisições:

Cadastrar Livro:<br>
  Rota: /livros<br>
  Método: POST<br>
  Body: {<br>
          "titulo": String,<br>
          "autor": String,<br>
          "genero": String<br>
        }<br>
  Retorno com sucesso: 201<br>
  
Listar Livros:<br>
  Rota: /livros<br>
  Método: GET<br>
  Retorno com sucesso: 200<br>
  
Atualizar Livro:<br>
  Rota: /livros<br>
  Método: PUT<br>
  Parametro: "id" - Int<br>
  Body: {<br>
          "titulo": String,<br>
          "autor": String,<br>
          "genero": String<br>
        }<br>
  Retorno com sucesso: 201<br>
  
Excluir Livro:<br>
  Rota: /livros<br>
  Método: DELETE<br>
  Retorno com sucesso: 200<br>

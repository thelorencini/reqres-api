# language: pt
# charset: UTF-8

Funcionalidade: Realizar DELETE em Users



  @DELETE
  Esquema do Cenario: Realizar operação de DELETE para Users
    Dado que eu deseje fazer um "DELETE" em "/users/{id}"
    E eu tenha o id de user "<id>"
    Quando eu realizar o DELETE
    Então o status code deverá ser "<statusCode>"
    Exemplos:
      |id|statusCode|
      |1 |  204     |
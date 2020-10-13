# language: pt
# charset: UTF-8

Funcionalidade: Realizar operação PUT


  @PUT
  Esquema do Cenario: Realizar operação de PUT para Users
    Dado que eu deseje fazer um "PUT" em "/users/{id}"
    E eu tenha o nome "<nome>" e o job "<job>" e o id "<id>"
    Quando eu realizar o PUT
    Então o status code deverá ser "<statusCode>"
    Exemplos:
      |id|nome       |job         |statusCode|
      |1 |rafael     |tester      |  200     |
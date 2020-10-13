# language: pt
# charset: UTF-8

Funcionalidade: Realizar operação GET


  @get
  Cenario:  Realizar operação GET de Users
    Dado que eu deseje fazer um "GET" em "/users"
    Quando eu executar a operacao GET
    Então o status code deverá ser "200"

  @get
  Esquema do Cenario:  Realizar operação GET de Single User
    Dado que eu deseje fazer um "GET" em "/users/{id}"
    E eu tenha o id de user "<id>"
    Quando eu executar a operacao GET
    Então o status code deverá ser "<statusCode>"
    Exemplos:
      |  id |statusCode|
      |  1  | 200      |
      | 288 | 404      |

  @get
  Cenario:  Realizar operação GET de Resources
    Dado que eu deseje fazer um "GET" em "/unknown"
    Quando eu executar a operacao GET
    Então o status code deverá ser "200"

  @get
  Esquema do Cenario:  Realizar operação GET de Single Resources
    Dado que eu deseje fazer um "GET" em "/unknown/{id}"
    E eu tenha o id de resource "<id>"
    Quando eu executar a operacao GET
    Então o status code deverá ser "<statusCode>"
    Exemplos:
      |  id |statusCode|
      |  1  | 200      |
      | 288 | 404      |


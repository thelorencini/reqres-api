# language: pt
# charset: UTF-8

Funcionalidade: Realizar operação POST


  @post
  Esquema do Cenario: Realizar operação de POST para Users
    Dado que eu deseje fazer um "POST" em "/users"
    E eu tenha o nome "<nome>" e o job "<job>"
    Quando eu realizar o POST
    Então o status code deverá ser "<statusCode>"
    Exemplos:
    |nome       |job         |statusCode|
    |rafael     |tester      |  201     |

  @post-register
  Esquema do Cenario: Realizar operação de POST para Register
    Dado que eu deseje fazer um "POST" em "/register"
    E eu tenha o email "<email>" e o password "<password>"
    Quando eu realizar o registro
    Então o status code deverá ser "<statusCode>"
    Exemplos:
      |email                    |password         |statusCode|
      |eve.holt@reqres.in       |pistol           |  200     |
      |eve.holt@reqres.in       |                 |  400     |

  @post-login
  Esquema do Cenario: Realizar operação de POST para Login
    Dado que eu deseje fazer um "POST" em "/login"
    E eu tenha o email "<email>" e o password "<password>"
    Quando eu realizar o login
    Então o status code deverá ser "<statusCode>"
    Exemplos:
      |email                    |password         |statusCode|
      |eve.holt@reqres.in       |pistol           |  200     |
      |eve.holt@reqres.in       |                 |  400     |
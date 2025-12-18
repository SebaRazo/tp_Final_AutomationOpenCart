#language: es

@regression
Característica: Logout

@TEST-1239
Escenario: Logout existoso
  Dado que el usuario ingresa a la home
  Y el usuario ingresa al login
  Cuando el usuario se loguea con datos válidos
  Y vuelve al dropdown para desloguearse
  Entonces se realiza el logout correctamente

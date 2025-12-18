#language: es

@regression
Característica: : Crear cuenta

  @TEST-1235
  Escenario: Crear cuenta valida
    Dado que el usuario ingresa a la home
    Y el usuario ingresa a registrar una cuenta
    Cuando el usuario crea la cuenta
    Entonces se verifica que la cuenta se creo correctamente

  @TEST-1238
  Escenario: Crear cuenta invalida
    Dado que el usuario ingresa a la home
    Y el usuario ingresa a registrar una cuenta
    Cuando el usuario no completa el formulario
    Entonces se verifica que la cuenta no se creo correctamente
#language: es

@regression
Característica: Agregar producto al carrito

  @TEST-1240
  Escenario: Agregar producto al carrito correctamente
    Dado que el usuario ingresa a la home
    Y el usuario ingresa al login
    Y el usuario se loguea con datos válidos
    Y busca un producto
    Y selecciona detalles y lo agrega al carrito
    Entonces se verifica que el producto elegido se haya agregado correctamente
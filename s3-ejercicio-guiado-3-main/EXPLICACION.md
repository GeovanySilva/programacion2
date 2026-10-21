# Explicación detallada de Main.java — Ejercicio guiado S3.3

Producto usa campos privados y un constructor que exige nombre, precio y categoría. Antes de guardar, verifica que nombre no sea null ni esté en blanco y que el precio no sea negativo. Si una regla falla, lanza IllegalArgumentException y el objeto no se crea.

El constructor asigna los parámetros a los campos mediante this. La variable static contador comparte un número entre todas las instancias. Cada producto incrementa contador y guarda el nuevo valor en id. id es final, por lo que una vez asignado no se puede reasignar.

Los getters permiten consultar nombre, precio, categoría e identificador. getTotalCreados() es static porque el total pertenece a la clase, no a un producto individual.

main construye tres productos válidos y muestra sus IDs y nombres; luego consulta el total, que es tres. El ejercicio practica constructores, validación con excepciones, encapsulación, identificadores y miembros estáticos.
# Guía de Java usada en estos ejercicios

Esta guía resume y explica los elementos de Java que aparecen en estos proyectos S2, S3 y S4.

## 1. Archivo, clase y punto de inicio

Cada proyecto contiene Main.java y una clase pública Main. El nombre del archivo debe coincidir con el nombre de esa clase pública. Java comienza a ejecutar el método public static void main(String[] args). public permite que el entorno encuentre el método; static permite invocarlo sin crear un objeto Main; void indica que no devuelve un valor; String[] args puede contener argumentos de terminal.

Para compilar y ejecutar, abre una terminal en la carpeta del ejercicio y ejecuta:

    javac Main.java
    java Main

javac es el compilador. Crea bytecode en archivos .class. java ejecuta ese bytecode. Los ejercicios usan String.isBlank(), que está disponible desde Java 11, por lo que se recomienda un JDK 11 o superior.

## 2. Clases y objetos

Una clase es una definición que agrupa datos y acciones. Un objeto es una instancia de esa clase, creada normalmente con new. En los ejercicios aparecen clases como Producto, Motor, Videojuego, Cupon, Sensor, Router, Valvula, Cliente y Pedido. Por ejemplo, dos objetos Producto guardan sus propios nombres y precios; cambiar el precio de uno no cambia el otro.

Las clases del ejercicio están escritas dentro de Main como clases anidadas static. Esto permite mantener el ejercicio en un solo archivo y crear esos objetos desde el main estático. En proyectos más grandes normalmente cada clase principal tendría su propio archivo.

## 3. Atributos y tipos

Los atributos almacenan el estado de un objeto. Se usan String para textos como nombre, código, categoría o dirección IP; int para cantidades e identificadores enteros; double para decimales como precios, potencia, presión y lecturas; boolean para estados verdadero/falso como activo, disponible o encendido.

Cada tipo tiene un propósito. Un atributo normal pertenece a cada objeto. Por eso un motor tiene su propia velocidad y un cliente su propio estado. Para dinero real, los programas comerciales suelen usar BigDecimal en lugar de double, para controlar con más precisión los decimales.

## 4. Visibilidad y encapsulación

public permite acceder a un miembro desde otras clases. private restringe el acceso directo a la clase que lo declara. Si no aparece un modificador, el acceso es de paquete: se limita a clases del mismo paquete.

En S2 se observan atributos públicos o de paquete para practicar el acceso directo. En S3 y S4 se usan atributos privados junto con métodos públicos. Esta práctica se llama encapsulación: el objeto protege sus datos y decide cómo se consultan o cambian.

## 5. Métodos, parámetros y valores devueltos

Un método define una acción o consulta. void significa que no devuelve resultado; métodos como activar(), encender(), confirmar() y mostrarInformacion() ejecutan acciones. Un método puede recibir parámetros, por ejemplo cambiarDisponibilidad(boolean nuevoEstado), para saber qué valor debe asignar.

Un getter devuelve un atributo: public double getPrecio() { return precio; }. Un setter modifica el atributo: public void setPrecio(double precio) { ... }. Los getters suelen comenzar por get; para boolean es común usar isActivo(). Los métodos de una instancia trabajan sobre el estado del objeto que los recibió.

## 6. this y constructores

this.nombre identifica el atributo nombre del objeto actual. Es útil cuando el parámetro del método o constructor tiene el mismo nombre, por ejemplo this.nombre = nombre.

Un constructor tiene el mismo nombre que su clase y no declara un tipo de retorno. Se ejecuta con new al crear el objeto y sirve para dejarlo inicializado. Algunos ejercicios crean el objeto vacío y asignan sus campos después; otros reciben los datos en el constructor. La segunda forma asegura que los datos iniciales se establezcan al crear el objeto.

## 7. Validaciones y condiciones

if ejecuta un bloque cuando una condición es verdadera. Comparaciones como >=, <=, > y < se usan para validar rangos. && significa “y”: deben ser ciertas ambas condiciones; || significa “o”: basta que una sea cierta; ! niega una condición.

Los setters de motor, sensor, válvula y router aceptan solo valores dentro de ciertos límites. En esta implementación, si el dato no pasa la condición, el setter no cambia el atributo y se conserva el valor anterior. Los constructores de Producto en los ejercicios guiados S3 comprueban nombre y precio y lanzan IllegalArgumentException si reciben datos inválidos. Una excepción no capturada detiene el programa.

Para comparar el contenido de String se usa equals, no ==. La expresión "Confirmado".equals(estado) compara el texto y es segura incluso si estado fuera null. == se reserva normalmente para comparar valores primitivos o identidad de referencias.

## 8. static, contadores e identificadores

Un atributo static pertenece a la clase y se comparte entre todos sus objetos. Los ejercicios lo usan para contar productos, clientes, pedidos o sensores, y para acumular ventas. Se consulta con el nombre de la clase, como Pedido.getVentasTotales().

El operador ++ aumenta un número en uno. Un constructor puede usar contador++ para asignar un nuevo identificador. En un campo final el valor se asigna una vez y después no puede reasignarse; resulta útil para identificadores que deben permanecer fijos.

## 9. Ciclos, salida y representación de objetos

El ciclo for repite un bloque. En el registro de producto, int i = 1 inicia el contador; i < 5 establece cuándo continuar; i++ lo incrementa en cada repetición. Así se crean varios productos de ejemplo.

System.out.println escribe una línea en la consola. El operador + puede concatenar textos y valores para construir mensajes.

toString() devuelve una descripción textual de un objeto. @Override indica que el método reemplaza uno heredado de Object y permite al compilador verificar la firma. Con System.out.println(objeto), Java usa toString() para mostrarlo.

## 10. Decidir qué mecanismo usar

Usa un atributo para guardar un dato del objeto; un método para realizar una acción; un getter para consultar; un setter para cambiar con control; un constructor para preparar los datos iniciales; private para proteger campos; static para datos compartidos entre objetos; final para un valor que no debe reasignarse; y una condición para aceptar o rechazar valores según reglas.

El conjunto actual se concentra en programación orientada a objetos básica. No utiliza todavía entrada por teclado con Scanner, arreglos o listas, herencia, interfaces, archivos, bases de datos, interfaces gráficas ni pruebas automatizadas. Los valores demostrados están escritos directamente en main.
# 01 - Introduccion a POO, clases y objetos

Este bloque combina las clases `intro-poo.md` y `clases-y-objetos.md`.

## Alcance de este tema

Aqui si se practica:

- Que es la Programacion Orientada a Objetos.
- Diferencia general entre programacion estructurada y POO.
- Estado y comportamiento.
- Clases como plantillas.
- Objetos como instancias.
- Atributos.
- Metodos.
- Constructores.
- `this`.
- `public` y `private`.
- Getters y setters sencillos.
- Instanciacion con `new`.
- UML basico de clases.
- Idea general de compilador, bytecode y JVM.

Aqui todavia no se practica:

- `Scanner`.
- Arrays.
- `ArrayList`.
- Aliases y copias.
- Relaciones entre clases.
- Herencia.
- Polimorfismo.
- Excepciones con `try/catch`.
- Comparaciones con otros lenguajes.

## Antes de programar

Lee el nombre de cada ejercicio y piensa:

- Que entidad del mundo real representa?
- Cuales son sus atributos?
- Cuales son sus metodos?
- Que valores necesita recibir el constructor?
- Que deberia quedar oculto con `private`?

## Como compilar

Entra a esta carpeta y compila un ejercicio:

```bash
javac Ejercicio01Perro.java
java Ejercicio01Perro
```

Cada archivo tiene una clase principal con `main` y una clase de practica debajo. Completa los `TODO` en orden.

## Ejercicios practicos

### Ejercicio 1: Perro

Archivo: `Ejercicio01Perro.java`

Objetivo: practicar la diferencia entre clase y objeto.

Tareas:

1. Completa el constructor de `Perro`.
2. Completa el metodo `ladrar`.
3. Completa el metodo `presentarse`.
4. En el `main`, crea dos perros distintos.
5. Llama los metodos de ambos objetos.

Pregunta clave: si ambos objetos fueron creados con la misma clase, por que pueden tener datos distintos?
*Respuesta:* Pueden tener datos distitnos porque la clase sobre la que son creados es solo la pantilla que usan, cada uno tiene atributos que distinguen un objeto del otro. Los objetos son instancias de una solo clase que determina sus atributos y métodos. A cada instancía se le pueden asignar datos distintos a traves de su creación y el constructor.

### Ejercicio 2: Bombilla

Archivo: `Ejercicio02Bombilla.java`

Objetivo: practicar estado y comportamiento.

Tareas:

1. Completa el constructor.
2. Completa `encender`.
3. Completa `apagar`.
4. Completa `mostrarEstado`.
5. En el `main`, cambia varias veces el estado de la bombilla.

Pregunta clave: que atributo representa el estado de la bombilla?
El atributo que representa el estado de la bombilla es "Encendido"
Ya que representa el estado de encendido o no encendido.

### Ejercicio 3: Televisor

Archivo: `Ejercicio03Televisor.java`

Objetivo: practicar atributos, metodos y `this`.

Tareas:

1. Completa el constructor.
2. Completa `encender`.
3. Completa `apagar`.
4. Completa `cambiarCanal`.
5. Completa `mostrarInformacion`.
6. Crea dos televisores con datos distintos.

Pregunta clave: por que usamos `this.marca = marca;` en el constructor?
*Respuesta:* Usamos this.marca = marca en el constructor porque con "this" declaramos que de la variable que se habla es la propia de la clase, por tanto en palabras comunes sería: que la variable marca de ESTA CLASE sea igual a la variable marca que se esta recibiendo como parametro, como ambas se llaman igual se debe ser explicito en la declaración.

### Ejercicio 4: Cuenta bancaria

Archivo: `Ejercicio04CuentaBancaria.java`

Objetivo: practicar encapsulamiento simple.

Tareas:

1. Completa el constructor.
2. Completa `getSaldo`.
3. Completa `setSaldo`.
4. Completa `mostrarSaldo`.
5. En el `main`, cambia el saldo usando el setter.

Pregunta clave: por que `saldo` esta declarado como `private`?
*Respuesta*: saldo esta declarado como private para que no se pueda acceder direcctamente a el desde otra clase, esto evita que se vea o modifique sin las devidas restricciones. Al usar métodos especificos para estos procesos podemos validar datos o mostrarlos como la clase lo requiera.


### Ejercicio 5: UML a codigo

Archivo: `Ejercicio05Producto.java`

Objetivo: convertir un diagrama UML basico a Java.

Diagrama:

```text
+----------------------------+
| Producto                   |
+----------------------------+
| - nombre: String           |
| - precio: double           |
+----------------------------+
| + mostrar(): void          |
| + getPrecio(): double      |
| + setPrecio(precio): void  |
+----------------------------+
```

Tareas:

1. Completa la clase `Producto`.
2. Crea dos productos.
3. Muestra su informacion.
4. Cambia el precio de uno usando `setPrecio`.
5. Muestra otra vez la informacion.

Pregunta clave: que partes del UML se convierten en atributos y que partes se convierten en metodos?
*Respuesta:* Del Uml el primer renglon se comvierte en el nombre del archivo .java y el nombre de la clase. El segundo renglon se convierte en los atributos. Y finalmente, el tercer renglon se convierte en los métodos. Todo eso siguiendo la notación de los UML.

## Preguntas teoricas

Responde debajo de cada pregunta con tus propias palabras.

### Introduccion a POO

1. Que problema intenta resolver la Programacion Orientada a Objetos?

Respuesta: El problema que intenta resolver la Programación Orientada a Objetos es el problema de la programación estructurada, ya que con ese paradigma resulta límitado el manejo de grandes volumnes de datos y relaciones.

2. Por que el paradigma estructurado puede volverse dificil en programas grandes?

Respuesta: Se vuelve dificil en programas grandes por el manejo de las relaciones, el manejo de los datos y porque el código es poco reutilizable, por lo que se puede caer en la repetición de codigo.

3. Que significa que un objeto tenga estado?

Respuesta: Que un objeto tenga estado significa que tiene atributos que lo definirán, estos atributos son características propias de lo que ES, como el nombre, color, tamaño, forma, etc.

4. Que significa que un objeto tenga comportamiento? 

Respuesta: Que un objeto tenga comportamiento significa que tiene métodos que lo definen, estos métodos son características propias de lo que HACE, como moverse, hablar, mostrar mensajes, abierse o cerarse, apagarse o encenderse, modificar algún atributo, etc. 

5. Escribe tres ejemplos de objetos reales y menciona dos atributos y dos metodos de cada uno.

Respuesta:
- Clase: Cargador 
- Atributos: Marca, Voltaje
- Métodos: Tranferir energía, cargar la pc

- Clase: Ropero
- Atributos: Alto, cantidad de gabetas
- Métodos: Abrir las puertas, abrir las gabetas

- Clase: Zapato
- Atributos: Talla, tipo de suela
- Métodos: Estirarse, apretar agujetas

### Clases y objetos

6. Que es una clase?

Respuesta: Una clase es una plantilla que define las caracteristas, es decir, los estados y comportamientos de un conjunto de objetos del mismo tipo.

7. Que es un objeto?

Respuesta: Un objeto es una entidad que se generá a partir de una, se le llama: instancía de la clase, es la unidad básica de la programación orientada a objetos.

8. Que significa instanciar una clase?

Respuesta: La acción de instanciar una clase significa crear un nuevo objeto a partir de la plantilla de clase, este objeto contiene las caracteristicas con sus propios datos en los estados y también contiene los comportamientos de la clase.

9. Que palabra reservada se usa en Java para crear un objeto?

Respuesta: Para crear un objeto se usa la palabra reservada "new"
La forma completa es: 
(nombre de la clase) (nombre que tendrá el objeto) = new (nombre de la clase con parentesis al final ());
Clase c1 = new Clase()

10. Explica con tus palabras la diferencia entre `Perro` y `miPerro`.

Respuesta: La diferencia entre "Perro" y "miPerro" esque como Perro inicia con mayuscula corresponde a la clase Perro, y miPerro que inicia con minuscula es una instancia de la Clase perro nombrada miPerro.

### Metodos y constructores

11. Para que sirve un constructor?

Respuesta: Un constructor sirve para poder declarar valores a los atributos iniciales al instanciar un objeto, estos valores son enviados al constructor como aparametros. El constructor es llamado en autommatico al momento de instanciar el objeto. El constructor se debe nombrar con el mismo nombre de la Clase, (con mayouscula también).

12. Por que un constructor tiene el mismo nombre que la clase?

Respuesta: El constructor tiene el mismo nombre de la clase proque esto permite que sea llmado en automatico al momento de instanciar el objeto.

13. Por que un constructor no tiene tipo de retorno?

Respuesta: Un constructor no tiene tipo de retorno porque alteraria su comportamiento y lo convertiría en un método ordinario, bloqueando la ventaja de ser automatico.
Tiene las siguientes partes:
- visibilidad: public (+)
- nombre de la clase (inicial mayuscula): Clase
- parametros dentro de parentesis: ("tipo de dato" "nombre del dato"){
    - this."nombre de la variable de la clae" = "nombre del dato";
}

14. Identifica las partes de este metodo:
las partes son:

```java
public double calcularArea(double base, double altura) {
    return base * altura;
}
```
public : visibilidad
double : tipo de retorno
calcularArea : nombre del método
(double base): base es el nombre que se le asigno al parametro de tipo double que le enviará quien llame al método
(double altra): altura es el nombre que se le asigno al parametro de tipo double que le enviará quien llame al método
return : es la palabra reservada para indicar la variable o dato que retornará del tipo double declarado
base * altura : es una operación de multiplicación entre dos booleanos, este resultado es el que será retornado a quien llame al método

Respuesta:

15. Cual es la diferencia entre un metodo `void` y un metodo que retorna un valor?

Respuesta: la diferencia entre un método void y un método que retorna un valor esque al llamar a un método void este realizará el comportamiento definido dentro del método pero ese resultado no podra ser almacenado en alguna otra varibale. En cambio los métodos que retornan un valor esque al momento de llamarlos van a valga la redundancia retornar un valor. Por tanto podemos declaran una variable del mismo tipo de retorno y llamar al método para almacenar el retorno del méotodo en dicha variable.

### Encapsulamiento

16. Que significa encapsular?

Respuesta: Encapsular significa proteger el estado interno de un objeto, al encapsular agrupamos datos y lógica dentro de una clase. Se oculta la implementación interna de la clase y se expone lo necesario a traves de una interfas publica definida. Este proceso nos permite seguridad al poder tener el control sobre la interfas a través de la cual tendrán acceso desde otras clases. Y tambén permite flexibilidad de la clase. 

17. Que significa que un atributo sea `private`?

Respuesta: Que un atributo sea ´private´ significa que ninguna otra clase que no sea la que contenga el atributo pueda acceder directamente al atributo, ni para leerlo, modificarlo o eliminarlo. Pero si se puede exponer a travez de una interfas controlada y definida.

18. Que significa que un metodo sea `public`?

Respuesta: Que un método sea ´public´ significa que cualquier otra clase puede llamar directamente al método, almacenar su retorno o aprovechar su comprotamiento.

19. Para que sirven los getters y setters?

Respuesta: Los getters y los setters son la interfas a través de la cual se exponen los atributos públicos. En especifico los getter tienen la funcioalidad de retornar el valor de un atributo, por tanto cualquier otra clase que llame al método getter puede leer el valor de esa varible. Y con el setter no se retorna nada, es void, ya que su funcionalidad es modificar el valor de la variable. Quien llama al método envia en el parámetro el valor con el que se sustituirá al actual valro del atributo de la clase.

20. Por que una clase puede verse como una caja negra?

Respuesta: Una clase se puede ver como una caja negra simplemente porque solo nos importa el resultado que nos da, y lo que podemos hacer con ella, al usuario no le interesa toda la implementación de la clase, no le interesa como es el funcionamineto interno de cada clase. Solo le interesa lo que ve y lo que puede hacer con ello.

### UML y Java

21. Para que sirve UML?

Respuesta: UML es una herramienta ESTANDAR para representar gráficamente una clase, tanto su nombre atributos y métodos, así como la visibilidad, tipo de dato en los atributos y tipo de retorno en los méotods, y tambien el tipo de datos y nombre de los parametros de cada método. La idea del UML fue unificar varias formar de reprentación para tener una forma estandar. Esta visualización facilita detectar problemas de arquitectura y facilita la identificación de cada clase , sus estados y comportamientos.

22. En UML, que significa el simbolo `-` antes de un atributo?

Respuesta: En UML el simbolo ´-´antes del atributo significa que este atributo tendrá una visublidad de "private".

23. En UML, que significa el simbolo `+` antes de un metodo?

Respuesta: Respuesta: En UML el simbolo ´+´antes del método significa que este método tendrá una visublidad de "public".

24. Que hace el compilador `javac`?

Respuesta: El compilador javac realiza el análisis léxico, análisis sintactico y análisis semantico del código y luego lo traduce a un lenguaje intermedio en este caso el bytecode para que pueda ser ejecutable el programa.

25. Que relacion hay entre `.java`, `.class` y la JVM?

Respuesta: La relación ente ´.java´, ´.class´ y la JVM esque el archivo .java contiene el código escrito por el programador en lenguaje java, el .class es el archivo bytecode generado por el compilador javac a partir del archivo .java y finalmente el JVM (Java Virtual Machine) ejecuta el archivo .class para que el programa funcione.

## Mini reto

Crea un archivo nuevo llamado `RetoEstudiante.java`.

Debe tener:

- Una clase principal `RetoEstudiante` con `main`.
- Una clase `Estudiante`.
- Atributos privados: `nombre`, `carne`, `carrera`.
- Constructor con parametros.
- Metodo `presentarse`.
- Getter y setter para `carrera`.

En el `main`:

1. Crea dos estudiantes.
2. Muestra su informacion.
3. Cambia la carrera de uno usando el setter.
4. Muestra nuevamente su informacion.

*MINI RETO COMPELTADO*
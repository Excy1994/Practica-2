# Practica-2

Cree un fichero llamado Variables y copie el siguiente código






Cree el fichero .gitignore y agregue el siguiente texto: *.jar puede usar el siguiente código para generar el .gitignore a través de bash.
estos son los pasos para crear un .gitignore, se puede hacer de varias formas como por ejemplo desde la consola.










Imprima la variable que creo en el código usando println en el programa 
 
 


 Copie el siguiente código al final del fichero variables



 Imprima la variable del código anterior e indique si hay algún error, en caso de haberlo indique el porqué del error y como corregirlo.
Este es el resultado, da error porque No puedes volver a asignar un valor a una variable que se declaró mediante val.

En este caso la mejor opción es usar var ya que con esta puedes reasignar su valor.


Cree una variable edad y establezca como valor su edad en años.


Imprima todas las variables en una misma línea y confirme cambios en GIT
al final imprime: Mi nombre es Excy Barrera y tengo 24 años.

Cree un nuevo fichero llamado Tipos.kt dentro de la carpeta contenedora creada en la actividad anterior 
 

 Copie el siguiente código y muestre los valores en una sola línea, precediendo una cadena descriptiva ante cada variable







Indique si hay error, en caso de encontrar alguno, resuélvalo e indique como hacerlo
No hay error 

  Indique como se pueden realizar conversiones entre tipos, de int a float y viceversa. Pruebe cada una de las funciones existentes de conversiones. Muestre ejemplos.
 

  Copie el siguiente código sobre el tipo de dato Bolean e indique de forma generalizada el uso de este tipo de dato










Muestre el resultado de las dos expresiones en una sola línea, mostrando la operación en una cadena y el valor de la variable Boolean a la par. Confirme cambios en GIT 
luego de obtener el resultado  hacemos los cambios en git y






 Realice un ejemplo del tipo de dato Char, en el mismo fichero Tipos.kt después del código relacionado a booleanos. Indique de forma generalizada cuando usamos este tipo de dato. Confirme cambios en GIT.

 Copie el siguiente código de cadenas en el fichero Tipos.kt e indique las diferencias entre Raw String y un String normal
Los raw string pueden contener varias líneas de texto. Y los string normal,así es como puede definir una String variable en Kotlin. Por ejemplo,
val myString = "¡Hola!"
Aquí, myString es una variable de tipo String.
Puede declarar la variable de tipo String y especificar su tipo en una declaración, e inicializar la variable en otra declaración más adelante en el programa.

Compile el fichero y muestre las variables en una sola sentencia println. Confirme los cambios en GIT. 

Para que funciones usamos fun main(){
} y ingresamos los datos dentro de esta.







 Imprima el primer array iterando sus elementos, del segundo array generado comente la manera en que se generó el array y la forma en que se imprimieron sus datos.

  Compile y pruebe. Confirme cambios en GIT. En cada uno de los ejemplos vaya comentando. 
 Investigue la forma de usar los rangos en Kotlin usando el operador in y .. en primera instancia. También puede lograrlo usando las funciones downTo() y rangeTo() 
El operador in es usado para asegurar si un valor está presente en un rango dado.
if (5 in 1..10) {
    print("Yes 5 is in the range") // prints "Yes 5 is in the range"
}
En el código de arriba, revisamos para ver si 5 está en el rango 1..10 usando el operador in. También podemos hacer lo contrario usando !n para revisar si 5 no está en el rango.
El operador .. puede ser reemplazado con la función de extensión rangeTo() para crear un rango. Por ejemplo, también podemos hacer esto 1.rangeTo(5) y aún tener los mismos resultados que usar el operador .. 

Cree un nuevo fichero llamado If.kt 
 Copie el código a continuación y brinde sus conclusiones mediante comentarios. 
Compile los resultados mostrando mensajes según convenga.

val fecha = Date()
val hoy = if (fecha.year == 2019) true else false

 Imprima el valor de la variable hoy y muestre el resultado
 Debajo del código anterior, copie el siguiente código
En este el resultado es que soy de mayor edad ya que haci lo declare.




 Cambie el valor de la variable edad, con su edad, compile y muestre el resultado obtenido. Confirme cambios en GIT.
El resultado de que dio es que todavía soy menor de edad ya que está declarado que si una persona de 22 años hacia arriba lo toma como mayor de edad.





¿Por qué es importando el control sobre nulos en Kotlin? 
En ocasiones es inevitable lidiar con el concepto de “vacío” o “inexistente”, un punto en el que no podemos quitarnos de encima el valor nulo. Afortunadamente existe un patrón al que podemos recurrir que se llama Null Object Pattern que nos puede ayudar en estos casos.
2. ¿Cómo usar la sentencia when sin argumentos en Kotlin?
when sin argumentos, Con esta opción, podemos hacer prácticamente la comprobación que queramos. Por ejemplo.




Como when es una expresión, puede retornar un valor que se puede almacenar en una variable.
 3. Conversión explicita vs implícita de datos en Kotlin 
Conversiones Explícitas, debido a las diferentes representaciones, los tipos más pequeños no son subtipos de los más grandes. 
La ausencia de conversiones implícitas raramente se nota ya que el tipo se deduce del contexto y las operaciones aritméticas están sobrecargadas para realizar las conversiones apropiadas, por ejemplo:
val numero = 1L + 3 // Long + Int => Long

4. Compare mediante ejemplos el uso de Arrays vs Listas en Kotlin
Los arrays en Kotlin se representan mediante la clase Array, la cual tiene las funciones get y set (que se convierten en [] por las convenciones de sobrecarga del operador), y propiedad de tamaño, junto con algunas otras funciones miembros útiles:
Para crear un array, podemos usar la función de la biblioteca arrayOf() y pasarle los valores, es decir, arrayOf(1, 2, 3) crea un array [1, 2, 3]. Alternativamente, la función arrayOfNulls() puede ser utilizada para crear un array de un número dado lleno de elementos nulos. 

 listas
Las colecciones se pueden clasificar en dos grandes grupos, las mutables e inmutables. Es decir, las que se pueden editar (mutables) y las que son solo de lectura (inmutable).
La declaración de una lista inmutable sería así.
val readOnly: List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
readOnly.size //Muestra el tamaño de la lista
readOnly.get(3) //Devuelve el valor de la posición 3
readOnly.first() //Devuelve el primer valor
readOnly.last() //Devuelve el último valor
println(readOnly) //[Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo]



Git hub:
https://github.com/Excy1994/Practica-2


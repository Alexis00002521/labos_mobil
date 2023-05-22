1. ¿Qué es una coroutine en Kotlin y cómo se diferencia de un hilo
tradicional?
Una coroutine es un método de programación que permite realizar procesos de manera secuencial y estructurada , y es diferente al hilo tradicional al poderse suspender cuando llega a un punto explicito y poder realizar mas de una operación a la vez por el contrario el hilo tradicional no permite esto y realiza bloqueos en la aplicación .
 
2. ¿Cuál es la importancia de la suspensión en las coroutines y cómo se
implementa?
la importancia cae en el manejo de actividades largar, donde esta no se bloquean al intentar realizar otra actividad sin afectar a la acción principal,
3. ¿Cuál es el propósito del Dispatcher en las coroutines y cómo se elige
uno adecuado para cada tarea?
Especifica en que hilo o hilos se esta ejecutando una coroutine ,se escogen depende la acción que realizaran en la app si que ver con la interfaz de usuario será Dispachers.Main, o si es entrada o salida de datos Dispacher.IO o si es una actividad de 
 
4. ¿Cuál es el propósito y el uso de la función async en las coroutines?
Es un constructor de coroutines utilizando el objeto deferred, y se obtiene a través de la función await(). 


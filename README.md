# Solución Reto 1 Ciclo 2 MisiónTIC 2022. Grupo P2 UNAL.
## ¡Asignando calificaciones a mis amigos!
En el mercado de las aplicaciones de redes sociales ha surgido una aplicación llamada **UNtynder**, la cual es muy interesante en su forma de evaluar los contactos que se tienen como amigos. Esta evaluación se realiza a partir de obtener algunas características de un amigo y mediante estas características generar la clasificación dicho amigo.
**UNtynder** es una aplicación que ha llamado bastante la atención debido a su forma de clasificación de sus amigos. Dicha clasificación se obtiene a partir del índice de la calidad, dado dicho índice de calidad que tiene un amigo registrado se puede estimar la categoría del amigo que se tiene  registrado en la red social. 
Un amigo es categoría **uno**, si su índice de la calidad está entre 0 y 20; es categoría **dos** si está entre 21 y 30, y es categoría **tres** si se encuentra entre 31 y 50. Y si su índice de la calidad es más de 50 indica que el amigo es categoría **cuatro**.
La aplicación realiza cálculos muy sencillos para generar este índice de calidad del amigo. La aplicación ha permitido establecer que la suma de la cantidad de amigos con la cantidad de publicaciones es igual a cinco veces el índice de calidad. También se estimó que, al quitarle 4 a la cantidad de amigos, se obtiene dos veces la cantidad de publicaciones (todas las distancias son enteras).
Elabore un programa que permita simular la evaluación que utiliza la aplicación UNtynder, dada la cantidad de publicaciones, imprima la cantidad de publicaciones, la cantidad de amigos y el índice de calidad del amigo, separados por un espacio. Adicionalmente, el programa debe indicar en la siguiente línea, la categoría del amigo.
### Entrada
La entrada es un número entero que representa la cantidad de publicaciones del amigo.
### Salida
Tres enteros separados por espacio que imprima la cantidad de publicaciones, la cantidad de amigos y el índice de calidad del amigo, separados por un espacio. En la siguiente línea en letras la categoría del amigo evaluado.
### Ejemplo
| Entrada  | Salida  |
| ------------ | ------------ |
| 178  | 178 360 107  |
|   | cuatro  |
| 73  | 73 150 44  |
|   | tres  |

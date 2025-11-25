Diferencias entre trabajar con Arrays y Listas Enlazadas

Un array es como tener todos tus útiles acomodados en una cartuchera ordenada: cada cosa tiene su lugar fijo, todo está pegado a lo demás, y si querés agarrar el “elemento número 5”, lo encontrás al toque porque sabés exactamente dónde está.

Una lista enlazada es más parecida a una fila de personas: cada una sabe quién viene después, pero no están necesariamente juntas ni ordenadas en la memoria. Para llegar al quinto, tenés que ir saludando uno por uno hasta llegar.

En pocas palabras:

Arrays: acceso rápido, estructura fija.

Listas enlazadas: acceso más lento, pero mucho más flexible para agregar y quitar cosas.

Ventajas y desventajas de usar listas enlazadas en este proyecto

Como en el trabajo práctico tenemos que manejar estudiantes, profesores, materias, etc., las listas enlazadas tienen cosas buenas y otras que no tanto.

Ventajas
-Crecen sin drama

No hay que decir “esta lista va a tener 20 estudiantes”. Simplemente se va agrandando a medida que le vas metiendo datos.

-Agregar y borrar es sencillo

Si tenés que agregar una materia, eliminar un estudiante o meter algo en el medio, es cuestión de cambiar referencias. No hace falta mover medio sistema como pasaría con un array.

-Se llevan bien con sistemas que cambian mucho

Y seamos honestos: en un sistema educativo siempre se agregan, borran o modifican datos.

Desventajas
-Acceder a un elemento puntual es más lento

Si querés el séptimo elemento, tenés que recorrer desde el primero hasta llegar. No existe eso de “dame el índice 7 y listo”.

-Consumen un poco más de memoria

Cada nodo guarda su dato y además un puntero al siguiente, así que ocupan un poquito más.

-Algunos algoritmos se complican

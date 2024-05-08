#Tarea 1 Programación - Diseño de Layout 
<p>

</p>
##Introducción
El entorno de diseño gráficos nos permite a los programadores examinar, comprobar la disposición y los comportamientos de los elementos incluidos e insertados en la interfaz de los aplicativos. 

La elaboración de este proyecto consiste en la creación de una ventana con BordenPane se cargan imagenes interactivas de usuario, sus respectivos etiquetas en la sección del lado izquierdo, en cambio en el lado derecho va el Listview, el campo en el cual aparece información de los usuarios con las interacciones empleadas, del mismo modo, en la parte de inferior esta un cuadro de TextField en donde se envian mensajes y se muestran en el Listview.

##Desarrollo
- **Los graficos**: AL usar Java Fx  te permite usar eventos, si das un clic en la parte las etiquetas Label se despliega información personal de cada usuario dentro del recuadro del Listview que esta del otro lado. 
- **Listview**: Aparece con color negro, pero una vez dado el click en la etiqueta aparece la información correspondiente al usuario.
![Imagen1](https://github.com/Yadira-Quinde/Tareas-Programacion/assets/168947646/acaee57a-7574-414f-9232-73e4da9e9da6)

- **TextField**: Este aparece con un mensaje "Ingrese nueva información" y con fondo azul, si se llga a ingresar una imagen y se da enter, lo escrito aparece en el Listview. 
![Imagen3](https://github.com/Yadira-Quinde/Tareas-Programacion/assets/168947646/e5ae58b8-8d56-4218-b77c-7f063d0e01d8)

- **Eventos**: Estos aparecen al detectar clics en cada etiqueta y añade información del al lado derecho de la ventana.
![Imagen2](https://github.com/Yadira-Quinde/Tareas-Programacion/assets/168947646/ac5bf245-9b6e-44be-8bb7-6dca5c42cc1e)

##Puntos relevantes: 
- Se usa un HASHMAP que almacena la información y la presenta del lado derecho
- Usamos 2 variables para las imagenes, 'Image' que sirve para cargas las imagenes dentro de la clase e 'ImageView' para mostrarlas.
- 'MouseEvent.Mouse_Clicked' se usa para las interacciones de la ventana.
- El 'TextField' sirve para ingresar los datos que queremos incluir, esto se maneja tambien con 'OnkeyPressed' con el objetivo mostrar la todo en el Listview cuando se da enter.
- Posee BordenPane para colocar dada elemento ya sea en la parte superior, la derecha, izquierda o abajo.

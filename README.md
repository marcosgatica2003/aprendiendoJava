# Contenido
## 1. Ejercicios básicos

   ### - Hola Mundo con entrada del usuario
  Escribe un programa que reciba un nombre por teclado e imprima un saludo personalizado.
   
  Ejemplo:
    
  Entrada: Lolon
    
  Salida: ¡Hola, Lolon! Bienvenido a Java.

  ### - Operaciones matemáticas simples
  
  Implementa un programa que permita al usuario ingresar dos números y seleccione entre sumar, restar, multiplicar o dividir. Usa un switch para manejar las opciones.

  ### - Número par o impar
  
  Escribe un programa que determine si un número ingresado es par o impar. Usa un operador ternario para decidir el mensaje a imprimir.

## 2. Clases y objetos

  ### - Clase Rectángulo
  
   Define una clase Rectangulo con atributos privados largo y ancho. Incluye métodos para calcular el área y el perímetro. Añade un método mostrarInformacion() para imprimir los valores.

  ### - Relación entre clases: Vehículo y Motor
  Crea una clase Motor con atributos como cilindrada y caballosFuerza.
  
  Crea una clase Vehiculo con atributos marca, modelo y un objeto de tipo Motor.
  
  Implementa un método para mostrar toda la información del vehículo y su motor.

  ### - Clase Fecha y Evento
  
  Implementa una clase Fecha con atributos día, mes y año. Crea una clase Evento que tenga un atributo Fecha y un atributo nombre. Añade un método para mostrar toda la información del evento.

## 3. POO Avanzada

### - Sobrecarga de métodos: Áreas geométricas

  Escribe una clase CalculoArea con métodos sobrecargados para calcular el área de un círculo, rectángulo y triángulo. Implementa un menú para que el usuario elija la figura.

### - Herencia: Productos
  Clase base Producto con atributos nombre y precio.
  
  Clase derivada Electrodomestico con atributo voltaje.
  
  Clase derivada Alimento con atributo fechaDeCaducidad.
  
  Implementa métodos en cada clase para mostrar información específica.

### - Polimorfismo: Formas geométricas

Implementa una clase base Forma con un método calcularArea(). Crea clases derivadas Circulo, Rectangulo y Triangulo, sobrescribiendo el método para calcular el área correspondiente.

## 4. Colecciones y excepciones

### - Manejo de excepciones: División por cero

Escribe un programa que intente dividir dos números ingresados por el usuario. Si el divisor es cero, captura la excepción y muestra un mensaje de error.

### - Lista de números únicos

Crea un programa que use una lista (ArrayList) para almacenar números ingresados por el usuario, asegurándote de que no se repitan.

### - Diccionario simple

Usa un HashMap para almacenar palabras y su traducción. Permite al usuario buscar palabras en el diccionario.

## 5. Temas avanzados

### - Clase genérica: Caja

Implementa una clase genérica Caja<T> que almacene un objeto de cualquier tipo. Añade métodos para asignar y obtener el objeto almacenado.

### - Hilos: Contador concurrente

Crea un programa que inicie dos hilos. Uno debe contar números de forma ascendente y otro de forma descendente. Sincroniza los hilos para evitar conflictos.

### - Expresiones Lambda y Streams
  Usa una lista de números enteros.
  Filtra solo los números pares y ordénalos de mayor a menor.
  Calcula la suma de los números mayores a 10 usando Streams.

## 6. Ejercicio integrador

### - Sistema de gestión de tareas
Diseña un sistema con las siguientes características:

Clase Tarea con atributos nombre, descripcion y prioridad.

Una lista (ArrayList) para gestionar tareas.

Métodos para añadir, eliminar y listar tareas.

Usa lambdas para ordenar tareas por prioridad.


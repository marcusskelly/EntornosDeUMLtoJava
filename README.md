
## Diagramas de clases traducidos a lenguaje Java y documentados en javadoc.

#Ejercicio 1.Biblioteca

Una aplicación necesita tener información sobre una biblioteca. Realiza el diagrama de clases y
añade los métodos necesarios para realizar el préstamo y devolución de libros.

La biblioteca tiene copias de libros. Estos últimos se caracterizan por su nombre, tipo (novela,
teatro, poesía, ensayo), editorial, año y autor.

Los autores se caracterizan por su nombre, nacionalidad y fecha de nacimiento.
Cada copia tiene un identificador, y puede estar en la biblioteca, prestada, con retraso o en
reparación.

Los lectores pueden tener un máximo de 3 libros en préstamo.

Cada libro se presta un máximo de 30 días, por cada día de retraso se impone una multa de dos días
sin posibilidad de coger un nuevo libro.

~~~
@startuml Biblioteca
'https://plantuml.com/class-diagram

skinparam classAttributeIconSize 0

enum Genero << enumeration >> {
    novela
    teatro
    poesia
    ensayo
}

enum EstadoCopia << enumeration >> {
    prestado
    retraso
    biblioteca
    reaparicion
}

Libro <|-- Copia
Libro "1" --o "0..*" Copia

Libro "1..*" --* "1" Autor

Copia "0..3" -- "0..1" Socio
(Copia, Socio)..Prestamo
Socio "0..*" *--right-- "1..*" Multa

class Libro {
    - titulo : String
    - editorial : String
    - year : int
    - tipo : Genero
}

class Copia {
    - referencia : integer
    - estado : EstadoCopia
}

class Prestamo {
    - inicio : Date
    - fin : Date
}

class Autor {
    - nombre : String
    - nacionalidad : String
    - fechaNacimiento : Date
}

class Socio {
    - numero : Integer
    - nombre : String
    - direccion : String
    - telefono : String
}

class Multa {
    - inicio : Date
    - fin : Date
}
@enduml
~~~


#Ejercicio 2. Instalaciones Deportivas

Un centro de instalaciones deportivas quiere hacer una aplicación de reservas. En el centro existen
instalaciones deportivas (piscinas, frontones, gimnasios y pistas de tesis). El centro en cuestión tiene
socios, de los cuales se almacenan su nombre, dirección, ciudad, provincia, teléfono y cuota.
Además, existen una serie de artículos que se pueden reservar si el socio lo requiere (balones, redes
y raquetas). Cada instalación es reservada por un socio en una fecha dada desde una hora de inicio
hasta una hora de fin. Cada reserva puede tener asociada uno o varios artículos deportivos que se
alquilan a parte. Por ejemplo, si yo quiero hacer una reserva para jugar al tenis, tengo que reservar
una instalación polideportiva y si lo necesito, las raquetas.


~~~
@startuml Instalaciones Deportivas
'https://plantuml.com/class-diagram

skinparam classAttributeIconSize 0

enum Material << enumeration >> {
    balon
    red
    raquetas
}

enum Instalacion << enumeration >> {
    piscina
    fronton
    Gym
    pista de tenis
}

Polideportivo "0..1" -- "0..*" Socio
(Polideportivo, Socio).. Reserva

class Polideportivo {
    - tipo : Instalacion
}

class Socio {
    - nombre : String
    - direccion : String
    - ciudad : String
    - provincia : String
    - telefono : int
    - cuota : int
}
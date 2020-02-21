﻿# My-tourney

Integrantes:
* Juan Camilo Angel Hernandez
* Juan Camilo Rojas Ortiz
* Daniel Felipe Walteros Trujillo
### Logo
![](img/logo.png)

### Descripción (antecedentes, problema que se resuelve, etc.):
En el torneo de fútbol de la escuela y en otros torneos pequeños se detectaron varios problemas:
* Uso de mecanismos de inscripción que dificultan o no permiten la validación de algunas restricciones
 como evitar que un jugador participe en dos equipos al tiempo o evitar equipos repetidos, además 
 estos mecanismos dificultan la modificación del equipo después del registro,situación
 que se presenta con frecuencia por la estructura del torneo
 
* Dificultad para registrar diferentes datos durante el torneo, ejemplos de esto son los puntos
de los equipos, tarjetas,goles y otros sucesos de los partidos.

* Dificultad para comunicar los hechos importantes de los partidos, la programación y las estadísticas
de jugadores y equipos tanto a los participantes como a los espectadores


Ante estas dificultades actualmente se utilizan formularios de Google o planillas para
registrar las inscripciones, y para informar datos sobre el torneo o no se tienen mecanismos para esto
o se publican documentos en las oficinas donde se gestiona el torneo.
 
Para solucionar esto se propone una aplicación web que permita administrar un torneo de fútbol,
facilitando la creación y aportando un valor agregado al desarrollo y finalización de este.Las principales
funciones de la aplicación permitirán :
* La inscipción de los equipos y la modificación de estos siempre y cuando
se realice antes de la fecha limite de inscripción y antes que se complete el cupo máximo de equipos
* Registrar los hechos más importantes de los partidos y los resultados de estos .
* Mostrar a los diferentes usuarios la información de los partidos, de los equipos y de los jugadores del torneo
* Generar reportes al finalizar el torneo
* Generar los enfrentamientos entre los equipos 

#### Diagrama de clases

![](img/clases.png)

#### Diagrama Entidad-Relación

![](img/E-R.png)

 
### Resumen:

Hemos visto que en el torneo de fútbol de la escuela y en otros torneos pequeños se presentan problemas relacionados con el proceso de inscripción, el registro de los datos que se generan durante el torneo, la comunicación de los hechos relevantes que ocurren en el desarrollo del torneo junto con la programación y la visualizacion de las estadísticas.

Viendo que actualmente se utilizan formularios de Google o planillas para registrar las inscripciones, y  que para informar datos sobre el torneo realizan la pubicación de documentos en una oficina, se propuso una aplicación web que permita administrar un torneo de fútbol, facilitando de esta manera la inscripción de los equipos y la modificación de estos, además mediante la aplicación se podrán  registrar los hechos más importantes para que los usuarios puedan conocer el estado del partido en tiempo real, también podrán visualizar datos de los jugadores y equipos, finalmente se generarán reportes del torneo.

### Historias de usuario:

![](img/arbitro.png)

* Como arbitro quiero consultar que partidos debo arbitrar para poder asistir a todos a tiempo 

* Como arbitro
  quiero registrar los sucesos que se presentan en los partidos para poder informar a jugadores,espectadores y otros arbitros sobre lo sucedido 
  
* Como arbitro
  Quiero consultar los datos de un jugador
  Para poder verificar si tiene sanciones por tarjetas amarillas o rojas
   
 ![](img/capitan.png)
 
  
* Como capitan
  Quiero registrar mi equipo para poder participar en el torneo

* Como capitan quiero poder añadir o eliminar jugadores de mi equipo  para poder modificar la composicion del equipo en cualquier momento antes de la ficha limite de inscripciones

![](img/usuario.png)

* Como usuario del sistema
  quiero consultar las estadisticas de un jugador para poder informarme del rendimiento de este

* Como usuario del sistema 
  quiero consultar los sucesos que ocurrieron en un partido para poder saber de forma rapida lo mas importante del partido

* Como usuario quiero consultar el estado de los partidos del torneo para poder saber rapidamente los resultados de los distintos equipos participantes

* Como usuario quiero consultar las estadisticas de un equipo para poder saber el rendimiento de este

![](img/adminh.png)


* Como administrador quiero crear el tornero para poder organizar una competencia y permitir la inscripcion de equipos

* Como administrador quiero organizar los enfrentamientos entre los equipos para poder definir los partidos que se van a jugar en el torneo
### Mockups

#### Vista Home

Logeandose

![](img/login.png)

Registrandose

![](img/sign1.png)

Selecciona el rol.

![](img/sign2.png)

Ingresa información adicional.

![](img/sign3.png)

Apenas ingresa un usuario se encontrará con la siguiente vista donde podrá obsevar el estado de los partidos y loguearse.

![](img/home.png)

Si selecciona un partido podrá ver el resumen en tiempo real.

![](img/home1.png)


Tambien podrá ver información de los jugadores.

![](img/home2.png)
![](img/home3.png)

Tambien podrá ver información de los equipos.

![](img/home4.png)
![](img/home5.png)

#### Vista Jugador

La siguiente es la vista que se encontrá un jugador.


![](img/player.png)

Si selecciona un partido podrá ver el resumen en tiempo real.

![](img/player1.png)

Tambien podrá ver información de los jugadores.

![](img/player2.png)
![](img/player3.png)

Tambien podrá ver información de los equipos.

![](img/player4.png)
![](img/player5.png)

Además podrá ver información de su equipo.

![](img/player6.png)

#### Vista Capitan

Si ingresa un capitan podrá crear un equipo.

![](img/cap.png)

Tambien podrá eliminar y añadir un jugador.

![](img/cap1.png)
![](img/cap2.png)

Además podrá ver estadisticas de su equipo.

![](img/cap3.png)

#### Vista Arbitro

Si ingresa un arbitro podrá ver sus proximos partidos.

![](img/arb.png)

Tambien podrá reportar un evento como gol, intento de gol, falta, penalty, etc

Selecciona el evento.

![](img/arb1.png)

Reportando un gol.

![](img/arb2.png)

Reportando un intento de gol.

![](img/arb3.png)

Reportando una falta.

![](img/arb4.png)

Reportando una tarjeta amarilla.

![](img/arb5.png)

Reportando una tarjeta roja.

![](img/arb6.png)

Reportando un penalty.

![](img/arb7.png)


#### Vista Administrador

Si ingresa un administrador podrá crear un torneo

![](img/admin1.png)

### Backlog

[Link backlog](https://drive.google.com/file/d/
# Exercicis Estructures Condicionals 01

# Tema 02: Programació Estructurada

```
1) Escriu un programa Java que demane tres números a l’usuari:

1. Un entre 1 i 7, que correspon al dia de la setmana.
2. Un altre entre 1 i 31 que correspon al dia del mes.
3. Un altre entre 1 i 12 que correspon al mes de l’any.
S’ha de comprovar que les dades introduïdes són correctes, enters dins dels rangs
demanats. Una vegada obtinguts els valors mostrarà per pantalla la data en el
format:
**Data Introduïda: dimarts, 2 d’octubre.**
```
```
2) Amplia el programa anterior verificant que el dia del més és correcte, és a dir que si
s’indica febrer, no es pot passar de 29 o si s’indica setembre no pot ser el 31.
```
```
3) Escriu un programa en Java que demane un nombre enter positiu i indique amb un
missatge si és parell o imparell, si és múltiple de 3 i si és múltiple de 5. Ha de
mostrar missatge d’error si no s’insereix un enter o si l’enter no és positiu. Exemple:

    +------------+--------------------------------+
    |   Entrada  |            Eixida              |
    +------------+--------------------------------+ 
    |8           |El número 8 és parell           |
    |            |El número 8 no és múltiple de 3 |
    |            |El número 8 no és múltiple de 5 |
    +------------+--------------------------------+
    |15          |El número 15 és imparell        |
    |            |El número 15 és múltiple de 3   |
    |            |El número 15 és múltiple de 5   |
    +------------+--------------------------------+


```
```
4) Escriu un programa en Java que demane tres números enters, els mostre en
pantalla i indique quin dels 3 és el major i quin és el menor. Comprova que
l’entrada és correcta. Exemple:
  +--------------+-------------------------------------------+
  |   Entrada    |                   Eixida                  |
  +--------------+-------------------------------------------+
  | 3, 10, -4    |El menor número dels 3 (3,10,-4) és: -4    |
  |              |El major número dels 3 (3,10,-4) és : 10   |
  +--------------+-------------------------------------------+
  | 200, 134, 0  |El menor número dels 3 (200,134,0) és : 0  |
  |              |El major número dels 3 (200,134,0) és : 200|
  +--------------+-------------------------------------------+

```
```
5) Escriu un programa en Java que demane a l’usuari una lletra de l’alfabet i indique si

realment ho és, i en cas que ho siga, si és una vocal o una consonant. No
considerem les vocals accentuades (í, à. ü...). Fes que no importe si l’usuari
insereix el caràcter en majúscules o minúscules. No s’accepta tampoc que l’usuari
introduïsca una cadena amb més d’un caràcter.
Útil : la funció length(), torna la longitud d’una cadena, per exemple:
String cadena ="hola";
System.out.println(cadena.length()); //l’eixida val 4
Útil : per obtenir un caràcter de l’entrada:
char caracter;
Scanner entrada = new Scanner(System.in);
caracter = entrada.next().charAt(0);

  +-----------+-----------------------------------------------+
  |  Entrada  |                  Eixida                       |
  +-----------+-----------------------------------------------+
  | 4         |No has introduït una lletra de l'alfabet       |
  +-----------+-----------------------------------------------+
  | A         |Has introduit una lletra de l'alfabet i és una |
  |           |vocal: a                                       |
  +-----------+-----------------------------------------------+
  | f         |Has introduït una lletra de l'alfabet i és una |
  |           |consonant: f                                   |
  +-----------+-----------------------------------------------+

```
```
6) Escriu un programa en Java que demane per teclat l'edat (nombre sencer) i el sexe
(caràcter: ‘H’/’D’) d'una persona i conteste amb una de les frases següents, en
funció d'aquesta edat i sexe:
    ◦ “Hola xaval, com estàs?, encara ets molt jove” (sexe ‘H’ i edat <= 18).
    ◦ “Vostè ja pot votar, senyor” (sexe 'H' i edat > 18).
    ◦ “Hola joveneta, què tal et trobes?” (sexe ‘D’ i edat<= 18).
    ◦ "Vostè ja pot votar, senyora" (sexe 'D' i edat > 18).
Fes que no importe si l’usuari introdueix la lletra en majúscules o en minúscules.
L’usuari només pot introduir la h o la d, qualsevol altra lletra, ha de fer que es
mostre un error.
```




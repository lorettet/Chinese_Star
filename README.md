# Chinese_Star
Chinese Checkers Game

By Theo LORETTE-FROIDEVAUX & Mathieu AUBEy as part of the second semester java mini-project.
IUT Valence FRANCE.

	
	
RULES :

GOAL : be the first player to reach the opposite side with all his marbles.

PROGRESS :



ASCII ART of the tray with the colored marbles:

          B
         B B
        B B B
       B B B B
G G G G . . . . . P P P P
 G G G . . . . . . P P P
  G G . . . . . . . P P
   G . . . . . . . . P
    . . . . . . . . .
   Y . . . . . . . . R
  Y Y . . . . . . . R R
 Y Y Y . . . . . . R R R
Y Y Y Y . . . . . R R R R
         O O O O
          O O O
           O O
            O 
            
            
6 PLAYER REPRESENTATION OF THE TRAY IN TABLE

"j" is the rank of the row
"i" is the rank of the column 

	00	01	02	03	04	05	06	07	08	09	10	11	12	13	14	15	16 i
00	-1	-1	-1	-1	G	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1
01	-1	-1	-1	-1	G	G	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1
02	-1	-1	-1	-1	G	G	G	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1
03	-1	-1	-1	-1	G	G	G	G	-1	-1	-1	-1	-1	-1	-1	-1	-1
04	B	B	B	B	0	0	0	0	0	Y	Y	Y	Y	-1	-1	-1	-1
05	-1	B	B	B	0	0	0	0	0	0	Y	Y	Y	-1	-1	-1	-1
06	-1	-1	B	B	0	0	0	0	0	0	0	Y	Y	-1	-1	-1	-1
07	-1	-1	-1	B	0	0	0	0	0	0	0	0	Y	-1	-1	-1	-1
08	-1	-1	-1	-1	0	0	0	0	0	0	0	0	0	-1	-1	-1	-1
09	-1	-1	-1	-1	P	0	0	0	0	0	0	0	0	O	-1	-1	-1
10	-1	-1	-1	-1	P	P	0	0	0	0	0	0	0	O	O	-1	-1
11	-1	-1	-1	-1	P	P	P	0	0	0	0	0	0	O	O	O	-1
12	-1	-1	-1	-1	P	P	P	P	0	0	0	0	0	O	O	O	O
13	-1	-1	-1	-1	-1	-1	-1	-1	-1	R	R	R	R	-1	-1	-1	-1
14	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	R	R	R	-1	-1	-1	-1
15	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	R	R	-1	-1	-1	-1
16	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	R	-1	-1	-1	-1
j

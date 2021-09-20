# hpe-test
hpe-test

It's a maven based project

Prerequisites

Java - installed JAVA_PATH is SET
Maven - installed - able to run mvn commands

Steps to Run

1. Go to root Directory in Terminal/cmd

2. run mvn clean compile

``` $ mvn clean compile ```

to Run with default centers/people file in resources folder

```mvn compile exec:java -Dexec.mainClass="com.hpe.coding.Main" ```

to Run with different centers file

```mvn compile exec:java -Dexec.mainClass="com.hpe.coding.Main" -DcenterFile="<path to center file>" ```

to Run with different people file

```mvn compile exec:java -Dexec.mainClass="com.hpe.coding.Main" -DpeopleFile="<path to people file>" ```

to Run with different people file

```mvn compile exec:java -Dexec.mainClass="com.hpe.coding.Main" -DpeopleFile="<path to people file>" -DpeopleFile="<path to people file>"```

Sample output
```
centerFileName=null
peopleFile=null
Cherlyn Heuser,Galway Racecourse, 73
Bobbi Byerley,Galway Racecourse, 71
Margarite Macdougall,Galway Racecourse, 68
Londa Feld,Galway Racecourse, 67
Chris Hegwood,Galway Racecourse, 63
Priscilla Lampert,Galway Racecourse, 63
Arlen Turpin,Galway Racecourse, 62
Janel Laubscher,Galway Racecourse, 61
Larhonda Clutter,Galway Racecourse, 60
Tayna Durr,Galway Racecourse, 59
Nilsa Marcus,Galway Racecourse, 59
Carma Tirrell,Galway Racecourse, 58
Neoma Leong,Galway Racecourse, 56
Mavis Unzueta,Galway Racecourse, 55
Cristine Kravetz,Galway Racecourse, 54
Rod Suter,Galway Racecourse, 51
Howard Encarnacion,Galway Racecourse, 47
Luci Force,Galway Racecourse, 46
Toni Appleby,Galway Racecourse, 45
Lindy Gerke,Galway Racecourse, 43
Celinda Hamilton,Galway Racecourse, 39
Janella Rabalais,Galway Racecourse, 31
Christopher Deveau,Galway Racecourse, 30
Clark Ospina,Galway Racecourse, 29
Diana Strassburg,Galway Racecourse, 27
Lorri Currey,Galway Racecourse, 25
Georgeann Kowalczyk,Galway Racecourse, 23
Rosalinda Eusebio,Galway Racecourse, 20
Yu Northam,City Hall Cork, 72
Eden Polston,City Hall Cork, 71
Marianna Strader,City Hall Cork, 70
Porter Wiemann,City Hall Cork, 70
Kendal Boltz,City Hall Cork, 69
Tandy Creegan,City Hall Cork, 68
Henriette Fitts,City Hall Cork, 63
Suk Mccright,City Hall Cork, 61
Tiffani O'Reilly,City Hall Cork, 59
Irwin Juneau,City Hall Cork, 59
Mabelle Deakins,City Hall Cork, 55
Page Bermea,City Hall Cork, 48
Kirstie Mcneece,City Hall Cork, 45
Keva Lohse,City Hall Cork, 45
Eda Gorby,City Hall Cork, 31
Pa Sheckler,City Hall Cork, 27
Bruna Ton,City Hall Cork, 21
Kina Clarke,City Hall Cork, 19
Jetta Twomey,Citywest Convention Centre Dublin, 75
Jamaal Tutor,Citywest Convention Centre Dublin, 75
Bj�rk Gu�mundsd�ttir,Citywest Convention Centre Dublin, 71
Talitha Laird,Citywest Convention Centre Dublin, 71
Keith Merlin,Citywest Convention Centre Dublin, 71
Christiane Aubuchon,Citywest Convention Centre Dublin, 70
Ezequiel Hepfer,Citywest Convention Centre Dublin, 69
Pa Sheckler,Citywest Convention Centre Dublin, 67
Leon Luppino,Citywest Convention Centre Dublin, 63
Lindy Gerke,Citywest Convention Centre Dublin, 63
Cora Jahns,Citywest Convention Centre Dublin, 59
Xenia Noto,Citywest Convention Centre Dublin, 59
Hiedi Pasternak,Citywest Convention Centre Dublin, 58
Tobie Steffens,Citywest Convention Centre Dublin, 58
Emmaline Beverlin,Citywest Convention Centre Dublin, 55
Arnoldo Rucks,Citywest Convention Centre Dublin, 54
Margarito Bundren,Citywest Convention Centre Dublin, 51
Sebastian Gerth,Citywest Convention Centre Dublin, 47
Rochel Hardrick,Citywest Convention Centre Dublin, 44
Marge Hatten,Citywest Convention Centre Dublin, 42
Ermelinda Donlon,Citywest Convention Centre Dublin, 42
Ilse Luebke,Citywest Convention Centre Dublin, 40
Sherise Hambly,Citywest Convention Centre Dublin, 38
Marguerita Brittian,Citywest Convention Centre Dublin, 38
Winter Bergman,Citywest Convention Centre Dublin, 36
Jason Mcvay,Citywest Convention Centre Dublin, 36
Jacquelin Luster,Citywest Convention Centre Dublin, 35
Danica Rosati,Citywest Convention Centre Dublin, 34
Marylyn Welle,Citywest Convention Centre Dublin, 29
Delila Hollaway,Citywest Convention Centre Dublin, 24
Dung Chesser,Citywest Convention Centre Dublin, 24
Arthur Schepis,Citywest Convention Centre Dublin, 23
Sima Haymon,Citywest Convention Centre Dublin, 22
Cecile Olea,Citywest Convention Centre Dublin, 22
John Oehler,Citywest Convention Centre Dublin, 20
Brittney Eakle,Citywest Convention Centre Dublin, 20
```

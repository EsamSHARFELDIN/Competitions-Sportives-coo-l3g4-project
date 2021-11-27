author: Adama TRAORE Esam SHARFELDIN

cls:

		javac -encoding utf8 -d cls -cp cls -classpath junit-4.3.jar main/*.java util/*.java

clean:

		rm -rf  cls  doc

doc:

		javac  -d doc -cp doc  main/*.java util/*.java

test:
		javac -encoding utf8 -d cls -cp cls -classpath junit-4.3.jar main/*.java util/*.java test/*.java

jar: 
		jar cvmf manifest-ex master.jar cls/main/*.class cls/util/*.class

L:

	java -jar master.jar  L  c1 c2 c3 c4 c5 c6 c7 c8

T: 

	java -jar master.jar  T  c1 c2 c3 c4 c5 c6 c7 c8


M16:
		java -jar master.jar  M16  c1 c2 c3 c4 c5 c6 c7 c8 c9 c10 c11 c12 c13 c14 c15 c16

M24:

	java -jar master.jar  M24  c1 c2 c3 c4 c5 c6 c7 c8 c9 c10 c11 c12 c13 c14 c15 c16 c17 c18 c19 c20 c21 c22 c23 c24


M32:

	java -jar master.jar  M32


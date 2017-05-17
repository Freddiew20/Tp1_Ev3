# Tp_Ev3
Trabajo práctico de tests en proyectos java

   #En primer lugar clonar el proyecto y situarse en la carpeta con los comandos:
   
         $ git clone https://github.com/Freddiew20/Tp_Ev3.git 
         $ cd Tp_Ev3

   #Ejecutamos este comando para compilar JunitTestSuite.java del proyecto, especificando la ruta en la que se encuentra el .jar de junit. (Se aconseja versión 4.8.1 para evitar problemas de compatibilidad y falta de dependencias).
   
        $ javac -cp ~/misjars/junit/*:. JunitTestSuite.java 
       
   #Una vez compilado, procedemos a ejecutar este comando, que nos permitirá comprobar si los test ejecutan correctamente y si no es as nos dirá los errores, el proyecto debera ejecutar sin problemas.
   
        $ java -cp ~/misjars/junit/*:. org.junit.runner.JUnitCore JunitTestSuite
   
   #Debe devolvernos este resultado, teniendo en cuenta las modificaciones hechas a los test:
   
        alumnado@A121PC08:~/Escritorio/git$ java -cp ~/misjars/junit/*:. org.junit.runner.JUnitCore JunitTestSuite
        JUnit version 4.8.1
        .....
        Time: 0,007

        OK (5 tests)



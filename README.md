# Tp1_Ev3
Trabajo práctico de tests en proyectos java

   ### En primer lugar clonar el proyecto y situarse en la carpeta con los comandos:
   
         $ git clone https://github.com/Freddiew20/Tp_Ev3.git 
         $ cd Tp_Ev3

   ### Ejecutamos este comando para compilar JunitTestSuite.java del proyecto, especificando la ruta en la que se encuentra el .jar de junit. (Se aconseja versión 4.8.1 para evitar problemas de compatibilidad y falta de dependencias).
   
        $ javac -cp ~/misjars/junit/*:. JunitTestSuite.java 
       
   ### Una vez compilado, procedemos a ejecutar este comando, que nos permitirá comprobar si los test ejecutan correctamente y si no es as nos dirá los errores, el proyecto debera ejecutar sin problemas.
   
        $ java -cp ~/misjars/junit/*:. org.junit.runner.JUnitCore JunitTestSuite
   
   ### Debe devolvernos este resultado, teniendo en cuenta las modificaciones hechas a los test:
   
        alumnado@A121PC08:~/Escritorio/git$ java -cp ~/misjars/junit/*:. org.junit.runner.JUnitCore JunitTestSuite
        JUnit version 4.8.1
        .....
        Time: 0,007

        OK (5 tests)

----------------------------------------------------------------------------------------------------------------------------------------

   ### In the first place you should clone the project and get in the directory where the project is with the commands:
   
         $ git clone https://github.com/Freddiew20/Tp_Ev3.git 
         $ cd Tp_Ev3

   ### Now you execute this to compile the JunitTestSuite.java from our project, especifying the path where your junit version is, instead of the path that i'm showing (actually this is the path to the folder where i saved my junit.jar) Use of junit version 4.8.1 is stongly recomended due to compatibillity problems with the following versions which will have extra dependencies that will be required for the project to execute in the next step.
   
        $ javac -cp ~/misjars/junit/*:. JunitTestSuite.java 
       
   ### Once it has been compiled correctly we shall proceed and execute this command that will execute the tests and show you the results, having in mind that yoy have cloned this project you should be fine, anyway, if there is any problem with the tests or the project itself, the process will cut off and show you the problem.
   
        $ java -cp ~/misjars/junit/*:. org.junit.runner.JUnitCore JunitTestSuite
   
   ### The expected result is the following:
   
        alumnado@A121PC08:~/Escritorio/git$ java -cp ~/misjars/junit/*:. org.junit.runner.JUnitCore JunitTestSuite
        JUnit version 4.8.1
        .....
        Time: 0,007

        OK (5 tests)

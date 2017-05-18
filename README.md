# Tp2_Ev3
Proyecto de transformación de un proyecto de testing a maven

   ### En primer lugar clonar el proyecto y situarse en la carpeta con los comandos:
   
         $ git clone https://github.com/Freddiew20/Tp2_Ev3.git 
         $ cd Tp2_Ev3

   ### El proyecto ha sido creado en base a el Trabajo Practico 1 de la 3ªEvaluación, puede encontrarlo en mi página principal de github, ha sido transformado a un proyecto maven, los cambios serán enumerados a continuación:
   
        - JunitTestSuite.java ha sido eliminado, pues no será necesario ya que el comando mvn test se encargará de ejecutar los test
        - Se ha habilitado una estructura de carpetas de un proyecto maven, esto puede hacerse manualmente, aunque he decidido importar el proyecto en un IDE (Spring tool suite) ya que de esta forma nos facilita la creación de un pom.xml lo que nos lleva al siguiente cambio.
        - Hay un pom.xml, como debe haberlo en todo proyecto maven
        - El código no ha cambiado ya que tenemos las clases bien hechas y los test igual, simplemente han sido modificadas la estructura de carpetas para que coincida con un proyecto maven y se ha creado un pom.xml
       
   ### Si ha clonado este repositorio y quiere ejecutar los tests utilizando la herramienta maven solo deberá ejecutar:
   
        $ mvn test
   
   ### Debe devolvernos este resultado, Como podemos ver es mucho más simple hacerlo de esta forma ya que no tenemos que hacer prácticamente nada:
   
      [INFO] Scanning for projects...
      [INFO]                                                                         
      [INFO] ------------------------------------------------------------------------
      [INFO] Building Tp2_maven 0.0.1-SNAPSHOT
      [INFO] ------------------------------------------------------------------------
      [INFO]
      [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ TrabajoPractico_2 ---
      [INFO] Using 'UTF-8' encoding to copy filtered resources.
      [INFO] skip non existing resourceDirectory /home/freddiew/Escritorio/Tp2_Ev3/src/main/resources
      [INFO]
      [INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ TrabajoPractico_2 ---
      [INFO] Nothing to compile - all classes are up to date
      [INFO]
      [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ TrabajoPractico_2 ---
      [INFO] Using 'UTF-8' encoding to copy filtered resources.
      [INFO] skip non existing resourceDirectory /home/freddiew/Escritorio/Tp2_Ev3/src/test/resources
      [INFO]
      [INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ TrabajoPractico_2 ---
      [INFO] Nothing to compile - all classes are up to date
      [INFO]
      [INFO] --- maven-surefire-plugin:2.17:test (default-test) @ TrabajoPractico_2 ---
      [INFO] Surefire report directory: /home/freddiew/Escritorio/Tp2_Ev3/target/surefire-reports

      -------------------------------------------------------
       T E S T S
      -------------------------------------------------------
      Running Tp2_Ev3.TestPerson
      Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.468 sec - in Tp2_Ev3.TestPerson
      Running Tp2_Ev3.MathTest
      Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 sec - in Tp2_Ev3.MathTest
      Running Tp2_Ev3.AppTest
      Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in Tp2_Ev3.AppTest

      Results :

      Tests run: 6, Failures: 0, Errors: 0, Skipped: 0

      [INFO] ------------------------------------------------------------------------
      [INFO] BUILD SUCCESS
      [INFO] ------------------------------------------------------------------------
      [INFO] Total time: 12.637 s
      [INFO] Finished at: 2017-05-17T20:08:07+02:00
      [INFO] Final Memory: 8M/20M
      [INFO] ------------------------------------------------------------------------
      
 ---------------------------------------------------------------------------------------------------------------------------------------
 
   ### In the first place you should clone the project and get in the directory where the project is with the commands:
   
         $ git clone https://github.com/Freddiew20/Tp2_Ev3.git 
         $ cd Tp2_Ev3

   ### The project has been created based on the first practice from class, you can find it on my github main page, and this is the maven version of it, i will proceed to list all the changes that have been made to the original project:
   
        - JunitTestSuite.java has been deleted, because it will be no longer necessary, the command mvn test will execute the tests.
        - A new folder structure has been implemented to fit maven standarts, this could be done manually but i chose to do it with Spring tool suite because it will make easier the creation of the pom.xml which leads to the next change
        - There is a pom.xml as it should be on every single maven project
        - The code hasn't been changed at all since we have our java files witten properly and we have tested them and work just as they should, the only change has been implementing that folder structure and minor changes to the ''package'' declaration at the begining of the code.
   ### If you have cloned this repository and want to execute the tests you just need to execute the command:
   
        $ mvn test
   
   ### It should output this, as you can see, if you have checked out the first Tp you can now tell that it is way more simple doing it this way:
   
      [INFO] Scanning for projects...
      [INFO]                                                                         
      [INFO] ------------------------------------------------------------------------
      [INFO] Building Tp2_maven 0.0.1-SNAPSHOT
      [INFO] ------------------------------------------------------------------------
      [INFO]
      [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ TrabajoPractico_2 ---
      [INFO] Using 'UTF-8' encoding to copy filtered resources.
      [INFO] skip non existing resourceDirectory /home/freddiew/Escritorio/Tp2_Ev3/src/main/resources
      [INFO]
      [INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ TrabajoPractico_2 ---
      [INFO] Nothing to compile - all classes are up to date
      [INFO]
      [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ TrabajoPractico_2 ---
      [INFO] Using 'UTF-8' encoding to copy filtered resources.
      [INFO] skip non existing resourceDirectory /home/freddiew/Escritorio/Tp2_Ev3/src/test/resources
      [INFO]
      [INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ TrabajoPractico_2 ---
      [INFO] Nothing to compile - all classes are up to date
      [INFO]
      [INFO] --- maven-surefire-plugin:2.17:test (default-test) @ TrabajoPractico_2 ---
      [INFO] Surefire report directory: /home/freddiew/Escritorio/Tp2_Ev3/target/surefire-reports

      -------------------------------------------------------
       T E S T S
      -------------------------------------------------------
      Running Tp2_Ev3.TestPerson
      Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.468 sec - in Tp2_Ev3.TestPerson
      Running Tp2_Ev3.MathTest
      Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 sec - in Tp2_Ev3.MathTest
      Running Tp2_Ev3.AppTest
      Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in Tp2_Ev3.AppTest

      Results :

      Tests run: 6, Failures: 0, Errors: 0, Skipped: 0

      [INFO] ------------------------------------------------------------------------
      [INFO] BUILD SUCCESS
      [INFO] ------------------------------------------------------------------------
      [INFO] Total time: 12.637 s
      [INFO] Finished at: 2017-05-17T20:08:07+02:00
      [INFO] Final Memory: 8M/20M
      [INFO] ------------------------------------------------------------------------

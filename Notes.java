//Maven == Project Manager of Spring == Dependency Manager
//Pom.xml is like the depency manager
//Can alt click it to see all the depencies thats added with that perticular package
//Maven Manager in on right side m logo to see all the depdency jar files or view -> tool window -> maven
//After adding new depedency to go to maven like above -> click reload circle -> click rebuild all maven tools
// ^ will download the dependecy
//Maven transitive Dependecies


//Parent POM
//Go to maven tab and right click name of file and click show effective POM to see everything behind the back of maven
// ^ can do this my right clicking the pom as well
//Good for finding dependcy version
//Dependecy management is where you define the management version of the dependency

//How other users incorporate into our porject
//GroupID is similiar to package name
//artifactid is similiar to class

//Checking depdency and its compatibility with another library
//depdency:tree in edit configuration in run

//Maven Build Life Cycle
//install

//right clikc target open in -> explorer -> sunfire reports shows all the test and tests run
// ^ can also see other things like class

//How maven Works
//Java project consists maven project structure

//Jar are downloaded from Maven central Repository


//mvn --version
//mvn --compile only sources are compile
//mvn --test compile compiles test and source
//mvn clean
//mvn test runs unite test
//mvn create a jar
//mvn depdency:tree shows all the depdencies entire tree

//Maven Command:
//mvn compile
//When: Every time you change your source code and want to test or package your app.
//
//        2. Why do we need to run clean?
//Purpose: Deletes the target/ directory (where Maven stores all compiled files and builds).
//
//Why: Prevents old files from interfering with your current build. It’s like starting with a clean slate.
//mvn clean
//When: Before building fresh, especially when errors are caused by leftover files.
//
//mvn package
//Purpose: Packages your compiled code and dependencies into a single .jar file.
//
//Why: This .jar is what you run on your server or share for others to use your app.
//
//Maven Command:
//mvn package
//When: When your app is ready to be run outside the IDE, on production, or sent to others.
// Typical full build flow:
//        Copy
//mvn clean install
//This means:
//
//clean: delete old files
//
//compile + test
//
//package: build the .jar
//
//install: put the .jar into your local Maven repo (useful if other projects depend on it)
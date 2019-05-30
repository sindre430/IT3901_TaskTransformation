# Task Transformer

This project was made for a master thesis (IT3901) for NTNU.

The repository contains the model which can contain the information needed to do a transformation of the coordiantors exercises.
It also cointains a parser to make instances of the transformation model. 

## The model
**The model can be found in the directory "model" and is named transformation.ecore**

The model is created with the use of Eclipse Modeling Framework (EMF) and is a Ecore file. which can be used to generate Java code.
It is possible to generate the source code that the model represents by using the EMF Generator Model (transformation.genmodel), which is found inside the model folder.
For this project the source code with classes and Java files are already generated and are located in the src folder.

The transformation model holds all the information needed to do the exercise with the different task types.

## The parser
**The parser can be found in the directory "src/transformation/parser"**

The parser itself uses two Java files; Program.java and TaskParser.java. 
The TaskParser is the parser which interprets a given file, finds comments of interest and adapts the comments to fit the transformation model.
Each method inside this file has comments about what it does, so if you are interested in how the parsing process is done please read the comments inside this file.

The Program file contains a main method which handles paths given as parameters. If the first parameter is a directory the output files (Task files) will be placed in this foled.

The parser can be used with several programming languages and for each language there is made a configuration classes which is placed in the directory "src/transformation/parser/languages".
This configuration files contains information about which symbols that represents comments for the language.
The name of the configuration file should be the extension name of the files that the languages works with concated with "Configuration".
For instance for Java will the configuration file be name: JavaConfiguration.java and for Python: PyConfiguration.java.
There are already made several such files that can be found in the directory "src/transformation/parser/languages".

## Examples
There are multiple test files and created instances inside the directory "model/Instances".

## How to test
* Download the project
* Run the Java program (src/transformation/parser/Program.java) with paths as arguments

The first path could be a directory for where the Task files should be placed after the parsing (optional).
The other paths should be pointing to files that contains information about transformations. For example the file BlankTest.java (model/instances/TestFiles/BlankTest.java)

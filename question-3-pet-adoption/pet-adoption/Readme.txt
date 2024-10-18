# generate grpc code

# python -m grpc_tools.protoc -I../protos --python_out=. --pyi_out=. --grpc_python_out=. ../protos/app.proto

#Q2

cse5306-group31/			#project-root
│
├── grpc-calculator/ 		# java server client
│   ├── src/main/java/com/example/grpc	
│   │           				    ├── CalculatorGrpc.java		# Generated from .proto file
│   │           			    	├── CalculatorProto.java	# Generated from .proto file
│   │           					├── CalculatorServer.java	# Java server class
│   │            	  				└── CalculatorClient.java   # Java client class
│   ├── pom.xml
│
├── python-app/ 				# python server client
│   ├── calculator-server.py	# run this after running the java server
│   ├── calculator-client.py	# run this after running the java server
│   ├── app_pb2.py 	     		# Generated from .proto file
│   ├── app_pb2_grpc.py	 		# Generated from .proto file
│   ├── requirements.txt		# requirements to download pre-rquisites for python 
│
├── protos/
│   ├── app.proto       		# .proto file shared with both Java and Python


# JAVA server-client:-
# Before trying to run the app on cmd, make sure the current directory is grpc-calculator.
# Linux Linux:
# Go to grpc-calculator directory:
	$ cd <path/to/>grpc-calculator 
# Run the Java Server:
	$ ./mvnw exec:java -Dexec.mainClass="com.example.grpc.CalculatorServer" # on linux 
# Run the Java Client:-
	$ ./mvnw exec:java -Dexec.mainClass="com.example.grpc.CalculatorClient" 

# For Windows:
# Go to grpc-calculator directory:
	> cd <path/to/>grpc-calculator
# Run the Java Server:
	> mvnw.cmd exec:java -Dexec.mainClass="com.example.grpc.CalculatorServer" # on windows 
# Run the Java Client:-
	$ ./mvnw exec:java -Dexec.mainClass="com.example.grpc.CalculatorClient"

References:-
https://github.com/yrreddy0123/yrrhelp

# Python server-client:-
# Before trying to run the app on cmd, make sure the current directory is python-app under cse5306-group31
# Now run the following commands:
	$ pip install -r requirements.txt #This will install gRPC, gRPC tools and protobuf for python.
# Run the Python Server :
	$ python calculator-server.py
# Run the Python Client:-
	$ python calculator-client.py


#Q3. 

pet-adoption/			#project-root
│
├── java-server/
│   ├── src/main/java/
│   │           	├── grpc/
│   │           	│   ├── PetAdoptionGrpc.java	# Generated from .proto file
│   │           	│   └── PetAdoptionProto.java	# Generated from .proto file
│   │           	├── server/
│   │           	│   └── PetAdoptionServer.java  # Java server class
│   ├── pom.xml
│
├── python-client/
│   ├── pet-adoption-client.py		 # run this after running the java server
│   ├── pet_adoption_pb2.py 	     # Generated from .proto file
│   ├── pet_adoption_pb2_grpc.py	 # Generated from .proto file
│   ├── requirements.txt			 # requirements to download pre-rquisites for python 
│
├── protos/
│   ├── pet_adoption.proto       	# .proto file shared with both Java and Python

#Run the server:
 $ cd <path/to/>java-server 
 $ mvnw exec:java -Dexec.mainClass="server.PetAdoptionServer"
# if the previous command does not work, please try the following command:
 $ mvn clean compile exec:java
 
#Run the client:
 $ cd <path/to/>python-client 
 $ python pet-adoption-client.py
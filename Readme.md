#### Q2
##
## JAVA server-client:-

#### Before trying to run the app on cmd, make sure the current directory is grpc-calculator.
### For Linux:
#### Go to grpc-calculator directory:
	$ cd <path/to/>grpc-calculator 
#### Run the Java Server:
	$ ./mvnw exec:java -Dexec.mainClass="com.example.grpc.CalculatorServer" # on linux 
#### Run the Java Client:
	$ ./mvnw exec:java -Dexec.mainClass="com.example.grpc.CalculatorClient" 
### For Windows:
#### Go to grpc-calculator directory:
	> cd <path/to/>grpc-calculator
#### Run the Java Server:
	> mvnw.cmd exec:java -Dexec.mainClass="com.example.grpc.CalculatorServer" # on windows 
#### Run the Java Client:-
	> mvnw.cmd exec:java -Dexec.mainClass="com.example.grpc.CalculatorClient"

References:-
https://github.com/yrreddy0123/yrrhelp
##
## Python server-client:-
#### Before trying to run the app on cmd, make sure the current directory is python-app under cse5306-group31

#### Now run the following commands:-
##### _This will install gRPC, gRPC tools and protobuf for python as listed in requirements.txt._
	$ pip install -r requirements.txt  
#### Run the Python Server :
	$ python calculator-server.py
#### Run the Python Client:-
	$ python calculator-client.py
###

```bash
cse5306-group31/			#project-root
│
├── grpc-calculator/ 			# java server client
│   ├── src/main/java/com/example/grpc	
│   │           		   ├── CalculatorGrpc.java	# Generated from .proto file
│   │           		   ├── CalculatorProto.java	# Generated from .proto file
│   │           		   ├── CalculatorServer.java	# Java server class
│   │            	  	   └── CalculatorClient.java	# Java client class
│   ├── pom.xml
│
├── python-app/			# python server client
│   ├── calculator-server.py	# run this after running the java server
│   ├── calculator-client.py	# run this after running the java server
│   ├── app_pb2.py		# Generated from .proto file
│   ├── app_pb2_grpc.py		# Generated from .proto file
│   ├── requirements.txt	# requirements to download pre-rquisites for python 
│
├── protos/
│   ├── app.proto	# .proto file shared with both Java and Python
```

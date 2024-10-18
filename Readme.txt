# generate grpc code

# python -m grpc_tools.protoc -I../protos --python_out=. --pyi_out=. --grpc_python_out=. ../protos/app.proto


#Q3. to run the server: cd java-server and run -- mvn clean compile exec:java

Python server-client:-
Before trying to run the app on cmd make sure the current directory is python-app which is in the directory cse5306-group31. Also run the following command:-
python -m pip install grpcio-tools
This will install gRPC tools.
To run the python Server:-
python calculator-server.py
To run the python Client:-
python calculator-client.py
JAVA server-client:-
Before trying to run the app on cmd make sure the current directory is grpc-calculator which is in the directory cse5306-group31.
To run the Java Server:-
mvn exec:java -Dexec.mainClass="com.example.grpc.CalculatorServer"
To run the Java Client:-
mvn exec:java -Dexec.mainClass="com.example.grpc.CalculatorClient"
References:-
https://github.com/yrreddy0123/yrrhelp

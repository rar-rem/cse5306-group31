# generate grpc code

# python -m grpc_tools.protoc -I../protos --python_out=. --pyi_out=. --grpc_python_out=. ../protos/app.proto



#Q3. to run the server: cd java-server and run -- mvn clean compile exec:java


project-root/
│
├── java-server/
│   ├── src/
│   │   └── main/
│   │       └── java/
│   │           └── grpc/
│   │               └── PetAdoptionServer.java
│   │           └── server/
│   │               └── PetAdoptionServer.java
│   ├── pom.xml
│
├── python-client/
│   ├── python_client.py
│   ├── pet_adoption_pb2.py      # Generated from .proto file
│   ├── pet_adoption_pb2_grpc.py # Generated from .proto file
│   ├── requirements.txt
│
├── protos/
│   ├── pet_adoption.proto       # .proto file shared with both Java and Python
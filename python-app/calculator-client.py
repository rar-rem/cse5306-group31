import grpc
import app_pb2
import app_pb2_grpc

def run():
    # Connect to the Python server on port 50051
    with grpc.insecure_channel('localhost:50051') as channel:
        stub = app_pb2_grpc.CalculatorStub(channel)
        
        print("Enter a number: ")
        num1 = int(input())
        print("Enter another number: ")
        num2 = int(input())

        response = stub.Add(app_pb2.AddRequest(number1=num1, number2=num2))
        print("Python client received: " + str(response.result))

if __name__ == '__main__':
    run()
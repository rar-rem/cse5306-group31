import grpc
from concurrent import futures
import app_pb2
import app_pb2_grpc

class CalculatorServicer(app_pb2_grpc.CalculatorServicer):
    def Add(self, request, context):
        # Server 1 adds the numbers
        result = request.number1 + request.number2
        return app_pb2.AddReply(result=result)
    

def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    app_pb2_grpc.add_CalculatorServicer_to_server(CalculatorServicer(), server)
    server.add_insecure_port('[::]:50051')
    server.start()
    print("Python Server 1 started at port 50051")
    server.wait_for_termination()

if __name__ == '__main__':
    serve()
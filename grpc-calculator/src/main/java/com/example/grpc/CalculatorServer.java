package com.example.grpc;

import java.io.IOException;

import com.example.grpc.CalculatorGrpc.CalculatorImplBase;
import com.example.grpc.CalculatorProto.AddReply;
import com.example.grpc.CalculatorProto.AddRequest;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class CalculatorServer extends CalculatorImplBase{

	@Override
	public void add(AddRequest request, StreamObserver<AddReply> responseObserver) {
		//Add the numbers
		int result = request.getNumber1() + request.getNumber2();
		AddReply.Builder reply = AddReply.newBuilder();
		reply.setResult(result).build();
		//Sending response
		responseObserver.onNext(reply.build());
		responseObserver.onCompleted();
	}
	
	public static void main (String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder.
				forPort(50051).addService(new CalculatorServer()).build();
		server.start();
		System.out.println("Server started at " + server.getPort());
		server.awaitTermination();
	}
}

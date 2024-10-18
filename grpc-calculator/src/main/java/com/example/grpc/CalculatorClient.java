package com.example.grpc;

import java.util.Scanner;

import com.example.grpc.CalculatorGrpc.CalculatorBlockingStub;
import com.example.grpc.CalculatorProto.AddReply;
import com.example.grpc.CalculatorProto.AddRequest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculatorClient {

	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress("localhost", 50051).usePlaintext().build();
		
		//Stubs- generated from proto
		CalculatorBlockingStub CalculatorStub = CalculatorGrpc.newBlockingStub(channel);
		
		// Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter another number: ");
        int nummber2 = scanner.nextInt();
        
        AddRequest request = AddRequest.
        		newBuilder().setNumber1(number1).setNumber2(nummber2).build();

        // Call the add method and get the reply
        AddReply reply = CalculatorStub.add(request);
        System.out.println("Result: " + reply.getResult());

        // Shutdown the channel
        channel.shutdown();
	}

}

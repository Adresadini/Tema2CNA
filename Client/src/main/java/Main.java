import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import proto.Gate;
import proto.gateGrpc;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();
        gateGrpc.gateStub stub=gateGrpc.newStub(channel);
        boolean isConnected = true;
        stub.trimiteZodia(Gate.Data.newBuilder().setZi(20).setLuna(6).setAn(2000).build(), new StreamObserver<Gate.Zodie>() {
            @Override
            public void onNext(Gate.Zodie value) {
                System.out.println(value.getZodie());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {

            }
        });

        while (isConnected) {
        }
        channel.shutdown();
    }
}

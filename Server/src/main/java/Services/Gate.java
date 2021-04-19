package Services;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.ManagedChannelProvider;
import io.grpc.stub.StreamObserver;
import proto.ServiceIarna;
import proto.gateGrpc;
import proto.iarnaGrpc;
import proto.primavaraGrpc;


public class Gate extends gateGrpc.gateImplBase{

    @Override
    public void trimiteZodia(proto.Gate.Data request, StreamObserver<proto.Gate.Zodie> responseObserver) {
        proto.Gate.Zodie.Builder response=proto.Gate.Zodie.newBuilder();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();
        if(request.getLuna()==12 || request.getLuna()==1 || request.getLuna()==2)
        {
            iarnaGrpc.iarnaStub stub=iarnaGrpc.newStub(channel);
            stub.trimiteZodia(ServiceIarna.Data.newBuilder().setZi(request.getZi()).setLuna(request.getLuna()).setAn(request.getAn()), new StreamObserver<ServiceIarna.Zodie>() {
                @Override
                public void onNext(ServiceIarna.Zodie value) {
                    response.setZodie(value.getZodie());
                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onCompleted() {

                }
            });
        }
        else
        if(request.getLuna()==3 || request.getLuna()==4 || request.getLuna()==5)
        {
            primavaraGrpc.primavaraStubStub stub=primavaraGrpc.newStub(channel);
            stub.trimiteZodia(ServicePrimavara.Data.newBuilder().setZi(request.getZi()).setLuna(request.getLuna()).setAn(request.getAn()), new StreamObserver<ServicePrimavara.Zodie>() {
                @Override
                public void onNext(ServiceIarna.Zodie value) {
                    response.setZodie(value.getZodie());
                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onCompleted() {

                }
            });
        }
    }
}

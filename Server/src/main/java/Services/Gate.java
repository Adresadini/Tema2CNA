package Services;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import proto.*;


public class Gate extends gateGrpc.gateImplBase{

    @Override
    public void trimiteZodia(proto.Gate.Data request, StreamObserver<proto.Gate.Zodie> responseObserver) {
        proto.Gate.Zodie.Builder response=proto.Gate.Zodie.newBuilder();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();
        if(request.getLuna()==12 || request.getLuna()==1 || request.getLuna()==2)
        {
            iarnaGrpc.iarnaStub stub=iarnaGrpc.newStub(channel);
            stub.trimiteZodia(ServiceIarna.Data.newBuilder().setZi(request.getZi()).setLuna(request.getLuna()).setAn(request.getAn()).build(), new StreamObserver<ServiceIarna.Zodie>() {
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
            primavaraGrpc.primavaraStub stub=primavaraGrpc.newStub(channel);
            stub.trimiteZodia(ServicePrimavara.Data.newBuilder().setZi(request.getZi()).setLuna(request.getLuna()).setAn(request.getAn()).build(), new StreamObserver<ServicePrimavara.Zodie>() {
                @Override
                public void onNext(ServicePrimavara.Zodie value) {
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
            if(request.getLuna()==6 || request.getLuna()==7 || request.getLuna()==8)
            {
                varaGrpc.varaStub stub=varaGrpc.newStub(channel);
                stub.trimiteZodia(ServiceVara.Data.newBuilder().setZi(request.getZi()).setLuna(request.getLuna()).setAn(request.getAn()).build(), new StreamObserver<ServiceVara.Zodie>() {
                    @Override
                    public void onNext(ServiceVara.Zodie value) {
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
                if(request.getLuna()==9 || request.getLuna()==10 || request.getLuna()==11)
                {
                    toamnaGrpc.toamnaStub stub=toamnaGrpc.newStub(channel);
                    stub.trimiteZodia(ServiceToamna.Data.newBuilder().setZi(request.getZi()).setLuna(request.getLuna()).setAn(request.getAn()).build(), new StreamObserver<ServiceToamna.Zodie>() {
                        @Override
                        public void onNext(ServiceToamna.Zodie value) {

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

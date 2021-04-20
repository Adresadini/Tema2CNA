package Services;

import classes.ListaZodii;
import classes.Zodie;
import io.grpc.stub.StreamObserver;
import proto.ServiceIarna;
import proto.ServicePrimavara;
import proto.primavaraGrpc;
import proto.primavaraGrpc.primavaraImplBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Primavara extends primavaraImplBase{

    @Override
    public void trimiteZodia(ServicePrimavara.Data request, StreamObserver<ServicePrimavara.Zodie> responseObserver) {
        ListaZodii zod= null;
        try {
            zod = new ListaZodii(new File("src/main/resources/primavara.txt"));
        } catch (FileNotFoundException e) {
            responseObserver.onError(e);
        }
        ArrayList<Zodie> zodii= zod.getZodii();
        ServicePrimavara.Zodie.Builder response=ServicePrimavara.Zodie.newBuilder();
        for(Zodie zodie :zodii)
        {
            if(zodie.getLunaStart()== request.getLuna() && request.getZi()>= zodie.getZiStart())
                response.setZodie(zodie.getNume());
            if(zodie.getLunaFinal()== request.getLuna() && request.getZi()<= zodie.getZiFinal())
                response.setZodie(zodie.getNume());
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}

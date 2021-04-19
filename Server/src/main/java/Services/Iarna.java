package Services;

import classes.ListaZodii;
import classes.Zodie;
import io.grpc.stub.StreamObserver;
import proto.ServiceIarna;
import proto.iarnaGrpc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Iarna extends iarnaGrpc.iarnaImplBase{
    @Override
    public void trimiteZodia(ServiceIarna.Data request, StreamObserver<ServiceIarna.Zodie> responseObserver) {
        ListaZodii zod= null;

        try {
            zod = new ListaZodii(new File("src/main/resources/iarna.txt"));
        } catch (FileNotFoundException e) {
            responseObserver.onError(e);
        }
        ArrayList<Zodie> zodii= zod.getZodii();
        ServiceIarna.Zodie.Builder response=ServiceIarna.Zodie.newBuilder();
        for(Zodie zodie :zodii)
        {
            if(zodie.getLunaStart()== request.getLuna() && request.getZi()>= zodie.getZiStart())
                response.setZodie(zodie.getNume());
            if(zodie.getLunaFinal()== request.getLuna() && request.getZi()<= zodie.getZiStart())
                response.setZodie(zodie.getNume());
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();


    }
}

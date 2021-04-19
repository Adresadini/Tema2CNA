package Services;

import classes.ListaZodii;
import classes.Zodie;
import io.grpc.stub.StreamObserver;
import proto.ServicePrimavara;
import proto.ServiceToamna;
import proto.toamnaGrpc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Toamna extends toamnaGrpc.toamnaImplBase{

    @Override
    public void trimiteZodia(ServiceToamna.Data request, StreamObserver<ServiceToamna.Zodie> responseObserver) {
        ListaZodii zod= null;
        try {
            zod = new ListaZodii(new File("src/main/resources/toamna.txt"));
        } catch (FileNotFoundException e) {
            responseObserver.onError(e);
        }
        ArrayList<Zodie> zodii= zod.getZodii();
        ServiceToamna.Zodie.Builder response=ServiceToamna.Zodie.newBuilder();
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

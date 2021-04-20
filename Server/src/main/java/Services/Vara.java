package Services;

import classes.ListaZodii;
import classes.Zodie;
import io.grpc.stub.StreamObserver;
import proto.ServiceVara;
import proto.varaGrpc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Vara extends varaGrpc.varaImplBase{
    @Override
    public void trimiteZodia(ServiceVara.Data request, StreamObserver<ServiceVara.Zodie> responseObserver)  {
        ListaZodii zod= null;
        System.out.println("Hello");
        try {
            zod = new ListaZodii(new File("src/main/resources/vara.txt"));
        } catch (FileNotFoundException e) {
            responseObserver.onError(e);
        }
        ArrayList<Zodie> zodii= zod.getZodii();
        ServiceVara.Zodie.Builder response=ServiceVara.Zodie.newBuilder();
        System.out.println(zodii);
        for(Zodie zodie :zodii)
        {
            if(zodie.getLunaStart()== request.getLuna() && request.getZi()>= zodie.getZiStart())
            {
                response.setZodie(zodie.getNume());
            }

            if(zodie.getLunaFinal()== request.getLuna() && request.getZi()<= zodie.getZiFinal())
            {
                response.setZodie(zodie.getNume());
            }

        }
        System.out.println(response.getZodie());
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}

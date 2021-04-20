import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import proto.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();
        boolean isConnected = true;
        System.out.println("Va rugam introduceti data nasterii");
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        String[] ziLunaAn = data.split("/");
        Throwable e = new Throwable("Data nu este valida");
        int luna = 0, zi = 0, an = 0;
        try {
            luna = Integer.parseInt(ziLunaAn[0]);
            zi = Integer.parseInt(ziLunaAn[1]);
            an = Integer.parseInt(ziLunaAn[2]);

            if (luna > 12 || luna < 0) {
                throw e;
            }
            if (luna == 1 || luna == 3 || luna == 5 || luna == 7 || luna == 8 || luna == 10 || luna == 12) {
                if (zi > 31)
                    throw e;
            } else if (luna == 2) {
                if (an % 4 != 0 || an % 100 == 0 && an % 400 != 0) {
                    if (zi > 28)
                        throw e;
                } else if (zi > 29)
                    throw e;
            } else if (zi > 30)
                throw e;
            if (zi < 0)
                throw e;
        } catch (NumberFormatException ex) {
            System.out.println("Data nu este valida");
        } catch (Throwable ex) {
            System.out.println(e.getMessage());
        }


        /*gateGrpc.gateStub stub = gateGrpc.newStub(channel);
        stub.trimiteZodia(Gate.Data.newBuilder().setZi(zi).setLuna(luna).setAn(an).build(), new StreamObserver<Gate.Zodie>() {
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
        });*/
        if (luna == 12 || luna == 1 || luna == 2) {
            iarnaGrpc.iarnaStub stub = iarnaGrpc.newStub(channel);
            stub.trimiteZodia(ServiceIarna.Data.newBuilder().setZi(zi).setLuna(luna).setAn(an).build(), new StreamObserver<ServiceIarna.Zodie>() {
                @Override
                public void onNext(ServiceIarna.Zodie value) {
                    System.out.println(value.getZodie());
                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onCompleted() {

                }
            });
        } else if (luna == 3 || luna == 4 || luna == 5) {
            primavaraGrpc.primavaraStub stub = primavaraGrpc.newStub(channel);
            stub.trimiteZodia(ServicePrimavara.Data.newBuilder().setZi(zi).setLuna(luna).setAn(an).build(), new StreamObserver<ServicePrimavara.Zodie>() {
                @Override
                public void onNext(ServicePrimavara.Zodie value) {
                    System.out.println(value.getZodie());
                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onCompleted() {

                }
            });
        } else if (luna == 6 || luna == 7 || luna == 8) {
            varaGrpc.varaStub stub = varaGrpc.newStub(channel);
            stub.trimiteZodia(ServiceVara.Data.newBuilder().setZi(zi).setLuna(luna).setAn(an).build(), new StreamObserver<ServiceVara.Zodie>() {
                @Override
                public void onNext(ServiceVara.Zodie value) {
                    System.out.println(value.getZodie());
                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onCompleted() {

                }
            });
        } else if (luna == 9 || luna == 10 || luna == 11) {
            toamnaGrpc.toamnaStub stub = toamnaGrpc.newStub(channel);
            stub.trimiteZodia(ServiceToamna.Data.newBuilder().setZi(zi).setLuna(luna).setAn(an).build(), new StreamObserver<ServiceToamna.Zodie>() {
                @Override
                public void onNext(ServiceToamna.Zodie value) {
                    System.out.println(value.getZodie());
                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onCompleted() {

                }
            });
        }
        while (isConnected) {
        }
        channel.shutdown();
    }
}

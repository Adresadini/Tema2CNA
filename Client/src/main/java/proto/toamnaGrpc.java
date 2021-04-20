package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ServiceToamna.proto")
public final class toamnaGrpc {

  private toamnaGrpc() {}

  public static final String SERVICE_NAME = "toamna";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.ServiceToamna.Data,
      proto.ServiceToamna.Zodie> getTrimiteZodiaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "trimiteZodia",
      requestType = proto.ServiceToamna.Data.class,
      responseType = proto.ServiceToamna.Zodie.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ServiceToamna.Data,
      proto.ServiceToamna.Zodie> getTrimiteZodiaMethod() {
    io.grpc.MethodDescriptor<proto.ServiceToamna.Data, proto.ServiceToamna.Zodie> getTrimiteZodiaMethod;
    if ((getTrimiteZodiaMethod = toamnaGrpc.getTrimiteZodiaMethod) == null) {
      synchronized (toamnaGrpc.class) {
        if ((getTrimiteZodiaMethod = toamnaGrpc.getTrimiteZodiaMethod) == null) {
          toamnaGrpc.getTrimiteZodiaMethod = getTrimiteZodiaMethod = 
              io.grpc.MethodDescriptor.<proto.ServiceToamna.Data, proto.ServiceToamna.Zodie>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "toamna", "trimiteZodia"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ServiceToamna.Data.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ServiceToamna.Zodie.getDefaultInstance()))
                  .setSchemaDescriptor(new toamnaMethodDescriptorSupplier("trimiteZodia"))
                  .build();
          }
        }
     }
     return getTrimiteZodiaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static toamnaStub newStub(io.grpc.Channel channel) {
    return new toamnaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static toamnaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new toamnaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static toamnaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new toamnaFutureStub(channel);
  }

  /**
   */
  public static abstract class toamnaImplBase implements io.grpc.BindableService {

    /**
     */
    public void trimiteZodia(proto.ServiceToamna.Data request,
        io.grpc.stub.StreamObserver<proto.ServiceToamna.Zodie> responseObserver) {
      asyncUnimplementedUnaryCall(getTrimiteZodiaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTrimiteZodiaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ServiceToamna.Data,
                proto.ServiceToamna.Zodie>(
                  this, METHODID_TRIMITE_ZODIA)))
          .build();
    }
  }

  /**
   */
  public static final class toamnaStub extends io.grpc.stub.AbstractStub<toamnaStub> {
    private toamnaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private toamnaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected toamnaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new toamnaStub(channel, callOptions);
    }

    /**
     */
    public void trimiteZodia(proto.ServiceToamna.Data request,
        io.grpc.stub.StreamObserver<proto.ServiceToamna.Zodie> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTrimiteZodiaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class toamnaBlockingStub extends io.grpc.stub.AbstractStub<toamnaBlockingStub> {
    private toamnaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private toamnaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected toamnaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new toamnaBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.ServiceToamna.Zodie trimiteZodia(proto.ServiceToamna.Data request) {
      return blockingUnaryCall(
          getChannel(), getTrimiteZodiaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class toamnaFutureStub extends io.grpc.stub.AbstractStub<toamnaFutureStub> {
    private toamnaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private toamnaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected toamnaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new toamnaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ServiceToamna.Zodie> trimiteZodia(
        proto.ServiceToamna.Data request) {
      return futureUnaryCall(
          getChannel().newCall(getTrimiteZodiaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRIMITE_ZODIA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final toamnaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(toamnaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRIMITE_ZODIA:
          serviceImpl.trimiteZodia((proto.ServiceToamna.Data) request,
              (io.grpc.stub.StreamObserver<proto.ServiceToamna.Zodie>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class toamnaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    toamnaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ServiceToamna.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("toamna");
    }
  }

  private static final class toamnaFileDescriptorSupplier
      extends toamnaBaseDescriptorSupplier {
    toamnaFileDescriptorSupplier() {}
  }

  private static final class toamnaMethodDescriptorSupplier
      extends toamnaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    toamnaMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (toamnaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new toamnaFileDescriptorSupplier())
              .addMethod(getTrimiteZodiaMethod())
              .build();
        }
      }
    }
    return result;
  }
}

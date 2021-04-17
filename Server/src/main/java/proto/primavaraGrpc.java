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
    comments = "Source: ServicePrimavara.proto")
public final class primavaraGrpc {

  private primavaraGrpc() {}

  public static final String SERVICE_NAME = "primavara";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.ServicePrimavara.Data,
      proto.ServicePrimavara.Zodie> getTrimiteZodiaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "trimiteZodia",
      requestType = proto.ServicePrimavara.Data.class,
      responseType = proto.ServicePrimavara.Zodie.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ServicePrimavara.Data,
      proto.ServicePrimavara.Zodie> getTrimiteZodiaMethod() {
    io.grpc.MethodDescriptor<proto.ServicePrimavara.Data, proto.ServicePrimavara.Zodie> getTrimiteZodiaMethod;
    if ((getTrimiteZodiaMethod = primavaraGrpc.getTrimiteZodiaMethod) == null) {
      synchronized (primavaraGrpc.class) {
        if ((getTrimiteZodiaMethod = primavaraGrpc.getTrimiteZodiaMethod) == null) {
          primavaraGrpc.getTrimiteZodiaMethod = getTrimiteZodiaMethod = 
              io.grpc.MethodDescriptor.<proto.ServicePrimavara.Data, proto.ServicePrimavara.Zodie>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "primavara", "trimiteZodia"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ServicePrimavara.Data.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ServicePrimavara.Zodie.getDefaultInstance()))
                  .setSchemaDescriptor(new primavaraMethodDescriptorSupplier("trimiteZodia"))
                  .build();
          }
        }
     }
     return getTrimiteZodiaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static primavaraStub newStub(io.grpc.Channel channel) {
    return new primavaraStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static primavaraBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new primavaraBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static primavaraFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new primavaraFutureStub(channel);
  }

  /**
   */
  public static abstract class primavaraImplBase implements io.grpc.BindableService {

    /**
     */
    public void trimiteZodia(proto.ServicePrimavara.Data request,
        io.grpc.stub.StreamObserver<proto.ServicePrimavara.Zodie> responseObserver) {
      asyncUnimplementedUnaryCall(getTrimiteZodiaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTrimiteZodiaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ServicePrimavara.Data,
                proto.ServicePrimavara.Zodie>(
                  this, METHODID_TRIMITE_ZODIA)))
          .build();
    }
  }

  /**
   */
  public static final class primavaraStub extends io.grpc.stub.AbstractStub<primavaraStub> {
    private primavaraStub(io.grpc.Channel channel) {
      super(channel);
    }

    private primavaraStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected primavaraStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new primavaraStub(channel, callOptions);
    }

    /**
     */
    public void trimiteZodia(proto.ServicePrimavara.Data request,
        io.grpc.stub.StreamObserver<proto.ServicePrimavara.Zodie> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTrimiteZodiaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class primavaraBlockingStub extends io.grpc.stub.AbstractStub<primavaraBlockingStub> {
    private primavaraBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private primavaraBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected primavaraBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new primavaraBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.ServicePrimavara.Zodie trimiteZodia(proto.ServicePrimavara.Data request) {
      return blockingUnaryCall(
          getChannel(), getTrimiteZodiaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class primavaraFutureStub extends io.grpc.stub.AbstractStub<primavaraFutureStub> {
    private primavaraFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private primavaraFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected primavaraFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new primavaraFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ServicePrimavara.Zodie> trimiteZodia(
        proto.ServicePrimavara.Data request) {
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
    private final primavaraImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(primavaraImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRIMITE_ZODIA:
          serviceImpl.trimiteZodia((proto.ServicePrimavara.Data) request,
              (io.grpc.stub.StreamObserver<proto.ServicePrimavara.Zodie>) responseObserver);
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

  private static abstract class primavaraBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    primavaraBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ServicePrimavara.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("primavara");
    }
  }

  private static final class primavaraFileDescriptorSupplier
      extends primavaraBaseDescriptorSupplier {
    primavaraFileDescriptorSupplier() {}
  }

  private static final class primavaraMethodDescriptorSupplier
      extends primavaraBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    primavaraMethodDescriptorSupplier(String methodName) {
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
      synchronized (primavaraGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new primavaraFileDescriptorSupplier())
              .addMethod(getTrimiteZodiaMethod())
              .build();
        }
      }
    }
    return result;
  }
}

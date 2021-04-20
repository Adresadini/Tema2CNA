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
    comments = "Source: ServiceVara.proto")
public final class varaGrpc {

  private varaGrpc() {}

  public static final String SERVICE_NAME = "vara";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.ServiceVara.Data,
      proto.ServiceVara.Zodie> getTrimiteZodiaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "trimiteZodia",
      requestType = proto.ServiceVara.Data.class,
      responseType = proto.ServiceVara.Zodie.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ServiceVara.Data,
      proto.ServiceVara.Zodie> getTrimiteZodiaMethod() {
    io.grpc.MethodDescriptor<proto.ServiceVara.Data, proto.ServiceVara.Zodie> getTrimiteZodiaMethod;
    if ((getTrimiteZodiaMethod = varaGrpc.getTrimiteZodiaMethod) == null) {
      synchronized (varaGrpc.class) {
        if ((getTrimiteZodiaMethod = varaGrpc.getTrimiteZodiaMethod) == null) {
          varaGrpc.getTrimiteZodiaMethod = getTrimiteZodiaMethod = 
              io.grpc.MethodDescriptor.<proto.ServiceVara.Data, proto.ServiceVara.Zodie>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "vara", "trimiteZodia"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ServiceVara.Data.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ServiceVara.Zodie.getDefaultInstance()))
                  .setSchemaDescriptor(new varaMethodDescriptorSupplier("trimiteZodia"))
                  .build();
          }
        }
     }
     return getTrimiteZodiaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static varaStub newStub(io.grpc.Channel channel) {
    return new varaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static varaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new varaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static varaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new varaFutureStub(channel);
  }

  /**
   */
  public static abstract class varaImplBase implements io.grpc.BindableService {

    /**
     */
    public void trimiteZodia(proto.ServiceVara.Data request,
        io.grpc.stub.StreamObserver<proto.ServiceVara.Zodie> responseObserver) {
      asyncUnimplementedUnaryCall(getTrimiteZodiaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTrimiteZodiaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ServiceVara.Data,
                proto.ServiceVara.Zodie>(
                  this, METHODID_TRIMITE_ZODIA)))
          .build();
    }
  }

  /**
   */
  public static final class varaStub extends io.grpc.stub.AbstractStub<varaStub> {
    private varaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private varaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected varaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new varaStub(channel, callOptions);
    }

    /**
     */
    public void trimiteZodia(proto.ServiceVara.Data request,
        io.grpc.stub.StreamObserver<proto.ServiceVara.Zodie> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTrimiteZodiaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class varaBlockingStub extends io.grpc.stub.AbstractStub<varaBlockingStub> {
    private varaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private varaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected varaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new varaBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.ServiceVara.Zodie trimiteZodia(proto.ServiceVara.Data request) {
      return blockingUnaryCall(
          getChannel(), getTrimiteZodiaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class varaFutureStub extends io.grpc.stub.AbstractStub<varaFutureStub> {
    private varaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private varaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected varaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new varaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ServiceVara.Zodie> trimiteZodia(
        proto.ServiceVara.Data request) {
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
    private final varaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(varaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRIMITE_ZODIA:
          serviceImpl.trimiteZodia((proto.ServiceVara.Data) request,
              (io.grpc.stub.StreamObserver<proto.ServiceVara.Zodie>) responseObserver);
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

  private static abstract class varaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    varaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ServiceVara.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("vara");
    }
  }

  private static final class varaFileDescriptorSupplier
      extends varaBaseDescriptorSupplier {
    varaFileDescriptorSupplier() {}
  }

  private static final class varaMethodDescriptorSupplier
      extends varaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    varaMethodDescriptorSupplier(String methodName) {
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
      synchronized (varaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new varaFileDescriptorSupplier())
              .addMethod(getTrimiteZodiaMethod())
              .build();
        }
      }
    }
    return result;
  }
}

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
    comments = "Source: Gate.proto")
public final class gateGrpc {

  private gateGrpc() {}

  public static final String SERVICE_NAME = "gate";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.Gate.Data,
      proto.Gate.Zodie> getTrimiteZodiaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "trimiteZodia",
      requestType = proto.Gate.Data.class,
      responseType = proto.Gate.Zodie.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.Gate.Data,
      proto.Gate.Zodie> getTrimiteZodiaMethod() {
    io.grpc.MethodDescriptor<proto.Gate.Data, proto.Gate.Zodie> getTrimiteZodiaMethod;
    if ((getTrimiteZodiaMethod = gateGrpc.getTrimiteZodiaMethod) == null) {
      synchronized (gateGrpc.class) {
        if ((getTrimiteZodiaMethod = gateGrpc.getTrimiteZodiaMethod) == null) {
          gateGrpc.getTrimiteZodiaMethod = getTrimiteZodiaMethod = 
              io.grpc.MethodDescriptor.<proto.Gate.Data, proto.Gate.Zodie>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gate", "trimiteZodia"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Gate.Data.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Gate.Zodie.getDefaultInstance()))
                  .setSchemaDescriptor(new gateMethodDescriptorSupplier("trimiteZodia"))
                  .build();
          }
        }
     }
     return getTrimiteZodiaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static gateStub newStub(io.grpc.Channel channel) {
    return new gateStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static gateBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new gateBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static gateFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new gateFutureStub(channel);
  }

  /**
   */
  public static abstract class gateImplBase implements io.grpc.BindableService {

    /**
     */
    public void trimiteZodia(proto.Gate.Data request,
        io.grpc.stub.StreamObserver<proto.Gate.Zodie> responseObserver) {
      asyncUnimplementedUnaryCall(getTrimiteZodiaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTrimiteZodiaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.Gate.Data,
                proto.Gate.Zodie>(
                  this, METHODID_TRIMITE_ZODIA)))
          .build();
    }
  }

  /**
   */
  public static final class gateStub extends io.grpc.stub.AbstractStub<gateStub> {
    private gateStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gateStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gateStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gateStub(channel, callOptions);
    }

    /**
     */
    public void trimiteZodia(proto.Gate.Data request,
        io.grpc.stub.StreamObserver<proto.Gate.Zodie> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTrimiteZodiaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class gateBlockingStub extends io.grpc.stub.AbstractStub<gateBlockingStub> {
    private gateBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gateBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gateBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gateBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.Gate.Zodie trimiteZodia(proto.Gate.Data request) {
      return blockingUnaryCall(
          getChannel(), getTrimiteZodiaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class gateFutureStub extends io.grpc.stub.AbstractStub<gateFutureStub> {
    private gateFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gateFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gateFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gateFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Gate.Zodie> trimiteZodia(
        proto.Gate.Data request) {
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
    private final gateImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(gateImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRIMITE_ZODIA:
          serviceImpl.trimiteZodia((proto.Gate.Data) request,
              (io.grpc.stub.StreamObserver<proto.Gate.Zodie>) responseObserver);
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

  private static abstract class gateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    gateBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.Gate.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("gate");
    }
  }

  private static final class gateFileDescriptorSupplier
      extends gateBaseDescriptorSupplier {
    gateFileDescriptorSupplier() {}
  }

  private static final class gateMethodDescriptorSupplier
      extends gateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    gateMethodDescriptorSupplier(String methodName) {
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
      synchronized (gateGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new gateFileDescriptorSupplier())
              .addMethod(getTrimiteZodiaMethod())
              .build();
        }
      }
    }
    return result;
  }
}

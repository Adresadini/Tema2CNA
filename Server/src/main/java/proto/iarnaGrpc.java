package proto;

import io.grpc.stub.StreamObserver;

import java.io.FileNotFoundException;

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
    comments = "Source: ServiceIarna.proto")
public final class iarnaGrpc {

  private iarnaGrpc() {}

  public static final String SERVICE_NAME = "iarna";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.ServiceIarna.Data,
      proto.ServiceIarna.Zodie> getTrimiteZodiaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "trimiteZodia",
      requestType = proto.ServiceIarna.Data.class,
      responseType = proto.ServiceIarna.Zodie.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ServiceIarna.Data,
      proto.ServiceIarna.Zodie> getTrimiteZodiaMethod() {
    io.grpc.MethodDescriptor<proto.ServiceIarna.Data, proto.ServiceIarna.Zodie> getTrimiteZodiaMethod;
    if ((getTrimiteZodiaMethod = iarnaGrpc.getTrimiteZodiaMethod) == null) {
      synchronized (iarnaGrpc.class) {
        if ((getTrimiteZodiaMethod = iarnaGrpc.getTrimiteZodiaMethod) == null) {
          iarnaGrpc.getTrimiteZodiaMethod = getTrimiteZodiaMethod = 
              io.grpc.MethodDescriptor.<proto.ServiceIarna.Data, proto.ServiceIarna.Zodie>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iarna", "trimiteZodia"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ServiceIarna.Data.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ServiceIarna.Zodie.getDefaultInstance()))
                  .setSchemaDescriptor(new iarnaMethodDescriptorSupplier("trimiteZodia"))
                  .build();
          }
        }
     }
     return getTrimiteZodiaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static iarnaStub newStub(io.grpc.Channel channel) {
    return new iarnaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static iarnaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new iarnaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static iarnaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new iarnaFutureStub(channel);
  }

  /**
   */
  public static abstract class iarnaImplBase implements io.grpc.BindableService {

    /**
     */
    public void trimiteZodia(proto.ServiceIarna.Data request,
        io.grpc.stub.StreamObserver<proto.ServiceIarna.Zodie> responseObserver) throws FileNotFoundException {
      asyncUnimplementedUnaryCall(getTrimiteZodiaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTrimiteZodiaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ServiceIarna.Data,
                proto.ServiceIarna.Zodie>(
                  this, METHODID_TRIMITE_ZODIA)))
          .build();
    }
  }

  /**
   */
  public static final class iarnaStub extends io.grpc.stub.AbstractStub<iarnaStub> {
    private iarnaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private iarnaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected iarnaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new iarnaStub(channel, callOptions);
    }

    /**
     */
    public void trimiteZodia(ServiceIarna.Data.Builder request,
                             StreamObserver<ServiceIarna.Zodie> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTrimiteZodiaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class iarnaBlockingStub extends io.grpc.stub.AbstractStub<iarnaBlockingStub> {
    private iarnaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private iarnaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected iarnaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new iarnaBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.ServiceIarna.Zodie trimiteZodia(proto.ServiceIarna.Data request) {
      return blockingUnaryCall(
          getChannel(), getTrimiteZodiaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class iarnaFutureStub extends io.grpc.stub.AbstractStub<iarnaFutureStub> {
    private iarnaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private iarnaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected iarnaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new iarnaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ServiceIarna.Zodie> trimiteZodia(
        proto.ServiceIarna.Data request) {
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
    private final iarnaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(iarnaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRIMITE_ZODIA:
          serviceImpl.trimiteZodia((proto.ServiceIarna.Data) request,
              (io.grpc.stub.StreamObserver<proto.ServiceIarna.Zodie>) responseObserver);
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

  private static abstract class iarnaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    iarnaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ServiceIarna.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("iarna");
    }
  }

  private static final class iarnaFileDescriptorSupplier
      extends iarnaBaseDescriptorSupplier {
    iarnaFileDescriptorSupplier() {}
  }

  private static final class iarnaMethodDescriptorSupplier
      extends iarnaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    iarnaMethodDescriptorSupplier(String methodName) {
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
      synchronized (iarnaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new iarnaFileDescriptorSupplier())
              .addMethod(getTrimiteZodiaMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package studentq.queue;

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
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: QueueService.proto")
public final class QueueServiceGrpc {

  private QueueServiceGrpc() {}

  public static final String SERVICE_NAME = "studentq.queue.QueueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<studentq.queue.QueueServiceOuterClass.AddQueue,
      studentq.queue.QueueServiceOuterClass.Response> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = studentq.queue.QueueServiceOuterClass.AddQueue.class,
      responseType = studentq.queue.QueueServiceOuterClass.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<studentq.queue.QueueServiceOuterClass.AddQueue,
      studentq.queue.QueueServiceOuterClass.Response> getAddMethod() {
    io.grpc.MethodDescriptor<studentq.queue.QueueServiceOuterClass.AddQueue, studentq.queue.QueueServiceOuterClass.Response> getAddMethod;
    if ((getAddMethod = QueueServiceGrpc.getAddMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getAddMethod = QueueServiceGrpc.getAddMethod) == null) {
          QueueServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<studentq.queue.QueueServiceOuterClass.AddQueue, studentq.queue.QueueServiceOuterClass.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.queue.QueueServiceOuterClass.AddQueue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.queue.QueueServiceOuterClass.Response.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<studentq.queue.QueueServiceOuterClass.HexRequest,
      studentq.queue.QueueServiceOuterClass.QueueResponse> getGetByHexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByHex",
      requestType = studentq.queue.QueueServiceOuterClass.HexRequest.class,
      responseType = studentq.queue.QueueServiceOuterClass.QueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<studentq.queue.QueueServiceOuterClass.HexRequest,
      studentq.queue.QueueServiceOuterClass.QueueResponse> getGetByHexMethod() {
    io.grpc.MethodDescriptor<studentq.queue.QueueServiceOuterClass.HexRequest, studentq.queue.QueueServiceOuterClass.QueueResponse> getGetByHexMethod;
    if ((getGetByHexMethod = QueueServiceGrpc.getGetByHexMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getGetByHexMethod = QueueServiceGrpc.getGetByHexMethod) == null) {
          QueueServiceGrpc.getGetByHexMethod = getGetByHexMethod =
              io.grpc.MethodDescriptor.<studentq.queue.QueueServiceOuterClass.HexRequest, studentq.queue.QueueServiceOuterClass.QueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByHex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.queue.QueueServiceOuterClass.HexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.queue.QueueServiceOuterClass.QueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("getByHex"))
              .build();
        }
      }
    }
    return getGetByHexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<studentq.queue.QueueServiceOuterClass.DeleteRequest,
      studentq.queue.QueueServiceOuterClass.Response> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = studentq.queue.QueueServiceOuterClass.DeleteRequest.class,
      responseType = studentq.queue.QueueServiceOuterClass.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<studentq.queue.QueueServiceOuterClass.DeleteRequest,
      studentq.queue.QueueServiceOuterClass.Response> getDeleteMethod() {
    io.grpc.MethodDescriptor<studentq.queue.QueueServiceOuterClass.DeleteRequest, studentq.queue.QueueServiceOuterClass.Response> getDeleteMethod;
    if ((getDeleteMethod = QueueServiceGrpc.getDeleteMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getDeleteMethod = QueueServiceGrpc.getDeleteMethod) == null) {
          QueueServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<studentq.queue.QueueServiceOuterClass.DeleteRequest, studentq.queue.QueueServiceOuterClass.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.queue.QueueServiceOuterClass.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.queue.QueueServiceOuterClass.Response.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<studentq.queue.QueueServiceOuterClass.AllResponse,
      studentq.queue.QueueServiceOuterClass.QueueResponse> getAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "all",
      requestType = studentq.queue.QueueServiceOuterClass.AllResponse.class,
      responseType = studentq.queue.QueueServiceOuterClass.QueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<studentq.queue.QueueServiceOuterClass.AllResponse,
      studentq.queue.QueueServiceOuterClass.QueueResponse> getAllMethod() {
    io.grpc.MethodDescriptor<studentq.queue.QueueServiceOuterClass.AllResponse, studentq.queue.QueueServiceOuterClass.QueueResponse> getAllMethod;
    if ((getAllMethod = QueueServiceGrpc.getAllMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getAllMethod = QueueServiceGrpc.getAllMethod) == null) {
          QueueServiceGrpc.getAllMethod = getAllMethod =
              io.grpc.MethodDescriptor.<studentq.queue.QueueServiceOuterClass.AllResponse, studentq.queue.QueueServiceOuterClass.QueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "all"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.queue.QueueServiceOuterClass.AllResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.queue.QueueServiceOuterClass.QueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("all"))
              .build();
        }
      }
    }
    return getAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueueServiceStub newStub(io.grpc.Channel channel) {
    return new QueueServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueueServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueueServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class QueueServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void add(studentq.queue.QueueServiceOuterClass.AddQueue request,
        io.grpc.stub.StreamObserver<studentq.queue.QueueServiceOuterClass.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void getByHex(studentq.queue.QueueServiceOuterClass.HexRequest request,
        io.grpc.stub.StreamObserver<studentq.queue.QueueServiceOuterClass.QueueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByHexMethod(), responseObserver);
    }

    /**
     */
    public void delete(studentq.queue.QueueServiceOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<studentq.queue.QueueServiceOuterClass.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void all(studentq.queue.QueueServiceOuterClass.AllResponse request,
        io.grpc.stub.StreamObserver<studentq.queue.QueueServiceOuterClass.QueueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                studentq.queue.QueueServiceOuterClass.AddQueue,
                studentq.queue.QueueServiceOuterClass.Response>(
                  this, METHODID_ADD)))
          .addMethod(
            getGetByHexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                studentq.queue.QueueServiceOuterClass.HexRequest,
                studentq.queue.QueueServiceOuterClass.QueueResponse>(
                  this, METHODID_GET_BY_HEX)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                studentq.queue.QueueServiceOuterClass.DeleteRequest,
                studentq.queue.QueueServiceOuterClass.Response>(
                  this, METHODID_DELETE)))
          .addMethod(
            getAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                studentq.queue.QueueServiceOuterClass.AllResponse,
                studentq.queue.QueueServiceOuterClass.QueueResponse>(
                  this, METHODID_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class QueueServiceStub extends io.grpc.stub.AbstractStub<QueueServiceStub> {
    private QueueServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueueServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueueServiceStub(channel, callOptions);
    }

    /**
     */
    public void add(studentq.queue.QueueServiceOuterClass.AddQueue request,
        io.grpc.stub.StreamObserver<studentq.queue.QueueServiceOuterClass.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByHex(studentq.queue.QueueServiceOuterClass.HexRequest request,
        io.grpc.stub.StreamObserver<studentq.queue.QueueServiceOuterClass.QueueResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByHexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(studentq.queue.QueueServiceOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<studentq.queue.QueueServiceOuterClass.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void all(studentq.queue.QueueServiceOuterClass.AllResponse request,
        io.grpc.stub.StreamObserver<studentq.queue.QueueServiceOuterClass.QueueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QueueServiceBlockingStub extends io.grpc.stub.AbstractStub<QueueServiceBlockingStub> {
    private QueueServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueueServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueueServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public studentq.queue.QueueServiceOuterClass.Response add(studentq.queue.QueueServiceOuterClass.AddQueue request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public studentq.queue.QueueServiceOuterClass.QueueResponse getByHex(studentq.queue.QueueServiceOuterClass.HexRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByHexMethod(), getCallOptions(), request);
    }

    /**
     */
    public studentq.queue.QueueServiceOuterClass.Response delete(studentq.queue.QueueServiceOuterClass.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<studentq.queue.QueueServiceOuterClass.QueueResponse> all(
        studentq.queue.QueueServiceOuterClass.AllResponse request) {
      return blockingServerStreamingCall(
          getChannel(), getAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QueueServiceFutureStub extends io.grpc.stub.AbstractStub<QueueServiceFutureStub> {
    private QueueServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueueServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueueServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<studentq.queue.QueueServiceOuterClass.Response> add(
        studentq.queue.QueueServiceOuterClass.AddQueue request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<studentq.queue.QueueServiceOuterClass.QueueResponse> getByHex(
        studentq.queue.QueueServiceOuterClass.HexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByHexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<studentq.queue.QueueServiceOuterClass.Response> delete(
        studentq.queue.QueueServiceOuterClass.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_GET_BY_HEX = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_ALL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((studentq.queue.QueueServiceOuterClass.AddQueue) request,
              (io.grpc.stub.StreamObserver<studentq.queue.QueueServiceOuterClass.Response>) responseObserver);
          break;
        case METHODID_GET_BY_HEX:
          serviceImpl.getByHex((studentq.queue.QueueServiceOuterClass.HexRequest) request,
              (io.grpc.stub.StreamObserver<studentq.queue.QueueServiceOuterClass.QueueResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((studentq.queue.QueueServiceOuterClass.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<studentq.queue.QueueServiceOuterClass.Response>) responseObserver);
          break;
        case METHODID_ALL:
          serviceImpl.all((studentq.queue.QueueServiceOuterClass.AllResponse) request,
              (io.grpc.stub.StreamObserver<studentq.queue.QueueServiceOuterClass.QueueResponse>) responseObserver);
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

  private static abstract class QueueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return studentq.queue.QueueServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueueService");
    }
  }

  private static final class QueueServiceFileDescriptorSupplier
      extends QueueServiceBaseDescriptorSupplier {
    QueueServiceFileDescriptorSupplier() {}
  }

  private static final class QueueServiceMethodDescriptorSupplier
      extends QueueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueueServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueueServiceFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getGetByHexMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package studentq.listqueues;

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
    comments = "Source: ListOfQueue.proto")
public final class ListOfQueueServiceGrpc {

  private ListOfQueueServiceGrpc() {}

  public static final String SERVICE_NAME = "studentq.listqueues.ListOfQueueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.AddResponse,
      studentq.listqueues.ListOfQueue.Response> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = studentq.listqueues.ListOfQueue.AddResponse.class,
      responseType = studentq.listqueues.ListOfQueue.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.AddResponse,
      studentq.listqueues.ListOfQueue.Response> getAddMethod() {
    io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.AddResponse, studentq.listqueues.ListOfQueue.Response> getAddMethod;
    if ((getAddMethod = ListOfQueueServiceGrpc.getAddMethod) == null) {
      synchronized (ListOfQueueServiceGrpc.class) {
        if ((getAddMethod = ListOfQueueServiceGrpc.getAddMethod) == null) {
          ListOfQueueServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<studentq.listqueues.ListOfQueue.AddResponse, studentq.listqueues.ListOfQueue.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.listqueues.ListOfQueue.AddResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.listqueues.ListOfQueue.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ListOfQueueServiceMethodDescriptorSupplier("add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.AllRequest,
      studentq.listqueues.ListOfQueue.ListQueueResponse> getAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "all",
      requestType = studentq.listqueues.ListOfQueue.AllRequest.class,
      responseType = studentq.listqueues.ListOfQueue.ListQueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.AllRequest,
      studentq.listqueues.ListOfQueue.ListQueueResponse> getAllMethod() {
    io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.AllRequest, studentq.listqueues.ListOfQueue.ListQueueResponse> getAllMethod;
    if ((getAllMethod = ListOfQueueServiceGrpc.getAllMethod) == null) {
      synchronized (ListOfQueueServiceGrpc.class) {
        if ((getAllMethod = ListOfQueueServiceGrpc.getAllMethod) == null) {
          ListOfQueueServiceGrpc.getAllMethod = getAllMethod =
              io.grpc.MethodDescriptor.<studentq.listqueues.ListOfQueue.AllRequest, studentq.listqueues.ListOfQueue.ListQueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "all"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.listqueues.ListOfQueue.AllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.listqueues.ListOfQueue.ListQueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListOfQueueServiceMethodDescriptorSupplier("all"))
              .build();
        }
      }
    }
    return getAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.IdStudentRequest,
      studentq.listqueues.ListOfQueue.ListQueueResponse> getGetByIdStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByIdStudent",
      requestType = studentq.listqueues.ListOfQueue.IdStudentRequest.class,
      responseType = studentq.listqueues.ListOfQueue.ListQueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.IdStudentRequest,
      studentq.listqueues.ListOfQueue.ListQueueResponse> getGetByIdStudentMethod() {
    io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.IdStudentRequest, studentq.listqueues.ListOfQueue.ListQueueResponse> getGetByIdStudentMethod;
    if ((getGetByIdStudentMethod = ListOfQueueServiceGrpc.getGetByIdStudentMethod) == null) {
      synchronized (ListOfQueueServiceGrpc.class) {
        if ((getGetByIdStudentMethod = ListOfQueueServiceGrpc.getGetByIdStudentMethod) == null) {
          ListOfQueueServiceGrpc.getGetByIdStudentMethod = getGetByIdStudentMethod =
              io.grpc.MethodDescriptor.<studentq.listqueues.ListOfQueue.IdStudentRequest, studentq.listqueues.ListOfQueue.ListQueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByIdStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.listqueues.ListOfQueue.IdStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.listqueues.ListOfQueue.ListQueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListOfQueueServiceMethodDescriptorSupplier("getByIdStudent"))
              .build();
        }
      }
    }
    return getGetByIdStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.IdQueueRequest,
      studentq.listqueues.ListOfQueue.ListQueueResponse> getGetByIdQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByIdQueue",
      requestType = studentq.listqueues.ListOfQueue.IdQueueRequest.class,
      responseType = studentq.listqueues.ListOfQueue.ListQueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.IdQueueRequest,
      studentq.listqueues.ListOfQueue.ListQueueResponse> getGetByIdQueueMethod() {
    io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.IdQueueRequest, studentq.listqueues.ListOfQueue.ListQueueResponse> getGetByIdQueueMethod;
    if ((getGetByIdQueueMethod = ListOfQueueServiceGrpc.getGetByIdQueueMethod) == null) {
      synchronized (ListOfQueueServiceGrpc.class) {
        if ((getGetByIdQueueMethod = ListOfQueueServiceGrpc.getGetByIdQueueMethod) == null) {
          ListOfQueueServiceGrpc.getGetByIdQueueMethod = getGetByIdQueueMethod =
              io.grpc.MethodDescriptor.<studentq.listqueues.ListOfQueue.IdQueueRequest, studentq.listqueues.ListOfQueue.ListQueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByIdQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.listqueues.ListOfQueue.IdQueueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.listqueues.ListOfQueue.ListQueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListOfQueueServiceMethodDescriptorSupplier("getByIdQueue"))
              .build();
        }
      }
    }
    return getGetByIdQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.DeleteRequest,
      studentq.listqueues.ListOfQueue.Response> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = studentq.listqueues.ListOfQueue.DeleteRequest.class,
      responseType = studentq.listqueues.ListOfQueue.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.DeleteRequest,
      studentq.listqueues.ListOfQueue.Response> getDeleteMethod() {
    io.grpc.MethodDescriptor<studentq.listqueues.ListOfQueue.DeleteRequest, studentq.listqueues.ListOfQueue.Response> getDeleteMethod;
    if ((getDeleteMethod = ListOfQueueServiceGrpc.getDeleteMethod) == null) {
      synchronized (ListOfQueueServiceGrpc.class) {
        if ((getDeleteMethod = ListOfQueueServiceGrpc.getDeleteMethod) == null) {
          ListOfQueueServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<studentq.listqueues.ListOfQueue.DeleteRequest, studentq.listqueues.ListOfQueue.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.listqueues.ListOfQueue.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.listqueues.ListOfQueue.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ListOfQueueServiceMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ListOfQueueServiceStub newStub(io.grpc.Channel channel) {
    return new ListOfQueueServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ListOfQueueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ListOfQueueServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ListOfQueueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ListOfQueueServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ListOfQueueServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void add(studentq.listqueues.ListOfQueue.AddResponse request,
        io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void all(studentq.listqueues.ListOfQueue.AllRequest request,
        io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.ListQueueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllMethod(), responseObserver);
    }

    /**
     */
    public void getByIdStudent(studentq.listqueues.ListOfQueue.IdStudentRequest request,
        io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.ListQueueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByIdStudentMethod(), responseObserver);
    }

    /**
     */
    public void getByIdQueue(studentq.listqueues.ListOfQueue.IdQueueRequest request,
        io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.ListQueueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByIdQueueMethod(), responseObserver);
    }

    /**
     */
    public void delete(studentq.listqueues.ListOfQueue.DeleteRequest request,
        io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                studentq.listqueues.ListOfQueue.AddResponse,
                studentq.listqueues.ListOfQueue.Response>(
                  this, METHODID_ADD)))
          .addMethod(
            getAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                studentq.listqueues.ListOfQueue.AllRequest,
                studentq.listqueues.ListOfQueue.ListQueueResponse>(
                  this, METHODID_ALL)))
          .addMethod(
            getGetByIdStudentMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                studentq.listqueues.ListOfQueue.IdStudentRequest,
                studentq.listqueues.ListOfQueue.ListQueueResponse>(
                  this, METHODID_GET_BY_ID_STUDENT)))
          .addMethod(
            getGetByIdQueueMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                studentq.listqueues.ListOfQueue.IdQueueRequest,
                studentq.listqueues.ListOfQueue.ListQueueResponse>(
                  this, METHODID_GET_BY_ID_QUEUE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                studentq.listqueues.ListOfQueue.DeleteRequest,
                studentq.listqueues.ListOfQueue.Response>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class ListOfQueueServiceStub extends io.grpc.stub.AbstractStub<ListOfQueueServiceStub> {
    private ListOfQueueServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ListOfQueueServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListOfQueueServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ListOfQueueServiceStub(channel, callOptions);
    }

    /**
     */
    public void add(studentq.listqueues.ListOfQueue.AddResponse request,
        io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void all(studentq.listqueues.ListOfQueue.AllRequest request,
        io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.ListQueueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByIdStudent(studentq.listqueues.ListOfQueue.IdStudentRequest request,
        io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.ListQueueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetByIdStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByIdQueue(studentq.listqueues.ListOfQueue.IdQueueRequest request,
        io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.ListQueueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetByIdQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(studentq.listqueues.ListOfQueue.DeleteRequest request,
        io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ListOfQueueServiceBlockingStub extends io.grpc.stub.AbstractStub<ListOfQueueServiceBlockingStub> {
    private ListOfQueueServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ListOfQueueServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListOfQueueServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ListOfQueueServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public studentq.listqueues.ListOfQueue.Response add(studentq.listqueues.ListOfQueue.AddResponse request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<studentq.listqueues.ListOfQueue.ListQueueResponse> all(
        studentq.listqueues.ListOfQueue.AllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<studentq.listqueues.ListOfQueue.ListQueueResponse> getByIdStudent(
        studentq.listqueues.ListOfQueue.IdStudentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetByIdStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<studentq.listqueues.ListOfQueue.ListQueueResponse> getByIdQueue(
        studentq.listqueues.ListOfQueue.IdQueueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetByIdQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public studentq.listqueues.ListOfQueue.Response delete(studentq.listqueues.ListOfQueue.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ListOfQueueServiceFutureStub extends io.grpc.stub.AbstractStub<ListOfQueueServiceFutureStub> {
    private ListOfQueueServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ListOfQueueServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListOfQueueServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ListOfQueueServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<studentq.listqueues.ListOfQueue.Response> add(
        studentq.listqueues.ListOfQueue.AddResponse request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<studentq.listqueues.ListOfQueue.Response> delete(
        studentq.listqueues.ListOfQueue.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_ALL = 1;
  private static final int METHODID_GET_BY_ID_STUDENT = 2;
  private static final int METHODID_GET_BY_ID_QUEUE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ListOfQueueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ListOfQueueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((studentq.listqueues.ListOfQueue.AddResponse) request,
              (io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.Response>) responseObserver);
          break;
        case METHODID_ALL:
          serviceImpl.all((studentq.listqueues.ListOfQueue.AllRequest) request,
              (io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.ListQueueResponse>) responseObserver);
          break;
        case METHODID_GET_BY_ID_STUDENT:
          serviceImpl.getByIdStudent((studentq.listqueues.ListOfQueue.IdStudentRequest) request,
              (io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.ListQueueResponse>) responseObserver);
          break;
        case METHODID_GET_BY_ID_QUEUE:
          serviceImpl.getByIdQueue((studentq.listqueues.ListOfQueue.IdQueueRequest) request,
              (io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.ListQueueResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((studentq.listqueues.ListOfQueue.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<studentq.listqueues.ListOfQueue.Response>) responseObserver);
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

  private static abstract class ListOfQueueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ListOfQueueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return studentq.listqueues.ListOfQueue.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ListOfQueueService");
    }
  }

  private static final class ListOfQueueServiceFileDescriptorSupplier
      extends ListOfQueueServiceBaseDescriptorSupplier {
    ListOfQueueServiceFileDescriptorSupplier() {}
  }

  private static final class ListOfQueueServiceMethodDescriptorSupplier
      extends ListOfQueueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ListOfQueueServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ListOfQueueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ListOfQueueServiceFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getAllMethod())
              .addMethod(getGetByIdStudentMethod())
              .addMethod(getGetByIdQueueMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}

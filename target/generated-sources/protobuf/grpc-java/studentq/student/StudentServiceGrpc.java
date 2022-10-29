package studentq.student;

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
    comments = "Source: StudentService.proto")
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final String SERVICE_NAME = "studentq.student.StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<studentq.student.StudentServiceOuterClass.StudentResponse,
      studentq.student.StudentServiceOuterClass.Response> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = studentq.student.StudentServiceOuterClass.StudentResponse.class,
      responseType = studentq.student.StudentServiceOuterClass.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<studentq.student.StudentServiceOuterClass.StudentResponse,
      studentq.student.StudentServiceOuterClass.Response> getAddMethod() {
    io.grpc.MethodDescriptor<studentq.student.StudentServiceOuterClass.StudentResponse, studentq.student.StudentServiceOuterClass.Response> getAddMethod;
    if ((getAddMethod = StudentServiceGrpc.getAddMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getAddMethod = StudentServiceGrpc.getAddMethod) == null) {
          StudentServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<studentq.student.StudentServiceOuterClass.StudentResponse, studentq.student.StudentServiceOuterClass.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.student.StudentServiceOuterClass.StudentResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.student.StudentServiceOuterClass.Response.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<studentq.student.StudentServiceOuterClass.AllRequest,
      studentq.student.StudentServiceOuterClass.StudentResponse> getAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "all",
      requestType = studentq.student.StudentServiceOuterClass.AllRequest.class,
      responseType = studentq.student.StudentServiceOuterClass.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<studentq.student.StudentServiceOuterClass.AllRequest,
      studentq.student.StudentServiceOuterClass.StudentResponse> getAllMethod() {
    io.grpc.MethodDescriptor<studentq.student.StudentServiceOuterClass.AllRequest, studentq.student.StudentServiceOuterClass.StudentResponse> getAllMethod;
    if ((getAllMethod = StudentServiceGrpc.getAllMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getAllMethod = StudentServiceGrpc.getAllMethod) == null) {
          StudentServiceGrpc.getAllMethod = getAllMethod =
              io.grpc.MethodDescriptor.<studentq.student.StudentServiceOuterClass.AllRequest, studentq.student.StudentServiceOuterClass.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "all"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.student.StudentServiceOuterClass.AllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.student.StudentServiceOuterClass.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("all"))
              .build();
        }
      }
    }
    return getAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<studentq.student.StudentServiceOuterClass.IdRequest,
      studentq.student.StudentServiceOuterClass.StudentResponse> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getById",
      requestType = studentq.student.StudentServiceOuterClass.IdRequest.class,
      responseType = studentq.student.StudentServiceOuterClass.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<studentq.student.StudentServiceOuterClass.IdRequest,
      studentq.student.StudentServiceOuterClass.StudentResponse> getGetByIdMethod() {
    io.grpc.MethodDescriptor<studentq.student.StudentServiceOuterClass.IdRequest, studentq.student.StudentServiceOuterClass.StudentResponse> getGetByIdMethod;
    if ((getGetByIdMethod = StudentServiceGrpc.getGetByIdMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetByIdMethod = StudentServiceGrpc.getGetByIdMethod) == null) {
          StudentServiceGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<studentq.student.StudentServiceOuterClass.IdRequest, studentq.student.StudentServiceOuterClass.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.student.StudentServiceOuterClass.IdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.student.StudentServiceOuterClass.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("getById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<studentq.student.StudentServiceOuterClass.DeleteRequest,
      studentq.student.StudentServiceOuterClass.Response> getDeleteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteById",
      requestType = studentq.student.StudentServiceOuterClass.DeleteRequest.class,
      responseType = studentq.student.StudentServiceOuterClass.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<studentq.student.StudentServiceOuterClass.DeleteRequest,
      studentq.student.StudentServiceOuterClass.Response> getDeleteByIdMethod() {
    io.grpc.MethodDescriptor<studentq.student.StudentServiceOuterClass.DeleteRequest, studentq.student.StudentServiceOuterClass.Response> getDeleteByIdMethod;
    if ((getDeleteByIdMethod = StudentServiceGrpc.getDeleteByIdMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getDeleteByIdMethod = StudentServiceGrpc.getDeleteByIdMethod) == null) {
          StudentServiceGrpc.getDeleteByIdMethod = getDeleteByIdMethod =
              io.grpc.MethodDescriptor.<studentq.student.StudentServiceOuterClass.DeleteRequest, studentq.student.StudentServiceOuterClass.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.student.StudentServiceOuterClass.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  studentq.student.StudentServiceOuterClass.Response.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("deleteById"))
              .build();
        }
      }
    }
    return getDeleteByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    return new StudentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StudentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void add(studentq.student.StudentServiceOuterClass.StudentResponse request,
        io.grpc.stub.StreamObserver<studentq.student.StudentServiceOuterClass.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void all(studentq.student.StudentServiceOuterClass.AllRequest request,
        io.grpc.stub.StreamObserver<studentq.student.StudentServiceOuterClass.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllMethod(), responseObserver);
    }

    /**
     */
    public void getById(studentq.student.StudentServiceOuterClass.IdRequest request,
        io.grpc.stub.StreamObserver<studentq.student.StudentServiceOuterClass.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteById(studentq.student.StudentServiceOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<studentq.student.StudentServiceOuterClass.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                studentq.student.StudentServiceOuterClass.StudentResponse,
                studentq.student.StudentServiceOuterClass.Response>(
                  this, METHODID_ADD)))
          .addMethod(
            getAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                studentq.student.StudentServiceOuterClass.AllRequest,
                studentq.student.StudentServiceOuterClass.StudentResponse>(
                  this, METHODID_ALL)))
          .addMethod(
            getGetByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                studentq.student.StudentServiceOuterClass.IdRequest,
                studentq.student.StudentServiceOuterClass.StudentResponse>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getDeleteByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                studentq.student.StudentServiceOuterClass.DeleteRequest,
                studentq.student.StudentServiceOuterClass.Response>(
                  this, METHODID_DELETE_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class StudentServiceStub extends io.grpc.stub.AbstractStub<StudentServiceStub> {
    private StudentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void add(studentq.student.StudentServiceOuterClass.StudentResponse request,
        io.grpc.stub.StreamObserver<studentq.student.StudentServiceOuterClass.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void all(studentq.student.StudentServiceOuterClass.AllRequest request,
        io.grpc.stub.StreamObserver<studentq.student.StudentServiceOuterClass.StudentResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getById(studentq.student.StudentServiceOuterClass.IdRequest request,
        io.grpc.stub.StreamObserver<studentq.student.StudentServiceOuterClass.StudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteById(studentq.student.StudentServiceOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<studentq.student.StudentServiceOuterClass.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StudentServiceBlockingStub extends io.grpc.stub.AbstractStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public studentq.student.StudentServiceOuterClass.Response add(studentq.student.StudentServiceOuterClass.StudentResponse request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<studentq.student.StudentServiceOuterClass.StudentResponse> all(
        studentq.student.StudentServiceOuterClass.AllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public studentq.student.StudentServiceOuterClass.StudentResponse getById(studentq.student.StudentServiceOuterClass.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public studentq.student.StudentServiceOuterClass.Response deleteById(studentq.student.StudentServiceOuterClass.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentServiceFutureStub extends io.grpc.stub.AbstractStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<studentq.student.StudentServiceOuterClass.Response> add(
        studentq.student.StudentServiceOuterClass.StudentResponse request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<studentq.student.StudentServiceOuterClass.StudentResponse> getById(
        studentq.student.StudentServiceOuterClass.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<studentq.student.StudentServiceOuterClass.Response> deleteById(
        studentq.student.StudentServiceOuterClass.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_ALL = 1;
  private static final int METHODID_GET_BY_ID = 2;
  private static final int METHODID_DELETE_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((studentq.student.StudentServiceOuterClass.StudentResponse) request,
              (io.grpc.stub.StreamObserver<studentq.student.StudentServiceOuterClass.Response>) responseObserver);
          break;
        case METHODID_ALL:
          serviceImpl.all((studentq.student.StudentServiceOuterClass.AllRequest) request,
              (io.grpc.stub.StreamObserver<studentq.student.StudentServiceOuterClass.StudentResponse>) responseObserver);
          break;
        case METHODID_GET_BY_ID:
          serviceImpl.getById((studentq.student.StudentServiceOuterClass.IdRequest) request,
              (io.grpc.stub.StreamObserver<studentq.student.StudentServiceOuterClass.StudentResponse>) responseObserver);
          break;
        case METHODID_DELETE_BY_ID:
          serviceImpl.deleteById((studentq.student.StudentServiceOuterClass.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<studentq.student.StudentServiceOuterClass.Response>) responseObserver);
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

  private static abstract class StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return studentq.student.StudentServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {}
  }

  private static final class StudentServiceMethodDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getAllMethod())
              .addMethod(getGetByIdMethod())
              .addMethod(getDeleteByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}

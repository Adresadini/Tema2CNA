// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServiceToamna.proto

package proto;

public final class ServiceToamna {
  private ServiceToamna() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Data)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 Zi = 1;</code>
     */
    int getZi();

    /**
     * <code>int32 Luna = 2;</code>
     */
    int getLuna();

    /**
     * <code>int32 An = 3;</code>
     */
    int getAn();
  }
  /**
   * Protobuf type {@code Data}
   */
  public  static final class Data extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Data)
      DataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Data.newBuilder() to construct.
    private Data(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Data() {
      zi_ = 0;
      luna_ = 0;
      an_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Data(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              zi_ = input.readInt32();
              break;
            }
            case 16: {

              luna_ = input.readInt32();
              break;
            }
            case 24: {

              an_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.ServiceToamna.internal_static_Data_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.ServiceToamna.internal_static_Data_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.ServiceToamna.Data.class, proto.ServiceToamna.Data.Builder.class);
    }

    public static final int ZI_FIELD_NUMBER = 1;
    private int zi_;
    /**
     * <code>int32 Zi = 1;</code>
     */
    public int getZi() {
      return zi_;
    }

    public static final int LUNA_FIELD_NUMBER = 2;
    private int luna_;
    /**
     * <code>int32 Luna = 2;</code>
     */
    public int getLuna() {
      return luna_;
    }

    public static final int AN_FIELD_NUMBER = 3;
    private int an_;
    /**
     * <code>int32 An = 3;</code>
     */
    public int getAn() {
      return an_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (zi_ != 0) {
        output.writeInt32(1, zi_);
      }
      if (luna_ != 0) {
        output.writeInt32(2, luna_);
      }
      if (an_ != 0) {
        output.writeInt32(3, an_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (zi_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, zi_);
      }
      if (luna_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, luna_);
      }
      if (an_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, an_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof proto.ServiceToamna.Data)) {
        return super.equals(obj);
      }
      proto.ServiceToamna.Data other = (proto.ServiceToamna.Data) obj;

      boolean result = true;
      result = result && (getZi()
          == other.getZi());
      result = result && (getLuna()
          == other.getLuna());
      result = result && (getAn()
          == other.getAn());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ZI_FIELD_NUMBER;
      hash = (53 * hash) + getZi();
      hash = (37 * hash) + LUNA_FIELD_NUMBER;
      hash = (53 * hash) + getLuna();
      hash = (37 * hash) + AN_FIELD_NUMBER;
      hash = (53 * hash) + getAn();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static proto.ServiceToamna.Data parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.ServiceToamna.Data parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.ServiceToamna.Data parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.ServiceToamna.Data parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.ServiceToamna.Data parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.ServiceToamna.Data parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.ServiceToamna.Data parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proto.ServiceToamna.Data parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static proto.ServiceToamna.Data parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static proto.ServiceToamna.Data parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static proto.ServiceToamna.Data parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proto.ServiceToamna.Data parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(proto.ServiceToamna.Data prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Data}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Data)
        proto.ServiceToamna.DataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return proto.ServiceToamna.internal_static_Data_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return proto.ServiceToamna.internal_static_Data_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                proto.ServiceToamna.Data.class, proto.ServiceToamna.Data.Builder.class);
      }

      // Construct using proto.ServiceToamna.Data.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        zi_ = 0;

        luna_ = 0;

        an_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return proto.ServiceToamna.internal_static_Data_descriptor;
      }

      @java.lang.Override
      public proto.ServiceToamna.Data getDefaultInstanceForType() {
        return proto.ServiceToamna.Data.getDefaultInstance();
      }

      @java.lang.Override
      public proto.ServiceToamna.Data build() {
        proto.ServiceToamna.Data result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public proto.ServiceToamna.Data buildPartial() {
        proto.ServiceToamna.Data result = new proto.ServiceToamna.Data(this);
        result.zi_ = zi_;
        result.luna_ = luna_;
        result.an_ = an_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof proto.ServiceToamna.Data) {
          return mergeFrom((proto.ServiceToamna.Data)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(proto.ServiceToamna.Data other) {
        if (other == proto.ServiceToamna.Data.getDefaultInstance()) return this;
        if (other.getZi() != 0) {
          setZi(other.getZi());
        }
        if (other.getLuna() != 0) {
          setLuna(other.getLuna());
        }
        if (other.getAn() != 0) {
          setAn(other.getAn());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        proto.ServiceToamna.Data parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (proto.ServiceToamna.Data) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int zi_ ;
      /**
       * <code>int32 Zi = 1;</code>
       */
      public int getZi() {
        return zi_;
      }
      /**
       * <code>int32 Zi = 1;</code>
       */
      public Builder setZi(int value) {
        
        zi_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 Zi = 1;</code>
       */
      public Builder clearZi() {
        
        zi_ = 0;
        onChanged();
        return this;
      }

      private int luna_ ;
      /**
       * <code>int32 Luna = 2;</code>
       */
      public int getLuna() {
        return luna_;
      }
      /**
       * <code>int32 Luna = 2;</code>
       */
      public Builder setLuna(int value) {
        
        luna_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 Luna = 2;</code>
       */
      public Builder clearLuna() {
        
        luna_ = 0;
        onChanged();
        return this;
      }

      private int an_ ;
      /**
       * <code>int32 An = 3;</code>
       */
      public int getAn() {
        return an_;
      }
      /**
       * <code>int32 An = 3;</code>
       */
      public Builder setAn(int value) {
        
        an_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 An = 3;</code>
       */
      public Builder clearAn() {
        
        an_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Data)
    }

    // @@protoc_insertion_point(class_scope:Data)
    private static final proto.ServiceToamna.Data DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new proto.ServiceToamna.Data();
    }

    public static proto.ServiceToamna.Data getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Data>
        PARSER = new com.google.protobuf.AbstractParser<Data>() {
      @java.lang.Override
      public Data parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Data(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Data> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Data> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public proto.ServiceToamna.Data getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ZodieOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Zodie)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string zodie = 1;</code>
     */
    java.lang.String getZodie();
    /**
     * <code>string zodie = 1;</code>
     */
    com.google.protobuf.ByteString
        getZodieBytes();
  }
  /**
   * Protobuf type {@code Zodie}
   */
  public  static final class Zodie extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Zodie)
      ZodieOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Zodie.newBuilder() to construct.
    private Zodie(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Zodie() {
      zodie_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Zodie(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              zodie_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.ServiceToamna.internal_static_Zodie_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.ServiceToamna.internal_static_Zodie_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.ServiceToamna.Zodie.class, proto.ServiceToamna.Zodie.Builder.class);
    }

    public static final int ZODIE_FIELD_NUMBER = 1;
    private volatile java.lang.Object zodie_;
    /**
     * <code>string zodie = 1;</code>
     */
    public java.lang.String getZodie() {
      java.lang.Object ref = zodie_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zodie_ = s;
        return s;
      }
    }
    /**
     * <code>string zodie = 1;</code>
     */
    public com.google.protobuf.ByteString
        getZodieBytes() {
      java.lang.Object ref = zodie_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zodie_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getZodieBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, zodie_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getZodieBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, zodie_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof proto.ServiceToamna.Zodie)) {
        return super.equals(obj);
      }
      proto.ServiceToamna.Zodie other = (proto.ServiceToamna.Zodie) obj;

      boolean result = true;
      result = result && getZodie()
          .equals(other.getZodie());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ZODIE_FIELD_NUMBER;
      hash = (53 * hash) + getZodie().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static proto.ServiceToamna.Zodie parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.ServiceToamna.Zodie parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.ServiceToamna.Zodie parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.ServiceToamna.Zodie parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.ServiceToamna.Zodie parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.ServiceToamna.Zodie parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.ServiceToamna.Zodie parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proto.ServiceToamna.Zodie parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static proto.ServiceToamna.Zodie parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static proto.ServiceToamna.Zodie parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static proto.ServiceToamna.Zodie parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proto.ServiceToamna.Zodie parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(proto.ServiceToamna.Zodie prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Zodie}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Zodie)
        proto.ServiceToamna.ZodieOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return proto.ServiceToamna.internal_static_Zodie_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return proto.ServiceToamna.internal_static_Zodie_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                proto.ServiceToamna.Zodie.class, proto.ServiceToamna.Zodie.Builder.class);
      }

      // Construct using proto.ServiceToamna.Zodie.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        zodie_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return proto.ServiceToamna.internal_static_Zodie_descriptor;
      }

      @java.lang.Override
      public proto.ServiceToamna.Zodie getDefaultInstanceForType() {
        return proto.ServiceToamna.Zodie.getDefaultInstance();
      }

      @java.lang.Override
      public proto.ServiceToamna.Zodie build() {
        proto.ServiceToamna.Zodie result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public proto.ServiceToamna.Zodie buildPartial() {
        proto.ServiceToamna.Zodie result = new proto.ServiceToamna.Zodie(this);
        result.zodie_ = zodie_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof proto.ServiceToamna.Zodie) {
          return mergeFrom((proto.ServiceToamna.Zodie)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(proto.ServiceToamna.Zodie other) {
        if (other == proto.ServiceToamna.Zodie.getDefaultInstance()) return this;
        if (!other.getZodie().isEmpty()) {
          zodie_ = other.zodie_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        proto.ServiceToamna.Zodie parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (proto.ServiceToamna.Zodie) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object zodie_ = "";
      /**
       * <code>string zodie = 1;</code>
       */
      public java.lang.String getZodie() {
        java.lang.Object ref = zodie_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          zodie_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string zodie = 1;</code>
       */
      public com.google.protobuf.ByteString
          getZodieBytes() {
        java.lang.Object ref = zodie_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          zodie_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string zodie = 1;</code>
       */
      public Builder setZodie(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        zodie_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string zodie = 1;</code>
       */
      public Builder clearZodie() {
        
        zodie_ = getDefaultInstance().getZodie();
        onChanged();
        return this;
      }
      /**
       * <code>string zodie = 1;</code>
       */
      public Builder setZodieBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        zodie_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Zodie)
    }

    // @@protoc_insertion_point(class_scope:Zodie)
    private static final proto.ServiceToamna.Zodie DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new proto.ServiceToamna.Zodie();
    }

    public static proto.ServiceToamna.Zodie getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Zodie>
        PARSER = new com.google.protobuf.AbstractParser<Zodie>() {
      @java.lang.Override
      public Zodie parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Zodie(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Zodie> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Zodie> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public proto.ServiceToamna.Zodie getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Data_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Data_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Zodie_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Zodie_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ServiceToamna.proto\032\031google/protobuf/a" +
      "ny.proto\",\n\004Data\022\n\n\002Zi\030\001 \001(\005\022\014\n\004Luna\030\002 \001" +
      "(\005\022\n\n\002An\030\003 \001(\005\"\026\n\005Zodie\022\r\n\005zodie\030\001 \001(\t2\'" +
      "\n\006toamna\022\035\n\014trimiteZodia\022\005.Data\032\006.ZodieB" +
      "\007\n\005protob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_Data_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Data_descriptor,
        new java.lang.String[] { "Zi", "Luna", "An", });
    internal_static_Zodie_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Zodie_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Zodie_descriptor,
        new java.lang.String[] { "Zodie", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
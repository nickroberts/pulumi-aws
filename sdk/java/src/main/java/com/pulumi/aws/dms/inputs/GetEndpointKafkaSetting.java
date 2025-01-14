// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetEndpointKafkaSetting extends com.pulumi.resources.InvokeArgs {

    public static final GetEndpointKafkaSetting Empty = new GetEndpointKafkaSetting();

    @Import(name="broker", required=true)
    private String broker;

    public String broker() {
        return this.broker;
    }

    @Import(name="includeControlDetails", required=true)
    private Boolean includeControlDetails;

    public Boolean includeControlDetails() {
        return this.includeControlDetails;
    }

    @Import(name="includeNullAndEmpty", required=true)
    private Boolean includeNullAndEmpty;

    public Boolean includeNullAndEmpty() {
        return this.includeNullAndEmpty;
    }

    @Import(name="includePartitionValue", required=true)
    private Boolean includePartitionValue;

    public Boolean includePartitionValue() {
        return this.includePartitionValue;
    }

    @Import(name="includeTableAlterOperations", required=true)
    private Boolean includeTableAlterOperations;

    public Boolean includeTableAlterOperations() {
        return this.includeTableAlterOperations;
    }

    @Import(name="includeTransactionDetails", required=true)
    private Boolean includeTransactionDetails;

    public Boolean includeTransactionDetails() {
        return this.includeTransactionDetails;
    }

    @Import(name="messageFormat", required=true)
    private String messageFormat;

    public String messageFormat() {
        return this.messageFormat;
    }

    @Import(name="messageMaxBytes", required=true)
    private Integer messageMaxBytes;

    public Integer messageMaxBytes() {
        return this.messageMaxBytes;
    }

    @Import(name="noHexPrefix", required=true)
    private Boolean noHexPrefix;

    public Boolean noHexPrefix() {
        return this.noHexPrefix;
    }

    @Import(name="partitionIncludeSchemaTable", required=true)
    private Boolean partitionIncludeSchemaTable;

    public Boolean partitionIncludeSchemaTable() {
        return this.partitionIncludeSchemaTable;
    }

    @Import(name="saslPassword", required=true)
    private String saslPassword;

    public String saslPassword() {
        return this.saslPassword;
    }

    @Import(name="saslUsername", required=true)
    private String saslUsername;

    public String saslUsername() {
        return this.saslUsername;
    }

    @Import(name="securityProtocol", required=true)
    private String securityProtocol;

    public String securityProtocol() {
        return this.securityProtocol;
    }

    @Import(name="sslCaCertificateArn", required=true)
    private String sslCaCertificateArn;

    public String sslCaCertificateArn() {
        return this.sslCaCertificateArn;
    }

    @Import(name="sslClientCertificateArn", required=true)
    private String sslClientCertificateArn;

    public String sslClientCertificateArn() {
        return this.sslClientCertificateArn;
    }

    @Import(name="sslClientKeyArn", required=true)
    private String sslClientKeyArn;

    public String sslClientKeyArn() {
        return this.sslClientKeyArn;
    }

    @Import(name="sslClientKeyPassword", required=true)
    private String sslClientKeyPassword;

    public String sslClientKeyPassword() {
        return this.sslClientKeyPassword;
    }

    @Import(name="topic", required=true)
    private String topic;

    public String topic() {
        return this.topic;
    }

    private GetEndpointKafkaSetting() {}

    private GetEndpointKafkaSetting(GetEndpointKafkaSetting $) {
        this.broker = $.broker;
        this.includeControlDetails = $.includeControlDetails;
        this.includeNullAndEmpty = $.includeNullAndEmpty;
        this.includePartitionValue = $.includePartitionValue;
        this.includeTableAlterOperations = $.includeTableAlterOperations;
        this.includeTransactionDetails = $.includeTransactionDetails;
        this.messageFormat = $.messageFormat;
        this.messageMaxBytes = $.messageMaxBytes;
        this.noHexPrefix = $.noHexPrefix;
        this.partitionIncludeSchemaTable = $.partitionIncludeSchemaTable;
        this.saslPassword = $.saslPassword;
        this.saslUsername = $.saslUsername;
        this.securityProtocol = $.securityProtocol;
        this.sslCaCertificateArn = $.sslCaCertificateArn;
        this.sslClientCertificateArn = $.sslClientCertificateArn;
        this.sslClientKeyArn = $.sslClientKeyArn;
        this.sslClientKeyPassword = $.sslClientKeyPassword;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEndpointKafkaSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEndpointKafkaSetting $;

        public Builder() {
            $ = new GetEndpointKafkaSetting();
        }

        public Builder(GetEndpointKafkaSetting defaults) {
            $ = new GetEndpointKafkaSetting(Objects.requireNonNull(defaults));
        }

        public Builder broker(String broker) {
            $.broker = broker;
            return this;
        }

        public Builder includeControlDetails(Boolean includeControlDetails) {
            $.includeControlDetails = includeControlDetails;
            return this;
        }

        public Builder includeNullAndEmpty(Boolean includeNullAndEmpty) {
            $.includeNullAndEmpty = includeNullAndEmpty;
            return this;
        }

        public Builder includePartitionValue(Boolean includePartitionValue) {
            $.includePartitionValue = includePartitionValue;
            return this;
        }

        public Builder includeTableAlterOperations(Boolean includeTableAlterOperations) {
            $.includeTableAlterOperations = includeTableAlterOperations;
            return this;
        }

        public Builder includeTransactionDetails(Boolean includeTransactionDetails) {
            $.includeTransactionDetails = includeTransactionDetails;
            return this;
        }

        public Builder messageFormat(String messageFormat) {
            $.messageFormat = messageFormat;
            return this;
        }

        public Builder messageMaxBytes(Integer messageMaxBytes) {
            $.messageMaxBytes = messageMaxBytes;
            return this;
        }

        public Builder noHexPrefix(Boolean noHexPrefix) {
            $.noHexPrefix = noHexPrefix;
            return this;
        }

        public Builder partitionIncludeSchemaTable(Boolean partitionIncludeSchemaTable) {
            $.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
            return this;
        }

        public Builder saslPassword(String saslPassword) {
            $.saslPassword = saslPassword;
            return this;
        }

        public Builder saslUsername(String saslUsername) {
            $.saslUsername = saslUsername;
            return this;
        }

        public Builder securityProtocol(String securityProtocol) {
            $.securityProtocol = securityProtocol;
            return this;
        }

        public Builder sslCaCertificateArn(String sslCaCertificateArn) {
            $.sslCaCertificateArn = sslCaCertificateArn;
            return this;
        }

        public Builder sslClientCertificateArn(String sslClientCertificateArn) {
            $.sslClientCertificateArn = sslClientCertificateArn;
            return this;
        }

        public Builder sslClientKeyArn(String sslClientKeyArn) {
            $.sslClientKeyArn = sslClientKeyArn;
            return this;
        }

        public Builder sslClientKeyPassword(String sslClientKeyPassword) {
            $.sslClientKeyPassword = sslClientKeyPassword;
            return this;
        }

        public Builder topic(String topic) {
            $.topic = topic;
            return this;
        }

        public GetEndpointKafkaSetting build() {
            $.broker = Objects.requireNonNull($.broker, "expected parameter 'broker' to be non-null");
            $.includeControlDetails = Objects.requireNonNull($.includeControlDetails, "expected parameter 'includeControlDetails' to be non-null");
            $.includeNullAndEmpty = Objects.requireNonNull($.includeNullAndEmpty, "expected parameter 'includeNullAndEmpty' to be non-null");
            $.includePartitionValue = Objects.requireNonNull($.includePartitionValue, "expected parameter 'includePartitionValue' to be non-null");
            $.includeTableAlterOperations = Objects.requireNonNull($.includeTableAlterOperations, "expected parameter 'includeTableAlterOperations' to be non-null");
            $.includeTransactionDetails = Objects.requireNonNull($.includeTransactionDetails, "expected parameter 'includeTransactionDetails' to be non-null");
            $.messageFormat = Objects.requireNonNull($.messageFormat, "expected parameter 'messageFormat' to be non-null");
            $.messageMaxBytes = Objects.requireNonNull($.messageMaxBytes, "expected parameter 'messageMaxBytes' to be non-null");
            $.noHexPrefix = Objects.requireNonNull($.noHexPrefix, "expected parameter 'noHexPrefix' to be non-null");
            $.partitionIncludeSchemaTable = Objects.requireNonNull($.partitionIncludeSchemaTable, "expected parameter 'partitionIncludeSchemaTable' to be non-null");
            $.saslPassword = Objects.requireNonNull($.saslPassword, "expected parameter 'saslPassword' to be non-null");
            $.saslUsername = Objects.requireNonNull($.saslUsername, "expected parameter 'saslUsername' to be non-null");
            $.securityProtocol = Objects.requireNonNull($.securityProtocol, "expected parameter 'securityProtocol' to be non-null");
            $.sslCaCertificateArn = Objects.requireNonNull($.sslCaCertificateArn, "expected parameter 'sslCaCertificateArn' to be non-null");
            $.sslClientCertificateArn = Objects.requireNonNull($.sslClientCertificateArn, "expected parameter 'sslClientCertificateArn' to be non-null");
            $.sslClientKeyArn = Objects.requireNonNull($.sslClientKeyArn, "expected parameter 'sslClientKeyArn' to be non-null");
            $.sslClientKeyPassword = Objects.requireNonNull($.sslClientKeyPassword, "expected parameter 'sslClientKeyPassword' to be non-null");
            $.topic = Objects.requireNonNull($.topic, "expected parameter 'topic' to be non-null");
            return $;
        }
    }

}

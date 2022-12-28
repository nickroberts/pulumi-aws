// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketReplicationConfigRuleDestinationEncryptionConfiguration {
    /**
     * @return The ID (Key ARN or Alias ARN) of the customer managed AWS KMS key stored in AWS Key Management Service (KMS) for the destination bucket.
     * 
     */
    private String replicaKmsKeyId;

    private BucketReplicationConfigRuleDestinationEncryptionConfiguration() {}
    /**
     * @return The ID (Key ARN or Alias ARN) of the customer managed AWS KMS key stored in AWS Key Management Service (KMS) for the destination bucket.
     * 
     */
    public String replicaKmsKeyId() {
        return this.replicaKmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String replicaKmsKeyId;
        public Builder() {}
        public Builder(BucketReplicationConfigRuleDestinationEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicaKmsKeyId = defaults.replicaKmsKeyId;
        }

        @CustomType.Setter
        public Builder replicaKmsKeyId(String replicaKmsKeyId) {
            this.replicaKmsKeyId = Objects.requireNonNull(replicaKmsKeyId);
            return this;
        }
        public BucketReplicationConfigRuleDestinationEncryptionConfiguration build() {
            final var o = new BucketReplicationConfigRuleDestinationEncryptionConfiguration();
            o.replicaKmsKeyId = replicaKmsKeyId;
            return o;
        }
    }
}
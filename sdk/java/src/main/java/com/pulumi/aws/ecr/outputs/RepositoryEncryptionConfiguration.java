// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RepositoryEncryptionConfiguration {
    /**
     * @return The encryption type to use for the repository. Valid values are `AES256` or `KMS`. Defaults to `AES256`.
     * 
     */
    private @Nullable String encryptionType;
    /**
     * @return The ARN of the KMS key to use when `encryption_type` is `KMS`. If not specified, uses the default AWS managed key for ECR.
     * 
     */
    private @Nullable String kmsKey;

    private RepositoryEncryptionConfiguration() {}
    /**
     * @return The encryption type to use for the repository. Valid values are `AES256` or `KMS`. Defaults to `AES256`.
     * 
     */
    public Optional<String> encryptionType() {
        return Optional.ofNullable(this.encryptionType);
    }
    /**
     * @return The ARN of the KMS key to use when `encryption_type` is `KMS`. If not specified, uses the default AWS managed key for ECR.
     * 
     */
    public Optional<String> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String encryptionType;
        private @Nullable String kmsKey;
        public Builder() {}
        public Builder(RepositoryEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionType = defaults.encryptionType;
    	      this.kmsKey = defaults.kmsKey;
        }

        @CustomType.Setter
        public Builder encryptionType(@Nullable String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        public RepositoryEncryptionConfiguration build() {
            final var o = new RepositoryEncryptionConfiguration();
            o.encryptionType = encryptionType;
            o.kmsKey = kmsKey;
            return o;
        }
    }
}
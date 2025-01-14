// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation {
    /**
     * @return The ARN for the S3 bucket containing the application code.
     * 
     */
    private String bucketArn;
    /**
     * @return The file key for the object containing the application code.
     * 
     */
    private String fileKey;
    /**
     * @return The version of the object containing the application code.
     * 
     */
    private @Nullable String objectVersion;

    private ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation() {}
    /**
     * @return The ARN for the S3 bucket containing the application code.
     * 
     */
    public String bucketArn() {
        return this.bucketArn;
    }
    /**
     * @return The file key for the object containing the application code.
     * 
     */
    public String fileKey() {
        return this.fileKey;
    }
    /**
     * @return The version of the object containing the application code.
     * 
     */
    public Optional<String> objectVersion() {
        return Optional.ofNullable(this.objectVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucketArn;
        private String fileKey;
        private @Nullable String objectVersion;
        public Builder() {}
        public Builder(ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketArn = defaults.bucketArn;
    	      this.fileKey = defaults.fileKey;
    	      this.objectVersion = defaults.objectVersion;
        }

        @CustomType.Setter
        public Builder bucketArn(String bucketArn) {
            this.bucketArn = Objects.requireNonNull(bucketArn);
            return this;
        }
        @CustomType.Setter
        public Builder fileKey(String fileKey) {
            this.fileKey = Objects.requireNonNull(fileKey);
            return this;
        }
        @CustomType.Setter
        public Builder objectVersion(@Nullable String objectVersion) {
            this.objectVersion = objectVersion;
            return this;
        }
        public ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation build() {
            final var o = new ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation();
            o.bucketArn = bucketArn;
            o.fileKey = fileKey;
            o.objectVersion = objectVersion;
            return o;
        }
    }
}

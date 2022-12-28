// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.aws.connect.outputs.GetInstanceStorageConfigStorageConfigKinesisFirehoseConfig;
import com.pulumi.aws.connect.outputs.GetInstanceStorageConfigStorageConfigKinesisStreamConfig;
import com.pulumi.aws.connect.outputs.GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfig;
import com.pulumi.aws.connect.outputs.GetInstanceStorageConfigStorageConfigS3Config;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceStorageConfigStorageConfig {
    /**
     * @return A block that specifies the configuration of the Kinesis Firehose delivery stream. Documented below.
     * 
     */
    private List<GetInstanceStorageConfigStorageConfigKinesisFirehoseConfig> kinesisFirehoseConfigs;
    /**
     * @return A block that specifies the configuration of the Kinesis data stream. Documented below.
     * 
     */
    private List<GetInstanceStorageConfigStorageConfigKinesisStreamConfig> kinesisStreamConfigs;
    /**
     * @return A block that specifies the configuration of the Kinesis video stream. Documented below.
     * 
     */
    private List<GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfig> kinesisVideoStreamConfigs;
    /**
     * @return A block that specifies the configuration of S3 Bucket. Documented below.
     * 
     */
    private List<GetInstanceStorageConfigStorageConfigS3Config> s3Configs;
    /**
     * @return A valid storage type. Valid Values: `S3` | `KINESIS_VIDEO_STREAM` | `KINESIS_STREAM` | `KINESIS_FIREHOSE`.
     * 
     */
    private String storageType;

    private GetInstanceStorageConfigStorageConfig() {}
    /**
     * @return A block that specifies the configuration of the Kinesis Firehose delivery stream. Documented below.
     * 
     */
    public List<GetInstanceStorageConfigStorageConfigKinesisFirehoseConfig> kinesisFirehoseConfigs() {
        return this.kinesisFirehoseConfigs;
    }
    /**
     * @return A block that specifies the configuration of the Kinesis data stream. Documented below.
     * 
     */
    public List<GetInstanceStorageConfigStorageConfigKinesisStreamConfig> kinesisStreamConfigs() {
        return this.kinesisStreamConfigs;
    }
    /**
     * @return A block that specifies the configuration of the Kinesis video stream. Documented below.
     * 
     */
    public List<GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfig> kinesisVideoStreamConfigs() {
        return this.kinesisVideoStreamConfigs;
    }
    /**
     * @return A block that specifies the configuration of S3 Bucket. Documented below.
     * 
     */
    public List<GetInstanceStorageConfigStorageConfigS3Config> s3Configs() {
        return this.s3Configs;
    }
    /**
     * @return A valid storage type. Valid Values: `S3` | `KINESIS_VIDEO_STREAM` | `KINESIS_STREAM` | `KINESIS_FIREHOSE`.
     * 
     */
    public String storageType() {
        return this.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceStorageConfigStorageConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetInstanceStorageConfigStorageConfigKinesisFirehoseConfig> kinesisFirehoseConfigs;
        private List<GetInstanceStorageConfigStorageConfigKinesisStreamConfig> kinesisStreamConfigs;
        private List<GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfig> kinesisVideoStreamConfigs;
        private List<GetInstanceStorageConfigStorageConfigS3Config> s3Configs;
        private String storageType;
        public Builder() {}
        public Builder(GetInstanceStorageConfigStorageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kinesisFirehoseConfigs = defaults.kinesisFirehoseConfigs;
    	      this.kinesisStreamConfigs = defaults.kinesisStreamConfigs;
    	      this.kinesisVideoStreamConfigs = defaults.kinesisVideoStreamConfigs;
    	      this.s3Configs = defaults.s3Configs;
    	      this.storageType = defaults.storageType;
        }

        @CustomType.Setter
        public Builder kinesisFirehoseConfigs(List<GetInstanceStorageConfigStorageConfigKinesisFirehoseConfig> kinesisFirehoseConfigs) {
            this.kinesisFirehoseConfigs = Objects.requireNonNull(kinesisFirehoseConfigs);
            return this;
        }
        public Builder kinesisFirehoseConfigs(GetInstanceStorageConfigStorageConfigKinesisFirehoseConfig... kinesisFirehoseConfigs) {
            return kinesisFirehoseConfigs(List.of(kinesisFirehoseConfigs));
        }
        @CustomType.Setter
        public Builder kinesisStreamConfigs(List<GetInstanceStorageConfigStorageConfigKinesisStreamConfig> kinesisStreamConfigs) {
            this.kinesisStreamConfigs = Objects.requireNonNull(kinesisStreamConfigs);
            return this;
        }
        public Builder kinesisStreamConfigs(GetInstanceStorageConfigStorageConfigKinesisStreamConfig... kinesisStreamConfigs) {
            return kinesisStreamConfigs(List.of(kinesisStreamConfigs));
        }
        @CustomType.Setter
        public Builder kinesisVideoStreamConfigs(List<GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfig> kinesisVideoStreamConfigs) {
            this.kinesisVideoStreamConfigs = Objects.requireNonNull(kinesisVideoStreamConfigs);
            return this;
        }
        public Builder kinesisVideoStreamConfigs(GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfig... kinesisVideoStreamConfigs) {
            return kinesisVideoStreamConfigs(List.of(kinesisVideoStreamConfigs));
        }
        @CustomType.Setter
        public Builder s3Configs(List<GetInstanceStorageConfigStorageConfigS3Config> s3Configs) {
            this.s3Configs = Objects.requireNonNull(s3Configs);
            return this;
        }
        public Builder s3Configs(GetInstanceStorageConfigStorageConfigS3Config... s3Configs) {
            return s3Configs(List.of(s3Configs));
        }
        @CustomType.Setter
        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }
        public GetInstanceStorageConfigStorageConfig build() {
            final var o = new GetInstanceStorageConfigStorageConfig();
            o.kinesisFirehoseConfigs = kinesisFirehoseConfigs;
            o.kinesisStreamConfigs = kinesisStreamConfigs;
            o.kinesisVideoStreamConfigs = kinesisVideoStreamConfigs;
            o.s3Configs = s3Configs;
            o.storageType = storageType;
            return o;
        }
    }
}
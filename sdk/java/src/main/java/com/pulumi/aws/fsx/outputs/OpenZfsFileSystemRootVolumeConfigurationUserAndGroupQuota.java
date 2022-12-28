// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota {
    /**
     * @return - The ID of the user or group. Valid values between `0` and `2147483647`
     * 
     */
    private Integer id;
    /**
     * @return - The amount of storage that the user or group can use in gibibytes (GiB). Valid values between `0` and `2147483647`
     * 
     */
    private Integer storageCapacityQuotaGib;
    /**
     * @return - A value that specifies whether the quota applies to a user or group. Valid values are `USER` or `GROUP`.
     * 
     */
    private String type;

    private OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota() {}
    /**
     * @return - The ID of the user or group. Valid values between `0` and `2147483647`
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return - The amount of storage that the user or group can use in gibibytes (GiB). Valid values between `0` and `2147483647`
     * 
     */
    public Integer storageCapacityQuotaGib() {
        return this.storageCapacityQuotaGib;
    }
    /**
     * @return - A value that specifies whether the quota applies to a user or group. Valid values are `USER` or `GROUP`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer id;
        private Integer storageCapacityQuotaGib;
        private String type;
        public Builder() {}
        public Builder(OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.storageCapacityQuotaGib = defaults.storageCapacityQuotaGib;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder storageCapacityQuotaGib(Integer storageCapacityQuotaGib) {
            this.storageCapacityQuotaGib = Objects.requireNonNull(storageCapacityQuotaGib);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota build() {
            final var o = new OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota();
            o.id = id;
            o.storageCapacityQuotaGib = storageCapacityQuotaGib;
            o.type = type;
            return o;
        }
    }
}
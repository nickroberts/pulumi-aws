// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ChannelVpc {
    private @Nullable List<String> availabilityZones;
    private List<String> publicAddressAllocationIds;
    private @Nullable List<String> securityGroupIds;
    private List<String> subnetIds;

    private ChannelVpc() {}
    public List<String> availabilityZones() {
        return this.availabilityZones == null ? List.of() : this.availabilityZones;
    }
    public List<String> publicAddressAllocationIds() {
        return this.publicAddressAllocationIds;
    }
    public List<String> securityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    public List<String> subnetIds() {
        return this.subnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelVpc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> availabilityZones;
        private List<String> publicAddressAllocationIds;
        private @Nullable List<String> securityGroupIds;
        private List<String> subnetIds;
        public Builder() {}
        public Builder(ChannelVpc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.publicAddressAllocationIds = defaults.publicAddressAllocationIds;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        @CustomType.Setter
        public Builder availabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        @CustomType.Setter
        public Builder publicAddressAllocationIds(List<String> publicAddressAllocationIds) {
            this.publicAddressAllocationIds = Objects.requireNonNull(publicAddressAllocationIds);
            return this;
        }
        public Builder publicAddressAllocationIds(String... publicAddressAllocationIds) {
            return publicAddressAllocationIds(List.of(publicAddressAllocationIds));
        }
        @CustomType.Setter
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        @CustomType.Setter
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public ChannelVpc build() {
            final var o = new ChannelVpc();
            o.availabilityZones = availabilityZones;
            o.publicAddressAllocationIds = publicAddressAllocationIds;
            o.securityGroupIds = securityGroupIds;
            o.subnetIds = subnetIds;
            return o;
        }
    }
}
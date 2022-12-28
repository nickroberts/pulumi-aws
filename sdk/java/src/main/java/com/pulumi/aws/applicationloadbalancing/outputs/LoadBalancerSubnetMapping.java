// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerSubnetMapping {
    /**
     * @return The allocation ID of the Elastic IP address.
     * 
     */
    private @Nullable String allocationId;
    /**
     * @return An ipv6 address within the subnet to assign to the internet-facing load balancer.
     * 
     */
    private @Nullable String ipv6Address;
    private @Nullable String outpostId;
    /**
     * @return A private ipv4 address within the subnet to assign to the internal-facing load balancer.
     * 
     */
    private @Nullable String privateIpv4Address;
    /**
     * @return ID of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
     * 
     */
    private String subnetId;

    private LoadBalancerSubnetMapping() {}
    /**
     * @return The allocation ID of the Elastic IP address.
     * 
     */
    public Optional<String> allocationId() {
        return Optional.ofNullable(this.allocationId);
    }
    /**
     * @return An ipv6 address within the subnet to assign to the internet-facing load balancer.
     * 
     */
    public Optional<String> ipv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }
    public Optional<String> outpostId() {
        return Optional.ofNullable(this.outpostId);
    }
    /**
     * @return A private ipv4 address within the subnet to assign to the internal-facing load balancer.
     * 
     */
    public Optional<String> privateIpv4Address() {
        return Optional.ofNullable(this.privateIpv4Address);
    }
    /**
     * @return ID of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerSubnetMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String allocationId;
        private @Nullable String ipv6Address;
        private @Nullable String outpostId;
        private @Nullable String privateIpv4Address;
        private String subnetId;
        public Builder() {}
        public Builder(LoadBalancerSubnetMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.outpostId = defaults.outpostId;
    	      this.privateIpv4Address = defaults.privateIpv4Address;
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder allocationId(@Nullable String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        @CustomType.Setter
        public Builder outpostId(@Nullable String outpostId) {
            this.outpostId = outpostId;
            return this;
        }
        @CustomType.Setter
        public Builder privateIpv4Address(@Nullable String privateIpv4Address) {
            this.privateIpv4Address = privateIpv4Address;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public LoadBalancerSubnetMapping build() {
            final var o = new LoadBalancerSubnetMapping();
            o.allocationId = allocationId;
            o.ipv6Address = ipv6Address;
            o.outpostId = outpostId;
            o.privateIpv4Address = privateIpv4Address;
            o.subnetId = subnetId;
            return o;
        }
    }
}
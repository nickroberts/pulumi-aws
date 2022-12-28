// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventTargetEcsTargetNetworkConfiguration {
    /**
     * @return Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
     * 
     */
    private @Nullable Boolean assignPublicIp;
    /**
     * @return The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
     * 
     */
    private @Nullable List<String> securityGroups;
    /**
     * @return The subnets associated with the task or service.
     * 
     */
    private List<String> subnets;

    private EventTargetEcsTargetNetworkConfiguration() {}
    /**
     * @return Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
     * 
     */
    public Optional<Boolean> assignPublicIp() {
        return Optional.ofNullable(this.assignPublicIp);
    }
    /**
     * @return The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * @return The subnets associated with the task or service.
     * 
     */
    public List<String> subnets() {
        return this.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetEcsTargetNetworkConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean assignPublicIp;
        private @Nullable List<String> securityGroups;
        private List<String> subnets;
        public Builder() {}
        public Builder(EventTargetEcsTargetNetworkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        @CustomType.Setter
        public Builder assignPublicIp(@Nullable Boolean assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        @CustomType.Setter
        public Builder subnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        public EventTargetEcsTargetNetworkConfiguration build() {
            final var o = new EventTargetEcsTargetNetworkConfiguration();
            o.assignPublicIp = assignPublicIp;
            o.securityGroups = securityGroups;
            o.subnets = subnets;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.scheduler.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScheduleTargetEcsParametersNetworkConfiguration {
    /**
     * @return Specifies whether the task&#39;s elastic network interface receives a public IP address. You can specify `ENABLED` only when the `launch_type` is set to `FARGATE`. One of: `ENABLED`, `DISABLED`.
     * 
     */
    private @Nullable Boolean assignPublicIp;
    /**
     * @return Set of 1 to 5 Security Group ID-s to be associated with the task. These security groups must all be in the same VPC.
     * 
     */
    private @Nullable List<String> securityGroups;
    /**
     * @return Set of 1 to 16 subnets to be associated with the task. These subnets must all be in the same VPC.
     * 
     */
    private List<String> subnets;

    private ScheduleTargetEcsParametersNetworkConfiguration() {}
    /**
     * @return Specifies whether the task&#39;s elastic network interface receives a public IP address. You can specify `ENABLED` only when the `launch_type` is set to `FARGATE`. One of: `ENABLED`, `DISABLED`.
     * 
     */
    public Optional<Boolean> assignPublicIp() {
        return Optional.ofNullable(this.assignPublicIp);
    }
    /**
     * @return Set of 1 to 5 Security Group ID-s to be associated with the task. These security groups must all be in the same VPC.
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * @return Set of 1 to 16 subnets to be associated with the task. These subnets must all be in the same VPC.
     * 
     */
    public List<String> subnets() {
        return this.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleTargetEcsParametersNetworkConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean assignPublicIp;
        private @Nullable List<String> securityGroups;
        private List<String> subnets;
        public Builder() {}
        public Builder(ScheduleTargetEcsParametersNetworkConfiguration defaults) {
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
        public ScheduleTargetEcsParametersNetworkConfiguration build() {
            final var o = new ScheduleTargetEcsParametersNetworkConfiguration();
            o.assignPublicIp = assignPublicIp;
            o.securityGroups = securityGroups;
            o.subnets = subnets;
            return o;
        }
    }
}
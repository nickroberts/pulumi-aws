// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceNetworkConfigurationIngressConfiguration {
    /**
     * @return Specifies whether your App Runner service is publicly accessible. To make the service publicly accessible set it to True. To make the service privately accessible, from only within an Amazon VPC set it to False.
     * 
     */
    private @Nullable Boolean isPubliclyAccessible;

    private ServiceNetworkConfigurationIngressConfiguration() {}
    /**
     * @return Specifies whether your App Runner service is publicly accessible. To make the service publicly accessible set it to True. To make the service privately accessible, from only within an Amazon VPC set it to False.
     * 
     */
    public Optional<Boolean> isPubliclyAccessible() {
        return Optional.ofNullable(this.isPubliclyAccessible);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceNetworkConfigurationIngressConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean isPubliclyAccessible;
        public Builder() {}
        public Builder(ServiceNetworkConfigurationIngressConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isPubliclyAccessible = defaults.isPubliclyAccessible;
        }

        @CustomType.Setter
        public Builder isPubliclyAccessible(@Nullable Boolean isPubliclyAccessible) {
            this.isPubliclyAccessible = isPubliclyAccessible;
            return this;
        }
        public ServiceNetworkConfigurationIngressConfiguration build() {
            final var o = new ServiceNetworkConfigurationIngressConfiguration();
            o.isPubliclyAccessible = isPubliclyAccessible;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InsightFiltersNetworkDestinationIpv4 {
    /**
     * @return A finding&#39;s CIDR value.
     * 
     */
    private String cidr;

    private InsightFiltersNetworkDestinationIpv4() {}
    /**
     * @return A finding&#39;s CIDR value.
     * 
     */
    public String cidr() {
        return this.cidr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersNetworkDestinationIpv4 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidr;
        public Builder() {}
        public Builder(InsightFiltersNetworkDestinationIpv4 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
        }

        @CustomType.Setter
        public Builder cidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }
        public InsightFiltersNetworkDestinationIpv4 build() {
            final var o = new InsightFiltersNetworkDestinationIpv4();
            o.cidr = cidr;
            return o;
        }
    }
}
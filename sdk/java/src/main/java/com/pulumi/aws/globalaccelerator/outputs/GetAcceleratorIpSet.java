// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.globalaccelerator.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAcceleratorIpSet {
    private List<String> ipAddresses;
    private String ipFamily;

    private GetAcceleratorIpSet() {}
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }
    public String ipFamily() {
        return this.ipFamily;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAcceleratorIpSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> ipAddresses;
        private String ipFamily;
        public Builder() {}
        public Builder(GetAcceleratorIpSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.ipFamily = defaults.ipFamily;
        }

        @CustomType.Setter
        public Builder ipAddresses(List<String> ipAddresses) {
            this.ipAddresses = Objects.requireNonNull(ipAddresses);
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        @CustomType.Setter
        public Builder ipFamily(String ipFamily) {
            this.ipFamily = Objects.requireNonNull(ipFamily);
            return this;
        }
        public GetAcceleratorIpSet build() {
            final var o = new GetAcceleratorIpSet();
            o.ipAddresses = ipAddresses;
            o.ipFamily = ipFamily;
            return o;
        }
    }
}

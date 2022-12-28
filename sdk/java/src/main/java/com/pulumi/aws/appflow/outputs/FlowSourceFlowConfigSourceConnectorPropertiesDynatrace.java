// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FlowSourceFlowConfigSourceConnectorPropertiesDynatrace {
    /**
     * @return Object specified in the Veeva flow source.
     * 
     */
    private String object;

    private FlowSourceFlowConfigSourceConnectorPropertiesDynatrace() {}
    /**
     * @return Object specified in the Veeva flow source.
     * 
     */
    public String object() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceFlowConfigSourceConnectorPropertiesDynatrace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String object;
        public Builder() {}
        public Builder(FlowSourceFlowConfigSourceConnectorPropertiesDynatrace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        @CustomType.Setter
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public FlowSourceFlowConfigSourceConnectorPropertiesDynatrace build() {
            final var o = new FlowSourceFlowConfigSourceConnectorPropertiesDynatrace();
            o.object = object;
            return o;
        }
    }
}
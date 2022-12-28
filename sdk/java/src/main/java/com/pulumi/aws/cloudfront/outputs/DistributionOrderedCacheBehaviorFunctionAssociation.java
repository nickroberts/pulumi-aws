// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DistributionOrderedCacheBehaviorFunctionAssociation {
    /**
     * @return The specific event to trigger this function.
     * Valid values: `viewer-request` or `viewer-response`
     * 
     */
    private String eventType;
    /**
     * @return ARN of the Cloudfront function.
     * 
     */
    private String functionArn;

    private DistributionOrderedCacheBehaviorFunctionAssociation() {}
    /**
     * @return The specific event to trigger this function.
     * Valid values: `viewer-request` or `viewer-response`
     * 
     */
    public String eventType() {
        return this.eventType;
    }
    /**
     * @return ARN of the Cloudfront function.
     * 
     */
    public String functionArn() {
        return this.functionArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOrderedCacheBehaviorFunctionAssociation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String eventType;
        private String functionArn;
        public Builder() {}
        public Builder(DistributionOrderedCacheBehaviorFunctionAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.functionArn = defaults.functionArn;
        }

        @CustomType.Setter
        public Builder eventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }
        @CustomType.Setter
        public Builder functionArn(String functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }
        public DistributionOrderedCacheBehaviorFunctionAssociation build() {
            final var o = new DistributionOrderedCacheBehaviorFunctionAssociation();
            o.eventType = eventType;
            o.functionArn = functionArn;
            return o;
        }
    }
}
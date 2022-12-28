// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sesv2.outputs;

import com.pulumi.aws.sesv2.outputs.GetDedicatedIpPoolDedicatedIp;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDedicatedIpPoolResult {
    /**
     * @return ARN of the Dedicated IP Pool.
     * 
     */
    private String arn;
    /**
     * @return A list of objects describing the pool&#39;s dedicated IP&#39;s. See `dedicated_ips`.
     * 
     */
    private List<GetDedicatedIpPoolDedicatedIp> dedicatedIps;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String poolName;
    /**
     * @return (Optional) IP pool scaling mode. Valid values: `STANDARD`, `MANAGED`.
     * 
     */
    private String scalingMode;
    /**
     * @return A map of tags attached to the pool.
     * 
     */
    private Map<String,String> tags;

    private GetDedicatedIpPoolResult() {}
    /**
     * @return ARN of the Dedicated IP Pool.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return A list of objects describing the pool&#39;s dedicated IP&#39;s. See `dedicated_ips`.
     * 
     */
    public List<GetDedicatedIpPoolDedicatedIp> dedicatedIps() {
        return this.dedicatedIps;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String poolName() {
        return this.poolName;
    }
    /**
     * @return (Optional) IP pool scaling mode. Valid values: `STANDARD`, `MANAGED`.
     * 
     */
    public String scalingMode() {
        return this.scalingMode;
    }
    /**
     * @return A map of tags attached to the pool.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedIpPoolResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private List<GetDedicatedIpPoolDedicatedIp> dedicatedIps;
        private String id;
        private String poolName;
        private String scalingMode;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetDedicatedIpPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dedicatedIps = defaults.dedicatedIps;
    	      this.id = defaults.id;
    	      this.poolName = defaults.poolName;
    	      this.scalingMode = defaults.scalingMode;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder dedicatedIps(List<GetDedicatedIpPoolDedicatedIp> dedicatedIps) {
            this.dedicatedIps = Objects.requireNonNull(dedicatedIps);
            return this;
        }
        public Builder dedicatedIps(GetDedicatedIpPoolDedicatedIp... dedicatedIps) {
            return dedicatedIps(List.of(dedicatedIps));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder poolName(String poolName) {
            this.poolName = Objects.requireNonNull(poolName);
            return this;
        }
        @CustomType.Setter
        public Builder scalingMode(String scalingMode) {
            this.scalingMode = Objects.requireNonNull(scalingMode);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetDedicatedIpPoolResult build() {
            final var o = new GetDedicatedIpPoolResult();
            o.arn = arn;
            o.dedicatedIps = dedicatedIps;
            o.id = id;
            o.poolName = poolName;
            o.scalingMode = scalingMode;
            o.tags = tags;
            return o;
        }
    }
}
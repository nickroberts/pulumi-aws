// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclVisibilityConfig {
    /**
     * @return Whether the associated resource sends metrics to CloudWatch. For the list of available metrics, see [AWS WAF Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics).
     * 
     */
    private Boolean cloudwatchMetricsEnabled;
    /**
     * @return A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9) hyphen(-) and underscore (\_), with length from one to 128 characters. It can&#39;t contain whitespace or metric names reserved for AWS WAF, for example `All` and `Default_Action`.
     * 
     */
    private String metricName;
    /**
     * @return Whether AWS WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the AWS WAF console.
     * 
     */
    private Boolean sampledRequestsEnabled;

    private WebAclVisibilityConfig() {}
    /**
     * @return Whether the associated resource sends metrics to CloudWatch. For the list of available metrics, see [AWS WAF Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics).
     * 
     */
    public Boolean cloudwatchMetricsEnabled() {
        return this.cloudwatchMetricsEnabled;
    }
    /**
     * @return A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9) hyphen(-) and underscore (\_), with length from one to 128 characters. It can&#39;t contain whitespace or metric names reserved for AWS WAF, for example `All` and `Default_Action`.
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return Whether AWS WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the AWS WAF console.
     * 
     */
    public Boolean sampledRequestsEnabled() {
        return this.sampledRequestsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclVisibilityConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean cloudwatchMetricsEnabled;
        private String metricName;
        private Boolean sampledRequestsEnabled;
        public Builder() {}
        public Builder(WebAclVisibilityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchMetricsEnabled = defaults.cloudwatchMetricsEnabled;
    	      this.metricName = defaults.metricName;
    	      this.sampledRequestsEnabled = defaults.sampledRequestsEnabled;
        }

        @CustomType.Setter
        public Builder cloudwatchMetricsEnabled(Boolean cloudwatchMetricsEnabled) {
            this.cloudwatchMetricsEnabled = Objects.requireNonNull(cloudwatchMetricsEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        @CustomType.Setter
        public Builder sampledRequestsEnabled(Boolean sampledRequestsEnabled) {
            this.sampledRequestsEnabled = Objects.requireNonNull(sampledRequestsEnabled);
            return this;
        }
        public WebAclVisibilityConfig build() {
            final var o = new WebAclVisibilityConfig();
            o.cloudwatchMetricsEnabled = cloudwatchMetricsEnabled;
            o.metricName = metricName;
            o.sampledRequestsEnabled = sampledRequestsEnabled;
            return o;
        }
    }
}
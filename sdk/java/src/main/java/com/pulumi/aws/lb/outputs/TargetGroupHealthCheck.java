// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TargetGroupHealthCheck {
    /**
     * @return Boolean to enable / disable `stickiness`. Default is `true`.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Number of consecutive health check successes required before considering a target healthy. The range is 2-10. Defaults to 3.
     * 
     */
    private @Nullable Integer healthyThreshold;
    /**
     * @return Approximate amount of time, in seconds, between health checks of an individual target. The range is 5-300. For `lambda` target groups, it needs to be greater than the timeout of the underlying `lambda`. Defaults to 30.
     * 
     */
    private @Nullable Integer interval;
    /**
     * @return Response codes to use when checking for a healthy responses from a target. You can specify multiple values (for example, &#34;200,202&#34; for HTTP(s) or &#34;0,12&#34; for GRPC) or a range of values (for example, &#34;200-299&#34; or &#34;0-99&#34;). Required for HTTP/HTTPS/GRPC ALB. Only applies to Application Load Balancers (i.e., HTTP/HTTPS/GRPC) not Network Load Balancers (i.e., TCP).
     * 
     */
    private @Nullable String matcher;
    /**
     * @return Destination for the health check request. Required for HTTP/HTTPS ALB and HTTP NLB. Only applies to HTTP/HTTPS.
     * 
     */
    private @Nullable String path;
    /**
     * @return The port the load balancer uses when performing health checks on targets. Default is traffic-port.
     * 
     */
    private @Nullable String port;
    /**
     * @return Protocol the load balancer uses when performing health checks on targets. Must be either `TCP`, `HTTP`, or `HTTPS`. The TCP protocol is not supported for health checks if the protocol of the target group is HTTP or HTTPS. Defaults to HTTP.
     * 
     */
    private @Nullable String protocol;
    /**
     * @return Amount of time, in seconds, during which no response from a target means a failed health check. The range is 2–120 seconds. For target groups with a protocol of HTTP, the default is 6 seconds. For target groups with a protocol of TCP, TLS or HTTPS, the default is 10 seconds. For target groups with a protocol of GENEVE, the default is 5 seconds. If the target type is lambda, the default is 30 seconds.
     * 
     */
    private @Nullable Integer timeout;
    /**
     * @return Number of consecutive health check failures required before considering a target unhealthy. The range is 2-10. Defaults to 3.
     * 
     */
    private @Nullable Integer unhealthyThreshold;

    private TargetGroupHealthCheck() {}
    /**
     * @return Boolean to enable / disable `stickiness`. Default is `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Number of consecutive health check successes required before considering a target healthy. The range is 2-10. Defaults to 3.
     * 
     */
    public Optional<Integer> healthyThreshold() {
        return Optional.ofNullable(this.healthyThreshold);
    }
    /**
     * @return Approximate amount of time, in seconds, between health checks of an individual target. The range is 5-300. For `lambda` target groups, it needs to be greater than the timeout of the underlying `lambda`. Defaults to 30.
     * 
     */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * @return Response codes to use when checking for a healthy responses from a target. You can specify multiple values (for example, &#34;200,202&#34; for HTTP(s) or &#34;0,12&#34; for GRPC) or a range of values (for example, &#34;200-299&#34; or &#34;0-99&#34;). Required for HTTP/HTTPS/GRPC ALB. Only applies to Application Load Balancers (i.e., HTTP/HTTPS/GRPC) not Network Load Balancers (i.e., TCP).
     * 
     */
    public Optional<String> matcher() {
        return Optional.ofNullable(this.matcher);
    }
    /**
     * @return Destination for the health check request. Required for HTTP/HTTPS ALB and HTTP NLB. Only applies to HTTP/HTTPS.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The port the load balancer uses when performing health checks on targets. Default is traffic-port.
     * 
     */
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Protocol the load balancer uses when performing health checks on targets. Must be either `TCP`, `HTTP`, or `HTTPS`. The TCP protocol is not supported for health checks if the protocol of the target group is HTTP or HTTPS. Defaults to HTTP.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return Amount of time, in seconds, during which no response from a target means a failed health check. The range is 2–120 seconds. For target groups with a protocol of HTTP, the default is 6 seconds. For target groups with a protocol of TCP, TLS or HTTPS, the default is 10 seconds. For target groups with a protocol of GENEVE, the default is 5 seconds. If the target type is lambda, the default is 30 seconds.
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return Number of consecutive health check failures required before considering a target unhealthy. The range is 2-10. Defaults to 3.
     * 
     */
    public Optional<Integer> unhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGroupHealthCheck defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer healthyThreshold;
        private @Nullable Integer interval;
        private @Nullable String matcher;
        private @Nullable String path;
        private @Nullable String port;
        private @Nullable String protocol;
        private @Nullable Integer timeout;
        private @Nullable Integer unhealthyThreshold;
        public Builder() {}
        public Builder(TargetGroupHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.interval = defaults.interval;
    	      this.matcher = defaults.matcher;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder healthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }
        @CustomType.Setter
        public Builder matcher(@Nullable String matcher) {
            this.matcher = matcher;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable String port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public TargetGroupHealthCheck build() {
            final var o = new TargetGroupHealthCheck();
            o.enabled = enabled;
            o.healthyThreshold = healthyThreshold;
            o.interval = interval;
            o.matcher = matcher;
            o.path = path;
            o.port = port;
            o.protocol = protocol;
            o.timeout = timeout;
            o.unhealthyThreshold = unhealthyThreshold;
            return o;
        }
    }
}
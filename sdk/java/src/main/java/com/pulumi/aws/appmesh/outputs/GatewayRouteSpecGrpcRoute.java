// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecGrpcRouteAction;
import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecGrpcRouteMatch;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GatewayRouteSpecGrpcRoute {
    /**
     * @return Action to take if a match is determined.
     * 
     */
    private GatewayRouteSpecGrpcRouteAction action;
    /**
     * @return Criteria for determining a request match.
     * 
     */
    private GatewayRouteSpecGrpcRouteMatch match;

    private GatewayRouteSpecGrpcRoute() {}
    /**
     * @return Action to take if a match is determined.
     * 
     */
    public GatewayRouteSpecGrpcRouteAction action() {
        return this.action;
    }
    /**
     * @return Criteria for determining a request match.
     * 
     */
    public GatewayRouteSpecGrpcRouteMatch match() {
        return this.match;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecGrpcRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GatewayRouteSpecGrpcRouteAction action;
        private GatewayRouteSpecGrpcRouteMatch match;
        public Builder() {}
        public Builder(GatewayRouteSpecGrpcRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.match = defaults.match;
        }

        @CustomType.Setter
        public Builder action(GatewayRouteSpecGrpcRouteAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        @CustomType.Setter
        public Builder match(GatewayRouteSpecGrpcRouteMatch match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public GatewayRouteSpecGrpcRoute build() {
            final var o = new GatewayRouteSpecGrpcRoute();
            o.action = action;
            o.match = match;
            return o;
        }
    }
}
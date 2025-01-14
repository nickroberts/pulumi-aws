// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderMatchArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteMatchHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteMatchHeaderArgs Empty = new RouteSpecHttpRouteMatchHeaderArgs();

    /**
     * If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
     * 
     */
    @Import(name="invert")
    private @Nullable Output<Boolean> invert;

    /**
     * @return If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
     * 
     */
    public Optional<Output<Boolean>> invert() {
        return Optional.ofNullable(this.invert);
    }

    /**
     * Method and value to match the header value sent with a request. Specify one match method.
     * 
     */
    @Import(name="match")
    private @Nullable Output<RouteSpecHttpRouteMatchHeaderMatchArgs> match;

    /**
     * @return Method and value to match the header value sent with a request. Specify one match method.
     * 
     */
    public Optional<Output<RouteSpecHttpRouteMatchHeaderMatchArgs>> match() {
        return Optional.ofNullable(this.match);
    }

    /**
     * Name for the HTTP header in the client request that will be matched on.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name for the HTTP header in the client request that will be matched on.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private RouteSpecHttpRouteMatchHeaderArgs() {}

    private RouteSpecHttpRouteMatchHeaderArgs(RouteSpecHttpRouteMatchHeaderArgs $) {
        this.invert = $.invert;
        this.match = $.match;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecHttpRouteMatchHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecHttpRouteMatchHeaderArgs $;

        public Builder() {
            $ = new RouteSpecHttpRouteMatchHeaderArgs();
        }

        public Builder(RouteSpecHttpRouteMatchHeaderArgs defaults) {
            $ = new RouteSpecHttpRouteMatchHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param invert If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder invert(@Nullable Output<Boolean> invert) {
            $.invert = invert;
            return this;
        }

        /**
         * @param invert If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder invert(Boolean invert) {
            return invert(Output.of(invert));
        }

        /**
         * @param match Method and value to match the header value sent with a request. Specify one match method.
         * 
         * @return builder
         * 
         */
        public Builder match(@Nullable Output<RouteSpecHttpRouteMatchHeaderMatchArgs> match) {
            $.match = match;
            return this;
        }

        /**
         * @param match Method and value to match the header value sent with a request. Specify one match method.
         * 
         * @return builder
         * 
         */
        public Builder match(RouteSpecHttpRouteMatchHeaderMatchArgs match) {
            return match(Output.of(match));
        }

        /**
         * @param name Name for the HTTP header in the client request that will be matched on.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name for the HTTP header in the client request that will be matched on.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RouteSpecHttpRouteMatchHeaderArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}

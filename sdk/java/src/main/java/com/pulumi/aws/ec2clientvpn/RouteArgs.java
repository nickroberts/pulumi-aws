// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2clientvpn;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * The ID of the Client VPN endpoint.
     * 
     */
    @Import(name="clientVpnEndpointId", required=true)
    private Output<String> clientVpnEndpointId;

    /**
     * @return The ID of the Client VPN endpoint.
     * 
     */
    public Output<String> clientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * A brief description of the route.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A brief description of the route.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The IPv4 address range, in CIDR notation, of the route destination.
     * 
     */
    @Import(name="destinationCidrBlock", required=true)
    private Output<String> destinationCidrBlock;

    /**
     * @return The IPv4 address range, in CIDR notation, of the route destination.
     * 
     */
    public Output<String> destinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
     * 
     */
    @Import(name="targetVpcSubnetId", required=true)
    private Output<String> targetVpcSubnetId;

    /**
     * @return The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
     * 
     */
    public Output<String> targetVpcSubnetId() {
        return this.targetVpcSubnetId;
    }

    private RouteArgs() {}

    private RouteArgs(RouteArgs $) {
        this.clientVpnEndpointId = $.clientVpnEndpointId;
        this.description = $.description;
        this.destinationCidrBlock = $.destinationCidrBlock;
        this.targetVpcSubnetId = $.targetVpcSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteArgs $;

        public Builder() {
            $ = new RouteArgs();
        }

        public Builder(RouteArgs defaults) {
            $ = new RouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientVpnEndpointId The ID of the Client VPN endpoint.
         * 
         * @return builder
         * 
         */
        public Builder clientVpnEndpointId(Output<String> clientVpnEndpointId) {
            $.clientVpnEndpointId = clientVpnEndpointId;
            return this;
        }

        /**
         * @param clientVpnEndpointId The ID of the Client VPN endpoint.
         * 
         * @return builder
         * 
         */
        public Builder clientVpnEndpointId(String clientVpnEndpointId) {
            return clientVpnEndpointId(Output.of(clientVpnEndpointId));
        }

        /**
         * @param description A brief description of the route.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A brief description of the route.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinationCidrBlock The IPv4 address range, in CIDR notation, of the route destination.
         * 
         * @return builder
         * 
         */
        public Builder destinationCidrBlock(Output<String> destinationCidrBlock) {
            $.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * @param destinationCidrBlock The IPv4 address range, in CIDR notation, of the route destination.
         * 
         * @return builder
         * 
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            return destinationCidrBlock(Output.of(destinationCidrBlock));
        }

        /**
         * @param targetVpcSubnetId The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
         * 
         * @return builder
         * 
         */
        public Builder targetVpcSubnetId(Output<String> targetVpcSubnetId) {
            $.targetVpcSubnetId = targetVpcSubnetId;
            return this;
        }

        /**
         * @param targetVpcSubnetId The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
         * 
         * @return builder
         * 
         */
        public Builder targetVpcSubnetId(String targetVpcSubnetId) {
            return targetVpcSubnetId(Output.of(targetVpcSubnetId));
        }

        public RouteArgs build() {
            $.clientVpnEndpointId = Objects.requireNonNull($.clientVpnEndpointId, "expected parameter 'clientVpnEndpointId' to be non-null");
            $.destinationCidrBlock = Objects.requireNonNull($.destinationCidrBlock, "expected parameter 'destinationCidrBlock' to be non-null");
            $.targetVpcSubnetId = Objects.requireNonNull($.targetVpcSubnetId, "expected parameter 'targetVpcSubnetId' to be non-null");
            return $;
        }
    }

}

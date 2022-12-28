// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TransitGatewayRegistrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransitGatewayRegistrationArgs Empty = new TransitGatewayRegistrationArgs();

    /**
     * The ID of the Global Network to register to.
     * 
     */
    @Import(name="globalNetworkId", required=true)
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the Global Network to register to.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The ARN of the Transit Gateway to register.
     * 
     */
    @Import(name="transitGatewayArn", required=true)
    private Output<String> transitGatewayArn;

    /**
     * @return The ARN of the Transit Gateway to register.
     * 
     */
    public Output<String> transitGatewayArn() {
        return this.transitGatewayArn;
    }

    private TransitGatewayRegistrationArgs() {}

    private TransitGatewayRegistrationArgs(TransitGatewayRegistrationArgs $) {
        this.globalNetworkId = $.globalNetworkId;
        this.transitGatewayArn = $.transitGatewayArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitGatewayRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitGatewayRegistrationArgs $;

        public Builder() {
            $ = new TransitGatewayRegistrationArgs();
        }

        public Builder(TransitGatewayRegistrationArgs defaults) {
            $ = new TransitGatewayRegistrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param globalNetworkId The ID of the Global Network to register to.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(Output<String> globalNetworkId) {
            $.globalNetworkId = globalNetworkId;
            return this;
        }

        /**
         * @param globalNetworkId The ID of the Global Network to register to.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(String globalNetworkId) {
            return globalNetworkId(Output.of(globalNetworkId));
        }

        /**
         * @param transitGatewayArn The ARN of the Transit Gateway to register.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayArn(Output<String> transitGatewayArn) {
            $.transitGatewayArn = transitGatewayArn;
            return this;
        }

        /**
         * @param transitGatewayArn The ARN of the Transit Gateway to register.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayArn(String transitGatewayArn) {
            return transitGatewayArn(Output.of(transitGatewayArn));
        }

        public TransitGatewayRegistrationArgs build() {
            $.globalNetworkId = Objects.requireNonNull($.globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
            $.transitGatewayArn = Objects.requireNonNull($.transitGatewayArn, "expected parameter 'transitGatewayArn' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerlessClusterVpcConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerlessClusterVpcConfigArgs Empty = new ServerlessClusterVpcConfigArgs();

    /**
     * Specifies up to five security groups that control inbound and outbound traffic for the serverless cluster.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return Specifies up to five security groups that control inbound and outbound traffic for the serverless cluster.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * A list of subnets in at least two different Availability Zones that host your client applications.
     * 
     */
    @Import(name="subnetIds", required=true)
    private Output<List<String>> subnetIds;

    /**
     * @return A list of subnets in at least two different Availability Zones that host your client applications.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    private ServerlessClusterVpcConfigArgs() {}

    private ServerlessClusterVpcConfigArgs(ServerlessClusterVpcConfigArgs $) {
        this.securityGroupIds = $.securityGroupIds;
        this.subnetIds = $.subnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerlessClusterVpcConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerlessClusterVpcConfigArgs $;

        public Builder() {
            $ = new ServerlessClusterVpcConfigArgs();
        }

        public Builder(ServerlessClusterVpcConfigArgs defaults) {
            $ = new ServerlessClusterVpcConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param securityGroupIds Specifies up to five security groups that control inbound and outbound traffic for the serverless cluster.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds Specifies up to five security groups that control inbound and outbound traffic for the serverless cluster.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds Specifies up to five security groups that control inbound and outbound traffic for the serverless cluster.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param subnetIds A list of subnets in at least two different Availability Zones that host your client applications.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds A list of subnets in at least two different Availability Zones that host your client applications.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds A list of subnets in at least two different Availability Zones that host your client applications.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        public ServerlessClusterVpcConfigArgs build() {
            $.subnetIds = Objects.requireNonNull($.subnetIds, "expected parameter 'subnetIds' to be non-null");
            return $;
        }
    }

}
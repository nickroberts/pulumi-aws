// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.route53.inputs.ResolverEndpointIpAddressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResolverEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResolverEndpointArgs Empty = new ResolverEndpointArgs();

    /**
     * The direction of DNS queries to or from the Route 53 Resolver endpoint.
     * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
     * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
     * 
     */
    @Import(name="direction", required=true)
    private Output<String> direction;

    /**
     * @return The direction of DNS queries to or from the Route 53 Resolver endpoint.
     * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
     * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
     * 
     */
    public Output<String> direction() {
        return this.direction;
    }

    /**
     * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
     * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
     * 
     */
    @Import(name="ipAddresses", required=true)
    private Output<List<ResolverEndpointIpAddressArgs>> ipAddresses;

    /**
     * @return The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
     * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
     * 
     */
    public Output<List<ResolverEndpointIpAddressArgs>> ipAddresses() {
        return this.ipAddresses;
    }

    /**
     * The friendly name of the Route 53 Resolver endpoint.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The friendly name of the Route 53 Resolver endpoint.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of one or more security groups that you want to use to control access to this VPC.
     * 
     */
    @Import(name="securityGroupIds", required=true)
    private Output<List<String>> securityGroupIds;

    /**
     * @return The ID of one or more security groups that you want to use to control access to this VPC.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ResolverEndpointArgs() {}

    private ResolverEndpointArgs(ResolverEndpointArgs $) {
        this.direction = $.direction;
        this.ipAddresses = $.ipAddresses;
        this.name = $.name;
        this.securityGroupIds = $.securityGroupIds;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResolverEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResolverEndpointArgs $;

        public Builder() {
            $ = new ResolverEndpointArgs();
        }

        public Builder(ResolverEndpointArgs defaults) {
            $ = new ResolverEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction The direction of DNS queries to or from the Route 53 Resolver endpoint.
         * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
         * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
         * 
         * @return builder
         * 
         */
        public Builder direction(Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction The direction of DNS queries to or from the Route 53 Resolver endpoint.
         * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
         * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param ipAddresses The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
         * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(Output<List<ResolverEndpointIpAddressArgs>> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        /**
         * @param ipAddresses The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
         * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(List<ResolverEndpointIpAddressArgs> ipAddresses) {
            return ipAddresses(Output.of(ipAddresses));
        }

        /**
         * @param ipAddresses The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
         * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(ResolverEndpointIpAddressArgs... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }

        /**
         * @param name The friendly name of the Route 53 Resolver endpoint.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The friendly name of the Route 53 Resolver endpoint.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param securityGroupIds The ID of one or more security groups that you want to use to control access to this VPC.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds The ID of one or more security groups that you want to use to control access to this VPC.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds The ID of one or more security groups that you want to use to control access to this VPC.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ResolverEndpointArgs build() {
            $.direction = Objects.requireNonNull($.direction, "expected parameter 'direction' to be non-null");
            $.ipAddresses = Objects.requireNonNull($.ipAddresses, "expected parameter 'ipAddresses' to be non-null");
            $.securityGroupIds = Objects.requireNonNull($.securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
            return $;
        }
    }

}
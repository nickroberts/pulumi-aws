// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyTableState extends com.pulumi.resources.ResourceArgs {

    public static final PolicyTableState Empty = new PolicyTableState();

    /**
     * EC2 Transit Gateway Policy Table Amazon Resource Name (ARN).
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return EC2 Transit Gateway Policy Table Amazon Resource Name (ARN).
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The state of the EC2 Transit Gateway Policy Table.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the EC2 Transit Gateway Policy Table.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Key-value tags for the EC2 Transit Gateway Policy Table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway Policy Table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * EC2 Transit Gateway identifier.
     * 
     */
    @Import(name="transitGatewayId")
    private @Nullable Output<String> transitGatewayId;

    /**
     * @return EC2 Transit Gateway identifier.
     * 
     */
    public Optional<Output<String>> transitGatewayId() {
        return Optional.ofNullable(this.transitGatewayId);
    }

    private PolicyTableState() {}

    private PolicyTableState(PolicyTableState $) {
        this.arn = $.arn;
        this.state = $.state;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.transitGatewayId = $.transitGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyTableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyTableState $;

        public Builder() {
            $ = new PolicyTableState();
        }

        public Builder(PolicyTableState defaults) {
            $ = new PolicyTableState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn EC2 Transit Gateway Policy Table Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn EC2 Transit Gateway Policy Table Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param state The state of the EC2 Transit Gateway Policy Table.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the EC2 Transit Gateway Policy Table.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags Key-value tags for the EC2 Transit Gateway Policy Table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value tags for the EC2 Transit Gateway Policy Table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param transitGatewayId EC2 Transit Gateway identifier.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayId(@Nullable Output<String> transitGatewayId) {
            $.transitGatewayId = transitGatewayId;
            return this;
        }

        /**
         * @param transitGatewayId EC2 Transit Gateway identifier.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayId(String transitGatewayId) {
            return transitGatewayId(Output.of(transitGatewayId));
        }

        public PolicyTableState build() {
            return $;
        }
    }

}
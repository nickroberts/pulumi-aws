// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogDestinationArgs Empty = new LogDestinationArgs();

    /**
     * A name for the log destination.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name for the log destination.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ARN of the target Amazon Kinesis stream resource for the destination.
     * 
     */
    @Import(name="targetArn", required=true)
    private Output<String> targetArn;

    /**
     * @return The ARN of the target Amazon Kinesis stream resource for the destination.
     * 
     */
    public Output<String> targetArn() {
        return this.targetArn;
    }

    private LogDestinationArgs() {}

    private LogDestinationArgs(LogDestinationArgs $) {
        this.name = $.name;
        this.roleArn = $.roleArn;
        this.tags = $.tags;
        this.targetArn = $.targetArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogDestinationArgs $;

        public Builder() {
            $ = new LogDestinationArgs();
        }

        public Builder(LogDestinationArgs defaults) {
            $ = new LogDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name A name for the log destination.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name for the log destination.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleArn The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param targetArn The ARN of the target Amazon Kinesis stream resource for the destination.
         * 
         * @return builder
         * 
         */
        public Builder targetArn(Output<String> targetArn) {
            $.targetArn = targetArn;
            return this;
        }

        /**
         * @param targetArn The ARN of the target Amazon Kinesis stream resource for the destination.
         * 
         * @return builder
         * 
         */
        public Builder targetArn(String targetArn) {
            return targetArn(Output.of(targetArn));
        }

        public LogDestinationArgs build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.targetArn = Objects.requireNonNull($.targetArn, "expected parameter 'targetArn' to be non-null");
            return $;
        }
    }

}
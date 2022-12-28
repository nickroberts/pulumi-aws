// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventTargetDeadLetterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventTargetDeadLetterConfigArgs Empty = new EventTargetDeadLetterConfigArgs();

    /**
     * - ARN of the SQS queue specified as the target for the dead-letter queue.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return - ARN of the SQS queue specified as the target for the dead-letter queue.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    private EventTargetDeadLetterConfigArgs() {}

    private EventTargetDeadLetterConfigArgs(EventTargetDeadLetterConfigArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventTargetDeadLetterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventTargetDeadLetterConfigArgs $;

        public Builder() {
            $ = new EventTargetDeadLetterConfigArgs();
        }

        public Builder(EventTargetDeadLetterConfigArgs defaults) {
            $ = new EventTargetDeadLetterConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn - ARN of the SQS queue specified as the target for the dead-letter queue.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn - ARN of the SQS queue specified as the target for the dead-letter queue.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public EventTargetDeadLetterConfigArgs build() {
            return $;
        }
    }

}
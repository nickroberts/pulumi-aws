// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleSourceSourceDetail {
    /**
     * @return The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWSresources. This defaults to `aws.config` and is the only valid value.
     * 
     */
    private @Nullable String eventSource;
    /**
     * @return The frequency that you want AWS Config to run evaluations for a rule that istriggered periodically. If specified, requires `message_type` to be `ScheduledNotification`.
     * 
     */
    private @Nullable String maximumExecutionFrequency;
    /**
     * @return The type of notification that triggers AWS Config to run an evaluation for a rule. You canspecify the following notification types:
     * 
     */
    private @Nullable String messageType;

    private RuleSourceSourceDetail() {}
    /**
     * @return The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWSresources. This defaults to `aws.config` and is the only valid value.
     * 
     */
    public Optional<String> eventSource() {
        return Optional.ofNullable(this.eventSource);
    }
    /**
     * @return The frequency that you want AWS Config to run evaluations for a rule that istriggered periodically. If specified, requires `message_type` to be `ScheduledNotification`.
     * 
     */
    public Optional<String> maximumExecutionFrequency() {
        return Optional.ofNullable(this.maximumExecutionFrequency);
    }
    /**
     * @return The type of notification that triggers AWS Config to run an evaluation for a rule. You canspecify the following notification types:
     * 
     */
    public Optional<String> messageType() {
        return Optional.ofNullable(this.messageType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleSourceSourceDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String eventSource;
        private @Nullable String maximumExecutionFrequency;
        private @Nullable String messageType;
        public Builder() {}
        public Builder(RuleSourceSourceDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventSource = defaults.eventSource;
    	      this.maximumExecutionFrequency = defaults.maximumExecutionFrequency;
    	      this.messageType = defaults.messageType;
        }

        @CustomType.Setter
        public Builder eventSource(@Nullable String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        @CustomType.Setter
        public Builder maximumExecutionFrequency(@Nullable String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        @CustomType.Setter
        public Builder messageType(@Nullable String messageType) {
            this.messageType = messageType;
            return this;
        }
        public RuleSourceSourceDetail build() {
            final var o = new RuleSourceSourceDetail();
            o.eventSource = eventSource;
            o.maximumExecutionFrequency = maximumExecutionFrequency;
            o.messageType = messageType;
            return o;
        }
    }
}
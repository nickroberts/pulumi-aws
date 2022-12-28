// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.chime.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VoiceConnectorStreamingState extends com.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorStreamingState Empty = new VoiceConnectorStreamingState();

    /**
     * The retention period, in hours, for the Amazon Kinesis data.
     * 
     */
    @Import(name="dataRetention")
    private @Nullable Output<Integer> dataRetention;

    /**
     * @return The retention period, in hours, for the Amazon Kinesis data.
     * 
     */
    public Optional<Output<Integer>> dataRetention() {
        return Optional.ofNullable(this.dataRetention);
    }

    /**
     * When true, media streaming to Amazon Kinesis is turned off. Default: `false`
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return When true, media streaming to Amazon Kinesis is turned off. Default: `false`
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
     * 
     */
    @Import(name="streamingNotificationTargets")
    private @Nullable Output<List<String>> streamingNotificationTargets;

    /**
     * @return The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
     * 
     */
    public Optional<Output<List<String>>> streamingNotificationTargets() {
        return Optional.ofNullable(this.streamingNotificationTargets);
    }

    /**
     * The Amazon Chime Voice Connector ID.
     * 
     */
    @Import(name="voiceConnectorId")
    private @Nullable Output<String> voiceConnectorId;

    /**
     * @return The Amazon Chime Voice Connector ID.
     * 
     */
    public Optional<Output<String>> voiceConnectorId() {
        return Optional.ofNullable(this.voiceConnectorId);
    }

    private VoiceConnectorStreamingState() {}

    private VoiceConnectorStreamingState(VoiceConnectorStreamingState $) {
        this.dataRetention = $.dataRetention;
        this.disabled = $.disabled;
        this.streamingNotificationTargets = $.streamingNotificationTargets;
        this.voiceConnectorId = $.voiceConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VoiceConnectorStreamingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VoiceConnectorStreamingState $;

        public Builder() {
            $ = new VoiceConnectorStreamingState();
        }

        public Builder(VoiceConnectorStreamingState defaults) {
            $ = new VoiceConnectorStreamingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataRetention The retention period, in hours, for the Amazon Kinesis data.
         * 
         * @return builder
         * 
         */
        public Builder dataRetention(@Nullable Output<Integer> dataRetention) {
            $.dataRetention = dataRetention;
            return this;
        }

        /**
         * @param dataRetention The retention period, in hours, for the Amazon Kinesis data.
         * 
         * @return builder
         * 
         */
        public Builder dataRetention(Integer dataRetention) {
            return dataRetention(Output.of(dataRetention));
        }

        /**
         * @param disabled When true, media streaming to Amazon Kinesis is turned off. Default: `false`
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled When true, media streaming to Amazon Kinesis is turned off. Default: `false`
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param streamingNotificationTargets The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
         * 
         * @return builder
         * 
         */
        public Builder streamingNotificationTargets(@Nullable Output<List<String>> streamingNotificationTargets) {
            $.streamingNotificationTargets = streamingNotificationTargets;
            return this;
        }

        /**
         * @param streamingNotificationTargets The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
         * 
         * @return builder
         * 
         */
        public Builder streamingNotificationTargets(List<String> streamingNotificationTargets) {
            return streamingNotificationTargets(Output.of(streamingNotificationTargets));
        }

        /**
         * @param streamingNotificationTargets The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
         * 
         * @return builder
         * 
         */
        public Builder streamingNotificationTargets(String... streamingNotificationTargets) {
            return streamingNotificationTargets(List.of(streamingNotificationTargets));
        }

        /**
         * @param voiceConnectorId The Amazon Chime Voice Connector ID.
         * 
         * @return builder
         * 
         */
        public Builder voiceConnectorId(@Nullable Output<String> voiceConnectorId) {
            $.voiceConnectorId = voiceConnectorId;
            return this;
        }

        /**
         * @param voiceConnectorId The Amazon Chime Voice Connector ID.
         * 
         * @return builder
         * 
         */
        public Builder voiceConnectorId(String voiceConnectorId) {
            return voiceConnectorId(Output.of(voiceConnectorId));
        }

        public VoiceConnectorStreamingState build() {
            return $;
        }
    }

}
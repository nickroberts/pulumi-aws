// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelInputAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelInputAttachmentArgs Empty = new ChannelInputAttachmentArgs();

    @Import(name="automaticInputFailoverSettings")
    private @Nullable Output<ChannelInputAttachmentAutomaticInputFailoverSettingsArgs> automaticInputFailoverSettings;

    public Optional<Output<ChannelInputAttachmentAutomaticInputFailoverSettingsArgs>> automaticInputFailoverSettings() {
        return Optional.ofNullable(this.automaticInputFailoverSettings);
    }

    /**
     * User-specified name for the attachment.
     * 
     */
    @Import(name="inputAttachmentName", required=true)
    private Output<String> inputAttachmentName;

    /**
     * @return User-specified name for the attachment.
     * 
     */
    public Output<String> inputAttachmentName() {
        return this.inputAttachmentName;
    }

    /**
     * The ID of the input.
     * 
     */
    @Import(name="inputId", required=true)
    private Output<String> inputId;

    /**
     * @return The ID of the input.
     * 
     */
    public Output<String> inputId() {
        return this.inputId;
    }

    /**
     * Settings of an input. See Input Settings for more details
     * 
     */
    @Import(name="inputSettings")
    private @Nullable Output<ChannelInputAttachmentInputSettingsArgs> inputSettings;

    /**
     * @return Settings of an input. See Input Settings for more details
     * 
     */
    public Optional<Output<ChannelInputAttachmentInputSettingsArgs>> inputSettings() {
        return Optional.ofNullable(this.inputSettings);
    }

    private ChannelInputAttachmentArgs() {}

    private ChannelInputAttachmentArgs(ChannelInputAttachmentArgs $) {
        this.automaticInputFailoverSettings = $.automaticInputFailoverSettings;
        this.inputAttachmentName = $.inputAttachmentName;
        this.inputId = $.inputId;
        this.inputSettings = $.inputSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelInputAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelInputAttachmentArgs $;

        public Builder() {
            $ = new ChannelInputAttachmentArgs();
        }

        public Builder(ChannelInputAttachmentArgs defaults) {
            $ = new ChannelInputAttachmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder automaticInputFailoverSettings(@Nullable Output<ChannelInputAttachmentAutomaticInputFailoverSettingsArgs> automaticInputFailoverSettings) {
            $.automaticInputFailoverSettings = automaticInputFailoverSettings;
            return this;
        }

        public Builder automaticInputFailoverSettings(ChannelInputAttachmentAutomaticInputFailoverSettingsArgs automaticInputFailoverSettings) {
            return automaticInputFailoverSettings(Output.of(automaticInputFailoverSettings));
        }

        /**
         * @param inputAttachmentName User-specified name for the attachment.
         * 
         * @return builder
         * 
         */
        public Builder inputAttachmentName(Output<String> inputAttachmentName) {
            $.inputAttachmentName = inputAttachmentName;
            return this;
        }

        /**
         * @param inputAttachmentName User-specified name for the attachment.
         * 
         * @return builder
         * 
         */
        public Builder inputAttachmentName(String inputAttachmentName) {
            return inputAttachmentName(Output.of(inputAttachmentName));
        }

        /**
         * @param inputId The ID of the input.
         * 
         * @return builder
         * 
         */
        public Builder inputId(Output<String> inputId) {
            $.inputId = inputId;
            return this;
        }

        /**
         * @param inputId The ID of the input.
         * 
         * @return builder
         * 
         */
        public Builder inputId(String inputId) {
            return inputId(Output.of(inputId));
        }

        /**
         * @param inputSettings Settings of an input. See Input Settings for more details
         * 
         * @return builder
         * 
         */
        public Builder inputSettings(@Nullable Output<ChannelInputAttachmentInputSettingsArgs> inputSettings) {
            $.inputSettings = inputSettings;
            return this;
        }

        /**
         * @param inputSettings Settings of an input. See Input Settings for more details
         * 
         * @return builder
         * 
         */
        public Builder inputSettings(ChannelInputAttachmentInputSettingsArgs inputSettings) {
            return inputSettings(Output.of(inputSettings));
        }

        public ChannelInputAttachmentArgs build() {
            $.inputAttachmentName = Objects.requireNonNull($.inputAttachmentName, "expected parameter 'inputAttachmentName' to be non-null");
            $.inputId = Objects.requireNonNull($.inputId, "expected parameter 'inputId' to be non-null");
            return $;
        }
    }

}
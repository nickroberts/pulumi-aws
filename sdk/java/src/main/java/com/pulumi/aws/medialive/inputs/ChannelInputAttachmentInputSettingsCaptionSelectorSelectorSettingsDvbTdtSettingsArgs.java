// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettingsArgs Empty = new ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettingsArgs();

    @Import(name="ocrLanguage")
    private @Nullable Output<String> ocrLanguage;

    public Optional<Output<String>> ocrLanguage() {
        return Optional.ofNullable(this.ocrLanguage);
    }

    @Import(name="pid")
    private @Nullable Output<Integer> pid;

    public Optional<Output<Integer>> pid() {
        return Optional.ofNullable(this.pid);
    }

    private ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettingsArgs() {}

    private ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettingsArgs(ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettingsArgs $) {
        this.ocrLanguage = $.ocrLanguage;
        this.pid = $.pid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettingsArgs $;

        public Builder() {
            $ = new ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettingsArgs();
        }

        public Builder(ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettingsArgs defaults) {
            $ = new ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder ocrLanguage(@Nullable Output<String> ocrLanguage) {
            $.ocrLanguage = ocrLanguage;
            return this;
        }

        public Builder ocrLanguage(String ocrLanguage) {
            return ocrLanguage(Output.of(ocrLanguage));
        }

        public Builder pid(@Nullable Output<Integer> pid) {
            $.pid = pid;
            return this;
        }

        public Builder pid(Integer pid) {
            return pid(Output.of(pid));
        }

        public ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettingsArgs build() {
            return $;
        }
    }

}
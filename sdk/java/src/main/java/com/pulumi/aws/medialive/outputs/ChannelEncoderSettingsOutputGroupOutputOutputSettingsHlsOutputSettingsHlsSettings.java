// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettings;
import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettings;
import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFrameCaptureHlsSettings;
import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsStandardHlsSettings;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettings {
    private @Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettings audioOnlyHlsSettings;
    private @Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettings fmp4HlsSettings;
    private @Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFrameCaptureHlsSettings frameCaptureHlsSettings;
    private @Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsStandardHlsSettings standardHlsSettings;

    private ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettings() {}
    public Optional<ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettings> audioOnlyHlsSettings() {
        return Optional.ofNullable(this.audioOnlyHlsSettings);
    }
    public Optional<ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettings> fmp4HlsSettings() {
        return Optional.ofNullable(this.fmp4HlsSettings);
    }
    public Optional<ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFrameCaptureHlsSettings> frameCaptureHlsSettings() {
        return Optional.ofNullable(this.frameCaptureHlsSettings);
    }
    public Optional<ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsStandardHlsSettings> standardHlsSettings() {
        return Optional.ofNullable(this.standardHlsSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettings audioOnlyHlsSettings;
        private @Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettings fmp4HlsSettings;
        private @Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFrameCaptureHlsSettings frameCaptureHlsSettings;
        private @Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsStandardHlsSettings standardHlsSettings;
        public Builder() {}
        public Builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioOnlyHlsSettings = defaults.audioOnlyHlsSettings;
    	      this.fmp4HlsSettings = defaults.fmp4HlsSettings;
    	      this.frameCaptureHlsSettings = defaults.frameCaptureHlsSettings;
    	      this.standardHlsSettings = defaults.standardHlsSettings;
        }

        @CustomType.Setter
        public Builder audioOnlyHlsSettings(@Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettings audioOnlyHlsSettings) {
            this.audioOnlyHlsSettings = audioOnlyHlsSettings;
            return this;
        }
        @CustomType.Setter
        public Builder fmp4HlsSettings(@Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettings fmp4HlsSettings) {
            this.fmp4HlsSettings = fmp4HlsSettings;
            return this;
        }
        @CustomType.Setter
        public Builder frameCaptureHlsSettings(@Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFrameCaptureHlsSettings frameCaptureHlsSettings) {
            this.frameCaptureHlsSettings = frameCaptureHlsSettings;
            return this;
        }
        @CustomType.Setter
        public Builder standardHlsSettings(@Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsStandardHlsSettings standardHlsSettings) {
            this.standardHlsSettings = standardHlsSettings;
            return this;
        }
        public ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettings build() {
            final var o = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettings();
            o.audioOnlyHlsSettings = audioOnlyHlsSettings;
            o.fmp4HlsSettings = fmp4HlsSettings;
            o.frameCaptureHlsSettings = frameCaptureHlsSettings;
            o.standardHlsSettings = standardHlsSettings;
            return o;
        }
    }
}
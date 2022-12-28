// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3Settings {
    /**
     * @return Sets the attenuation control.
     * 
     */
    private @Nullable String attenuationControl;
    /**
     * @return Average bitrate in bits/second.
     * 
     */
    private @Nullable Double bitrate;
    /**
     * @return Specifies the bitstream mode (bsmod) for the emitted AC-3 stream.
     * 
     */
    private @Nullable String bitstreamMode;
    /**
     * @return Dolby Digital Plus coding mode.
     * 
     */
    private @Nullable String codingMode;
    private @Nullable String dcFilter;
    /**
     * @return Sets the dialnorm for the output.
     * 
     */
    private @Nullable Integer dialnorm;
    /**
     * @return Sets the Dolby dynamic range compression profile.
     * 
     */
    private @Nullable String drcLine;
    /**
     * @return Sets the profile for heavy Dolby dynamic range compression.
     * 
     */
    private @Nullable String drcRf;
    private @Nullable String lfeControl;
    /**
     * @return When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding.
     * 
     */
    private @Nullable String lfeFilter;
    private @Nullable Double loRoCenterMixLevel;
    private @Nullable Double loRoSurroundMixLevel;
    private @Nullable Double ltRtCenterMixLevel;
    private @Nullable Double ltRtSurroundMixLevel;
    /**
     * @return Metadata control.
     * 
     */
    private @Nullable String metadataControl;
    private @Nullable String passthroughControl;
    private @Nullable String phaseControl;
    private @Nullable String stereoDownmix;
    private @Nullable String surroundExMode;
    private @Nullable String surroundMode;

    private ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3Settings() {}
    /**
     * @return Sets the attenuation control.
     * 
     */
    public Optional<String> attenuationControl() {
        return Optional.ofNullable(this.attenuationControl);
    }
    /**
     * @return Average bitrate in bits/second.
     * 
     */
    public Optional<Double> bitrate() {
        return Optional.ofNullable(this.bitrate);
    }
    /**
     * @return Specifies the bitstream mode (bsmod) for the emitted AC-3 stream.
     * 
     */
    public Optional<String> bitstreamMode() {
        return Optional.ofNullable(this.bitstreamMode);
    }
    /**
     * @return Dolby Digital Plus coding mode.
     * 
     */
    public Optional<String> codingMode() {
        return Optional.ofNullable(this.codingMode);
    }
    public Optional<String> dcFilter() {
        return Optional.ofNullable(this.dcFilter);
    }
    /**
     * @return Sets the dialnorm for the output.
     * 
     */
    public Optional<Integer> dialnorm() {
        return Optional.ofNullable(this.dialnorm);
    }
    /**
     * @return Sets the Dolby dynamic range compression profile.
     * 
     */
    public Optional<String> drcLine() {
        return Optional.ofNullable(this.drcLine);
    }
    /**
     * @return Sets the profile for heavy Dolby dynamic range compression.
     * 
     */
    public Optional<String> drcRf() {
        return Optional.ofNullable(this.drcRf);
    }
    public Optional<String> lfeControl() {
        return Optional.ofNullable(this.lfeControl);
    }
    /**
     * @return When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding.
     * 
     */
    public Optional<String> lfeFilter() {
        return Optional.ofNullable(this.lfeFilter);
    }
    public Optional<Double> loRoCenterMixLevel() {
        return Optional.ofNullable(this.loRoCenterMixLevel);
    }
    public Optional<Double> loRoSurroundMixLevel() {
        return Optional.ofNullable(this.loRoSurroundMixLevel);
    }
    public Optional<Double> ltRtCenterMixLevel() {
        return Optional.ofNullable(this.ltRtCenterMixLevel);
    }
    public Optional<Double> ltRtSurroundMixLevel() {
        return Optional.ofNullable(this.ltRtSurroundMixLevel);
    }
    /**
     * @return Metadata control.
     * 
     */
    public Optional<String> metadataControl() {
        return Optional.ofNullable(this.metadataControl);
    }
    public Optional<String> passthroughControl() {
        return Optional.ofNullable(this.passthroughControl);
    }
    public Optional<String> phaseControl() {
        return Optional.ofNullable(this.phaseControl);
    }
    public Optional<String> stereoDownmix() {
        return Optional.ofNullable(this.stereoDownmix);
    }
    public Optional<String> surroundExMode() {
        return Optional.ofNullable(this.surroundExMode);
    }
    public Optional<String> surroundMode() {
        return Optional.ofNullable(this.surroundMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3Settings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String attenuationControl;
        private @Nullable Double bitrate;
        private @Nullable String bitstreamMode;
        private @Nullable String codingMode;
        private @Nullable String dcFilter;
        private @Nullable Integer dialnorm;
        private @Nullable String drcLine;
        private @Nullable String drcRf;
        private @Nullable String lfeControl;
        private @Nullable String lfeFilter;
        private @Nullable Double loRoCenterMixLevel;
        private @Nullable Double loRoSurroundMixLevel;
        private @Nullable Double ltRtCenterMixLevel;
        private @Nullable Double ltRtSurroundMixLevel;
        private @Nullable String metadataControl;
        private @Nullable String passthroughControl;
        private @Nullable String phaseControl;
        private @Nullable String stereoDownmix;
        private @Nullable String surroundExMode;
        private @Nullable String surroundMode;
        public Builder() {}
        public Builder(ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3Settings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attenuationControl = defaults.attenuationControl;
    	      this.bitrate = defaults.bitrate;
    	      this.bitstreamMode = defaults.bitstreamMode;
    	      this.codingMode = defaults.codingMode;
    	      this.dcFilter = defaults.dcFilter;
    	      this.dialnorm = defaults.dialnorm;
    	      this.drcLine = defaults.drcLine;
    	      this.drcRf = defaults.drcRf;
    	      this.lfeControl = defaults.lfeControl;
    	      this.lfeFilter = defaults.lfeFilter;
    	      this.loRoCenterMixLevel = defaults.loRoCenterMixLevel;
    	      this.loRoSurroundMixLevel = defaults.loRoSurroundMixLevel;
    	      this.ltRtCenterMixLevel = defaults.ltRtCenterMixLevel;
    	      this.ltRtSurroundMixLevel = defaults.ltRtSurroundMixLevel;
    	      this.metadataControl = defaults.metadataControl;
    	      this.passthroughControl = defaults.passthroughControl;
    	      this.phaseControl = defaults.phaseControl;
    	      this.stereoDownmix = defaults.stereoDownmix;
    	      this.surroundExMode = defaults.surroundExMode;
    	      this.surroundMode = defaults.surroundMode;
        }

        @CustomType.Setter
        public Builder attenuationControl(@Nullable String attenuationControl) {
            this.attenuationControl = attenuationControl;
            return this;
        }
        @CustomType.Setter
        public Builder bitrate(@Nullable Double bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        @CustomType.Setter
        public Builder bitstreamMode(@Nullable String bitstreamMode) {
            this.bitstreamMode = bitstreamMode;
            return this;
        }
        @CustomType.Setter
        public Builder codingMode(@Nullable String codingMode) {
            this.codingMode = codingMode;
            return this;
        }
        @CustomType.Setter
        public Builder dcFilter(@Nullable String dcFilter) {
            this.dcFilter = dcFilter;
            return this;
        }
        @CustomType.Setter
        public Builder dialnorm(@Nullable Integer dialnorm) {
            this.dialnorm = dialnorm;
            return this;
        }
        @CustomType.Setter
        public Builder drcLine(@Nullable String drcLine) {
            this.drcLine = drcLine;
            return this;
        }
        @CustomType.Setter
        public Builder drcRf(@Nullable String drcRf) {
            this.drcRf = drcRf;
            return this;
        }
        @CustomType.Setter
        public Builder lfeControl(@Nullable String lfeControl) {
            this.lfeControl = lfeControl;
            return this;
        }
        @CustomType.Setter
        public Builder lfeFilter(@Nullable String lfeFilter) {
            this.lfeFilter = lfeFilter;
            return this;
        }
        @CustomType.Setter
        public Builder loRoCenterMixLevel(@Nullable Double loRoCenterMixLevel) {
            this.loRoCenterMixLevel = loRoCenterMixLevel;
            return this;
        }
        @CustomType.Setter
        public Builder loRoSurroundMixLevel(@Nullable Double loRoSurroundMixLevel) {
            this.loRoSurroundMixLevel = loRoSurroundMixLevel;
            return this;
        }
        @CustomType.Setter
        public Builder ltRtCenterMixLevel(@Nullable Double ltRtCenterMixLevel) {
            this.ltRtCenterMixLevel = ltRtCenterMixLevel;
            return this;
        }
        @CustomType.Setter
        public Builder ltRtSurroundMixLevel(@Nullable Double ltRtSurroundMixLevel) {
            this.ltRtSurroundMixLevel = ltRtSurroundMixLevel;
            return this;
        }
        @CustomType.Setter
        public Builder metadataControl(@Nullable String metadataControl) {
            this.metadataControl = metadataControl;
            return this;
        }
        @CustomType.Setter
        public Builder passthroughControl(@Nullable String passthroughControl) {
            this.passthroughControl = passthroughControl;
            return this;
        }
        @CustomType.Setter
        public Builder phaseControl(@Nullable String phaseControl) {
            this.phaseControl = phaseControl;
            return this;
        }
        @CustomType.Setter
        public Builder stereoDownmix(@Nullable String stereoDownmix) {
            this.stereoDownmix = stereoDownmix;
            return this;
        }
        @CustomType.Setter
        public Builder surroundExMode(@Nullable String surroundExMode) {
            this.surroundExMode = surroundExMode;
            return this;
        }
        @CustomType.Setter
        public Builder surroundMode(@Nullable String surroundMode) {
            this.surroundMode = surroundMode;
            return this;
        }
        public ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3Settings build() {
            final var o = new ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3Settings();
            o.attenuationControl = attenuationControl;
            o.bitrate = bitrate;
            o.bitstreamMode = bitstreamMode;
            o.codingMode = codingMode;
            o.dcFilter = dcFilter;
            o.dialnorm = dialnorm;
            o.drcLine = drcLine;
            o.drcRf = drcRf;
            o.lfeControl = lfeControl;
            o.lfeFilter = lfeFilter;
            o.loRoCenterMixLevel = loRoCenterMixLevel;
            o.loRoSurroundMixLevel = loRoSurroundMixLevel;
            o.ltRtCenterMixLevel = ltRtCenterMixLevel;
            o.ltRtSurroundMixLevel = ltRtSurroundMixLevel;
            o.metadataControl = metadataControl;
            o.passthroughControl = passthroughControl;
            o.phaseControl = phaseControl;
            o.stereoDownmix = stereoDownmix;
            o.surroundExMode = surroundExMode;
            o.surroundMode = surroundMode;
            return o;
        }
    }
}
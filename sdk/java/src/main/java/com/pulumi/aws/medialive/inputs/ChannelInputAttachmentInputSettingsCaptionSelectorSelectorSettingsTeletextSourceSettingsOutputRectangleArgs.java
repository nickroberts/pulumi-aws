// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsOutputRectangleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsOutputRectangleArgs Empty = new ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsOutputRectangleArgs();

    /**
     * Output video height in pixels.
     * 
     */
    @Import(name="height", required=true)
    private Output<Double> height;

    /**
     * @return Output video height in pixels.
     * 
     */
    public Output<Double> height() {
        return this.height;
    }

    @Import(name="leftOffset", required=true)
    private Output<Double> leftOffset;

    public Output<Double> leftOffset() {
        return this.leftOffset;
    }

    @Import(name="topOffset", required=true)
    private Output<Double> topOffset;

    public Output<Double> topOffset() {
        return this.topOffset;
    }

    /**
     * Output video width in pixels.
     * 
     */
    @Import(name="width", required=true)
    private Output<Double> width;

    /**
     * @return Output video width in pixels.
     * 
     */
    public Output<Double> width() {
        return this.width;
    }

    private ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsOutputRectangleArgs() {}

    private ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsOutputRectangleArgs(ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsOutputRectangleArgs $) {
        this.height = $.height;
        this.leftOffset = $.leftOffset;
        this.topOffset = $.topOffset;
        this.width = $.width;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsOutputRectangleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsOutputRectangleArgs $;

        public Builder() {
            $ = new ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsOutputRectangleArgs();
        }

        public Builder(ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsOutputRectangleArgs defaults) {
            $ = new ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsOutputRectangleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param height Output video height in pixels.
         * 
         * @return builder
         * 
         */
        public Builder height(Output<Double> height) {
            $.height = height;
            return this;
        }

        /**
         * @param height Output video height in pixels.
         * 
         * @return builder
         * 
         */
        public Builder height(Double height) {
            return height(Output.of(height));
        }

        public Builder leftOffset(Output<Double> leftOffset) {
            $.leftOffset = leftOffset;
            return this;
        }

        public Builder leftOffset(Double leftOffset) {
            return leftOffset(Output.of(leftOffset));
        }

        public Builder topOffset(Output<Double> topOffset) {
            $.topOffset = topOffset;
            return this;
        }

        public Builder topOffset(Double topOffset) {
            return topOffset(Output.of(topOffset));
        }

        /**
         * @param width Output video width in pixels.
         * 
         * @return builder
         * 
         */
        public Builder width(Output<Double> width) {
            $.width = width;
            return this;
        }

        /**
         * @param width Output video width in pixels.
         * 
         * @return builder
         * 
         */
        public Builder width(Double width) {
            return width(Output.of(width));
        }

        public ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsOutputRectangleArgs build() {
            $.height = Objects.requireNonNull($.height, "expected parameter 'height' to be non-null");
            $.leftOffset = Objects.requireNonNull($.leftOffset, "expected parameter 'leftOffset' to be non-null");
            $.topOffset = Objects.requireNonNull($.topOffset, "expected parameter 'topOffset' to be non-null");
            $.width = Objects.requireNonNull($.width, "expected parameter 'width' to be non-null");
            return $;
        }
    }

}
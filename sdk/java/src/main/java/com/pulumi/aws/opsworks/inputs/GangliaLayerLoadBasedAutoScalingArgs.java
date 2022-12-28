// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.inputs;

import com.pulumi.aws.opsworks.inputs.GangliaLayerLoadBasedAutoScalingDownscalingArgs;
import com.pulumi.aws.opsworks.inputs.GangliaLayerLoadBasedAutoScalingUpscalingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GangliaLayerLoadBasedAutoScalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GangliaLayerLoadBasedAutoScalingArgs Empty = new GangliaLayerLoadBasedAutoScalingArgs();

    @Import(name="downscaling")
    private @Nullable Output<GangliaLayerLoadBasedAutoScalingDownscalingArgs> downscaling;

    public Optional<Output<GangliaLayerLoadBasedAutoScalingDownscalingArgs>> downscaling() {
        return Optional.ofNullable(this.downscaling);
    }

    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    @Import(name="upscaling")
    private @Nullable Output<GangliaLayerLoadBasedAutoScalingUpscalingArgs> upscaling;

    public Optional<Output<GangliaLayerLoadBasedAutoScalingUpscalingArgs>> upscaling() {
        return Optional.ofNullable(this.upscaling);
    }

    private GangliaLayerLoadBasedAutoScalingArgs() {}

    private GangliaLayerLoadBasedAutoScalingArgs(GangliaLayerLoadBasedAutoScalingArgs $) {
        this.downscaling = $.downscaling;
        this.enable = $.enable;
        this.upscaling = $.upscaling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GangliaLayerLoadBasedAutoScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GangliaLayerLoadBasedAutoScalingArgs $;

        public Builder() {
            $ = new GangliaLayerLoadBasedAutoScalingArgs();
        }

        public Builder(GangliaLayerLoadBasedAutoScalingArgs defaults) {
            $ = new GangliaLayerLoadBasedAutoScalingArgs(Objects.requireNonNull(defaults));
        }

        public Builder downscaling(@Nullable Output<GangliaLayerLoadBasedAutoScalingDownscalingArgs> downscaling) {
            $.downscaling = downscaling;
            return this;
        }

        public Builder downscaling(GangliaLayerLoadBasedAutoScalingDownscalingArgs downscaling) {
            return downscaling(Output.of(downscaling));
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public Builder upscaling(@Nullable Output<GangliaLayerLoadBasedAutoScalingUpscalingArgs> upscaling) {
            $.upscaling = upscaling;
            return this;
        }

        public Builder upscaling(GangliaLayerLoadBasedAutoScalingUpscalingArgs upscaling) {
            return upscaling(Output.of(upscaling));
        }

        public GangliaLayerLoadBasedAutoScalingArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.inputs;

import com.pulumi.aws.opsworks.inputs.StaticWebLayerLoadBasedAutoScalingDownscalingArgs;
import com.pulumi.aws.opsworks.inputs.StaticWebLayerLoadBasedAutoScalingUpscalingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StaticWebLayerLoadBasedAutoScalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final StaticWebLayerLoadBasedAutoScalingArgs Empty = new StaticWebLayerLoadBasedAutoScalingArgs();

    @Import(name="downscaling")
    private @Nullable Output<StaticWebLayerLoadBasedAutoScalingDownscalingArgs> downscaling;

    public Optional<Output<StaticWebLayerLoadBasedAutoScalingDownscalingArgs>> downscaling() {
        return Optional.ofNullable(this.downscaling);
    }

    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    @Import(name="upscaling")
    private @Nullable Output<StaticWebLayerLoadBasedAutoScalingUpscalingArgs> upscaling;

    public Optional<Output<StaticWebLayerLoadBasedAutoScalingUpscalingArgs>> upscaling() {
        return Optional.ofNullable(this.upscaling);
    }

    private StaticWebLayerLoadBasedAutoScalingArgs() {}

    private StaticWebLayerLoadBasedAutoScalingArgs(StaticWebLayerLoadBasedAutoScalingArgs $) {
        this.downscaling = $.downscaling;
        this.enable = $.enable;
        this.upscaling = $.upscaling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StaticWebLayerLoadBasedAutoScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StaticWebLayerLoadBasedAutoScalingArgs $;

        public Builder() {
            $ = new StaticWebLayerLoadBasedAutoScalingArgs();
        }

        public Builder(StaticWebLayerLoadBasedAutoScalingArgs defaults) {
            $ = new StaticWebLayerLoadBasedAutoScalingArgs(Objects.requireNonNull(defaults));
        }

        public Builder downscaling(@Nullable Output<StaticWebLayerLoadBasedAutoScalingDownscalingArgs> downscaling) {
            $.downscaling = downscaling;
            return this;
        }

        public Builder downscaling(StaticWebLayerLoadBasedAutoScalingDownscalingArgs downscaling) {
            return downscaling(Output.of(downscaling));
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public Builder upscaling(@Nullable Output<StaticWebLayerLoadBasedAutoScalingUpscalingArgs> upscaling) {
            $.upscaling = upscaling;
            return this;
        }

        public Builder upscaling(StaticWebLayerLoadBasedAutoScalingUpscalingArgs upscaling) {
            return upscaling(Output.of(upscaling));
        }

        public StaticWebLayerLoadBasedAutoScalingArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ModelInferenceExecutionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelInferenceExecutionConfigArgs Empty = new ModelInferenceExecutionConfigArgs();

    /**
     * The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    private ModelInferenceExecutionConfigArgs() {}

    private ModelInferenceExecutionConfigArgs(ModelInferenceExecutionConfigArgs $) {
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelInferenceExecutionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelInferenceExecutionConfigArgs $;

        public Builder() {
            $ = new ModelInferenceExecutionConfigArgs();
        }

        public Builder(ModelInferenceExecutionConfigArgs defaults) {
            $ = new ModelInferenceExecutionConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public ModelInferenceExecutionConfigArgs build() {
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            return $;
        }
    }

}

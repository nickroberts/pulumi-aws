// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.EndpointConfigurationProductionVariantCoreDumpConfig;
import com.pulumi.aws.sagemaker.outputs.EndpointConfigurationProductionVariantServerlessConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointConfigurationProductionVariant {
    /**
     * @return The size of the Elastic Inference (EI) instance to use for the production variant.
     * 
     */
    private @Nullable String acceleratorType;
    /**
     * @return The timeout value, in seconds, for your inference container to pass health check by SageMaker Hosting. For more information about health check, see [How Your Container Should Respond to Health Check (Ping) Requests](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests). Valid values between `60` and `3600`.
     * 
     */
    private @Nullable Integer containerStartupHealthCheckTimeoutInSeconds;
    /**
     * @return Specifies configuration for a core dump from the model container when the process crashes. Fields are documented below.
     * 
     */
    private @Nullable EndpointConfigurationProductionVariantCoreDumpConfig coreDumpConfig;
    /**
     * @return Initial number of instances used for auto-scaling.
     * 
     */
    private @Nullable Integer initialInstanceCount;
    /**
     * @return Determines initial traffic distribution among all of the models that you specify in the endpoint configuration. If unspecified, it defaults to `1.0`.
     * 
     */
    private @Nullable Double initialVariantWeight;
    /**
     * @return The type of instance to start.
     * 
     */
    private @Nullable String instanceType;
    /**
     * @return The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to the individual inference instance associated with this production variant. Valid values between `60` and `3600`.
     * 
     */
    private @Nullable Integer modelDataDownloadTimeoutInSeconds;
    /**
     * @return The name of the model to use.
     * 
     */
    private String modelName;
    /**
     * @return Specifies configuration for how an endpoint performs asynchronous inference.
     * 
     */
    private @Nullable EndpointConfigurationProductionVariantServerlessConfig serverlessConfig;
    /**
     * @return The name of the variant. If omitted, this provider will assign a random, unique name.
     * 
     */
    private @Nullable String variantName;
    /**
     * @return The size, in GB, of the ML storage volume attached to individual inference instance associated with the production variant. Valid values between `1` and `512`.
     * 
     */
    private @Nullable Integer volumeSizeInGb;

    private EndpointConfigurationProductionVariant() {}
    /**
     * @return The size of the Elastic Inference (EI) instance to use for the production variant.
     * 
     */
    public Optional<String> acceleratorType() {
        return Optional.ofNullable(this.acceleratorType);
    }
    /**
     * @return The timeout value, in seconds, for your inference container to pass health check by SageMaker Hosting. For more information about health check, see [How Your Container Should Respond to Health Check (Ping) Requests](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests). Valid values between `60` and `3600`.
     * 
     */
    public Optional<Integer> containerStartupHealthCheckTimeoutInSeconds() {
        return Optional.ofNullable(this.containerStartupHealthCheckTimeoutInSeconds);
    }
    /**
     * @return Specifies configuration for a core dump from the model container when the process crashes. Fields are documented below.
     * 
     */
    public Optional<EndpointConfigurationProductionVariantCoreDumpConfig> coreDumpConfig() {
        return Optional.ofNullable(this.coreDumpConfig);
    }
    /**
     * @return Initial number of instances used for auto-scaling.
     * 
     */
    public Optional<Integer> initialInstanceCount() {
        return Optional.ofNullable(this.initialInstanceCount);
    }
    /**
     * @return Determines initial traffic distribution among all of the models that you specify in the endpoint configuration. If unspecified, it defaults to `1.0`.
     * 
     */
    public Optional<Double> initialVariantWeight() {
        return Optional.ofNullable(this.initialVariantWeight);
    }
    /**
     * @return The type of instance to start.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to the individual inference instance associated with this production variant. Valid values between `60` and `3600`.
     * 
     */
    public Optional<Integer> modelDataDownloadTimeoutInSeconds() {
        return Optional.ofNullable(this.modelDataDownloadTimeoutInSeconds);
    }
    /**
     * @return The name of the model to use.
     * 
     */
    public String modelName() {
        return this.modelName;
    }
    /**
     * @return Specifies configuration for how an endpoint performs asynchronous inference.
     * 
     */
    public Optional<EndpointConfigurationProductionVariantServerlessConfig> serverlessConfig() {
        return Optional.ofNullable(this.serverlessConfig);
    }
    /**
     * @return The name of the variant. If omitted, this provider will assign a random, unique name.
     * 
     */
    public Optional<String> variantName() {
        return Optional.ofNullable(this.variantName);
    }
    /**
     * @return The size, in GB, of the ML storage volume attached to individual inference instance associated with the production variant. Valid values between `1` and `512`.
     * 
     */
    public Optional<Integer> volumeSizeInGb() {
        return Optional.ofNullable(this.volumeSizeInGb);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationProductionVariant defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String acceleratorType;
        private @Nullable Integer containerStartupHealthCheckTimeoutInSeconds;
        private @Nullable EndpointConfigurationProductionVariantCoreDumpConfig coreDumpConfig;
        private @Nullable Integer initialInstanceCount;
        private @Nullable Double initialVariantWeight;
        private @Nullable String instanceType;
        private @Nullable Integer modelDataDownloadTimeoutInSeconds;
        private String modelName;
        private @Nullable EndpointConfigurationProductionVariantServerlessConfig serverlessConfig;
        private @Nullable String variantName;
        private @Nullable Integer volumeSizeInGb;
        public Builder() {}
        public Builder(EndpointConfigurationProductionVariant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.containerStartupHealthCheckTimeoutInSeconds = defaults.containerStartupHealthCheckTimeoutInSeconds;
    	      this.coreDumpConfig = defaults.coreDumpConfig;
    	      this.initialInstanceCount = defaults.initialInstanceCount;
    	      this.initialVariantWeight = defaults.initialVariantWeight;
    	      this.instanceType = defaults.instanceType;
    	      this.modelDataDownloadTimeoutInSeconds = defaults.modelDataDownloadTimeoutInSeconds;
    	      this.modelName = defaults.modelName;
    	      this.serverlessConfig = defaults.serverlessConfig;
    	      this.variantName = defaults.variantName;
    	      this.volumeSizeInGb = defaults.volumeSizeInGb;
        }

        @CustomType.Setter
        public Builder acceleratorType(@Nullable String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }
        @CustomType.Setter
        public Builder containerStartupHealthCheckTimeoutInSeconds(@Nullable Integer containerStartupHealthCheckTimeoutInSeconds) {
            this.containerStartupHealthCheckTimeoutInSeconds = containerStartupHealthCheckTimeoutInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder coreDumpConfig(@Nullable EndpointConfigurationProductionVariantCoreDumpConfig coreDumpConfig) {
            this.coreDumpConfig = coreDumpConfig;
            return this;
        }
        @CustomType.Setter
        public Builder initialInstanceCount(@Nullable Integer initialInstanceCount) {
            this.initialInstanceCount = initialInstanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder initialVariantWeight(@Nullable Double initialVariantWeight) {
            this.initialVariantWeight = initialVariantWeight;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder modelDataDownloadTimeoutInSeconds(@Nullable Integer modelDataDownloadTimeoutInSeconds) {
            this.modelDataDownloadTimeoutInSeconds = modelDataDownloadTimeoutInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder modelName(String modelName) {
            this.modelName = Objects.requireNonNull(modelName);
            return this;
        }
        @CustomType.Setter
        public Builder serverlessConfig(@Nullable EndpointConfigurationProductionVariantServerlessConfig serverlessConfig) {
            this.serverlessConfig = serverlessConfig;
            return this;
        }
        @CustomType.Setter
        public Builder variantName(@Nullable String variantName) {
            this.variantName = variantName;
            return this;
        }
        @CustomType.Setter
        public Builder volumeSizeInGb(@Nullable Integer volumeSizeInGb) {
            this.volumeSizeInGb = volumeSizeInGb;
            return this;
        }
        public EndpointConfigurationProductionVariant build() {
            final var o = new EndpointConfigurationProductionVariant();
            o.acceleratorType = acceleratorType;
            o.containerStartupHealthCheckTimeoutInSeconds = containerStartupHealthCheckTimeoutInSeconds;
            o.coreDumpConfig = coreDumpConfig;
            o.initialInstanceCount = initialInstanceCount;
            o.initialVariantWeight = initialVariantWeight;
            o.instanceType = instanceType;
            o.modelDataDownloadTimeoutInSeconds = modelDataDownloadTimeoutInSeconds;
            o.modelName = modelName;
            o.serverlessConfig = serverlessConfig;
            o.variantName = variantName;
            o.volumeSizeInGb = volumeSizeInGb;
            return o;
        }
    }
}
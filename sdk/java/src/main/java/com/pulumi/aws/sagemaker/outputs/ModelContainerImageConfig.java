// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.ModelContainerImageConfigRepositoryAuthConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ModelContainerImageConfig {
    /**
     * @return Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
     * 
     */
    private String repositoryAccessMode;
    /**
     * @return Specifies an authentication configuration for the private docker registry where your model image is hosted. Specify a value for this property only if you specified Vpc as the value for the RepositoryAccessMode field, and the private Docker registry where the model image is hosted requires authentication. see Repository Auth Config.
     * 
     */
    private @Nullable ModelContainerImageConfigRepositoryAuthConfig repositoryAuthConfig;

    private ModelContainerImageConfig() {}
    /**
     * @return Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
     * 
     */
    public String repositoryAccessMode() {
        return this.repositoryAccessMode;
    }
    /**
     * @return Specifies an authentication configuration for the private docker registry where your model image is hosted. Specify a value for this property only if you specified Vpc as the value for the RepositoryAccessMode field, and the private Docker registry where the model image is hosted requires authentication. see Repository Auth Config.
     * 
     */
    public Optional<ModelContainerImageConfigRepositoryAuthConfig> repositoryAuthConfig() {
        return Optional.ofNullable(this.repositoryAuthConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelContainerImageConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String repositoryAccessMode;
        private @Nullable ModelContainerImageConfigRepositoryAuthConfig repositoryAuthConfig;
        public Builder() {}
        public Builder(ModelContainerImageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryAccessMode = defaults.repositoryAccessMode;
    	      this.repositoryAuthConfig = defaults.repositoryAuthConfig;
        }

        @CustomType.Setter
        public Builder repositoryAccessMode(String repositoryAccessMode) {
            this.repositoryAccessMode = Objects.requireNonNull(repositoryAccessMode);
            return this;
        }
        @CustomType.Setter
        public Builder repositoryAuthConfig(@Nullable ModelContainerImageConfigRepositoryAuthConfig repositoryAuthConfig) {
            this.repositoryAuthConfig = repositoryAuthConfig;
            return this;
        }
        public ModelContainerImageConfig build() {
            final var o = new ModelContainerImageConfig();
            o.repositoryAccessMode = repositoryAccessMode;
            o.repositoryAuthConfig = repositoryAuthConfig;
            return o;
        }
    }
}
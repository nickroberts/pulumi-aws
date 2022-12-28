// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs;
import com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpaceSpaceSettingsJupyterServerAppSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpaceSpaceSettingsJupyterServerAppSettingsArgs Empty = new SpaceSpaceSettingsJupyterServerAppSettingsArgs();

    /**
     * A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterServer application. see Code Repository below.
     * 
     */
    @Import(name="codeRepositories")
    private @Nullable Output<List<SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs>> codeRepositories;

    /**
     * @return A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterServer application. see Code Repository below.
     * 
     */
    public Optional<Output<List<SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs>>> codeRepositories() {
        return Optional.ofNullable(this.codeRepositories);
    }

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    @Import(name="defaultResourceSpec", required=true)
    private Output<SpaceSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs> defaultResourceSpec;

    /**
     * @return The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    public Output<SpaceSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs> defaultResourceSpec() {
        return this.defaultResourceSpec;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations.
     * 
     */
    @Import(name="lifecycleConfigArns")
    private @Nullable Output<List<String>> lifecycleConfigArns;

    /**
     * @return The Amazon Resource Name (ARN) of the Lifecycle Configurations.
     * 
     */
    public Optional<Output<List<String>>> lifecycleConfigArns() {
        return Optional.ofNullable(this.lifecycleConfigArns);
    }

    private SpaceSpaceSettingsJupyterServerAppSettingsArgs() {}

    private SpaceSpaceSettingsJupyterServerAppSettingsArgs(SpaceSpaceSettingsJupyterServerAppSettingsArgs $) {
        this.codeRepositories = $.codeRepositories;
        this.defaultResourceSpec = $.defaultResourceSpec;
        this.lifecycleConfigArns = $.lifecycleConfigArns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpaceSpaceSettingsJupyterServerAppSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpaceSpaceSettingsJupyterServerAppSettingsArgs $;

        public Builder() {
            $ = new SpaceSpaceSettingsJupyterServerAppSettingsArgs();
        }

        public Builder(SpaceSpaceSettingsJupyterServerAppSettingsArgs defaults) {
            $ = new SpaceSpaceSettingsJupyterServerAppSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param codeRepositories A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterServer application. see Code Repository below.
         * 
         * @return builder
         * 
         */
        public Builder codeRepositories(@Nullable Output<List<SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs>> codeRepositories) {
            $.codeRepositories = codeRepositories;
            return this;
        }

        /**
         * @param codeRepositories A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterServer application. see Code Repository below.
         * 
         * @return builder
         * 
         */
        public Builder codeRepositories(List<SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs> codeRepositories) {
            return codeRepositories(Output.of(codeRepositories));
        }

        /**
         * @param codeRepositories A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterServer application. see Code Repository below.
         * 
         * @return builder
         * 
         */
        public Builder codeRepositories(SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs... codeRepositories) {
            return codeRepositories(List.of(codeRepositories));
        }

        /**
         * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
         * 
         * @return builder
         * 
         */
        public Builder defaultResourceSpec(Output<SpaceSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs> defaultResourceSpec) {
            $.defaultResourceSpec = defaultResourceSpec;
            return this;
        }

        /**
         * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
         * 
         * @return builder
         * 
         */
        public Builder defaultResourceSpec(SpaceSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs defaultResourceSpec) {
            return defaultResourceSpec(Output.of(defaultResourceSpec));
        }

        /**
         * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Lifecycle Configurations.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleConfigArns(@Nullable Output<List<String>> lifecycleConfigArns) {
            $.lifecycleConfigArns = lifecycleConfigArns;
            return this;
        }

        /**
         * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Lifecycle Configurations.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleConfigArns(List<String> lifecycleConfigArns) {
            return lifecycleConfigArns(Output.of(lifecycleConfigArns));
        }

        /**
         * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Lifecycle Configurations.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleConfigArns(String... lifecycleConfigArns) {
            return lifecycleConfigArns(List.of(lifecycleConfigArns));
        }

        public SpaceSpaceSettingsJupyterServerAppSettingsArgs build() {
            $.defaultResourceSpec = Objects.requireNonNull($.defaultResourceSpec, "expected parameter 'defaultResourceSpec' to be non-null");
            return $;
        }
    }

}
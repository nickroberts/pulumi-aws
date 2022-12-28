// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs Empty = new SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs();

    /**
     * The URL of the Git repository.
     * 
     */
    @Import(name="repositoryUrl", required=true)
    private Output<String> repositoryUrl;

    /**
     * @return The URL of the Git repository.
     * 
     */
    public Output<String> repositoryUrl() {
        return this.repositoryUrl;
    }

    private SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs() {}

    private SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs(SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs $) {
        this.repositoryUrl = $.repositoryUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs $;

        public Builder() {
            $ = new SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs();
        }

        public Builder(SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs defaults) {
            $ = new SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param repositoryUrl The URL of the Git repository.
         * 
         * @return builder
         * 
         */
        public Builder repositoryUrl(Output<String> repositoryUrl) {
            $.repositoryUrl = repositoryUrl;
            return this;
        }

        /**
         * @param repositoryUrl The URL of the Git repository.
         * 
         * @return builder
         * 
         */
        public Builder repositoryUrl(String repositoryUrl) {
            return repositoryUrl(Output.of(repositoryUrl));
        }

        public SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs build() {
            $.repositoryUrl = Objects.requireNonNull($.repositoryUrl, "expected parameter 'repositoryUrl' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FunctionRuntimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionRuntimeArgs Empty = new FunctionRuntimeArgs();

    /**
     * The name of the runtime to use. Currently, the only allowed value is `APPSYNC_JS`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the runtime to use. Currently, the only allowed value is `APPSYNC_JS`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The version of the runtime to use. Currently, the only allowed version is `1.0.0`.
     * 
     */
    @Import(name="runtimeVersion", required=true)
    private Output<String> runtimeVersion;

    /**
     * @return The version of the runtime to use. Currently, the only allowed version is `1.0.0`.
     * 
     */
    public Output<String> runtimeVersion() {
        return this.runtimeVersion;
    }

    private FunctionRuntimeArgs() {}

    private FunctionRuntimeArgs(FunctionRuntimeArgs $) {
        this.name = $.name;
        this.runtimeVersion = $.runtimeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionRuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionRuntimeArgs $;

        public Builder() {
            $ = new FunctionRuntimeArgs();
        }

        public Builder(FunctionRuntimeArgs defaults) {
            $ = new FunctionRuntimeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the runtime to use. Currently, the only allowed value is `APPSYNC_JS`.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the runtime to use. Currently, the only allowed value is `APPSYNC_JS`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param runtimeVersion The version of the runtime to use. Currently, the only allowed version is `1.0.0`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(Output<String> runtimeVersion) {
            $.runtimeVersion = runtimeVersion;
            return this;
        }

        /**
         * @param runtimeVersion The version of the runtime to use. Currently, the only allowed version is `1.0.0`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(String runtimeVersion) {
            return runtimeVersion(Output.of(runtimeVersion));
        }

        public FunctionRuntimeArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.runtimeVersion = Objects.requireNonNull($.runtimeVersion, "expected parameter 'runtimeVersion' to be non-null");
            return $;
        }
    }

}
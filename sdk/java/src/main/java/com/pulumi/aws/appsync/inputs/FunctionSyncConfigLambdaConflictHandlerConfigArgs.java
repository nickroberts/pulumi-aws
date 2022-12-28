// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionSyncConfigLambdaConflictHandlerConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionSyncConfigLambdaConflictHandlerConfigArgs Empty = new FunctionSyncConfigLambdaConflictHandlerConfigArgs();

    /**
     * ARN for the Lambda function to use as the Conflict Handler.
     * 
     */
    @Import(name="lambdaConflictHandlerArn")
    private @Nullable Output<String> lambdaConflictHandlerArn;

    /**
     * @return ARN for the Lambda function to use as the Conflict Handler.
     * 
     */
    public Optional<Output<String>> lambdaConflictHandlerArn() {
        return Optional.ofNullable(this.lambdaConflictHandlerArn);
    }

    private FunctionSyncConfigLambdaConflictHandlerConfigArgs() {}

    private FunctionSyncConfigLambdaConflictHandlerConfigArgs(FunctionSyncConfigLambdaConflictHandlerConfigArgs $) {
        this.lambdaConflictHandlerArn = $.lambdaConflictHandlerArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionSyncConfigLambdaConflictHandlerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionSyncConfigLambdaConflictHandlerConfigArgs $;

        public Builder() {
            $ = new FunctionSyncConfigLambdaConflictHandlerConfigArgs();
        }

        public Builder(FunctionSyncConfigLambdaConflictHandlerConfigArgs defaults) {
            $ = new FunctionSyncConfigLambdaConflictHandlerConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lambdaConflictHandlerArn ARN for the Lambda function to use as the Conflict Handler.
         * 
         * @return builder
         * 
         */
        public Builder lambdaConflictHandlerArn(@Nullable Output<String> lambdaConflictHandlerArn) {
            $.lambdaConflictHandlerArn = lambdaConflictHandlerArn;
            return this;
        }

        /**
         * @param lambdaConflictHandlerArn ARN for the Lambda function to use as the Conflict Handler.
         * 
         * @return builder
         * 
         */
        public Builder lambdaConflictHandlerArn(String lambdaConflictHandlerArn) {
            return lambdaConflictHandlerArn(Output.of(lambdaConflictHandlerArn));
        }

        public FunctionSyncConfigLambdaConflictHandlerConfigArgs build() {
            return $;
        }
    }

}
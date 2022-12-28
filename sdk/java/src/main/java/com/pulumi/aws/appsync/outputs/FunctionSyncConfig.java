// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.outputs;

import com.pulumi.aws.appsync.outputs.FunctionSyncConfigLambdaConflictHandlerConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionSyncConfig {
    /**
     * @return Conflict Detection strategy to use. Valid values are `NONE` and `VERSION`.
     * 
     */
    private @Nullable String conflictDetection;
    /**
     * @return Conflict Resolution strategy to perform in the event of a conflict. Valid values are `NONE`, `OPTIMISTIC_CONCURRENCY`, `AUTOMERGE`, and `LAMBDA`.
     * 
     */
    private @Nullable String conflictHandler;
    /**
     * @return Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
     * 
     */
    private @Nullable FunctionSyncConfigLambdaConflictHandlerConfig lambdaConflictHandlerConfig;

    private FunctionSyncConfig() {}
    /**
     * @return Conflict Detection strategy to use. Valid values are `NONE` and `VERSION`.
     * 
     */
    public Optional<String> conflictDetection() {
        return Optional.ofNullable(this.conflictDetection);
    }
    /**
     * @return Conflict Resolution strategy to perform in the event of a conflict. Valid values are `NONE`, `OPTIMISTIC_CONCURRENCY`, `AUTOMERGE`, and `LAMBDA`.
     * 
     */
    public Optional<String> conflictHandler() {
        return Optional.ofNullable(this.conflictHandler);
    }
    /**
     * @return Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
     * 
     */
    public Optional<FunctionSyncConfigLambdaConflictHandlerConfig> lambdaConflictHandlerConfig() {
        return Optional.ofNullable(this.lambdaConflictHandlerConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionSyncConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String conflictDetection;
        private @Nullable String conflictHandler;
        private @Nullable FunctionSyncConfigLambdaConflictHandlerConfig lambdaConflictHandlerConfig;
        public Builder() {}
        public Builder(FunctionSyncConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conflictDetection = defaults.conflictDetection;
    	      this.conflictHandler = defaults.conflictHandler;
    	      this.lambdaConflictHandlerConfig = defaults.lambdaConflictHandlerConfig;
        }

        @CustomType.Setter
        public Builder conflictDetection(@Nullable String conflictDetection) {
            this.conflictDetection = conflictDetection;
            return this;
        }
        @CustomType.Setter
        public Builder conflictHandler(@Nullable String conflictHandler) {
            this.conflictHandler = conflictHandler;
            return this;
        }
        @CustomType.Setter
        public Builder lambdaConflictHandlerConfig(@Nullable FunctionSyncConfigLambdaConflictHandlerConfig lambdaConflictHandlerConfig) {
            this.lambdaConflictHandlerConfig = lambdaConflictHandlerConfig;
            return this;
        }
        public FunctionSyncConfig build() {
            final var o = new FunctionSyncConfig();
            o.conflictDetection = conflictDetection;
            o.conflictHandler = conflictHandler;
            o.lambdaConflictHandlerConfig = lambdaConflictHandlerConfig;
            return o;
        }
    }
}
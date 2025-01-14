// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipeTargetParametersEcsTaskParametersPlacementConstraint {
    /**
     * @return A cluster query language expression to apply to the constraint. You cannot specify an expression if the constraint type is distinctInstance. Maximum length of 2,000.
     * 
     */
    private @Nullable String expression;
    /**
     * @return The type of resource to assign to a container. The supported resources include GPU, MEMORY, and VCPU.
     * 
     */
    private @Nullable String type;

    private PipeTargetParametersEcsTaskParametersPlacementConstraint() {}
    /**
     * @return A cluster query language expression to apply to the constraint. You cannot specify an expression if the constraint type is distinctInstance. Maximum length of 2,000.
     * 
     */
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    /**
     * @return The type of resource to assign to a container. The supported resources include GPU, MEMORY, and VCPU.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipeTargetParametersEcsTaskParametersPlacementConstraint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expression;
        private @Nullable String type;
        public Builder() {}
        public Builder(PipeTargetParametersEcsTaskParametersPlacementConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder expression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public PipeTargetParametersEcsTaskParametersPlacementConstraint build() {
            final var o = new PipeTargetParametersEcsTaskParametersPlacementConstraint();
            o.expression = expression;
            o.type = type;
            return o;
        }
    }
}

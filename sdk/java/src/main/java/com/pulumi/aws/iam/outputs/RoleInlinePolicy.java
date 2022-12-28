// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoleInlinePolicy {
    /**
     * @return Name of the role policy.
     * 
     */
    private @Nullable String name;
    /**
     * @return Policy document as a JSON formatted string.
     * 
     */
    private @Nullable String policy;

    private RoleInlinePolicy() {}
    /**
     * @return Name of the role policy.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Policy document as a JSON formatted string.
     * 
     */
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleInlinePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String policy;
        public Builder() {}
        public Builder(RoleInlinePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder policy(@Nullable String policy) {
            this.policy = policy;
            return this;
        }
        public RoleInlinePolicy build() {
            final var o = new RoleInlinePolicy();
            o.name = name;
            o.policy = policy;
            return o;
        }
    }
}
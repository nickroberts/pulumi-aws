// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class UserPoolUserAttributeUpdateSettings {
    /**
     * @return A list of attributes requiring verification before update. If set, the provided value(s) must also be set in `auto_verified_attributes`. Valid values: `email`, `phone_number`.
     * 
     */
    private List<String> attributesRequireVerificationBeforeUpdates;

    private UserPoolUserAttributeUpdateSettings() {}
    /**
     * @return A list of attributes requiring verification before update. If set, the provided value(s) must also be set in `auto_verified_attributes`. Valid values: `email`, `phone_number`.
     * 
     */
    public List<String> attributesRequireVerificationBeforeUpdates() {
        return this.attributesRequireVerificationBeforeUpdates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolUserAttributeUpdateSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> attributesRequireVerificationBeforeUpdates;
        public Builder() {}
        public Builder(UserPoolUserAttributeUpdateSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributesRequireVerificationBeforeUpdates = defaults.attributesRequireVerificationBeforeUpdates;
        }

        @CustomType.Setter
        public Builder attributesRequireVerificationBeforeUpdates(List<String> attributesRequireVerificationBeforeUpdates) {
            this.attributesRequireVerificationBeforeUpdates = Objects.requireNonNull(attributesRequireVerificationBeforeUpdates);
            return this;
        }
        public Builder attributesRequireVerificationBeforeUpdates(String... attributesRequireVerificationBeforeUpdates) {
            return attributesRequireVerificationBeforeUpdates(List.of(attributesRequireVerificationBeforeUpdates));
        }
        public UserPoolUserAttributeUpdateSettings build() {
            final var o = new UserPoolUserAttributeUpdateSettings();
            o.attributesRequireVerificationBeforeUpdates = attributesRequireVerificationBeforeUpdates;
            return o;
        }
    }
}
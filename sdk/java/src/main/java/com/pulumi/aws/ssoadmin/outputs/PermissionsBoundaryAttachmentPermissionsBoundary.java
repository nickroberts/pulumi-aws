// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssoadmin.outputs;

import com.pulumi.aws.ssoadmin.outputs.PermissionsBoundaryAttachmentPermissionsBoundaryCustomerManagedPolicyReference;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PermissionsBoundaryAttachmentPermissionsBoundary {
    /**
     * @return Specifies the name and path of a customer managed policy. See below.
     * 
     */
    private @Nullable PermissionsBoundaryAttachmentPermissionsBoundaryCustomerManagedPolicyReference customerManagedPolicyReference;
    /**
     * @return AWS-managed IAM policy ARN to use as the permissions boundary.
     * 
     */
    private @Nullable String managedPolicyArn;

    private PermissionsBoundaryAttachmentPermissionsBoundary() {}
    /**
     * @return Specifies the name and path of a customer managed policy. See below.
     * 
     */
    public Optional<PermissionsBoundaryAttachmentPermissionsBoundaryCustomerManagedPolicyReference> customerManagedPolicyReference() {
        return Optional.ofNullable(this.customerManagedPolicyReference);
    }
    /**
     * @return AWS-managed IAM policy ARN to use as the permissions boundary.
     * 
     */
    public Optional<String> managedPolicyArn() {
        return Optional.ofNullable(this.managedPolicyArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionsBoundaryAttachmentPermissionsBoundary defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PermissionsBoundaryAttachmentPermissionsBoundaryCustomerManagedPolicyReference customerManagedPolicyReference;
        private @Nullable String managedPolicyArn;
        public Builder() {}
        public Builder(PermissionsBoundaryAttachmentPermissionsBoundary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedPolicyReference = defaults.customerManagedPolicyReference;
    	      this.managedPolicyArn = defaults.managedPolicyArn;
        }

        @CustomType.Setter
        public Builder customerManagedPolicyReference(@Nullable PermissionsBoundaryAttachmentPermissionsBoundaryCustomerManagedPolicyReference customerManagedPolicyReference) {
            this.customerManagedPolicyReference = customerManagedPolicyReference;
            return this;
        }
        @CustomType.Setter
        public Builder managedPolicyArn(@Nullable String managedPolicyArn) {
            this.managedPolicyArn = managedPolicyArn;
            return this;
        }
        public PermissionsBoundaryAttachmentPermissionsBoundary build() {
            final var o = new PermissionsBoundaryAttachmentPermissionsBoundary();
            o.customerManagedPolicyReference = customerManagedPolicyReference;
            o.managedPolicyArn = managedPolicyArn;
            return o;
        }
    }
}
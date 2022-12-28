// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssoadmin.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedPolicyAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final ManagedPolicyAttachmentState Empty = new ManagedPolicyAttachmentState();

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    @Import(name="instanceArn")
    private @Nullable Output<String> instanceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    public Optional<Output<String>> instanceArn() {
        return Optional.ofNullable(this.instanceArn);
    }

    /**
     * The IAM managed policy Amazon Resource Name (ARN) to be attached to the Permission Set.
     * 
     */
    @Import(name="managedPolicyArn")
    private @Nullable Output<String> managedPolicyArn;

    /**
     * @return The IAM managed policy Amazon Resource Name (ARN) to be attached to the Permission Set.
     * 
     */
    public Optional<Output<String>> managedPolicyArn() {
        return Optional.ofNullable(this.managedPolicyArn);
    }

    /**
     * The name of the IAM Managed Policy.
     * 
     */
    @Import(name="managedPolicyName")
    private @Nullable Output<String> managedPolicyName;

    /**
     * @return The name of the IAM Managed Policy.
     * 
     */
    public Optional<Output<String>> managedPolicyName() {
        return Optional.ofNullable(this.managedPolicyName);
    }

    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    @Import(name="permissionSetArn")
    private @Nullable Output<String> permissionSetArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    public Optional<Output<String>> permissionSetArn() {
        return Optional.ofNullable(this.permissionSetArn);
    }

    private ManagedPolicyAttachmentState() {}

    private ManagedPolicyAttachmentState(ManagedPolicyAttachmentState $) {
        this.instanceArn = $.instanceArn;
        this.managedPolicyArn = $.managedPolicyArn;
        this.managedPolicyName = $.managedPolicyName;
        this.permissionSetArn = $.permissionSetArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedPolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedPolicyAttachmentState $;

        public Builder() {
            $ = new ManagedPolicyAttachmentState();
        }

        public Builder(ManagedPolicyAttachmentState defaults) {
            $ = new ManagedPolicyAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceArn The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(@Nullable Output<String> instanceArn) {
            $.instanceArn = instanceArn;
            return this;
        }

        /**
         * @param instanceArn The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(String instanceArn) {
            return instanceArn(Output.of(instanceArn));
        }

        /**
         * @param managedPolicyArn The IAM managed policy Amazon Resource Name (ARN) to be attached to the Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder managedPolicyArn(@Nullable Output<String> managedPolicyArn) {
            $.managedPolicyArn = managedPolicyArn;
            return this;
        }

        /**
         * @param managedPolicyArn The IAM managed policy Amazon Resource Name (ARN) to be attached to the Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder managedPolicyArn(String managedPolicyArn) {
            return managedPolicyArn(Output.of(managedPolicyArn));
        }

        /**
         * @param managedPolicyName The name of the IAM Managed Policy.
         * 
         * @return builder
         * 
         */
        public Builder managedPolicyName(@Nullable Output<String> managedPolicyName) {
            $.managedPolicyName = managedPolicyName;
            return this;
        }

        /**
         * @param managedPolicyName The name of the IAM Managed Policy.
         * 
         * @return builder
         * 
         */
        public Builder managedPolicyName(String managedPolicyName) {
            return managedPolicyName(Output.of(managedPolicyName));
        }

        /**
         * @param permissionSetArn The Amazon Resource Name (ARN) of the Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder permissionSetArn(@Nullable Output<String> permissionSetArn) {
            $.permissionSetArn = permissionSetArn;
            return this;
        }

        /**
         * @param permissionSetArn The Amazon Resource Name (ARN) of the Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder permissionSetArn(String permissionSetArn) {
            return permissionSetArn(Output.of(permissionSetArn));
        }

        public ManagedPolicyAttachmentState build() {
            return $;
        }
    }

}
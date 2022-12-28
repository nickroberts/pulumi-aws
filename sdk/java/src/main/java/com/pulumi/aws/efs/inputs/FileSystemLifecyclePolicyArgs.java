// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileSystemLifecyclePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileSystemLifecyclePolicyArgs Empty = new FileSystemLifecyclePolicyArgs();

    /**
     * Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_1_DAY`, `AFTER_7_DAYS`, `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
     * 
     */
    @Import(name="transitionToIa")
    private @Nullable Output<String> transitionToIa;

    /**
     * @return Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_1_DAY`, `AFTER_7_DAYS`, `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
     * 
     */
    public Optional<Output<String>> transitionToIa() {
        return Optional.ofNullable(this.transitionToIa);
    }

    /**
     * Describes the policy used to transition a file from infequent access storage to primary storage. Valid values: `AFTER_1_ACCESS`.
     * 
     */
    @Import(name="transitionToPrimaryStorageClass")
    private @Nullable Output<String> transitionToPrimaryStorageClass;

    /**
     * @return Describes the policy used to transition a file from infequent access storage to primary storage. Valid values: `AFTER_1_ACCESS`.
     * 
     */
    public Optional<Output<String>> transitionToPrimaryStorageClass() {
        return Optional.ofNullable(this.transitionToPrimaryStorageClass);
    }

    private FileSystemLifecyclePolicyArgs() {}

    private FileSystemLifecyclePolicyArgs(FileSystemLifecyclePolicyArgs $) {
        this.transitionToIa = $.transitionToIa;
        this.transitionToPrimaryStorageClass = $.transitionToPrimaryStorageClass;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileSystemLifecyclePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileSystemLifecyclePolicyArgs $;

        public Builder() {
            $ = new FileSystemLifecyclePolicyArgs();
        }

        public Builder(FileSystemLifecyclePolicyArgs defaults) {
            $ = new FileSystemLifecyclePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param transitionToIa Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_1_DAY`, `AFTER_7_DAYS`, `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
         * 
         * @return builder
         * 
         */
        public Builder transitionToIa(@Nullable Output<String> transitionToIa) {
            $.transitionToIa = transitionToIa;
            return this;
        }

        /**
         * @param transitionToIa Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_1_DAY`, `AFTER_7_DAYS`, `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
         * 
         * @return builder
         * 
         */
        public Builder transitionToIa(String transitionToIa) {
            return transitionToIa(Output.of(transitionToIa));
        }

        /**
         * @param transitionToPrimaryStorageClass Describes the policy used to transition a file from infequent access storage to primary storage. Valid values: `AFTER_1_ACCESS`.
         * 
         * @return builder
         * 
         */
        public Builder transitionToPrimaryStorageClass(@Nullable Output<String> transitionToPrimaryStorageClass) {
            $.transitionToPrimaryStorageClass = transitionToPrimaryStorageClass;
            return this;
        }

        /**
         * @param transitionToPrimaryStorageClass Describes the policy used to transition a file from infequent access storage to primary storage. Valid values: `AFTER_1_ACCESS`.
         * 
         * @return builder
         * 
         */
        public Builder transitionToPrimaryStorageClass(String transitionToPrimaryStorageClass) {
            return transitionToPrimaryStorageClass(Output.of(transitionToPrimaryStorageClass));
        }

        public FileSystemLifecyclePolicyArgs build() {
            return $;
        }
    }

}
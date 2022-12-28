// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.aws.autoscaling.inputs.GroupWarmPoolInstanceReusePolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupWarmPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupWarmPoolArgs Empty = new GroupWarmPoolArgs();

    /**
     * Whether instances in the Auto Scaling group can be returned to the warm pool on scale in. The default is to terminate instances in the Auto Scaling group when the group scales in.
     * 
     */
    @Import(name="instanceReusePolicy")
    private @Nullable Output<GroupWarmPoolInstanceReusePolicyArgs> instanceReusePolicy;

    /**
     * @return Whether instances in the Auto Scaling group can be returned to the warm pool on scale in. The default is to terminate instances in the Auto Scaling group when the group scales in.
     * 
     */
    public Optional<Output<GroupWarmPoolInstanceReusePolicyArgs>> instanceReusePolicy() {
        return Optional.ofNullable(this.instanceReusePolicy);
    }

    /**
     * Total maximum number of instances that are allowed to be in the warm pool or in any state except Terminated for the Auto Scaling group.
     * 
     */
    @Import(name="maxGroupPreparedCapacity")
    private @Nullable Output<Integer> maxGroupPreparedCapacity;

    /**
     * @return Total maximum number of instances that are allowed to be in the warm pool or in any state except Terminated for the Auto Scaling group.
     * 
     */
    public Optional<Output<Integer>> maxGroupPreparedCapacity() {
        return Optional.ofNullable(this.maxGroupPreparedCapacity);
    }

    /**
     * Minimum number of instances to maintain in the warm pool. This helps you to ensure that there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * 
     */
    @Import(name="minSize")
    private @Nullable Output<Integer> minSize;

    /**
     * @return Minimum number of instances to maintain in the warm pool. This helps you to ensure that there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * 
     */
    public Optional<Output<Integer>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    /**
     * Sets the instance state to transition to after the lifecycle hooks finish. Valid values are: Stopped (default), Running or Hibernated.
     * 
     */
    @Import(name="poolState")
    private @Nullable Output<String> poolState;

    /**
     * @return Sets the instance state to transition to after the lifecycle hooks finish. Valid values are: Stopped (default), Running or Hibernated.
     * 
     */
    public Optional<Output<String>> poolState() {
        return Optional.ofNullable(this.poolState);
    }

    private GroupWarmPoolArgs() {}

    private GroupWarmPoolArgs(GroupWarmPoolArgs $) {
        this.instanceReusePolicy = $.instanceReusePolicy;
        this.maxGroupPreparedCapacity = $.maxGroupPreparedCapacity;
        this.minSize = $.minSize;
        this.poolState = $.poolState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupWarmPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupWarmPoolArgs $;

        public Builder() {
            $ = new GroupWarmPoolArgs();
        }

        public Builder(GroupWarmPoolArgs defaults) {
            $ = new GroupWarmPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceReusePolicy Whether instances in the Auto Scaling group can be returned to the warm pool on scale in. The default is to terminate instances in the Auto Scaling group when the group scales in.
         * 
         * @return builder
         * 
         */
        public Builder instanceReusePolicy(@Nullable Output<GroupWarmPoolInstanceReusePolicyArgs> instanceReusePolicy) {
            $.instanceReusePolicy = instanceReusePolicy;
            return this;
        }

        /**
         * @param instanceReusePolicy Whether instances in the Auto Scaling group can be returned to the warm pool on scale in. The default is to terminate instances in the Auto Scaling group when the group scales in.
         * 
         * @return builder
         * 
         */
        public Builder instanceReusePolicy(GroupWarmPoolInstanceReusePolicyArgs instanceReusePolicy) {
            return instanceReusePolicy(Output.of(instanceReusePolicy));
        }

        /**
         * @param maxGroupPreparedCapacity Total maximum number of instances that are allowed to be in the warm pool or in any state except Terminated for the Auto Scaling group.
         * 
         * @return builder
         * 
         */
        public Builder maxGroupPreparedCapacity(@Nullable Output<Integer> maxGroupPreparedCapacity) {
            $.maxGroupPreparedCapacity = maxGroupPreparedCapacity;
            return this;
        }

        /**
         * @param maxGroupPreparedCapacity Total maximum number of instances that are allowed to be in the warm pool or in any state except Terminated for the Auto Scaling group.
         * 
         * @return builder
         * 
         */
        public Builder maxGroupPreparedCapacity(Integer maxGroupPreparedCapacity) {
            return maxGroupPreparedCapacity(Output.of(maxGroupPreparedCapacity));
        }

        /**
         * @param minSize Minimum number of instances to maintain in the warm pool. This helps you to ensure that there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
         * 
         * @return builder
         * 
         */
        public Builder minSize(@Nullable Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        /**
         * @param minSize Minimum number of instances to maintain in the warm pool. This helps you to ensure that there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
         * 
         * @return builder
         * 
         */
        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        /**
         * @param poolState Sets the instance state to transition to after the lifecycle hooks finish. Valid values are: Stopped (default), Running or Hibernated.
         * 
         * @return builder
         * 
         */
        public Builder poolState(@Nullable Output<String> poolState) {
            $.poolState = poolState;
            return this;
        }

        /**
         * @param poolState Sets the instance state to transition to after the lifecycle hooks finish. Valid values are: Stopped (default), Running or Hibernated.
         * 
         * @return builder
         * 
         */
        public Builder poolState(String poolState) {
            return poolState(Output.of(poolState));
        }

        public GroupWarmPoolArgs build() {
            return $;
        }
    }

}
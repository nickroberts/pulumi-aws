// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.aws.autoscaling.outputs.PolicyPredictiveScalingConfigurationMetricSpecification;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyPredictiveScalingConfiguration {
    /**
     * @return Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity of the Auto Scaling group. Valid values are `HonorMaxCapacity` or `IncreaseMaxCapacity`. Default is `HonorMaxCapacity`.
     * 
     */
    private @Nullable String maxCapacityBreachBehavior;
    /**
     * @return Size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity. Valid range is `0` to `100`. If set to `0`, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to equal but not exceed forecast capacity.
     * 
     */
    private @Nullable String maxCapacityBuffer;
    /**
     * @return This structure includes the metrics and target utilization to use for predictive scaling.
     * 
     */
    private PolicyPredictiveScalingConfigurationMetricSpecification metricSpecification;
    /**
     * @return Predictive scaling mode. Valid values are `ForecastAndScale` and `ForecastOnly`. Default is `ForecastOnly`.
     * 
     */
    private @Nullable String mode;
    /**
     * @return Amount of time, in seconds, by which the instance launch time can be advanced. Minimum is `0`.
     * 
     */
    private @Nullable String schedulingBufferTime;

    private PolicyPredictiveScalingConfiguration() {}
    /**
     * @return Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity of the Auto Scaling group. Valid values are `HonorMaxCapacity` or `IncreaseMaxCapacity`. Default is `HonorMaxCapacity`.
     * 
     */
    public Optional<String> maxCapacityBreachBehavior() {
        return Optional.ofNullable(this.maxCapacityBreachBehavior);
    }
    /**
     * @return Size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity. Valid range is `0` to `100`. If set to `0`, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to equal but not exceed forecast capacity.
     * 
     */
    public Optional<String> maxCapacityBuffer() {
        return Optional.ofNullable(this.maxCapacityBuffer);
    }
    /**
     * @return This structure includes the metrics and target utilization to use for predictive scaling.
     * 
     */
    public PolicyPredictiveScalingConfigurationMetricSpecification metricSpecification() {
        return this.metricSpecification;
    }
    /**
     * @return Predictive scaling mode. Valid values are `ForecastAndScale` and `ForecastOnly`. Default is `ForecastOnly`.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return Amount of time, in seconds, by which the instance launch time can be advanced. Minimum is `0`.
     * 
     */
    public Optional<String> schedulingBufferTime() {
        return Optional.ofNullable(this.schedulingBufferTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPredictiveScalingConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String maxCapacityBreachBehavior;
        private @Nullable String maxCapacityBuffer;
        private PolicyPredictiveScalingConfigurationMetricSpecification metricSpecification;
        private @Nullable String mode;
        private @Nullable String schedulingBufferTime;
        public Builder() {}
        public Builder(PolicyPredictiveScalingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacityBreachBehavior = defaults.maxCapacityBreachBehavior;
    	      this.maxCapacityBuffer = defaults.maxCapacityBuffer;
    	      this.metricSpecification = defaults.metricSpecification;
    	      this.mode = defaults.mode;
    	      this.schedulingBufferTime = defaults.schedulingBufferTime;
        }

        @CustomType.Setter
        public Builder maxCapacityBreachBehavior(@Nullable String maxCapacityBreachBehavior) {
            this.maxCapacityBreachBehavior = maxCapacityBreachBehavior;
            return this;
        }
        @CustomType.Setter
        public Builder maxCapacityBuffer(@Nullable String maxCapacityBuffer) {
            this.maxCapacityBuffer = maxCapacityBuffer;
            return this;
        }
        @CustomType.Setter
        public Builder metricSpecification(PolicyPredictiveScalingConfigurationMetricSpecification metricSpecification) {
            this.metricSpecification = Objects.requireNonNull(metricSpecification);
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder schedulingBufferTime(@Nullable String schedulingBufferTime) {
            this.schedulingBufferTime = schedulingBufferTime;
            return this;
        }
        public PolicyPredictiveScalingConfiguration build() {
            final var o = new PolicyPredictiveScalingConfiguration();
            o.maxCapacityBreachBehavior = maxCapacityBreachBehavior;
            o.maxCapacityBuffer = maxCapacityBuffer;
            o.metricSpecification = metricSpecification;
            o.mode = mode;
            o.schedulingBufferTime = schedulingBufferTime;
            return o;
        }
    }
}
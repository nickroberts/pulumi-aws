// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling;

import com.pulumi.aws.appautoscaling.inputs.ScheduledActionScalableTargetActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledActionArgs Empty = new ScheduledActionArgs();

    /**
     * Date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return Date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * Name of the scheduled action.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the scheduled action.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Identifier of the resource associated with the scheduled action. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    /**
     * @return Identifier of the resource associated with the scheduled action. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * Scalable dimension. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs:service:DesiredCount
     * 
     */
    @Import(name="scalableDimension", required=true)
    private Output<String> scalableDimension;

    /**
     * @return Scalable dimension. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs:service:DesiredCount
     * 
     */
    public Output<String> scalableDimension() {
        return this.scalableDimension;
    }

    /**
     * New minimum and maximum capacity. You can set both values or just one. See below
     * 
     */
    @Import(name="scalableTargetAction", required=true)
    private Output<ScheduledActionScalableTargetActionArgs> scalableTargetAction;

    /**
     * @return New minimum and maximum capacity. You can set both values or just one. See below
     * 
     */
    public Output<ScheduledActionScalableTargetActionArgs> scalableTargetAction() {
        return this.scalableTargetAction;
    }

    /**
     * Schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the `Timezone` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
     * 
     */
    @Import(name="schedule", required=true)
    private Output<String> schedule;

    /**
     * @return Schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the `Timezone` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
     * 
     */
    public Output<String> schedule() {
        return this.schedule;
    }

    /**
     * Namespace of the AWS service. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs
     * 
     */
    @Import(name="serviceNamespace", required=true)
    private Output<String> serviceNamespace;

    /**
     * @return Namespace of the AWS service. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs
     * 
     */
    public Output<String> serviceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * Date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * Time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
     * 
     */
    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    /**
     * @return Time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
     * 
     */
    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    private ScheduledActionArgs() {}

    private ScheduledActionArgs(ScheduledActionArgs $) {
        this.endTime = $.endTime;
        this.name = $.name;
        this.resourceId = $.resourceId;
        this.scalableDimension = $.scalableDimension;
        this.scalableTargetAction = $.scalableTargetAction;
        this.schedule = $.schedule;
        this.serviceNamespace = $.serviceNamespace;
        this.startTime = $.startTime;
        this.timezone = $.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledActionArgs $;

        public Builder() {
            $ = new ScheduledActionArgs();
        }

        public Builder(ScheduledActionArgs defaults) {
            $ = new ScheduledActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endTime Date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime Date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param name Name of the scheduled action.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the scheduled action.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceId Identifier of the resource associated with the scheduled action. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
         * 
         * @return builder
         * 
         */
        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId Identifier of the resource associated with the scheduled action. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param scalableDimension Scalable dimension. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs:service:DesiredCount
         * 
         * @return builder
         * 
         */
        public Builder scalableDimension(Output<String> scalableDimension) {
            $.scalableDimension = scalableDimension;
            return this;
        }

        /**
         * @param scalableDimension Scalable dimension. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs:service:DesiredCount
         * 
         * @return builder
         * 
         */
        public Builder scalableDimension(String scalableDimension) {
            return scalableDimension(Output.of(scalableDimension));
        }

        /**
         * @param scalableTargetAction New minimum and maximum capacity. You can set both values or just one. See below
         * 
         * @return builder
         * 
         */
        public Builder scalableTargetAction(Output<ScheduledActionScalableTargetActionArgs> scalableTargetAction) {
            $.scalableTargetAction = scalableTargetAction;
            return this;
        }

        /**
         * @param scalableTargetAction New minimum and maximum capacity. You can set both values or just one. See below
         * 
         * @return builder
         * 
         */
        public Builder scalableTargetAction(ScheduledActionScalableTargetActionArgs scalableTargetAction) {
            return scalableTargetAction(Output.of(scalableTargetAction));
        }

        /**
         * @param schedule Schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the `Timezone` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
         * 
         * @return builder
         * 
         */
        public Builder schedule(Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule Schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the `Timezone` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param serviceNamespace Namespace of the AWS service. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs
         * 
         * @return builder
         * 
         */
        public Builder serviceNamespace(Output<String> serviceNamespace) {
            $.serviceNamespace = serviceNamespace;
            return this;
        }

        /**
         * @param serviceNamespace Namespace of the AWS service. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs
         * 
         * @return builder
         * 
         */
        public Builder serviceNamespace(String serviceNamespace) {
            return serviceNamespace(Output.of(serviceNamespace));
        }

        /**
         * @param startTime Date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param timezone Time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
         * 
         * @return builder
         * 
         */
        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone Time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        public ScheduledActionArgs build() {
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            $.scalableDimension = Objects.requireNonNull($.scalableDimension, "expected parameter 'scalableDimension' to be non-null");
            $.scalableTargetAction = Objects.requireNonNull($.scalableTargetAction, "expected parameter 'scalableTargetAction' to be non-null");
            $.schedule = Objects.requireNonNull($.schedule, "expected parameter 'schedule' to be non-null");
            $.serviceNamespace = Objects.requireNonNull($.serviceNamespace, "expected parameter 'serviceNamespace' to be non-null");
            return $;
        }
    }

}
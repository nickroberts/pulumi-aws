// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sns;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicSubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicSubscriptionArgs Empty = new TopicSubscriptionArgs();

    /**
     * Integer indicating number of minutes to wait in retrying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols. Default is `1`.
     * 
     */
    @Import(name="confirmationTimeoutInMinutes")
    private @Nullable Output<Integer> confirmationTimeoutInMinutes;

    /**
     * @return Integer indicating number of minutes to wait in retrying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols. Default is `1`.
     * 
     */
    public Optional<Output<Integer>> confirmationTimeoutInMinutes() {
        return Optional.ofNullable(this.confirmationTimeoutInMinutes);
    }

    /**
     * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
     * 
     */
    @Import(name="deliveryPolicy")
    private @Nullable Output<String> deliveryPolicy;

    /**
     * @return JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
     * 
     */
    public Optional<Output<String>> deliveryPolicy() {
        return Optional.ofNullable(this.deliveryPolicy);
    }

    /**
     * Endpoint to send data to. The contents vary with the protocol. See details below.
     * 
     */
    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    /**
     * @return Endpoint to send data to. The contents vary with the protocol. See details below.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }

    /**
     * Whether the endpoint is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) (e.g., PagerDuty). Default is `false`.
     * 
     */
    @Import(name="endpointAutoConfirms")
    private @Nullable Output<Boolean> endpointAutoConfirms;

    /**
     * @return Whether the endpoint is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) (e.g., PagerDuty). Default is `false`.
     * 
     */
    public Optional<Output<Boolean>> endpointAutoConfirms() {
        return Optional.ofNullable(this.endpointAutoConfirms);
    }

    /**
     * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
     * 
     */
    @Import(name="filterPolicy")
    private @Nullable Output<String> filterPolicy;

    /**
     * @return JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
     * 
     */
    public Optional<Output<String>> filterPolicy() {
        return Optional.ofNullable(this.filterPolicy);
    }

    /**
     * Whether the `filter_policy` applies to `MessageAttributes` (default) or `MessageBody`.
     * 
     */
    @Import(name="filterPolicyScope")
    private @Nullable Output<String> filterPolicyScope;

    /**
     * @return Whether the `filter_policy` applies to `MessageAttributes` (default) or `MessageBody`.
     * 
     */
    public Optional<Output<String>> filterPolicyScope() {
        return Optional.ofNullable(this.filterPolicyScope);
    }

    /**
     * Protocol to use. Valid values are: `sqs`, `sms`, `lambda`, `firehose`, and `application`. Protocols `email`, `email-json`, `http` and `https` are also valid but partially supported. See details below.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return Protocol to use. Valid values are: `sqs`, `sms`, `lambda`, `firehose`, and `application`. Protocols `email`, `email-json`, `http` and `https` are also valid but partially supported. See details below.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * Whether to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property). Default is `false`.
     * 
     */
    @Import(name="rawMessageDelivery")
    private @Nullable Output<Boolean> rawMessageDelivery;

    /**
     * @return Whether to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property). Default is `false`.
     * 
     */
    public Optional<Output<Boolean>> rawMessageDelivery() {
        return Optional.ofNullable(this.rawMessageDelivery);
    }

    /**
     * JSON String with the redrive policy that will be used in the subscription. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-dead-letter-queues.html#how-messages-moved-into-dead-letter-queue) for more details.
     * 
     */
    @Import(name="redrivePolicy")
    private @Nullable Output<String> redrivePolicy;

    /**
     * @return JSON String with the redrive policy that will be used in the subscription. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-dead-letter-queues.html#how-messages-moved-into-dead-letter-queue) for more details.
     * 
     */
    public Optional<Output<String>> redrivePolicy() {
        return Optional.ofNullable(this.redrivePolicy);
    }

    /**
     * ARN of the IAM role to publish to Kinesis Data Firehose delivery stream. Refer to [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html).
     * 
     */
    @Import(name="subscriptionRoleArn")
    private @Nullable Output<String> subscriptionRoleArn;

    /**
     * @return ARN of the IAM role to publish to Kinesis Data Firehose delivery stream. Refer to [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html).
     * 
     */
    public Optional<Output<String>> subscriptionRoleArn() {
        return Optional.ofNullable(this.subscriptionRoleArn);
    }

    /**
     * ARN of the SNS topic to subscribe to.
     * 
     */
    @Import(name="topic", required=true)
    private Output<String> topic;

    /**
     * @return ARN of the SNS topic to subscribe to.
     * 
     */
    public Output<String> topic() {
        return this.topic;
    }

    private TopicSubscriptionArgs() {}

    private TopicSubscriptionArgs(TopicSubscriptionArgs $) {
        this.confirmationTimeoutInMinutes = $.confirmationTimeoutInMinutes;
        this.deliveryPolicy = $.deliveryPolicy;
        this.endpoint = $.endpoint;
        this.endpointAutoConfirms = $.endpointAutoConfirms;
        this.filterPolicy = $.filterPolicy;
        this.filterPolicyScope = $.filterPolicyScope;
        this.protocol = $.protocol;
        this.rawMessageDelivery = $.rawMessageDelivery;
        this.redrivePolicy = $.redrivePolicy;
        this.subscriptionRoleArn = $.subscriptionRoleArn;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicSubscriptionArgs $;

        public Builder() {
            $ = new TopicSubscriptionArgs();
        }

        public Builder(TopicSubscriptionArgs defaults) {
            $ = new TopicSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param confirmationTimeoutInMinutes Integer indicating number of minutes to wait in retrying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols. Default is `1`.
         * 
         * @return builder
         * 
         */
        public Builder confirmationTimeoutInMinutes(@Nullable Output<Integer> confirmationTimeoutInMinutes) {
            $.confirmationTimeoutInMinutes = confirmationTimeoutInMinutes;
            return this;
        }

        /**
         * @param confirmationTimeoutInMinutes Integer indicating number of minutes to wait in retrying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols. Default is `1`.
         * 
         * @return builder
         * 
         */
        public Builder confirmationTimeoutInMinutes(Integer confirmationTimeoutInMinutes) {
            return confirmationTimeoutInMinutes(Output.of(confirmationTimeoutInMinutes));
        }

        /**
         * @param deliveryPolicy JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
         * 
         * @return builder
         * 
         */
        public Builder deliveryPolicy(@Nullable Output<String> deliveryPolicy) {
            $.deliveryPolicy = deliveryPolicy;
            return this;
        }

        /**
         * @param deliveryPolicy JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
         * 
         * @return builder
         * 
         */
        public Builder deliveryPolicy(String deliveryPolicy) {
            return deliveryPolicy(Output.of(deliveryPolicy));
        }

        /**
         * @param endpoint Endpoint to send data to. The contents vary with the protocol. See details below.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Endpoint to send data to. The contents vary with the protocol. See details below.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param endpointAutoConfirms Whether the endpoint is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) (e.g., PagerDuty). Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder endpointAutoConfirms(@Nullable Output<Boolean> endpointAutoConfirms) {
            $.endpointAutoConfirms = endpointAutoConfirms;
            return this;
        }

        /**
         * @param endpointAutoConfirms Whether the endpoint is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) (e.g., PagerDuty). Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder endpointAutoConfirms(Boolean endpointAutoConfirms) {
            return endpointAutoConfirms(Output.of(endpointAutoConfirms));
        }

        /**
         * @param filterPolicy JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
         * 
         * @return builder
         * 
         */
        public Builder filterPolicy(@Nullable Output<String> filterPolicy) {
            $.filterPolicy = filterPolicy;
            return this;
        }

        /**
         * @param filterPolicy JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
         * 
         * @return builder
         * 
         */
        public Builder filterPolicy(String filterPolicy) {
            return filterPolicy(Output.of(filterPolicy));
        }

        /**
         * @param filterPolicyScope Whether the `filter_policy` applies to `MessageAttributes` (default) or `MessageBody`.
         * 
         * @return builder
         * 
         */
        public Builder filterPolicyScope(@Nullable Output<String> filterPolicyScope) {
            $.filterPolicyScope = filterPolicyScope;
            return this;
        }

        /**
         * @param filterPolicyScope Whether the `filter_policy` applies to `MessageAttributes` (default) or `MessageBody`.
         * 
         * @return builder
         * 
         */
        public Builder filterPolicyScope(String filterPolicyScope) {
            return filterPolicyScope(Output.of(filterPolicyScope));
        }

        /**
         * @param protocol Protocol to use. Valid values are: `sqs`, `sms`, `lambda`, `firehose`, and `application`. Protocols `email`, `email-json`, `http` and `https` are also valid but partially supported. See details below.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Protocol to use. Valid values are: `sqs`, `sms`, `lambda`, `firehose`, and `application`. Protocols `email`, `email-json`, `http` and `https` are also valid but partially supported. See details below.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param rawMessageDelivery Whether to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property). Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder rawMessageDelivery(@Nullable Output<Boolean> rawMessageDelivery) {
            $.rawMessageDelivery = rawMessageDelivery;
            return this;
        }

        /**
         * @param rawMessageDelivery Whether to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property). Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder rawMessageDelivery(Boolean rawMessageDelivery) {
            return rawMessageDelivery(Output.of(rawMessageDelivery));
        }

        /**
         * @param redrivePolicy JSON String with the redrive policy that will be used in the subscription. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-dead-letter-queues.html#how-messages-moved-into-dead-letter-queue) for more details.
         * 
         * @return builder
         * 
         */
        public Builder redrivePolicy(@Nullable Output<String> redrivePolicy) {
            $.redrivePolicy = redrivePolicy;
            return this;
        }

        /**
         * @param redrivePolicy JSON String with the redrive policy that will be used in the subscription. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-dead-letter-queues.html#how-messages-moved-into-dead-letter-queue) for more details.
         * 
         * @return builder
         * 
         */
        public Builder redrivePolicy(String redrivePolicy) {
            return redrivePolicy(Output.of(redrivePolicy));
        }

        /**
         * @param subscriptionRoleArn ARN of the IAM role to publish to Kinesis Data Firehose delivery stream. Refer to [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html).
         * 
         * @return builder
         * 
         */
        public Builder subscriptionRoleArn(@Nullable Output<String> subscriptionRoleArn) {
            $.subscriptionRoleArn = subscriptionRoleArn;
            return this;
        }

        /**
         * @param subscriptionRoleArn ARN of the IAM role to publish to Kinesis Data Firehose delivery stream. Refer to [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html).
         * 
         * @return builder
         * 
         */
        public Builder subscriptionRoleArn(String subscriptionRoleArn) {
            return subscriptionRoleArn(Output.of(subscriptionRoleArn));
        }

        /**
         * @param topic ARN of the SNS topic to subscribe to.
         * 
         * @return builder
         * 
         */
        public Builder topic(Output<String> topic) {
            $.topic = topic;
            return this;
        }

        /**
         * @param topic ARN of the SNS topic to subscribe to.
         * 
         * @return builder
         * 
         */
        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public TopicSubscriptionArgs build() {
            $.endpoint = Objects.requireNonNull($.endpoint, "expected parameter 'endpoint' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.topic = Objects.requireNonNull($.topic, "expected parameter 'topic' to be non-null");
            return $;
        }
    }

}
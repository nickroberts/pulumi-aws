// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowDestinationFlowConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowDestinationFlowConfigArgs Empty = new FlowDestinationFlowConfigArgs();

    /**
     * API version that the destination connector uses.
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return API version that the destination connector uses.
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * Name of the connector profile. This name must be unique for each connector profile in the AWS account.
     * 
     */
    @Import(name="connectorProfileName")
    private @Nullable Output<String> connectorProfileName;

    /**
     * @return Name of the connector profile. This name must be unique for each connector profile in the AWS account.
     * 
     */
    public Optional<Output<String>> connectorProfileName() {
        return Optional.ofNullable(this.connectorProfileName);
    }

    /**
     * Type of connector, such as Salesforce, Amplitude, and so on. Valid values are `Salesforce`, `Singular`, `Slack`, `Redshift`, `S3`, `Marketo`, `Googleanalytics`, `Zendesk`, `Servicenow`, `Datadog`, `Trendmicro`, `Snowflake`, `Dynatrace`, `Infornexus`, `Amplitude`, `Veeva`, `EventBridge`, `LookoutMetrics`, `Upsolver`, `Honeycode`, `CustomerProfiles`, `SAPOData`, and `CustomConnector`.
     * 
     */
    @Import(name="connectorType", required=true)
    private Output<String> connectorType;

    /**
     * @return Type of connector, such as Salesforce, Amplitude, and so on. Valid values are `Salesforce`, `Singular`, `Slack`, `Redshift`, `S3`, `Marketo`, `Googleanalytics`, `Zendesk`, `Servicenow`, `Datadog`, `Trendmicro`, `Snowflake`, `Dynatrace`, `Infornexus`, `Amplitude`, `Veeva`, `EventBridge`, `LookoutMetrics`, `Upsolver`, `Honeycode`, `CustomerProfiles`, `SAPOData`, and `CustomConnector`.
     * 
     */
    public Output<String> connectorType() {
        return this.connectorType;
    }

    /**
     * This stores the information that is required to query a particular connector. See Destination Connector Properties for more information.
     * 
     */
    @Import(name="destinationConnectorProperties", required=true)
    private Output<FlowDestinationFlowConfigDestinationConnectorPropertiesArgs> destinationConnectorProperties;

    /**
     * @return This stores the information that is required to query a particular connector. See Destination Connector Properties for more information.
     * 
     */
    public Output<FlowDestinationFlowConfigDestinationConnectorPropertiesArgs> destinationConnectorProperties() {
        return this.destinationConnectorProperties;
    }

    private FlowDestinationFlowConfigArgs() {}

    private FlowDestinationFlowConfigArgs(FlowDestinationFlowConfigArgs $) {
        this.apiVersion = $.apiVersion;
        this.connectorProfileName = $.connectorProfileName;
        this.connectorType = $.connectorType;
        this.destinationConnectorProperties = $.destinationConnectorProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowDestinationFlowConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowDestinationFlowConfigArgs $;

        public Builder() {
            $ = new FlowDestinationFlowConfigArgs();
        }

        public Builder(FlowDestinationFlowConfigArgs defaults) {
            $ = new FlowDestinationFlowConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion API version that the destination connector uses.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion API version that the destination connector uses.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param connectorProfileName Name of the connector profile. This name must be unique for each connector profile in the AWS account.
         * 
         * @return builder
         * 
         */
        public Builder connectorProfileName(@Nullable Output<String> connectorProfileName) {
            $.connectorProfileName = connectorProfileName;
            return this;
        }

        /**
         * @param connectorProfileName Name of the connector profile. This name must be unique for each connector profile in the AWS account.
         * 
         * @return builder
         * 
         */
        public Builder connectorProfileName(String connectorProfileName) {
            return connectorProfileName(Output.of(connectorProfileName));
        }

        /**
         * @param connectorType Type of connector, such as Salesforce, Amplitude, and so on. Valid values are `Salesforce`, `Singular`, `Slack`, `Redshift`, `S3`, `Marketo`, `Googleanalytics`, `Zendesk`, `Servicenow`, `Datadog`, `Trendmicro`, `Snowflake`, `Dynatrace`, `Infornexus`, `Amplitude`, `Veeva`, `EventBridge`, `LookoutMetrics`, `Upsolver`, `Honeycode`, `CustomerProfiles`, `SAPOData`, and `CustomConnector`.
         * 
         * @return builder
         * 
         */
        public Builder connectorType(Output<String> connectorType) {
            $.connectorType = connectorType;
            return this;
        }

        /**
         * @param connectorType Type of connector, such as Salesforce, Amplitude, and so on. Valid values are `Salesforce`, `Singular`, `Slack`, `Redshift`, `S3`, `Marketo`, `Googleanalytics`, `Zendesk`, `Servicenow`, `Datadog`, `Trendmicro`, `Snowflake`, `Dynatrace`, `Infornexus`, `Amplitude`, `Veeva`, `EventBridge`, `LookoutMetrics`, `Upsolver`, `Honeycode`, `CustomerProfiles`, `SAPOData`, and `CustomConnector`.
         * 
         * @return builder
         * 
         */
        public Builder connectorType(String connectorType) {
            return connectorType(Output.of(connectorType));
        }

        /**
         * @param destinationConnectorProperties This stores the information that is required to query a particular connector. See Destination Connector Properties for more information.
         * 
         * @return builder
         * 
         */
        public Builder destinationConnectorProperties(Output<FlowDestinationFlowConfigDestinationConnectorPropertiesArgs> destinationConnectorProperties) {
            $.destinationConnectorProperties = destinationConnectorProperties;
            return this;
        }

        /**
         * @param destinationConnectorProperties This stores the information that is required to query a particular connector. See Destination Connector Properties for more information.
         * 
         * @return builder
         * 
         */
        public Builder destinationConnectorProperties(FlowDestinationFlowConfigDestinationConnectorPropertiesArgs destinationConnectorProperties) {
            return destinationConnectorProperties(Output.of(destinationConnectorProperties));
        }

        public FlowDestinationFlowConfigArgs build() {
            $.connectorType = Objects.requireNonNull($.connectorType, "expected parameter 'connectorType' to be non-null");
            $.destinationConnectorProperties = Objects.requireNonNull($.destinationConnectorProperties, "expected parameter 'destinationConnectorProperties' to be non-null");
            return $;
        }
    }

}
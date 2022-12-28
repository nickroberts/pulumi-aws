// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs Empty = new DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs();

    /**
     * The IAM role that Canvas passes to Amazon Forecast for time series forecasting. By default, Canvas uses the execution role specified in the UserProfile that launches the Canvas app. If an execution role is not specified in the UserProfile, Canvas uses the execution role specified in the Domain that owns the UserProfile. To allow time series forecasting, this IAM role should have the [AmazonSageMakerCanvasForecastAccess](https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-canvas.html#security-iam-awsmanpol-AmazonSageMakerCanvasForecastAccess) policy attached and forecast.amazonaws.com added in the trust relationship as a service principal.
     * 
     */
    @Import(name="amazonForecastRoleArn")
    private @Nullable Output<String> amazonForecastRoleArn;

    /**
     * @return The IAM role that Canvas passes to Amazon Forecast for time series forecasting. By default, Canvas uses the execution role specified in the UserProfile that launches the Canvas app. If an execution role is not specified in the UserProfile, Canvas uses the execution role specified in the Domain that owns the UserProfile. To allow time series forecasting, this IAM role should have the [AmazonSageMakerCanvasForecastAccess](https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-canvas.html#security-iam-awsmanpol-AmazonSageMakerCanvasForecastAccess) policy attached and forecast.amazonaws.com added in the trust relationship as a service principal.
     * 
     */
    public Optional<Output<String>> amazonForecastRoleArn() {
        return Optional.ofNullable(this.amazonForecastRoleArn);
    }

    /**
     * Describes whether time series forecasting is enabled or disabled in the Canvas app. Valid values are `ENABLED` and `DISABLED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Describes whether time series forecasting is enabled or disabled in the Canvas app. Valid values are `ENABLED` and `DISABLED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs() {}

    private DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs(DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs $) {
        this.amazonForecastRoleArn = $.amazonForecastRoleArn;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs $;

        public Builder() {
            $ = new DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs();
        }

        public Builder(DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs defaults) {
            $ = new DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param amazonForecastRoleArn The IAM role that Canvas passes to Amazon Forecast for time series forecasting. By default, Canvas uses the execution role specified in the UserProfile that launches the Canvas app. If an execution role is not specified in the UserProfile, Canvas uses the execution role specified in the Domain that owns the UserProfile. To allow time series forecasting, this IAM role should have the [AmazonSageMakerCanvasForecastAccess](https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-canvas.html#security-iam-awsmanpol-AmazonSageMakerCanvasForecastAccess) policy attached and forecast.amazonaws.com added in the trust relationship as a service principal.
         * 
         * @return builder
         * 
         */
        public Builder amazonForecastRoleArn(@Nullable Output<String> amazonForecastRoleArn) {
            $.amazonForecastRoleArn = amazonForecastRoleArn;
            return this;
        }

        /**
         * @param amazonForecastRoleArn The IAM role that Canvas passes to Amazon Forecast for time series forecasting. By default, Canvas uses the execution role specified in the UserProfile that launches the Canvas app. If an execution role is not specified in the UserProfile, Canvas uses the execution role specified in the Domain that owns the UserProfile. To allow time series forecasting, this IAM role should have the [AmazonSageMakerCanvasForecastAccess](https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-canvas.html#security-iam-awsmanpol-AmazonSageMakerCanvasForecastAccess) policy attached and forecast.amazonaws.com added in the trust relationship as a service principal.
         * 
         * @return builder
         * 
         */
        public Builder amazonForecastRoleArn(String amazonForecastRoleArn) {
            return amazonForecastRoleArn(Output.of(amazonForecastRoleArn));
        }

        /**
         * @param status Describes whether time series forecasting is enabled or disabled in the Canvas app. Valid values are `ENABLED` and `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Describes whether time series forecasting is enabled or disabled in the Canvas app. Valid values are `ENABLED` and `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs build() {
            return $;
        }
    }

}
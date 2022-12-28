// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.inputs;

import com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs;
import com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsFirehoseArgs;
import com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsS3Args;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterLoggingInfoBrokerLogsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterLoggingInfoBrokerLogsArgs Empty = new ClusterLoggingInfoBrokerLogsArgs();

    @Import(name="cloudwatchLogs")
    private @Nullable Output<ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs> cloudwatchLogs;

    public Optional<Output<ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs>> cloudwatchLogs() {
        return Optional.ofNullable(this.cloudwatchLogs);
    }

    @Import(name="firehose")
    private @Nullable Output<ClusterLoggingInfoBrokerLogsFirehoseArgs> firehose;

    public Optional<Output<ClusterLoggingInfoBrokerLogsFirehoseArgs>> firehose() {
        return Optional.ofNullable(this.firehose);
    }

    @Import(name="s3")
    private @Nullable Output<ClusterLoggingInfoBrokerLogsS3Args> s3;

    public Optional<Output<ClusterLoggingInfoBrokerLogsS3Args>> s3() {
        return Optional.ofNullable(this.s3);
    }

    private ClusterLoggingInfoBrokerLogsArgs() {}

    private ClusterLoggingInfoBrokerLogsArgs(ClusterLoggingInfoBrokerLogsArgs $) {
        this.cloudwatchLogs = $.cloudwatchLogs;
        this.firehose = $.firehose;
        this.s3 = $.s3;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterLoggingInfoBrokerLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterLoggingInfoBrokerLogsArgs $;

        public Builder() {
            $ = new ClusterLoggingInfoBrokerLogsArgs();
        }

        public Builder(ClusterLoggingInfoBrokerLogsArgs defaults) {
            $ = new ClusterLoggingInfoBrokerLogsArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudwatchLogs(@Nullable Output<ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs> cloudwatchLogs) {
            $.cloudwatchLogs = cloudwatchLogs;
            return this;
        }

        public Builder cloudwatchLogs(ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs cloudwatchLogs) {
            return cloudwatchLogs(Output.of(cloudwatchLogs));
        }

        public Builder firehose(@Nullable Output<ClusterLoggingInfoBrokerLogsFirehoseArgs> firehose) {
            $.firehose = firehose;
            return this;
        }

        public Builder firehose(ClusterLoggingInfoBrokerLogsFirehoseArgs firehose) {
            return firehose(Output.of(firehose));
        }

        public Builder s3(@Nullable Output<ClusterLoggingInfoBrokerLogsS3Args> s3) {
            $.s3 = s3;
            return this;
        }

        public Builder s3(ClusterLoggingInfoBrokerLogsS3Args s3) {
            return s3(Output.of(s3));
        }

        public ClusterLoggingInfoBrokerLogsArgs build() {
            return $;
        }
    }

}
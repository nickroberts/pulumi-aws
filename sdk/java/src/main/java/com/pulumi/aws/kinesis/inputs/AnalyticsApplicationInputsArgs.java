// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsKinesisFirehoseArgs;
import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsKinesisStreamArgs;
import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsParallelismArgs;
import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsProcessingConfigurationArgs;
import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaArgs;
import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsStartingPositionConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnalyticsApplicationInputsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsArgs Empty = new AnalyticsApplicationInputsArgs();

    /**
     * The ARN of the Kinesis Analytics Application.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ARN of the Kinesis Analytics Application.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The Kinesis Firehose configuration for the streaming source. Conflicts with `kinesis_stream`.
     * See Kinesis Firehose below for more details.
     * 
     */
    @Import(name="kinesisFirehose")
    private @Nullable Output<AnalyticsApplicationInputsKinesisFirehoseArgs> kinesisFirehose;

    /**
     * @return The Kinesis Firehose configuration for the streaming source. Conflicts with `kinesis_stream`.
     * See Kinesis Firehose below for more details.
     * 
     */
    public Optional<Output<AnalyticsApplicationInputsKinesisFirehoseArgs>> kinesisFirehose() {
        return Optional.ofNullable(this.kinesisFirehose);
    }

    /**
     * The Kinesis Stream configuration for the streaming source. Conflicts with `kinesis_firehose`.
     * See Kinesis Stream below for more details.
     * 
     */
    @Import(name="kinesisStream")
    private @Nullable Output<AnalyticsApplicationInputsKinesisStreamArgs> kinesisStream;

    /**
     * @return The Kinesis Stream configuration for the streaming source. Conflicts with `kinesis_firehose`.
     * See Kinesis Stream below for more details.
     * 
     */
    public Optional<Output<AnalyticsApplicationInputsKinesisStreamArgs>> kinesisStream() {
        return Optional.ofNullable(this.kinesisStream);
    }

    /**
     * The Name Prefix to use when creating an in-application stream.
     * 
     */
    @Import(name="namePrefix", required=true)
    private Output<String> namePrefix;

    /**
     * @return The Name Prefix to use when creating an in-application stream.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }

    /**
     * The number of Parallel in-application streams to create.
     * See Parallelism below for more details.
     * 
     */
    @Import(name="parallelism")
    private @Nullable Output<AnalyticsApplicationInputsParallelismArgs> parallelism;

    /**
     * @return The number of Parallel in-application streams to create.
     * See Parallelism below for more details.
     * 
     */
    public Optional<Output<AnalyticsApplicationInputsParallelismArgs>> parallelism() {
        return Optional.ofNullable(this.parallelism);
    }

    /**
     * The Processing Configuration to transform records as they are received from the stream.
     * See Processing Configuration below for more details.
     * 
     */
    @Import(name="processingConfiguration")
    private @Nullable Output<AnalyticsApplicationInputsProcessingConfigurationArgs> processingConfiguration;

    /**
     * @return The Processing Configuration to transform records as they are received from the stream.
     * See Processing Configuration below for more details.
     * 
     */
    public Optional<Output<AnalyticsApplicationInputsProcessingConfigurationArgs>> processingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }

    /**
     * The Schema format of the data in the streaming source. See Source Schema below for more details.
     * 
     */
    @Import(name="schema", required=true)
    private Output<AnalyticsApplicationInputsSchemaArgs> schema;

    /**
     * @return The Schema format of the data in the streaming source. See Source Schema below for more details.
     * 
     */
    public Output<AnalyticsApplicationInputsSchemaArgs> schema() {
        return this.schema;
    }

    /**
     * The point at which the application starts processing records from the streaming source.
     * See Starting Position Configuration below for more details.
     * 
     */
    @Import(name="startingPositionConfigurations")
    private @Nullable Output<List<AnalyticsApplicationInputsStartingPositionConfigurationArgs>> startingPositionConfigurations;

    /**
     * @return The point at which the application starts processing records from the streaming source.
     * See Starting Position Configuration below for more details.
     * 
     */
    public Optional<Output<List<AnalyticsApplicationInputsStartingPositionConfigurationArgs>>> startingPositionConfigurations() {
        return Optional.ofNullable(this.startingPositionConfigurations);
    }

    @Import(name="streamNames")
    private @Nullable Output<List<String>> streamNames;

    public Optional<Output<List<String>>> streamNames() {
        return Optional.ofNullable(this.streamNames);
    }

    private AnalyticsApplicationInputsArgs() {}

    private AnalyticsApplicationInputsArgs(AnalyticsApplicationInputsArgs $) {
        this.id = $.id;
        this.kinesisFirehose = $.kinesisFirehose;
        this.kinesisStream = $.kinesisStream;
        this.namePrefix = $.namePrefix;
        this.parallelism = $.parallelism;
        this.processingConfiguration = $.processingConfiguration;
        this.schema = $.schema;
        this.startingPositionConfigurations = $.startingPositionConfigurations;
        this.streamNames = $.streamNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsApplicationInputsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsApplicationInputsArgs $;

        public Builder() {
            $ = new AnalyticsApplicationInputsArgs();
        }

        public Builder(AnalyticsApplicationInputsArgs defaults) {
            $ = new AnalyticsApplicationInputsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ARN of the Kinesis Analytics Application.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ARN of the Kinesis Analytics Application.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param kinesisFirehose The Kinesis Firehose configuration for the streaming source. Conflicts with `kinesis_stream`.
         * See Kinesis Firehose below for more details.
         * 
         * @return builder
         * 
         */
        public Builder kinesisFirehose(@Nullable Output<AnalyticsApplicationInputsKinesisFirehoseArgs> kinesisFirehose) {
            $.kinesisFirehose = kinesisFirehose;
            return this;
        }

        /**
         * @param kinesisFirehose The Kinesis Firehose configuration for the streaming source. Conflicts with `kinesis_stream`.
         * See Kinesis Firehose below for more details.
         * 
         * @return builder
         * 
         */
        public Builder kinesisFirehose(AnalyticsApplicationInputsKinesisFirehoseArgs kinesisFirehose) {
            return kinesisFirehose(Output.of(kinesisFirehose));
        }

        /**
         * @param kinesisStream The Kinesis Stream configuration for the streaming source. Conflicts with `kinesis_firehose`.
         * See Kinesis Stream below for more details.
         * 
         * @return builder
         * 
         */
        public Builder kinesisStream(@Nullable Output<AnalyticsApplicationInputsKinesisStreamArgs> kinesisStream) {
            $.kinesisStream = kinesisStream;
            return this;
        }

        /**
         * @param kinesisStream The Kinesis Stream configuration for the streaming source. Conflicts with `kinesis_firehose`.
         * See Kinesis Stream below for more details.
         * 
         * @return builder
         * 
         */
        public Builder kinesisStream(AnalyticsApplicationInputsKinesisStreamArgs kinesisStream) {
            return kinesisStream(Output.of(kinesisStream));
        }

        /**
         * @param namePrefix The Name Prefix to use when creating an in-application stream.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix The Name Prefix to use when creating an in-application stream.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param parallelism The number of Parallel in-application streams to create.
         * See Parallelism below for more details.
         * 
         * @return builder
         * 
         */
        public Builder parallelism(@Nullable Output<AnalyticsApplicationInputsParallelismArgs> parallelism) {
            $.parallelism = parallelism;
            return this;
        }

        /**
         * @param parallelism The number of Parallel in-application streams to create.
         * See Parallelism below for more details.
         * 
         * @return builder
         * 
         */
        public Builder parallelism(AnalyticsApplicationInputsParallelismArgs parallelism) {
            return parallelism(Output.of(parallelism));
        }

        /**
         * @param processingConfiguration The Processing Configuration to transform records as they are received from the stream.
         * See Processing Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder processingConfiguration(@Nullable Output<AnalyticsApplicationInputsProcessingConfigurationArgs> processingConfiguration) {
            $.processingConfiguration = processingConfiguration;
            return this;
        }

        /**
         * @param processingConfiguration The Processing Configuration to transform records as they are received from the stream.
         * See Processing Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder processingConfiguration(AnalyticsApplicationInputsProcessingConfigurationArgs processingConfiguration) {
            return processingConfiguration(Output.of(processingConfiguration));
        }

        /**
         * @param schema The Schema format of the data in the streaming source. See Source Schema below for more details.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<AnalyticsApplicationInputsSchemaArgs> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The Schema format of the data in the streaming source. See Source Schema below for more details.
         * 
         * @return builder
         * 
         */
        public Builder schema(AnalyticsApplicationInputsSchemaArgs schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param startingPositionConfigurations The point at which the application starts processing records from the streaming source.
         * See Starting Position Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder startingPositionConfigurations(@Nullable Output<List<AnalyticsApplicationInputsStartingPositionConfigurationArgs>> startingPositionConfigurations) {
            $.startingPositionConfigurations = startingPositionConfigurations;
            return this;
        }

        /**
         * @param startingPositionConfigurations The point at which the application starts processing records from the streaming source.
         * See Starting Position Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder startingPositionConfigurations(List<AnalyticsApplicationInputsStartingPositionConfigurationArgs> startingPositionConfigurations) {
            return startingPositionConfigurations(Output.of(startingPositionConfigurations));
        }

        /**
         * @param startingPositionConfigurations The point at which the application starts processing records from the streaming source.
         * See Starting Position Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder startingPositionConfigurations(AnalyticsApplicationInputsStartingPositionConfigurationArgs... startingPositionConfigurations) {
            return startingPositionConfigurations(List.of(startingPositionConfigurations));
        }

        public Builder streamNames(@Nullable Output<List<String>> streamNames) {
            $.streamNames = streamNames;
            return this;
        }

        public Builder streamNames(List<String> streamNames) {
            return streamNames(Output.of(streamNames));
        }

        public Builder streamNames(String... streamNames) {
            return streamNames(List.of(streamNames));
        }

        public AnalyticsApplicationInputsArgs build() {
            $.namePrefix = Objects.requireNonNull($.namePrefix, "expected parameter 'namePrefix' to be non-null");
            $.schema = Objects.requireNonNull($.schema, "expected parameter 'schema' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect.Outputs
{

    [OutputType]
    public sealed class InstanceStorageConfigStorageConfig
    {
        /// <summary>
        /// A block that specifies the configuration of the Kinesis Firehose delivery stream. Documented below.
        /// </summary>
        public readonly Outputs.InstanceStorageConfigStorageConfigKinesisFirehoseConfig? KinesisFirehoseConfig;
        /// <summary>
        /// A block that specifies the configuration of the Kinesis data stream. Documented below.
        /// </summary>
        public readonly Outputs.InstanceStorageConfigStorageConfigKinesisStreamConfig? KinesisStreamConfig;
        /// <summary>
        /// A block that specifies the configuration of the Kinesis video stream. Documented below.
        /// </summary>
        public readonly Outputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfig? KinesisVideoStreamConfig;
        /// <summary>
        /// A block that specifies the configuration of S3 Bucket. Documented below.
        /// </summary>
        public readonly Outputs.InstanceStorageConfigStorageConfigS3Config? S3Config;
        /// <summary>
        /// A valid storage type. Valid Values: `S3` | `KINESIS_VIDEO_STREAM` | `KINESIS_STREAM` | `KINESIS_FIREHOSE`.
        /// </summary>
        public readonly string StorageType;

        [OutputConstructor]
        private InstanceStorageConfigStorageConfig(
            Outputs.InstanceStorageConfigStorageConfigKinesisFirehoseConfig? kinesisFirehoseConfig,

            Outputs.InstanceStorageConfigStorageConfigKinesisStreamConfig? kinesisStreamConfig,

            Outputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfig? kinesisVideoStreamConfig,

            Outputs.InstanceStorageConfigStorageConfigS3Config? s3Config,

            string storageType)
        {
            KinesisFirehoseConfig = kinesisFirehoseConfig;
            KinesisStreamConfig = kinesisStreamConfig;
            KinesisVideoStreamConfig = kinesisVideoStreamConfig;
            S3Config = s3Config;
            StorageType = storageType;
        }
    }
}
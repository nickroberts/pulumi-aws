// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Inputs
{

    public sealed class BucketV2ServerSideEncryptionConfigurationRuleGetArgs : Pulumi.ResourceArgs
    {
        [Input("applyServerSideEncryptionByDefaults", required: true)]
        private InputList<Inputs.BucketV2ServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultGetArgs>? _applyServerSideEncryptionByDefaults;

        /// <summary>
        /// A single object for setting server-side encryption by default. (documented below)
        /// </summary>
        public InputList<Inputs.BucketV2ServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultGetArgs> ApplyServerSideEncryptionByDefaults
        {
            get => _applyServerSideEncryptionByDefaults ?? (_applyServerSideEncryptionByDefaults = new InputList<Inputs.BucketV2ServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultGetArgs>());
            set => _applyServerSideEncryptionByDefaults = value;
        }

        /// <summary>
        /// Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
        /// </summary>
        [Input("bucketKeyEnabled")]
        public Input<bool>? BucketKeyEnabled { get; set; }

        public BucketV2ServerSideEncryptionConfigurationRuleGetArgs()
        {
        }
    }
}
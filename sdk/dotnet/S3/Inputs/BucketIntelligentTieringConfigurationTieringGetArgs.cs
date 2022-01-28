// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Inputs
{

    public sealed class BucketIntelligentTieringConfigurationTieringGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// S3 Intelligent-Tiering access tier. Valid values: `ARCHIVE_CONFIGURATION`, `DEEP_ARCHIVE_CONFIGURATION`.
        /// </summary>
        [Input("accessTier", required: true)]
        public Input<string> AccessTier { get; set; } = null!;

        /// <summary>
        /// The number of consecutive days of no access after which an object will be eligible to be transitioned to the corresponding tier.
        /// </summary>
        [Input("days", required: true)]
        public Input<int> Days { get; set; } = null!;

        public BucketIntelligentTieringConfigurationTieringGetArgs()
        {
        }
    }
}
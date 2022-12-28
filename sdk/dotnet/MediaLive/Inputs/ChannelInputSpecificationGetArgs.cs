// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelInputSpecificationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("codec", required: true)]
        public Input<string> Codec { get; set; } = null!;

        [Input("inputResolution", required: true)]
        public Input<string> InputResolution { get; set; } = null!;

        [Input("maximumBitrate", required: true)]
        public Input<string> MaximumBitrate { get; set; } = null!;

        public ChannelInputSpecificationGetArgs()
        {
        }
        public static new ChannelInputSpecificationGetArgs Empty => new ChannelInputSpecificationGetArgs();
    }
}
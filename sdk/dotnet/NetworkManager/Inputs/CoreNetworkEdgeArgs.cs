// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkManager.Inputs
{

    public sealed class CoreNetworkEdgeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ASN of a core network edge.
        /// </summary>
        [Input("asn")]
        public Input<int>? Asn { get; set; }

        /// <summary>
        /// Region where a core network edge is located.
        /// </summary>
        [Input("edgeLocation")]
        public Input<string>? EdgeLocation { get; set; }

        [Input("insideCidrBlocks")]
        private InputList<string>? _insideCidrBlocks;

        /// <summary>
        /// Inside IP addresses used for core network edges.
        /// </summary>
        public InputList<string> InsideCidrBlocks
        {
            get => _insideCidrBlocks ?? (_insideCidrBlocks = new InputList<string>());
            set => _insideCidrBlocks = value;
        }

        public CoreNetworkEdgeArgs()
        {
        }
        public static new CoreNetworkEdgeArgs Empty => new CoreNetworkEdgeArgs();
    }
}
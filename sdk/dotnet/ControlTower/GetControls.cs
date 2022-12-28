// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ControlTower
{
    public static class GetControls
    {
        /// <summary>
        /// List of Control Tower controls applied to an OU.
        /// </summary>
        public static Task<GetControlsResult> InvokeAsync(GetControlsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetControlsResult>("aws:controltower/getControls:getControls", args ?? new GetControlsArgs(), options.WithDefaults());

        /// <summary>
        /// List of Control Tower controls applied to an OU.
        /// </summary>
        public static Output<GetControlsResult> Invoke(GetControlsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetControlsResult>("aws:controltower/getControls:getControls", args ?? new GetControlsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetControlsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ARN of the organizational unit.
        /// </summary>
        [Input("targetIdentifier", required: true)]
        public string TargetIdentifier { get; set; } = null!;

        public GetControlsArgs()
        {
        }
        public static new GetControlsArgs Empty => new GetControlsArgs();
    }

    public sealed class GetControlsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ARN of the organizational unit.
        /// </summary>
        [Input("targetIdentifier", required: true)]
        public Input<string> TargetIdentifier { get; set; } = null!;

        public GetControlsInvokeArgs()
        {
        }
        public static new GetControlsInvokeArgs Empty => new GetControlsInvokeArgs();
    }


    [OutputType]
    public sealed class GetControlsResult
    {
        /// <summary>
        /// List of all the ARNs for the controls applied to the `target_identifier`.
        /// </summary>
        public readonly ImmutableArray<string> EnabledControls;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string TargetIdentifier;

        [OutputConstructor]
        private GetControlsResult(
            ImmutableArray<string> enabledControls,

            string id,

            string targetIdentifier)
        {
            EnabledControls = enabledControls;
            Id = id;
            TargetIdentifier = targetIdentifier;
        }
    }
}
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Inputs
{

    public sealed class ProviderAssumeRoleWithWebIdentityArgs : Pulumi.ResourceArgs
    {
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        [Input("policy")]
        public Input<string>? Policy { get; set; }

        [Input("policyArns")]
        private InputList<string>? _policyArns;
        public InputList<string> PolicyArns
        {
            get => _policyArns ?? (_policyArns = new InputList<string>());
            set => _policyArns = value;
        }

        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        [Input("sessionName")]
        public Input<string>? SessionName { get; set; }

        [Input("webIdentityToken")]
        public Input<string>? WebIdentityToken { get; set; }

        [Input("webIdentityTokenFile")]
        public Input<string>? WebIdentityTokenFile { get; set; }

        public ProviderAssumeRoleWithWebIdentityArgs()
        {
        }
    }
}
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Outputs
{

    [OutputType]
    public sealed class GetNetworkInsightsAnalysisReturnPathComponentAdditionalDetailResult
    {
        public readonly string AdditionalDetailType;
        public readonly ImmutableArray<Outputs.GetNetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponentResult> Components;

        [OutputConstructor]
        private GetNetworkInsightsAnalysisReturnPathComponentAdditionalDetailResult(
            string additionalDetailType,

            ImmutableArray<Outputs.GetNetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponentResult> components)
        {
            AdditionalDetailType = additionalDetailType;
            Components = components;
        }
    }
}
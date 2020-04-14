// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafRegional
{
    public static class GetRule
    {
        /// <summary>
        /// `aws.wafregional.Rule` Retrieves a WAF Regional Rule Resource Id.
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRuleResult> InvokeAsync(GetRuleArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetRuleResult>("aws:wafregional/getRule:getRule", args ?? new GetRuleArgs(), options.WithVersion());
    }


    public sealed class GetRuleArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the WAF Regional rule.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetRuleArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetRuleResult
    {
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetRuleResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}
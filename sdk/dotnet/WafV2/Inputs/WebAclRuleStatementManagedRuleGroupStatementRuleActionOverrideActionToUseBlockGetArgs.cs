// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines a custom response for the web request. See Custom Response below for details.
        /// </summary>
        [Input("customResponse")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockCustomResponseGetArgs>? CustomResponse { get; set; }

        public WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockGetArgs()
        {
        }
        public static new WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockGetArgs Empty => new WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockGetArgs();
    }
}
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An empty configuration block that is used for inspecting all headers.
        /// </summary>
        [Input("all")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllGetArgs>? All { get; set; }

        [Input("includedPaths")]
        private InputList<string>? _includedPaths;
        public InputList<string> IncludedPaths
        {
            get => _includedPaths ?? (_includedPaths = new InputList<string>());
            set => _includedPaths = value;
        }

        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternGetArgs()
        {
        }
        public static new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternGetArgs Empty => new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternGetArgs();
    }
}
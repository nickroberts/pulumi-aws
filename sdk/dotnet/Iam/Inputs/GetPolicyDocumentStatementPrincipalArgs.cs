// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iam.Inputs
{

    public sealed class GetPolicyDocumentStatementPrincipalInputArgs : Pulumi.ResourceArgs
    {
        [Input("identifiers", required: true)]
        private InputList<string>? _identifiers;

        /// <summary>
        /// List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
        /// </summary>
        public InputList<string> Identifiers
        {
            get => _identifiers ?? (_identifiers = new InputList<string>());
            set => _identifiers = value;
        }

        /// <summary>
        /// Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetPolicyDocumentStatementPrincipalInputArgs()
        {
        }
    }
}
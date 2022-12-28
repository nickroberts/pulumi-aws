// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Outputs
{

    [OutputType]
    public sealed class WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatch
    {
        /// <summary>
        /// Inspect all query arguments.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments? AllQueryArguments;
        /// <summary>
        /// Inspect the request body, which immediately follows the request headers.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchBody? Body;
        /// <summary>
        /// Inspect the cookies in the web request. See Cookies below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchCookies? Cookies;
        /// <summary>
        /// Inspect the request headers. See Headers below for details.
        /// </summary>
        public readonly ImmutableArray<Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchHeader> Headers;
        /// <summary>
        /// Inspect the request body as JSON. See JSON Body for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchJsonBody? JsonBody;
        /// <summary>
        /// Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchMethod? Method;
        /// <summary>
        /// Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchQueryString? QueryString;
        /// <summary>
        /// Inspect a single header. See Single Header below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchSingleHeader? SingleHeader;
        /// <summary>
        /// Inspect a single query argument. See Single Query Argument below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument? SingleQueryArgument;
        /// <summary>
        /// Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchUriPath? UriPath;

        [OutputConstructor]
        private WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatch(
            Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments? allQueryArguments,

            Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchBody? body,

            Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchCookies? cookies,

            ImmutableArray<Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchHeader> headers,

            Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchJsonBody? jsonBody,

            Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchMethod? method,

            Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchQueryString? queryString,

            Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchSingleHeader? singleHeader,

            Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument? singleQueryArgument,

            Outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchUriPath? uriPath)
        {
            AllQueryArguments = allQueryArguments;
            Body = body;
            Cookies = cookies;
            Headers = headers;
            JsonBody = jsonBody;
            Method = method;
            QueryString = queryString;
            SingleHeader = singleHeader;
            SingleQueryArgument = singleQueryArgument;
            UriPath = uriPath;
        }
    }
}
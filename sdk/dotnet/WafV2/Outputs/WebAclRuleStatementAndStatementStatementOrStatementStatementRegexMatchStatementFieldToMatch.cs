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
    public sealed class WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatch
    {
        /// <summary>
        /// Inspect all query arguments.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments? AllQueryArguments;
        /// <summary>
        /// Inspect the request body, which immediately follows the request headers.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchBody? Body;
        /// <summary>
        /// Inspect the cookies in the web request. See Cookies below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchCookies? Cookies;
        /// <summary>
        /// Inspect the request headers. See Headers below for details.
        /// </summary>
        public readonly ImmutableArray<Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchHeader> Headers;
        /// <summary>
        /// Inspect the request body as JSON. See JSON Body for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchJsonBody? JsonBody;
        /// <summary>
        /// Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchMethod? Method;
        /// <summary>
        /// Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchQueryString? QueryString;
        /// <summary>
        /// Inspect a single header. See Single Header below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleHeader? SingleHeader;
        /// <summary>
        /// Inspect a single query argument. See Single Query Argument below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument? SingleQueryArgument;
        /// <summary>
        /// Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchUriPath? UriPath;

        [OutputConstructor]
        private WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatch(
            Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments? allQueryArguments,

            Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchBody? body,

            Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchCookies? cookies,

            ImmutableArray<Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchHeader> headers,

            Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchJsonBody? jsonBody,

            Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchMethod? method,

            Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchQueryString? queryString,

            Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleHeader? singleHeader,

            Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument? singleQueryArgument,

            Outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchUriPath? uriPath)
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
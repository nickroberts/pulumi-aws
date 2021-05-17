// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudWatch.Outputs
{

    [OutputType]
    public sealed class EventTargetHttpTarget
    {
        /// <summary>
        /// Enables you to specify HTTP headers to add to the request.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? HeaderParameters;
        /// <summary>
        /// The list of values that correspond sequentially to any path variables in your endpoint ARN (for example `arn:aws:execute-api:us-east-1:123456:myapi/*/POST/pets/*`).
        /// </summary>
        public readonly ImmutableArray<string> PathParameterValues;
        /// <summary>
        /// Represents keys/values of query string parameters that are appended to the invoked endpoint.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? QueryStringParameters;

        [OutputConstructor]
        private EventTargetHttpTarget(
            ImmutableDictionary<string, string>? headerParameters,

            ImmutableArray<string> pathParameterValues,

            ImmutableDictionary<string, string>? queryStringParameters)
        {
            HeaderParameters = headerParameters;
            PathParameterValues = pathParameterValues;
            QueryStringParameters = queryStringParameters;
        }
    }
}
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.LightSail.Outputs
{

    [OutputType]
    public sealed class ContainerServiceDeploymentVersionPublicEndpointHealthCheck
    {
        /// <summary>
        /// The number of consecutive health checks successes required before moving the container to the Healthy state. Defaults to 2.
        /// </summary>
        public readonly int? HealthyThreshold;
        /// <summary>
        /// The approximate interval, in seconds, between health checks of an individual container. You can specify between 5 and 300 seconds. Defaults to 5.
        /// </summary>
        public readonly int? IntervalSeconds;
        /// <summary>
        /// The path on the container on which to perform the health check. Defaults to "/".
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// The HTTP codes to use when checking for a successful response from a container. You can specify values between 200 and 499. Defaults to "200-499".
        /// </summary>
        public readonly string? SuccessCodes;
        /// <summary>
        /// The amount of time, in seconds, during which no response means a failed health check. You can specify between 2 and 60 seconds. Defaults to 2.
        /// </summary>
        public readonly int? TimeoutSeconds;
        /// <summary>
        /// The number of consecutive health checks failures required before moving the container to the Unhealthy state. Defaults to 2.
        /// </summary>
        public readonly int? UnhealthyThreshold;

        [OutputConstructor]
        private ContainerServiceDeploymentVersionPublicEndpointHealthCheck(
            int? healthyThreshold,

            int? intervalSeconds,

            string? path,

            string? successCodes,

            int? timeoutSeconds,

            int? unhealthyThreshold)
        {
            HealthyThreshold = healthyThreshold;
            IntervalSeconds = intervalSeconds;
            Path = path;
            SuccessCodes = successCodes;
            TimeoutSeconds = timeoutSeconds;
            UnhealthyThreshold = unhealthyThreshold;
        }
    }
}
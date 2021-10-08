// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.RedShift.Outputs
{

    [OutputType]
    public sealed class ScheduledActionTargetActionResumeCluster
    {
        /// <summary>
        /// The identifier of the cluster to be resumed.
        /// </summary>
        public readonly string ClusterIdentifier;

        [OutputConstructor]
        private ScheduledActionTargetActionResumeCluster(string clusterIdentifier)
        {
            ClusterIdentifier = clusterIdentifier;
        }
    }
}
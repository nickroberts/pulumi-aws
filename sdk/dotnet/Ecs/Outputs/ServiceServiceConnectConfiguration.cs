// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ecs.Outputs
{

    [OutputType]
    public sealed class ServiceServiceConnectConfiguration
    {
        /// <summary>
        /// Specifies whether to use Service Connect with this service.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The log configuration for the container. See below.
        /// </summary>
        public readonly Outputs.ServiceServiceConnectConfigurationLogConfiguration? LogConfiguration;
        /// <summary>
        /// The namespace name or ARN of the `aws.servicediscovery.HttpNamespace` for use with Service Connect.
        /// </summary>
        public readonly string? Namespace;
        /// <summary>
        /// The list of Service Connect service objects. See below.
        /// </summary>
        public readonly Outputs.ServiceServiceConnectConfigurationService? Service;

        [OutputConstructor]
        private ServiceServiceConnectConfiguration(
            bool enabled,

            Outputs.ServiceServiceConnectConfigurationLogConfiguration? logConfiguration,

            string? @namespace,

            Outputs.ServiceServiceConnectConfigurationService? service)
        {
            Enabled = enabled;
            LogConfiguration = logConfiguration;
            Namespace = @namespace;
            Service = service;
        }
    }
}
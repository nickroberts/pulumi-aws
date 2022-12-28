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
    public sealed class ContainerServicePublicDomainNames
    {
        public readonly ImmutableArray<Outputs.ContainerServicePublicDomainNamesCertificate> Certificates;

        [OutputConstructor]
        private ContainerServicePublicDomainNames(ImmutableArray<Outputs.ContainerServicePublicDomainNamesCertificate> certificates)
        {
            Certificates = certificates;
        }
    }
}
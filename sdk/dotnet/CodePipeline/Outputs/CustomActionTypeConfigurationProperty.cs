// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodePipeline.Outputs
{

    [OutputType]
    public sealed class CustomActionTypeConfigurationProperty
    {
        /// <summary>
        /// The description of the action configuration property.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Whether the configuration property is a key.
        /// </summary>
        public readonly bool Key;
        /// <summary>
        /// The name of the action configuration property.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Indicates that the property will be used in conjunction with PollForJobs.
        /// </summary>
        public readonly bool? Queryable;
        /// <summary>
        /// Whether the configuration property is a required value.
        /// </summary>
        public readonly bool Required;
        /// <summary>
        /// Whether the configuration property is secret.
        /// </summary>
        public readonly bool Secret;
        /// <summary>
        /// The type of the configuration property. Valid values: `String`, `Number`, `Boolean`
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private CustomActionTypeConfigurationProperty(
            string? description,

            bool key,

            string name,

            bool? queryable,

            bool required,

            bool secret,

            string? type)
        {
            Description = description;
            Key = key;
            Name = name;
            Queryable = queryable;
            Required = required;
            Secret = secret;
            Type = type;
        }
    }
}
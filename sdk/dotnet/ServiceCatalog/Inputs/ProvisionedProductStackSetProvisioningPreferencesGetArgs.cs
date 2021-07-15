// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ServiceCatalog.Inputs
{

    public sealed class ProvisionedProductStackSetProvisioningPreferencesGetArgs : Pulumi.ResourceArgs
    {
        [Input("accounts")]
        private InputList<string>? _accounts;

        /// <summary>
        /// One or more AWS accounts that will have access to the provisioned product. The AWS accounts specified should be within the list of accounts in the STACKSET constraint. To get the list of accounts in the STACKSET constraint, use the `aws_servicecatalog_provisioning_parameters` data source. If no values are specified, the default value is all accounts from the STACKSET constraint.
        /// </summary>
        public InputList<string> Accounts
        {
            get => _accounts ?? (_accounts = new InputList<string>());
            set => _accounts = value;
        }

        /// <summary>
        /// Number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. You must specify either `failure_tolerance_count` or `failure_tolerance_percentage`, but not both. The default value is 0 if no value is specified.
        /// </summary>
        [Input("failureToleranceCount")]
        public Input<int>? FailureToleranceCount { get; set; }

        /// <summary>
        /// Percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. You must specify either `failure_tolerance_count` or `failure_tolerance_percentage`, but not both.
        /// </summary>
        [Input("failureTolerancePercentage")]
        public Input<int>? FailureTolerancePercentage { get; set; }

        /// <summary>
        /// Maximum number of accounts in which to perform this operation at one time. This is dependent on the value of `failure_tolerance_count`. `max_concurrency_count` is at most one more than the `failure_tolerance_count`. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. You must specify either `max_concurrency_count` or `max_concurrency_percentage`, but not both.
        /// </summary>
        [Input("maxConcurrencyCount")]
        public Input<int>? MaxConcurrencyCount { get; set; }

        /// <summary>
        /// Maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS Service Catalog sets the number as 1 instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. You must specify either `max_concurrency_count` or `max_concurrency_percentage`, but not both.
        /// </summary>
        [Input("maxConcurrencyPercentage")]
        public Input<int>? MaxConcurrencyPercentage { get; set; }

        [Input("regions")]
        private InputList<string>? _regions;

        /// <summary>
        /// One or more AWS Regions where the provisioned product will be available. The specified regions should be within the list of regions from the STACKSET constraint. To get the list of regions in the STACKSET constraint, use the `aws_servicecatalog_provisioning_parameters` data source. If no values are specified, the default value is all regions from the STACKSET constraint.
        /// </summary>
        public InputList<string> Regions
        {
            get => _regions ?? (_regions = new InputList<string>());
            set => _regions = value;
        }

        public ProvisionedProductStackSetProvisioningPreferencesGetArgs()
        {
        }
    }
}
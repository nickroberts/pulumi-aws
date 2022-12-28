// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kendra.Inputs
{

    public sealed class DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A block that specifies the condition used for when a Lambda function should be invoked. For example, you can specify a condition that if there are empty date-time values, then Amazon Kendra should invoke a function that inserts the current date-time. See Document Attribute Condition.
        /// </summary>
        [Input("invocationCondition")]
        public Input<Inputs.DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionArgs>? InvocationCondition { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of a Lambda Function that can manipulate your document metadata fields or attributes and content.
        /// </summary>
        [Input("lambdaArn", required: true)]
        public Input<string> LambdaArn { get; set; } = null!;

        /// <summary>
        /// Stores the original, raw documents or the structured, parsed documents before and after altering them. For more information, see [Data contracts for Lambda functions](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#cde-data-contracts-lambda).
        /// </summary>
        [Input("s3Bucket", required: true)]
        public Input<string> S3Bucket { get; set; } = null!;

        public DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationArgs()
        {
        }
        public static new DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationArgs Empty => new DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationArgs();
    }
}
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kendra
{
    public static class GetFaq
    {
        /// <summary>
        /// Provides details about a specific Amazon Kendra Faq.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Aws.Kendra.GetFaq.Invoke(new()
        ///     {
        ///         FaqId = "87654321-1234-4321-4321-321987654321",
        ///         IndexId = "12345678-1234-1234-1234-123456789123",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFaqResult> InvokeAsync(GetFaqArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFaqResult>("aws:kendra/getFaq:getFaq", args ?? new GetFaqArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Amazon Kendra Faq.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Aws.Kendra.GetFaq.Invoke(new()
        ///     {
        ///         FaqId = "87654321-1234-4321-4321-321987654321",
        ///         IndexId = "12345678-1234-1234-1234-123456789123",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetFaqResult> Invoke(GetFaqInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFaqResult>("aws:kendra/getFaq:getFaq", args ?? new GetFaqInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFaqArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier of the FAQ.
        /// </summary>
        [Input("faqId", required: true)]
        public string FaqId { get; set; } = null!;

        /// <summary>
        /// Identifier of the index that contains the FAQ.
        /// </summary>
        [Input("indexId", required: true)]
        public string IndexId { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Metadata that helps organize the FAQs you create.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetFaqArgs()
        {
        }
        public static new GetFaqArgs Empty => new GetFaqArgs();
    }

    public sealed class GetFaqInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier of the FAQ.
        /// </summary>
        [Input("faqId", required: true)]
        public Input<string> FaqId { get; set; } = null!;

        /// <summary>
        /// Identifier of the index that contains the FAQ.
        /// </summary>
        [Input("indexId", required: true)]
        public Input<string> IndexId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Metadata that helps organize the FAQs you create.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetFaqInvokeArgs()
        {
        }
        public static new GetFaqInvokeArgs Empty => new GetFaqInvokeArgs();
    }


    [OutputType]
    public sealed class GetFaqResult
    {
        /// <summary>
        /// ARN of the FAQ.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Unix datetime that the faq was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// Description of the FAQ.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// When the `status` field value is `FAILED`, this contains a message that explains why.
        /// </summary>
        public readonly string ErrorMessage;
        public readonly string FaqId;
        /// <summary>
        /// File format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
        /// </summary>
        public readonly string FileFormat;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string IndexId;
        /// <summary>
        /// Code for a language. This shows a supported language for the FAQ document. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
        /// </summary>
        public readonly string LanguageCode;
        /// <summary>
        /// Name of the FAQ.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// ARN of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
        /// </summary>
        public readonly string RoleArn;
        /// <summary>
        /// S3 location of the FAQ input data. Detailed below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFaqS3PathResult> S3Paths;
        /// <summary>
        /// Status of the FAQ. It is ready to use when the status is ACTIVE.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Metadata that helps organize the FAQs you create.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Date and time that the FAQ was last updated.
        /// </summary>
        public readonly string UpdatedAt;

        [OutputConstructor]
        private GetFaqResult(
            string arn,

            string createdAt,

            string description,

            string errorMessage,

            string faqId,

            string fileFormat,

            string id,

            string indexId,

            string languageCode,

            string name,

            string roleArn,

            ImmutableArray<Outputs.GetFaqS3PathResult> s3Paths,

            string status,

            ImmutableDictionary<string, string> tags,

            string updatedAt)
        {
            Arn = arn;
            CreatedAt = createdAt;
            Description = description;
            ErrorMessage = errorMessage;
            FaqId = faqId;
            FileFormat = fileFormat;
            Id = id;
            IndexId = indexId;
            LanguageCode = languageCode;
            Name = name;
            RoleArn = roleArn;
            S3Paths = s3Paths;
            Status = status;
            Tags = tags;
            UpdatedAt = updatedAt;
        }
    }
}
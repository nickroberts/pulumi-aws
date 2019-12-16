// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ebs
{
    /// <summary>
    /// Provides a resource to manage the default customer master key (CMK) that your AWS account uses to encrypt EBS volumes.
    /// 
    /// Your AWS account has an AWS-managed default CMK that is used for encrypting an EBS volume when no CMK is specified in the API call that creates the volume.
    /// By using the `aws.ebs.DefaultKmsKey` resource, you can specify a customer-managed CMK to use in place of the AWS-managed default CMK.
    /// 
    /// &gt; **NOTE:** Creating an `aws.ebs.DefaultKmsKey` resource does not enable default EBS encryption. Use the `aws.ebs.EncryptionByDefault` to enable default EBS encryption.
    /// 
    /// &gt; **NOTE:** Destroying this resource will reset the default CMK to the account's AWS-managed default CMK for EBS.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-aws/blob/master/website/docs/r/ebs_default_kms_key.html.markdown.
    /// </summary>
    public partial class DefaultKmsKey : Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
        /// </summary>
        [Output("keyArn")]
        public Output<string> KeyArn { get; private set; } = null!;


        /// <summary>
        /// Create a DefaultKmsKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DefaultKmsKey(string name, DefaultKmsKeyArgs args, CustomResourceOptions? options = null)
            : base("aws:ebs/defaultKmsKey:DefaultKmsKey", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private DefaultKmsKey(string name, Input<string> id, DefaultKmsKeyState? state = null, CustomResourceOptions? options = null)
            : base("aws:ebs/defaultKmsKey:DefaultKmsKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DefaultKmsKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DefaultKmsKey Get(string name, Input<string> id, DefaultKmsKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new DefaultKmsKey(name, id, state, options);
        }
    }

    public sealed class DefaultKmsKeyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
        /// </summary>
        [Input("keyArn", required: true)]
        public Input<string> KeyArn { get; set; } = null!;

        public DefaultKmsKeyArgs()
        {
        }
    }

    public sealed class DefaultKmsKeyState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
        /// </summary>
        [Input("keyArn")]
        public Input<string>? KeyArn { get; set; }

        public DefaultKmsKeyState()
        {
        }
    }
}
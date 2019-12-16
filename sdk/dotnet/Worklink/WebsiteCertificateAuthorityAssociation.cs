// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WorkLink
{
    public partial class WebsiteCertificateAuthorityAssociation : Pulumi.CustomResource
    {
        /// <summary>
        /// The root certificate of the Certificate Authority.
        /// </summary>
        [Output("certificate")]
        public Output<string> Certificate { get; private set; } = null!;

        /// <summary>
        /// The certificate name to display.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The ARN of the fleet.
        /// </summary>
        [Output("fleetArn")]
        public Output<string> FleetArn { get; private set; } = null!;

        /// <summary>
        /// A unique identifier for the Certificate Authority.
        /// </summary>
        [Output("websiteCaId")]
        public Output<string> WebsiteCaId { get; private set; } = null!;


        /// <summary>
        /// Create a WebsiteCertificateAuthorityAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WebsiteCertificateAuthorityAssociation(string name, WebsiteCertificateAuthorityAssociationArgs args, CustomResourceOptions? options = null)
            : base("aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private WebsiteCertificateAuthorityAssociation(string name, Input<string> id, WebsiteCertificateAuthorityAssociationState? state = null, CustomResourceOptions? options = null)
            : base("aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WebsiteCertificateAuthorityAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WebsiteCertificateAuthorityAssociation Get(string name, Input<string> id, WebsiteCertificateAuthorityAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new WebsiteCertificateAuthorityAssociation(name, id, state, options);
        }
    }

    public sealed class WebsiteCertificateAuthorityAssociationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The root certificate of the Certificate Authority.
        /// </summary>
        [Input("certificate", required: true)]
        public Input<string> Certificate { get; set; } = null!;

        /// <summary>
        /// The certificate name to display.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The ARN of the fleet.
        /// </summary>
        [Input("fleetArn", required: true)]
        public Input<string> FleetArn { get; set; } = null!;

        public WebsiteCertificateAuthorityAssociationArgs()
        {
        }
    }

    public sealed class WebsiteCertificateAuthorityAssociationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The root certificate of the Certificate Authority.
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// The certificate name to display.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The ARN of the fleet.
        /// </summary>
        [Input("fleetArn")]
        public Input<string>? FleetArn { get; set; }

        /// <summary>
        /// A unique identifier for the Certificate Authority.
        /// </summary>
        [Input("websiteCaId")]
        public Input<string>? WebsiteCaId { get; set; }

        public WebsiteCertificateAuthorityAssociationState()
        {
        }
    }
}
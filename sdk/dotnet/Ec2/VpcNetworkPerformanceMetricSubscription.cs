// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    /// <summary>
    /// Provides a resource to manage an Infrastructure Performance subscription.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ec2.VpcNetworkPerformanceMetricSubscription("example", new()
    ///     {
    ///         Destination = "us-west-1",
    ///         Source = "us-east-1",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/vpcNetworkPerformanceMetricSubscription:VpcNetworkPerformanceMetricSubscription")]
    public partial class VpcNetworkPerformanceMetricSubscription : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The target Region or Availability Zone that the metric subscription is enabled for. For example, `eu-west-1`.
        /// </summary>
        [Output("destination")]
        public Output<string> Destination { get; private set; } = null!;

        /// <summary>
        /// The metric used for the enabled subscription. Valid values: `aggregate-latency`. Default: `aggregate-latency`.
        /// </summary>
        [Output("metric")]
        public Output<string?> Metric { get; private set; } = null!;

        /// <summary>
        /// The data aggregation time for the subscription.
        /// </summary>
        [Output("period")]
        public Output<string> Period { get; private set; } = null!;

        /// <summary>
        /// The source Region or Availability Zone that the metric subscription is enabled for. For example, `us-east-1`.
        /// </summary>
        [Output("source")]
        public Output<string> Source { get; private set; } = null!;

        /// <summary>
        /// The statistic used for the enabled subscription. Valid values: `p50`. Default: `p50`.
        /// </summary>
        [Output("statistic")]
        public Output<string?> Statistic { get; private set; } = null!;


        /// <summary>
        /// Create a VpcNetworkPerformanceMetricSubscription resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcNetworkPerformanceMetricSubscription(string name, VpcNetworkPerformanceMetricSubscriptionArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcNetworkPerformanceMetricSubscription:VpcNetworkPerformanceMetricSubscription", name, args ?? new VpcNetworkPerformanceMetricSubscriptionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcNetworkPerformanceMetricSubscription(string name, Input<string> id, VpcNetworkPerformanceMetricSubscriptionState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcNetworkPerformanceMetricSubscription:VpcNetworkPerformanceMetricSubscription", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcNetworkPerformanceMetricSubscription resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcNetworkPerformanceMetricSubscription Get(string name, Input<string> id, VpcNetworkPerformanceMetricSubscriptionState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcNetworkPerformanceMetricSubscription(name, id, state, options);
        }
    }

    public sealed class VpcNetworkPerformanceMetricSubscriptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The target Region or Availability Zone that the metric subscription is enabled for. For example, `eu-west-1`.
        /// </summary>
        [Input("destination", required: true)]
        public Input<string> Destination { get; set; } = null!;

        /// <summary>
        /// The metric used for the enabled subscription. Valid values: `aggregate-latency`. Default: `aggregate-latency`.
        /// </summary>
        [Input("metric")]
        public Input<string>? Metric { get; set; }

        /// <summary>
        /// The source Region or Availability Zone that the metric subscription is enabled for. For example, `us-east-1`.
        /// </summary>
        [Input("source", required: true)]
        public Input<string> Source { get; set; } = null!;

        /// <summary>
        /// The statistic used for the enabled subscription. Valid values: `p50`. Default: `p50`.
        /// </summary>
        [Input("statistic")]
        public Input<string>? Statistic { get; set; }

        public VpcNetworkPerformanceMetricSubscriptionArgs()
        {
        }
        public static new VpcNetworkPerformanceMetricSubscriptionArgs Empty => new VpcNetworkPerformanceMetricSubscriptionArgs();
    }

    public sealed class VpcNetworkPerformanceMetricSubscriptionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The target Region or Availability Zone that the metric subscription is enabled for. For example, `eu-west-1`.
        /// </summary>
        [Input("destination")]
        public Input<string>? Destination { get; set; }

        /// <summary>
        /// The metric used for the enabled subscription. Valid values: `aggregate-latency`. Default: `aggregate-latency`.
        /// </summary>
        [Input("metric")]
        public Input<string>? Metric { get; set; }

        /// <summary>
        /// The data aggregation time for the subscription.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        /// <summary>
        /// The source Region or Availability Zone that the metric subscription is enabled for. For example, `us-east-1`.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// The statistic used for the enabled subscription. Valid values: `p50`. Default: `p50`.
        /// </summary>
        [Input("statistic")]
        public Input<string>? Statistic { get; set; }

        public VpcNetworkPerformanceMetricSubscriptionState()
        {
        }
        public static new VpcNetworkPerformanceMetricSubscriptionState Empty => new VpcNetworkPerformanceMetricSubscriptionState();
    }
}
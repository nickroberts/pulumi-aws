// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Outposts
{
    public static class GetAssets
    {
        /// <summary>
        /// Information about hardware assets in an Outpost.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Basic
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Outposts.GetAssets.Invoke(new()
        ///     {
        ///         Arn = data.Aws_outposts_outpost.Example.Arn,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### With Host ID Filter
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Outposts.GetAssets.Invoke(new()
        ///     {
        ///         Arn = data.Aws_outposts_outpost.Example.Arn,
        ///         HostIdFilters = new[]
        ///         {
        ///             "h-x38g5n0yd2a0ueb61",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### With Status ID Filter
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Outposts.GetAssets.Invoke(new()
        ///     {
        ///         Arn = data.Aws_outposts_outpost.Example.Arn,
        ///         StatusIdFilters = new[]
        ///         {
        ///             "ACTIVE",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAssetsResult> InvokeAsync(GetAssetsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAssetsResult>("aws:outposts/getAssets:getAssets", args ?? new GetAssetsArgs(), options.WithDefaults());

        /// <summary>
        /// Information about hardware assets in an Outpost.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Basic
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Outposts.GetAssets.Invoke(new()
        ///     {
        ///         Arn = data.Aws_outposts_outpost.Example.Arn,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### With Host ID Filter
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Outposts.GetAssets.Invoke(new()
        ///     {
        ///         Arn = data.Aws_outposts_outpost.Example.Arn,
        ///         HostIdFilters = new[]
        ///         {
        ///             "h-x38g5n0yd2a0ueb61",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### With Status ID Filter
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Outposts.GetAssets.Invoke(new()
        ///     {
        ///         Arn = data.Aws_outposts_outpost.Example.Arn,
        ///         StatusIdFilters = new[]
        ///         {
        ///             "ACTIVE",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAssetsResult> Invoke(GetAssetsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAssetsResult>("aws:outposts/getAssets:getAssets", args ?? new GetAssetsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAssetsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Outpost ARN.
        /// </summary>
        [Input("arn", required: true)]
        public string Arn { get; set; } = null!;

        [Input("hostIdFilters")]
        private List<string>? _hostIdFilters;

        /// <summary>
        /// Filters by list of Host IDs of a Dedicated Host.
        /// </summary>
        public List<string> HostIdFilters
        {
            get => _hostIdFilters ?? (_hostIdFilters = new List<string>());
            set => _hostIdFilters = value;
        }

        [Input("statusIdFilters")]
        private List<string>? _statusIdFilters;

        /// <summary>
        /// Filters by list of state status. Valid values: "ACTIVE", "RETIRING".
        /// </summary>
        public List<string> StatusIdFilters
        {
            get => _statusIdFilters ?? (_statusIdFilters = new List<string>());
            set => _statusIdFilters = value;
        }

        public GetAssetsArgs()
        {
        }
        public static new GetAssetsArgs Empty => new GetAssetsArgs();
    }

    public sealed class GetAssetsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Outpost ARN.
        /// </summary>
        [Input("arn", required: true)]
        public Input<string> Arn { get; set; } = null!;

        [Input("hostIdFilters")]
        private InputList<string>? _hostIdFilters;

        /// <summary>
        /// Filters by list of Host IDs of a Dedicated Host.
        /// </summary>
        public InputList<string> HostIdFilters
        {
            get => _hostIdFilters ?? (_hostIdFilters = new InputList<string>());
            set => _hostIdFilters = value;
        }

        [Input("statusIdFilters")]
        private InputList<string>? _statusIdFilters;

        /// <summary>
        /// Filters by list of state status. Valid values: "ACTIVE", "RETIRING".
        /// </summary>
        public InputList<string> StatusIdFilters
        {
            get => _statusIdFilters ?? (_statusIdFilters = new InputList<string>());
            set => _statusIdFilters = value;
        }

        public GetAssetsInvokeArgs()
        {
        }
        public static new GetAssetsInvokeArgs Empty => new GetAssetsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAssetsResult
    {
        public readonly string Arn;
        /// <summary>
        /// List of all the asset ids found. This data source will fail if none are found.
        /// </summary>
        public readonly ImmutableArray<string> AssetIds;
        public readonly ImmutableArray<string> HostIdFilters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> StatusIdFilters;

        [OutputConstructor]
        private GetAssetsResult(
            string arn,

            ImmutableArray<string> assetIds,

            ImmutableArray<string> hostIdFilters,

            string id,

            ImmutableArray<string> statusIdFilters)
        {
            Arn = arn;
            AssetIds = assetIds;
            HostIdFilters = hostIdFilters;
            Id = id;
            StatusIdFilters = statusIdFilters;
        }
    }
}
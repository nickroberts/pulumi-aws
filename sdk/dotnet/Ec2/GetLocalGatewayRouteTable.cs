// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetLocalGatewayRouteTable
    {
        /// <summary>
        /// Provides details about an EC2 Local Gateway Route Table.
        /// 
        /// This data source can prove useful when a module accepts a local gateway route table id as
        /// an input variable and needs to, for example, find the associated Outpost or Local Gateway.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example returns a specific local gateway route table ID
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var config = new Config();
        ///         var awsEc2LocalGatewayRouteTable = config.RequireObject&lt;dynamic&gt;("awsEc2LocalGatewayRouteTable");
        ///         var selected = Output.Create(Aws.Ec2.GetLocalGatewayRouteTable.InvokeAsync(new Aws.Ec2.GetLocalGatewayRouteTableArgs
        ///         {
        ///             LocalGatewayRouteTableId = awsEc2LocalGatewayRouteTable,
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetLocalGatewayRouteTableResult> InvokeAsync(GetLocalGatewayRouteTableArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetLocalGatewayRouteTableResult>("aws:ec2/getLocalGatewayRouteTable:getLocalGatewayRouteTable", args ?? new GetLocalGatewayRouteTableArgs(), options.WithVersion());
    }


    public sealed class GetLocalGatewayRouteTableArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetLocalGatewayRouteTableFilterArgs>? _filters;
        public List<Inputs.GetLocalGatewayRouteTableFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetLocalGatewayRouteTableFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The id of the specific local gateway route table to retrieve.
        /// </summary>
        [Input("localGatewayId")]
        public string? LocalGatewayId { get; set; }

        /// <summary>
        /// Local Gateway Route Table Id assigned to desired local gateway route table
        /// </summary>
        [Input("localGatewayRouteTableId")]
        public string? LocalGatewayRouteTableId { get; set; }

        /// <summary>
        /// The arn of the Outpost the local gateway route table is associated with.
        /// </summary>
        [Input("outpostArn")]
        public string? OutpostArn { get; set; }

        /// <summary>
        /// The state of the local gateway route table.
        /// </summary>
        [Input("state")]
        public string? State { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// A mapping of tags, each pair of which must exactly match
        /// a pair on the desired local gateway route table.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        public GetLocalGatewayRouteTableArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetLocalGatewayRouteTableResult
    {
        public readonly ImmutableArray<Outputs.GetLocalGatewayRouteTableFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string LocalGatewayId;
        public readonly string LocalGatewayRouteTableId;
        public readonly string OutpostArn;
        public readonly string State;
        public readonly ImmutableDictionary<string, object> Tags;

        [OutputConstructor]
        private GetLocalGatewayRouteTableResult(
            ImmutableArray<Outputs.GetLocalGatewayRouteTableFilterResult> filters,

            string id,

            string localGatewayId,

            string localGatewayRouteTableId,

            string outpostArn,

            string state,

            ImmutableDictionary<string, object> tags)
        {
            Filters = filters;
            Id = id;
            LocalGatewayId = localGatewayId;
            LocalGatewayRouteTableId = localGatewayRouteTableId;
            OutpostArn = outpostArn;
            State = state;
            Tags = tags;
        }
    }
}
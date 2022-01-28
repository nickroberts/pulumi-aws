// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.Aws.Connect
{
    public static class GetContactFlowModule
    {
        /// <summary>
        /// Provides details about a specific Amazon Connect Contact Flow Module.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// By `name`
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.Connect.GetContactFlowModule.InvokeAsync(new Aws.Connect.GetContactFlowModuleArgs
        ///         {
        ///             InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
        ///             Name = "example",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// By `contact_flow_module_id`
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.Connect.GetContactFlowModule.InvokeAsync(new Aws.Connect.GetContactFlowModuleArgs
        ///         {
        ///             ContactFlowModuleId = "cccccccc-bbbb-cccc-dddd-111111111111",
        ///             InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetContactFlowModuleResult> InvokeAsync(GetContactFlowModuleArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetContactFlowModuleResult>("aws:connect/getContactFlowModule:getContactFlowModule", args ?? new GetContactFlowModuleArgs(), options.WithVersion());

        /// <summary>
        /// Provides details about a specific Amazon Connect Contact Flow Module.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// By `name`
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.Connect.GetContactFlowModule.InvokeAsync(new Aws.Connect.GetContactFlowModuleArgs
        ///         {
        ///             InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
        ///             Name = "example",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// By `contact_flow_module_id`
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.Connect.GetContactFlowModule.InvokeAsync(new Aws.Connect.GetContactFlowModuleArgs
        ///         {
        ///             ContactFlowModuleId = "cccccccc-bbbb-cccc-dddd-111111111111",
        ///             InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetContactFlowModuleResult> Invoke(GetContactFlowModuleInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetContactFlowModuleResult>("aws:connect/getContactFlowModule:getContactFlowModule", args ?? new GetContactFlowModuleInvokeArgs(), options.WithVersion());
    }


    public sealed class GetContactFlowModuleArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Returns information on a specific Contact Flow Module by contact flow module id
        /// </summary>
        [Input("contactFlowModuleId")]
        public string? ContactFlowModuleId { get; set; }

        /// <summary>
        /// Reference to the hosting Amazon Connect Instance
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// Returns information on a specific Contact Flow Module by name
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// A map of tags to assign to the Contact Flow Module.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetContactFlowModuleArgs()
        {
        }
    }

    public sealed class GetContactFlowModuleInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Returns information on a specific Contact Flow Module by contact flow module id
        /// </summary>
        [Input("contactFlowModuleId")]
        public Input<string>? ContactFlowModuleId { get; set; }

        /// <summary>
        /// Reference to the hosting Amazon Connect Instance
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// Returns information on a specific Contact Flow Module by name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the Contact Flow Module.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetContactFlowModuleInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetContactFlowModuleResult
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the Contact Flow Module.
        /// </summary>
        public readonly string Arn;
        public readonly string ContactFlowModuleId;
        /// <summary>
        /// Specifies the logic of the Contact Flow Module.
        /// </summary>
        public readonly string Content;
        /// <summary>
        /// Specifies the description of the Contact Flow Module.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string InstanceId;
        public readonly string Name;
        /// <summary>
        /// Specifies the type of Contact Flow Module Module. Values are either `ACTIVE` or `ARCHIVED`.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The status of the Contact Flow Module Module. Values are either `PUBLISHED` or `SAVED`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A map of tags to assign to the Contact Flow Module.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetContactFlowModuleResult(
            string arn,

            string contactFlowModuleId,

            string content,

            string description,

            string id,

            string instanceId,

            string name,

            string state,

            string status,

            ImmutableDictionary<string, string> tags)
        {
            Arn = arn;
            ContactFlowModuleId = contactFlowModuleId;
            Content = content;
            Description = description;
            Id = id;
            InstanceId = instanceId;
            Name = name;
            State = state;
            Status = status;
            Tags = tags;
        }
    }
}
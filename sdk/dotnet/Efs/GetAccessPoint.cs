// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Efs
{
    public static class GetAccessPoint
    {
        /// <summary>
        /// Provides information about an Elastic File System (EFS) Access Point.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var test = Output.Create(Aws.Efs.GetAccessPoint.InvokeAsync(new Aws.Efs.GetAccessPointArgs
        ///         {
        ///             AccessPointId = "fsap-12345678",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAccessPointResult> InvokeAsync(GetAccessPointArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAccessPointResult>("aws:efs/getAccessPoint:getAccessPoint", args ?? new GetAccessPointArgs(), options.WithVersion());
    }


    public sealed class GetAccessPointArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID that identifies the file system.
        /// </summary>
        [Input("accessPointId", required: true)]
        public string AccessPointId { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// Key-value mapping of resource tags.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        public GetAccessPointArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAccessPointResult
    {
        public readonly string AccessPointId;
        /// <summary>
        /// Amazon Resource Name of the file system.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Amazon Resource Name of the file system.
        /// </summary>
        public readonly string FileSystemArn;
        /// <summary>
        /// The ID of the file system for which the access point is intended.
        /// </summary>
        public readonly string FileSystemId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string OwnerId;
        /// <summary>
        /// Single element list containing operating system user and group applied to all file system requests made using the access point.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAccessPointPosixUserResult> PosixUsers;
        public readonly ImmutableArray<Outputs.GetAccessPointRootDirectoryResult> RootDirectories;
        /// <summary>
        /// Key-value mapping of resource tags.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Tags;

        [OutputConstructor]
        private GetAccessPointResult(
            string accessPointId,

            string arn,

            string fileSystemArn,

            string fileSystemId,

            string id,

            string ownerId,

            ImmutableArray<Outputs.GetAccessPointPosixUserResult> posixUsers,

            ImmutableArray<Outputs.GetAccessPointRootDirectoryResult> rootDirectories,

            ImmutableDictionary<string, object>? tags)
        {
            AccessPointId = accessPointId;
            Arn = arn;
            FileSystemArn = fileSystemArn;
            FileSystemId = fileSystemId;
            Id = id;
            OwnerId = ownerId;
            PosixUsers = posixUsers;
            RootDirectories = rootDirectories;
            Tags = tags;
        }
    }
}
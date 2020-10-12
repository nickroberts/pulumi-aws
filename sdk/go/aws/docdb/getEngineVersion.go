// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package docdb

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Information about a DocumentDB engine version.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v3/go/aws/docdb"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "3.6.0"
// 		_, err := docdb.GetEngineVersion(ctx, &docdb.GetEngineVersionArgs{
// 			Version: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetEngineVersion(ctx *pulumi.Context, args *GetEngineVersionArgs, opts ...pulumi.InvokeOption) (*GetEngineVersionResult, error) {
	var rv GetEngineVersionResult
	err := ctx.Invoke("aws:docdb/getEngineVersion:getEngineVersion", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEngineVersion.
type GetEngineVersionArgs struct {
	// DB engine. (Default: `docdb`)
	Engine *string `pulumi:"engine"`
	// The name of a specific DB parameter group family. An example parameter group family is `docdb3.6`.
	ParameterGroupFamily *string `pulumi:"parameterGroupFamily"`
	// Ordered list of preferred engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. If both the `version` and `preferredVersions` arguments are not configured, the data source will return the default version for the engine.
	PreferredVersions []string `pulumi:"preferredVersions"`
	// Version of the DB engine. For example, `3.6.0`. If `version` and `preferredVersions` are not set, the data source will provide information for the AWS-defined default version. If both the `version` and `preferredVersions` arguments are not configured, the data source will return the default version for the engine.
	Version *string `pulumi:"version"`
}

// A collection of values returned by getEngineVersion.
type GetEngineVersionResult struct {
	Engine *string `pulumi:"engine"`
	// The description of the database engine.
	EngineDescription string `pulumi:"engineDescription"`
	// Set of log types that the database engine has available for export to CloudWatch Logs.
	ExportableLogTypes []string `pulumi:"exportableLogTypes"`
	// The provider-assigned unique ID for this managed resource.
	Id                   string   `pulumi:"id"`
	ParameterGroupFamily string   `pulumi:"parameterGroupFamily"`
	PreferredVersions    []string `pulumi:"preferredVersions"`
	// Indicates whether the engine version supports exporting the log types specified by `exportableLogTypes` to CloudWatch Logs.
	SupportsLogExportsToCloudwatch bool `pulumi:"supportsLogExportsToCloudwatch"`
	// A set of engine versions that this database engine version can be upgraded to.
	ValidUpgradeTargets []string `pulumi:"validUpgradeTargets"`
	Version             string   `pulumi:"version"`
	// The description of the database engine version.
	VersionDescription string `pulumi:"versionDescription"`
}
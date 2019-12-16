// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package lambda

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Manages a Lambda Provisioned Concurrency Configuration.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-aws/blob/master/website/docs/r/lambda_provisioned_concurrency_config.html.markdown.
type ProvisionedConcurrencyConfig struct {
	s *pulumi.ResourceState
}

// NewProvisionedConcurrencyConfig registers a new resource with the given unique name, arguments, and options.
func NewProvisionedConcurrencyConfig(ctx *pulumi.Context,
	name string, args *ProvisionedConcurrencyConfigArgs, opts ...pulumi.ResourceOpt) (*ProvisionedConcurrencyConfig, error) {
	if args == nil || args.FunctionName == nil {
		return nil, errors.New("missing required argument 'FunctionName'")
	}
	if args == nil || args.ProvisionedConcurrentExecutions == nil {
		return nil, errors.New("missing required argument 'ProvisionedConcurrentExecutions'")
	}
	if args == nil || args.Qualifier == nil {
		return nil, errors.New("missing required argument 'Qualifier'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["functionName"] = nil
		inputs["provisionedConcurrentExecutions"] = nil
		inputs["qualifier"] = nil
	} else {
		inputs["functionName"] = args.FunctionName
		inputs["provisionedConcurrentExecutions"] = args.ProvisionedConcurrentExecutions
		inputs["qualifier"] = args.Qualifier
	}
	s, err := ctx.RegisterResource("aws:lambda/provisionedConcurrencyConfig:ProvisionedConcurrencyConfig", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &ProvisionedConcurrencyConfig{s: s}, nil
}

// GetProvisionedConcurrencyConfig gets an existing ProvisionedConcurrencyConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProvisionedConcurrencyConfig(ctx *pulumi.Context,
	name string, id pulumi.ID, state *ProvisionedConcurrencyConfigState, opts ...pulumi.ResourceOpt) (*ProvisionedConcurrencyConfig, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["functionName"] = state.FunctionName
		inputs["provisionedConcurrentExecutions"] = state.ProvisionedConcurrentExecutions
		inputs["qualifier"] = state.Qualifier
	}
	s, err := ctx.ReadResource("aws:lambda/provisionedConcurrencyConfig:ProvisionedConcurrencyConfig", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &ProvisionedConcurrencyConfig{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *ProvisionedConcurrencyConfig) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *ProvisionedConcurrencyConfig) ID() pulumi.IDOutput {
	return r.s.ID()
}

// Name or Amazon Resource Name (ARN) of the Lambda Function.
func (r *ProvisionedConcurrencyConfig) FunctionName() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["functionName"])
}

// Amount of capacity to allocate. Must be greater than or equal to `1`.
func (r *ProvisionedConcurrencyConfig) ProvisionedConcurrentExecutions() pulumi.IntOutput {
	return (pulumi.IntOutput)(r.s.State["provisionedConcurrentExecutions"])
}

// Lambda Function version or Lambda Alias name.
func (r *ProvisionedConcurrencyConfig) Qualifier() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["qualifier"])
}

// Input properties used for looking up and filtering ProvisionedConcurrencyConfig resources.
type ProvisionedConcurrencyConfigState struct {
	// Name or Amazon Resource Name (ARN) of the Lambda Function.
	FunctionName interface{}
	// Amount of capacity to allocate. Must be greater than or equal to `1`.
	ProvisionedConcurrentExecutions interface{}
	// Lambda Function version or Lambda Alias name.
	Qualifier interface{}
}

// The set of arguments for constructing a ProvisionedConcurrencyConfig resource.
type ProvisionedConcurrencyConfigArgs struct {
	// Name or Amazon Resource Name (ARN) of the Lambda Function.
	FunctionName interface{}
	// Amount of capacity to allocate. Must be greater than or equal to `1`.
	ProvisionedConcurrentExecutions interface{}
	// Lambda Function version or Lambda Alias name.
	Qualifier interface{}
}
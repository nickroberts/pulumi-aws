// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package redshiftserverless

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a new Amazon Redshift Serverless Resource Policy.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/redshiftserverless"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"Version": "2012-10-17",
//				"Statement": []map[string]interface{}{
//					map[string]interface{}{
//						"Effect": "Allow",
//						"Principal": map[string]interface{}{
//							"AWS": []string{
//								"12345678901",
//							},
//						},
//						"Action": []string{
//							"redshift-serverless:RestoreFromSnapshot",
//						},
//						"Sid": "",
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = redshiftserverless.NewResourcePolicy(ctx, "example", &redshiftserverless.ResourcePolicyArgs{
//				ResourceArn: pulumi.Any(aws_redshiftserverless_snapshot.Example.Arn),
//				Policy:      pulumi.String(json0),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Redshift Serverless Resource Policies can be imported using the `resource_arn`, e.g.,
//
// ```sh
//
//	$ pulumi import aws:redshiftserverless/resourcePolicy:ResourcePolicy example example
//
// ```
type ResourcePolicy struct {
	pulumi.CustomResourceState

	// The policy to create or update. For example, the following policy grants a user authorization to restore a snapshot.
	Policy pulumi.StringOutput `pulumi:"policy"`
	// The Amazon Resource Name (ARN) of the account to create or update a resource policy for.
	ResourceArn pulumi.StringOutput `pulumi:"resourceArn"`
}

// NewResourcePolicy registers a new resource with the given unique name, arguments, and options.
func NewResourcePolicy(ctx *pulumi.Context,
	name string, args *ResourcePolicyArgs, opts ...pulumi.ResourceOption) (*ResourcePolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	if args.ResourceArn == nil {
		return nil, errors.New("invalid value for required argument 'ResourceArn'")
	}
	var resource ResourcePolicy
	err := ctx.RegisterResource("aws:redshiftserverless/resourcePolicy:ResourcePolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourcePolicy gets an existing ResourcePolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourcePolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourcePolicyState, opts ...pulumi.ResourceOption) (*ResourcePolicy, error) {
	var resource ResourcePolicy
	err := ctx.ReadResource("aws:redshiftserverless/resourcePolicy:ResourcePolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResourcePolicy resources.
type resourcePolicyState struct {
	// The policy to create or update. For example, the following policy grants a user authorization to restore a snapshot.
	Policy *string `pulumi:"policy"`
	// The Amazon Resource Name (ARN) of the account to create or update a resource policy for.
	ResourceArn *string `pulumi:"resourceArn"`
}

type ResourcePolicyState struct {
	// The policy to create or update. For example, the following policy grants a user authorization to restore a snapshot.
	Policy pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of the account to create or update a resource policy for.
	ResourceArn pulumi.StringPtrInput
}

func (ResourcePolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourcePolicyState)(nil)).Elem()
}

type resourcePolicyArgs struct {
	// The policy to create or update. For example, the following policy grants a user authorization to restore a snapshot.
	Policy string `pulumi:"policy"`
	// The Amazon Resource Name (ARN) of the account to create or update a resource policy for.
	ResourceArn string `pulumi:"resourceArn"`
}

// The set of arguments for constructing a ResourcePolicy resource.
type ResourcePolicyArgs struct {
	// The policy to create or update. For example, the following policy grants a user authorization to restore a snapshot.
	Policy pulumi.StringInput
	// The Amazon Resource Name (ARN) of the account to create or update a resource policy for.
	ResourceArn pulumi.StringInput
}

func (ResourcePolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourcePolicyArgs)(nil)).Elem()
}

type ResourcePolicyInput interface {
	pulumi.Input

	ToResourcePolicyOutput() ResourcePolicyOutput
	ToResourcePolicyOutputWithContext(ctx context.Context) ResourcePolicyOutput
}

func (*ResourcePolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourcePolicy)(nil)).Elem()
}

func (i *ResourcePolicy) ToResourcePolicyOutput() ResourcePolicyOutput {
	return i.ToResourcePolicyOutputWithContext(context.Background())
}

func (i *ResourcePolicy) ToResourcePolicyOutputWithContext(ctx context.Context) ResourcePolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourcePolicyOutput)
}

// ResourcePolicyArrayInput is an input type that accepts ResourcePolicyArray and ResourcePolicyArrayOutput values.
// You can construct a concrete instance of `ResourcePolicyArrayInput` via:
//
//	ResourcePolicyArray{ ResourcePolicyArgs{...} }
type ResourcePolicyArrayInput interface {
	pulumi.Input

	ToResourcePolicyArrayOutput() ResourcePolicyArrayOutput
	ToResourcePolicyArrayOutputWithContext(context.Context) ResourcePolicyArrayOutput
}

type ResourcePolicyArray []ResourcePolicyInput

func (ResourcePolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourcePolicy)(nil)).Elem()
}

func (i ResourcePolicyArray) ToResourcePolicyArrayOutput() ResourcePolicyArrayOutput {
	return i.ToResourcePolicyArrayOutputWithContext(context.Background())
}

func (i ResourcePolicyArray) ToResourcePolicyArrayOutputWithContext(ctx context.Context) ResourcePolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourcePolicyArrayOutput)
}

// ResourcePolicyMapInput is an input type that accepts ResourcePolicyMap and ResourcePolicyMapOutput values.
// You can construct a concrete instance of `ResourcePolicyMapInput` via:
//
//	ResourcePolicyMap{ "key": ResourcePolicyArgs{...} }
type ResourcePolicyMapInput interface {
	pulumi.Input

	ToResourcePolicyMapOutput() ResourcePolicyMapOutput
	ToResourcePolicyMapOutputWithContext(context.Context) ResourcePolicyMapOutput
}

type ResourcePolicyMap map[string]ResourcePolicyInput

func (ResourcePolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourcePolicy)(nil)).Elem()
}

func (i ResourcePolicyMap) ToResourcePolicyMapOutput() ResourcePolicyMapOutput {
	return i.ToResourcePolicyMapOutputWithContext(context.Background())
}

func (i ResourcePolicyMap) ToResourcePolicyMapOutputWithContext(ctx context.Context) ResourcePolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourcePolicyMapOutput)
}

type ResourcePolicyOutput struct{ *pulumi.OutputState }

func (ResourcePolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourcePolicy)(nil)).Elem()
}

func (o ResourcePolicyOutput) ToResourcePolicyOutput() ResourcePolicyOutput {
	return o
}

func (o ResourcePolicyOutput) ToResourcePolicyOutputWithContext(ctx context.Context) ResourcePolicyOutput {
	return o
}

// The policy to create or update. For example, the following policy grants a user authorization to restore a snapshot.
func (o ResourcePolicyOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourcePolicy) pulumi.StringOutput { return v.Policy }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) of the account to create or update a resource policy for.
func (o ResourcePolicyOutput) ResourceArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourcePolicy) pulumi.StringOutput { return v.ResourceArn }).(pulumi.StringOutput)
}

type ResourcePolicyArrayOutput struct{ *pulumi.OutputState }

func (ResourcePolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourcePolicy)(nil)).Elem()
}

func (o ResourcePolicyArrayOutput) ToResourcePolicyArrayOutput() ResourcePolicyArrayOutput {
	return o
}

func (o ResourcePolicyArrayOutput) ToResourcePolicyArrayOutputWithContext(ctx context.Context) ResourcePolicyArrayOutput {
	return o
}

func (o ResourcePolicyArrayOutput) Index(i pulumi.IntInput) ResourcePolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResourcePolicy {
		return vs[0].([]*ResourcePolicy)[vs[1].(int)]
	}).(ResourcePolicyOutput)
}

type ResourcePolicyMapOutput struct{ *pulumi.OutputState }

func (ResourcePolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourcePolicy)(nil)).Elem()
}

func (o ResourcePolicyMapOutput) ToResourcePolicyMapOutput() ResourcePolicyMapOutput {
	return o
}

func (o ResourcePolicyMapOutput) ToResourcePolicyMapOutputWithContext(ctx context.Context) ResourcePolicyMapOutput {
	return o
}

func (o ResourcePolicyMapOutput) MapIndex(k pulumi.StringInput) ResourcePolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResourcePolicy {
		return vs[0].(map[string]*ResourcePolicy)[vs[1].(string)]
	}).(ResourcePolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourcePolicyInput)(nil)).Elem(), &ResourcePolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourcePolicyArrayInput)(nil)).Elem(), ResourcePolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourcePolicyMapInput)(nil)).Elem(), ResourcePolicyMap{})
	pulumi.RegisterOutputType(ResourcePolicyOutput{})
	pulumi.RegisterOutputType(ResourcePolicyArrayOutput{})
	pulumi.RegisterOutputType(ResourcePolicyMapOutput{})
}
// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package applicationinsights

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ApplicationInsights Application resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/applicationinsights"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/resourcegroups"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleGroup, err := resourcegroups.NewGroup(ctx, "exampleGroup", &resourcegroups.GroupArgs{
//				ResourceQuery: &resourcegroups.GroupResourceQueryArgs{
//					Query: pulumi.String(fmt.Sprintf(`	{
//			"ResourceTypeFilters": [
//			  "AWS::EC2::Instance"
//			],
//			"TagFilters": [
//			  {
//				"Key": "Stage",
//				"Values": [
//				  "Test"
//				]
//			  }
//			]
//		  }
//
// `)),
//
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = applicationinsights.NewApplication(ctx, "exampleApplication", &applicationinsights.ApplicationArgs{
//				ResourceGroupName: exampleGroup.Name,
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
// ApplicationInsights Applications can be imported using the `resource_group_name`, e.g.,
//
// ```sh
//
//	$ pulumi import aws:applicationinsights/application:Application some some-application
//
// ```
type Application struct {
	pulumi.CustomResourceState

	// ARN of the Application.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Indicates whether Application Insights automatically configures unmonitored resources in the resource group.
	AutoConfigEnabled pulumi.BoolPtrOutput `pulumi:"autoConfigEnabled"`
	// Configures all of the resources in the resource group by applying the recommended configurations.
	AutoCreate pulumi.BoolPtrOutput `pulumi:"autoCreate"`
	// Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as instance terminated, failed deployment, and others.
	CweMonitorEnabled pulumi.BoolPtrOutput `pulumi:"cweMonitorEnabled"`
	// Application Insights can create applications based on a resource group or on an account. To create an account-based application using all of the resources in the account, set this parameter to `ACCOUNT_BASED`.
	GroupingType pulumi.StringPtrOutput `pulumi:"groupingType"`
	// When set to `true`, creates opsItems for any problems detected on an application.
	OpsCenterEnabled pulumi.BoolPtrOutput `pulumi:"opsCenterEnabled"`
	// SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive notifications for updates to the opsItem.
	OpsItemSnsTopicArn pulumi.StringPtrOutput `pulumi:"opsItemSnsTopicArn"`
	// Name of the resource group.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewApplication registers a new resource with the given unique name, arguments, and options.
func NewApplication(ctx *pulumi.Context,
	name string, args *ApplicationArgs, opts ...pulumi.ResourceOption) (*Application, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	var resource Application
	err := ctx.RegisterResource("aws:applicationinsights/application:Application", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplication gets an existing Application resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplication(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplicationState, opts ...pulumi.ResourceOption) (*Application, error) {
	var resource Application
	err := ctx.ReadResource("aws:applicationinsights/application:Application", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Application resources.
type applicationState struct {
	// ARN of the Application.
	Arn *string `pulumi:"arn"`
	// Indicates whether Application Insights automatically configures unmonitored resources in the resource group.
	AutoConfigEnabled *bool `pulumi:"autoConfigEnabled"`
	// Configures all of the resources in the resource group by applying the recommended configurations.
	AutoCreate *bool `pulumi:"autoCreate"`
	// Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as instance terminated, failed deployment, and others.
	CweMonitorEnabled *bool `pulumi:"cweMonitorEnabled"`
	// Application Insights can create applications based on a resource group or on an account. To create an account-based application using all of the resources in the account, set this parameter to `ACCOUNT_BASED`.
	GroupingType *string `pulumi:"groupingType"`
	// When set to `true`, creates opsItems for any problems detected on an application.
	OpsCenterEnabled *bool `pulumi:"opsCenterEnabled"`
	// SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive notifications for updates to the opsItem.
	OpsItemSnsTopicArn *string `pulumi:"opsItemSnsTopicArn"`
	// Name of the resource group.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ApplicationState struct {
	// ARN of the Application.
	Arn pulumi.StringPtrInput
	// Indicates whether Application Insights automatically configures unmonitored resources in the resource group.
	AutoConfigEnabled pulumi.BoolPtrInput
	// Configures all of the resources in the resource group by applying the recommended configurations.
	AutoCreate pulumi.BoolPtrInput
	// Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as instance terminated, failed deployment, and others.
	CweMonitorEnabled pulumi.BoolPtrInput
	// Application Insights can create applications based on a resource group or on an account. To create an account-based application using all of the resources in the account, set this parameter to `ACCOUNT_BASED`.
	GroupingType pulumi.StringPtrInput
	// When set to `true`, creates opsItems for any problems detected on an application.
	OpsCenterEnabled pulumi.BoolPtrInput
	// SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive notifications for updates to the opsItem.
	OpsItemSnsTopicArn pulumi.StringPtrInput
	// Name of the resource group.
	ResourceGroupName pulumi.StringPtrInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (ApplicationState) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationState)(nil)).Elem()
}

type applicationArgs struct {
	// Indicates whether Application Insights automatically configures unmonitored resources in the resource group.
	AutoConfigEnabled *bool `pulumi:"autoConfigEnabled"`
	// Configures all of the resources in the resource group by applying the recommended configurations.
	AutoCreate *bool `pulumi:"autoCreate"`
	// Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as instance terminated, failed deployment, and others.
	CweMonitorEnabled *bool `pulumi:"cweMonitorEnabled"`
	// Application Insights can create applications based on a resource group or on an account. To create an account-based application using all of the resources in the account, set this parameter to `ACCOUNT_BASED`.
	GroupingType *string `pulumi:"groupingType"`
	// When set to `true`, creates opsItems for any problems detected on an application.
	OpsCenterEnabled *bool `pulumi:"opsCenterEnabled"`
	// SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive notifications for updates to the opsItem.
	OpsItemSnsTopicArn *string `pulumi:"opsItemSnsTopicArn"`
	// Name of the resource group.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Application resource.
type ApplicationArgs struct {
	// Indicates whether Application Insights automatically configures unmonitored resources in the resource group.
	AutoConfigEnabled pulumi.BoolPtrInput
	// Configures all of the resources in the resource group by applying the recommended configurations.
	AutoCreate pulumi.BoolPtrInput
	// Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as instance terminated, failed deployment, and others.
	CweMonitorEnabled pulumi.BoolPtrInput
	// Application Insights can create applications based on a resource group or on an account. To create an account-based application using all of the resources in the account, set this parameter to `ACCOUNT_BASED`.
	GroupingType pulumi.StringPtrInput
	// When set to `true`, creates opsItems for any problems detected on an application.
	OpsCenterEnabled pulumi.BoolPtrInput
	// SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive notifications for updates to the opsItem.
	OpsItemSnsTopicArn pulumi.StringPtrInput
	// Name of the resource group.
	ResourceGroupName pulumi.StringInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ApplicationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationArgs)(nil)).Elem()
}

type ApplicationInput interface {
	pulumi.Input

	ToApplicationOutput() ApplicationOutput
	ToApplicationOutputWithContext(ctx context.Context) ApplicationOutput
}

func (*Application) ElementType() reflect.Type {
	return reflect.TypeOf((**Application)(nil)).Elem()
}

func (i *Application) ToApplicationOutput() ApplicationOutput {
	return i.ToApplicationOutputWithContext(context.Background())
}

func (i *Application) ToApplicationOutputWithContext(ctx context.Context) ApplicationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationOutput)
}

// ApplicationArrayInput is an input type that accepts ApplicationArray and ApplicationArrayOutput values.
// You can construct a concrete instance of `ApplicationArrayInput` via:
//
//	ApplicationArray{ ApplicationArgs{...} }
type ApplicationArrayInput interface {
	pulumi.Input

	ToApplicationArrayOutput() ApplicationArrayOutput
	ToApplicationArrayOutputWithContext(context.Context) ApplicationArrayOutput
}

type ApplicationArray []ApplicationInput

func (ApplicationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Application)(nil)).Elem()
}

func (i ApplicationArray) ToApplicationArrayOutput() ApplicationArrayOutput {
	return i.ToApplicationArrayOutputWithContext(context.Background())
}

func (i ApplicationArray) ToApplicationArrayOutputWithContext(ctx context.Context) ApplicationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationArrayOutput)
}

// ApplicationMapInput is an input type that accepts ApplicationMap and ApplicationMapOutput values.
// You can construct a concrete instance of `ApplicationMapInput` via:
//
//	ApplicationMap{ "key": ApplicationArgs{...} }
type ApplicationMapInput interface {
	pulumi.Input

	ToApplicationMapOutput() ApplicationMapOutput
	ToApplicationMapOutputWithContext(context.Context) ApplicationMapOutput
}

type ApplicationMap map[string]ApplicationInput

func (ApplicationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Application)(nil)).Elem()
}

func (i ApplicationMap) ToApplicationMapOutput() ApplicationMapOutput {
	return i.ToApplicationMapOutputWithContext(context.Background())
}

func (i ApplicationMap) ToApplicationMapOutputWithContext(ctx context.Context) ApplicationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationMapOutput)
}

type ApplicationOutput struct{ *pulumi.OutputState }

func (ApplicationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Application)(nil)).Elem()
}

func (o ApplicationOutput) ToApplicationOutput() ApplicationOutput {
	return o
}

func (o ApplicationOutput) ToApplicationOutputWithContext(ctx context.Context) ApplicationOutput {
	return o
}

// ARN of the Application.
func (o ApplicationOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Application) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Indicates whether Application Insights automatically configures unmonitored resources in the resource group.
func (o ApplicationOutput) AutoConfigEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Application) pulumi.BoolPtrOutput { return v.AutoConfigEnabled }).(pulumi.BoolPtrOutput)
}

// Configures all of the resources in the resource group by applying the recommended configurations.
func (o ApplicationOutput) AutoCreate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Application) pulumi.BoolPtrOutput { return v.AutoCreate }).(pulumi.BoolPtrOutput)
}

// Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as instance terminated, failed deployment, and others.
func (o ApplicationOutput) CweMonitorEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Application) pulumi.BoolPtrOutput { return v.CweMonitorEnabled }).(pulumi.BoolPtrOutput)
}

// Application Insights can create applications based on a resource group or on an account. To create an account-based application using all of the resources in the account, set this parameter to `ACCOUNT_BASED`.
func (o ApplicationOutput) GroupingType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Application) pulumi.StringPtrOutput { return v.GroupingType }).(pulumi.StringPtrOutput)
}

// When set to `true`, creates opsItems for any problems detected on an application.
func (o ApplicationOutput) OpsCenterEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Application) pulumi.BoolPtrOutput { return v.OpsCenterEnabled }).(pulumi.BoolPtrOutput)
}

// SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive notifications for updates to the opsItem.
func (o ApplicationOutput) OpsItemSnsTopicArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Application) pulumi.StringPtrOutput { return v.OpsItemSnsTopicArn }).(pulumi.StringPtrOutput)
}

// Name of the resource group.
func (o ApplicationOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Application) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ApplicationOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Application) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o ApplicationOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Application) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ApplicationArrayOutput struct{ *pulumi.OutputState }

func (ApplicationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Application)(nil)).Elem()
}

func (o ApplicationArrayOutput) ToApplicationArrayOutput() ApplicationArrayOutput {
	return o
}

func (o ApplicationArrayOutput) ToApplicationArrayOutputWithContext(ctx context.Context) ApplicationArrayOutput {
	return o
}

func (o ApplicationArrayOutput) Index(i pulumi.IntInput) ApplicationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Application {
		return vs[0].([]*Application)[vs[1].(int)]
	}).(ApplicationOutput)
}

type ApplicationMapOutput struct{ *pulumi.OutputState }

func (ApplicationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Application)(nil)).Elem()
}

func (o ApplicationMapOutput) ToApplicationMapOutput() ApplicationMapOutput {
	return o
}

func (o ApplicationMapOutput) ToApplicationMapOutputWithContext(ctx context.Context) ApplicationMapOutput {
	return o
}

func (o ApplicationMapOutput) MapIndex(k pulumi.StringInput) ApplicationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Application {
		return vs[0].(map[string]*Application)[vs[1].(string)]
	}).(ApplicationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationInput)(nil)).Elem(), &Application{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationArrayInput)(nil)).Elem(), ApplicationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationMapInput)(nil)).Elem(), ApplicationMap{})
	pulumi.RegisterOutputType(ApplicationOutput{})
	pulumi.RegisterOutputType(ApplicationArrayOutput{})
	pulumi.RegisterOutputType(ApplicationMapOutput{})
}
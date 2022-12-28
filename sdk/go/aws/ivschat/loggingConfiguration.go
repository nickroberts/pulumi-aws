// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ivschat

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS IVS (Interactive Video) Chat Logging Configuration.
//
// ## Example Usage
// ### Basic Usage - Logging to CloudWatch
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cloudwatch"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ivschat"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleLogGroup, err := cloudwatch.NewLogGroup(ctx, "exampleLogGroup", nil)
//			if err != nil {
//				return err
//			}
//			_, err = ivschat.NewLoggingConfiguration(ctx, "exampleLoggingConfiguration", &ivschat.LoggingConfigurationArgs{
//				DestinationConfiguration: &ivschat.LoggingConfigurationDestinationConfigurationArgs{
//					CloudwatchLogs: &ivschat.LoggingConfigurationDestinationConfigurationCloudwatchLogsArgs{
//						LogGroupName: exampleLogGroup.Name,
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Basic Usage - Logging to Kinesis Firehose with Extended S3
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ivschat"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/kinesis"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/s3"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleBucketV2, err := s3.NewBucketV2(ctx, "exampleBucketV2", &s3.BucketV2Args{
//				BucketPrefix: pulumi.String("tf-ivschat-logging-bucket"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleRole, err := iam.NewRole(ctx, "exampleRole", &iam.RoleArgs{
//				AssumeRolePolicy: pulumi.Any(fmt.Sprintf(`{
//	  "Version": "2012-10-17",
//	  "Statement": [
//	    {
//	      "Action": "sts:AssumeRole",
//	      "Principal": {
//	        "Service": "firehose.amazonaws.com"
//	      },
//	      "Effect": "Allow",
//	      "Sid": ""
//	    }
//	  ]
//	}
//
// `)),
//
//			})
//			if err != nil {
//				return err
//			}
//			exampleFirehoseDeliveryStream, err := kinesis.NewFirehoseDeliveryStream(ctx, "exampleFirehoseDeliveryStream", &kinesis.FirehoseDeliveryStreamArgs{
//				Destination: pulumi.String("extended_s3"),
//				ExtendedS3Configuration: &kinesis.FirehoseDeliveryStreamExtendedS3ConfigurationArgs{
//					RoleArn:   exampleRole.Arn,
//					BucketArn: exampleBucketV2.Arn,
//				},
//				Tags: pulumi.StringMap{
//					"LogDeliveryEnabled": pulumi.String("true"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = s3.NewBucketAclV2(ctx, "exampleBucketAclV2", &s3.BucketAclV2Args{
//				Bucket: exampleBucketV2.ID(),
//				Acl:    pulumi.String("private"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ivschat.NewLoggingConfiguration(ctx, "exampleLoggingConfiguration", &ivschat.LoggingConfigurationArgs{
//				DestinationConfiguration: &ivschat.LoggingConfigurationDestinationConfigurationArgs{
//					Firehose: &ivschat.LoggingConfigurationDestinationConfigurationFirehoseArgs{
//						DeliveryStreamName: exampleFirehoseDeliveryStream.Name,
//					},
//				},
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
// IVS (Interactive Video) Chat Logging Configuration can be imported using the ARN, e.g.,
//
// ```sh
//
//	$ pulumi import aws:ivschat/loggingConfiguration:LoggingConfiguration example arn:aws:ivschat:us-west-2:326937407773:logging-configuration/MMUQc8wcqZmC
//
// ```
type LoggingConfiguration struct {
	pulumi.CustomResourceState

	// ARN of the Logging Configuration.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Object containing destination configuration for where chat activity will be logged. This object must contain exactly one of the following children arguments:
	DestinationConfiguration LoggingConfigurationDestinationConfigurationPtrOutput `pulumi:"destinationConfiguration"`
	// Logging Configuration name.
	Name pulumi.StringOutput `pulumi:"name"`
	// State of the Logging Configuration.
	State pulumi.StringOutput `pulumi:"state"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewLoggingConfiguration registers a new resource with the given unique name, arguments, and options.
func NewLoggingConfiguration(ctx *pulumi.Context,
	name string, args *LoggingConfigurationArgs, opts ...pulumi.ResourceOption) (*LoggingConfiguration, error) {
	if args == nil {
		args = &LoggingConfigurationArgs{}
	}

	var resource LoggingConfiguration
	err := ctx.RegisterResource("aws:ivschat/loggingConfiguration:LoggingConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoggingConfiguration gets an existing LoggingConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoggingConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoggingConfigurationState, opts ...pulumi.ResourceOption) (*LoggingConfiguration, error) {
	var resource LoggingConfiguration
	err := ctx.ReadResource("aws:ivschat/loggingConfiguration:LoggingConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoggingConfiguration resources.
type loggingConfigurationState struct {
	// ARN of the Logging Configuration.
	Arn *string `pulumi:"arn"`
	// Object containing destination configuration for where chat activity will be logged. This object must contain exactly one of the following children arguments:
	DestinationConfiguration *LoggingConfigurationDestinationConfiguration `pulumi:"destinationConfiguration"`
	// Logging Configuration name.
	Name *string `pulumi:"name"`
	// State of the Logging Configuration.
	State *string `pulumi:"state"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type LoggingConfigurationState struct {
	// ARN of the Logging Configuration.
	Arn pulumi.StringPtrInput
	// Object containing destination configuration for where chat activity will be logged. This object must contain exactly one of the following children arguments:
	DestinationConfiguration LoggingConfigurationDestinationConfigurationPtrInput
	// Logging Configuration name.
	Name pulumi.StringPtrInput
	// State of the Logging Configuration.
	State pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (LoggingConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*loggingConfigurationState)(nil)).Elem()
}

type loggingConfigurationArgs struct {
	// Object containing destination configuration for where chat activity will be logged. This object must contain exactly one of the following children arguments:
	DestinationConfiguration *LoggingConfigurationDestinationConfiguration `pulumi:"destinationConfiguration"`
	// Logging Configuration name.
	Name *string `pulumi:"name"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a LoggingConfiguration resource.
type LoggingConfigurationArgs struct {
	// Object containing destination configuration for where chat activity will be logged. This object must contain exactly one of the following children arguments:
	DestinationConfiguration LoggingConfigurationDestinationConfigurationPtrInput
	// Logging Configuration name.
	Name pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (LoggingConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loggingConfigurationArgs)(nil)).Elem()
}

type LoggingConfigurationInput interface {
	pulumi.Input

	ToLoggingConfigurationOutput() LoggingConfigurationOutput
	ToLoggingConfigurationOutputWithContext(ctx context.Context) LoggingConfigurationOutput
}

func (*LoggingConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**LoggingConfiguration)(nil)).Elem()
}

func (i *LoggingConfiguration) ToLoggingConfigurationOutput() LoggingConfigurationOutput {
	return i.ToLoggingConfigurationOutputWithContext(context.Background())
}

func (i *LoggingConfiguration) ToLoggingConfigurationOutputWithContext(ctx context.Context) LoggingConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoggingConfigurationOutput)
}

// LoggingConfigurationArrayInput is an input type that accepts LoggingConfigurationArray and LoggingConfigurationArrayOutput values.
// You can construct a concrete instance of `LoggingConfigurationArrayInput` via:
//
//	LoggingConfigurationArray{ LoggingConfigurationArgs{...} }
type LoggingConfigurationArrayInput interface {
	pulumi.Input

	ToLoggingConfigurationArrayOutput() LoggingConfigurationArrayOutput
	ToLoggingConfigurationArrayOutputWithContext(context.Context) LoggingConfigurationArrayOutput
}

type LoggingConfigurationArray []LoggingConfigurationInput

func (LoggingConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoggingConfiguration)(nil)).Elem()
}

func (i LoggingConfigurationArray) ToLoggingConfigurationArrayOutput() LoggingConfigurationArrayOutput {
	return i.ToLoggingConfigurationArrayOutputWithContext(context.Background())
}

func (i LoggingConfigurationArray) ToLoggingConfigurationArrayOutputWithContext(ctx context.Context) LoggingConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoggingConfigurationArrayOutput)
}

// LoggingConfigurationMapInput is an input type that accepts LoggingConfigurationMap and LoggingConfigurationMapOutput values.
// You can construct a concrete instance of `LoggingConfigurationMapInput` via:
//
//	LoggingConfigurationMap{ "key": LoggingConfigurationArgs{...} }
type LoggingConfigurationMapInput interface {
	pulumi.Input

	ToLoggingConfigurationMapOutput() LoggingConfigurationMapOutput
	ToLoggingConfigurationMapOutputWithContext(context.Context) LoggingConfigurationMapOutput
}

type LoggingConfigurationMap map[string]LoggingConfigurationInput

func (LoggingConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoggingConfiguration)(nil)).Elem()
}

func (i LoggingConfigurationMap) ToLoggingConfigurationMapOutput() LoggingConfigurationMapOutput {
	return i.ToLoggingConfigurationMapOutputWithContext(context.Background())
}

func (i LoggingConfigurationMap) ToLoggingConfigurationMapOutputWithContext(ctx context.Context) LoggingConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoggingConfigurationMapOutput)
}

type LoggingConfigurationOutput struct{ *pulumi.OutputState }

func (LoggingConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoggingConfiguration)(nil)).Elem()
}

func (o LoggingConfigurationOutput) ToLoggingConfigurationOutput() LoggingConfigurationOutput {
	return o
}

func (o LoggingConfigurationOutput) ToLoggingConfigurationOutputWithContext(ctx context.Context) LoggingConfigurationOutput {
	return o
}

// ARN of the Logging Configuration.
func (o LoggingConfigurationOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *LoggingConfiguration) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Object containing destination configuration for where chat activity will be logged. This object must contain exactly one of the following children arguments:
func (o LoggingConfigurationOutput) DestinationConfiguration() LoggingConfigurationDestinationConfigurationPtrOutput {
	return o.ApplyT(func(v *LoggingConfiguration) LoggingConfigurationDestinationConfigurationPtrOutput {
		return v.DestinationConfiguration
	}).(LoggingConfigurationDestinationConfigurationPtrOutput)
}

// Logging Configuration name.
func (o LoggingConfigurationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LoggingConfiguration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// State of the Logging Configuration.
func (o LoggingConfigurationOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *LoggingConfiguration) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o LoggingConfigurationOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LoggingConfiguration) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o LoggingConfigurationOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LoggingConfiguration) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type LoggingConfigurationArrayOutput struct{ *pulumi.OutputState }

func (LoggingConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoggingConfiguration)(nil)).Elem()
}

func (o LoggingConfigurationArrayOutput) ToLoggingConfigurationArrayOutput() LoggingConfigurationArrayOutput {
	return o
}

func (o LoggingConfigurationArrayOutput) ToLoggingConfigurationArrayOutputWithContext(ctx context.Context) LoggingConfigurationArrayOutput {
	return o
}

func (o LoggingConfigurationArrayOutput) Index(i pulumi.IntInput) LoggingConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoggingConfiguration {
		return vs[0].([]*LoggingConfiguration)[vs[1].(int)]
	}).(LoggingConfigurationOutput)
}

type LoggingConfigurationMapOutput struct{ *pulumi.OutputState }

func (LoggingConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoggingConfiguration)(nil)).Elem()
}

func (o LoggingConfigurationMapOutput) ToLoggingConfigurationMapOutput() LoggingConfigurationMapOutput {
	return o
}

func (o LoggingConfigurationMapOutput) ToLoggingConfigurationMapOutputWithContext(ctx context.Context) LoggingConfigurationMapOutput {
	return o
}

func (o LoggingConfigurationMapOutput) MapIndex(k pulumi.StringInput) LoggingConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoggingConfiguration {
		return vs[0].(map[string]*LoggingConfiguration)[vs[1].(string)]
	}).(LoggingConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoggingConfigurationInput)(nil)).Elem(), &LoggingConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoggingConfigurationArrayInput)(nil)).Elem(), LoggingConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoggingConfigurationMapInput)(nil)).Elem(), LoggingConfigurationMap{})
	pulumi.RegisterOutputType(LoggingConfigurationOutput{})
	pulumi.RegisterOutputType(LoggingConfigurationArrayOutput{})
	pulumi.RegisterOutputType(LoggingConfigurationMapOutput{})
}
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package imagebuilder

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages an Image Builder Image Recipe.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v3/go/aws/imagebuilder"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := imagebuilder.NewImageRecipe(ctx, "example", &imagebuilder.ImageRecipeArgs{
// 			BlockDeviceMappings: imagebuilder.ImageRecipeBlockDeviceMappingArray{
// 				&imagebuilder.ImageRecipeBlockDeviceMappingArgs{
// 					DeviceName: pulumi.String("/dev/xvdb"),
// 					Ebs: &imagebuilder.ImageRecipeBlockDeviceMappingEbsArgs{
// 						DeleteOnTermination: pulumi.String("true"),
// 						VolumeSize:          pulumi.Int(100),
// 						VolumeType:          pulumi.String("gp2"),
// 					},
// 				},
// 			},
// 			Components: imagebuilder.ImageRecipeComponentArray{
// 				&imagebuilder.ImageRecipeComponentArgs{
// 					ComponentArn: pulumi.Any(aws_imagebuilder_component.Example.Arn),
// 				},
// 			},
// 			ParentImage: pulumi.String(fmt.Sprintf("%v%v%v%v%v", "arn:", data.Aws_partition.Current.Partition, ":imagebuilder:", data.Aws_region.Current.Name, ":aws:image/amazon-linux-2-x86/x.x.x")),
// 			Version:     pulumi.String("1.0.0"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// `aws_imagebuilder_image_recipe` resources can be imported by using the Amazon Resource Name (ARN), e.g.
//
// ```sh
//  $ pulumi import aws:imagebuilder/imageRecipe:ImageRecipe example arn:aws:imagebuilder:us-east-1:123456789012:image-recipe/example/1.0.0
// ```
type ImageRecipe struct {
	pulumi.CustomResourceState

	// (Required) Amazon Resource Name (ARN) of the image recipe.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Configuration block(s) with block device mappings for the the image recipe. Detailed below.
	BlockDeviceMappings ImageRecipeBlockDeviceMappingArrayOutput `pulumi:"blockDeviceMappings"`
	// Configuration block(s) with components for the image recipe. Detailed below.
	Components ImageRecipeComponentArrayOutput `pulumi:"components"`
	// Date the image recipe was created.
	DateCreated pulumi.StringOutput `pulumi:"dateCreated"`
	// Description of the image recipe.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of the image recipe.
	Name pulumi.StringOutput `pulumi:"name"`
	// Owner of the image recipe.
	Owner pulumi.StringOutput `pulumi:"owner"`
	// Platform of the image recipe.
	ParentImage pulumi.StringOutput `pulumi:"parentImage"`
	// Platform of the image recipe.
	Platform pulumi.StringOutput `pulumi:"platform"`
	// Key-value map of resource tags for the image recipe.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Version of the image recipe.
	Version pulumi.StringOutput `pulumi:"version"`
}

// NewImageRecipe registers a new resource with the given unique name, arguments, and options.
func NewImageRecipe(ctx *pulumi.Context,
	name string, args *ImageRecipeArgs, opts ...pulumi.ResourceOption) (*ImageRecipe, error) {
	if args == nil || args.Components == nil {
		return nil, errors.New("missing required argument 'Components'")
	}
	if args == nil || args.ParentImage == nil {
		return nil, errors.New("missing required argument 'ParentImage'")
	}
	if args == nil || args.Version == nil {
		return nil, errors.New("missing required argument 'Version'")
	}
	if args == nil {
		args = &ImageRecipeArgs{}
	}
	var resource ImageRecipe
	err := ctx.RegisterResource("aws:imagebuilder/imageRecipe:ImageRecipe", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetImageRecipe gets an existing ImageRecipe resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetImageRecipe(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ImageRecipeState, opts ...pulumi.ResourceOption) (*ImageRecipe, error) {
	var resource ImageRecipe
	err := ctx.ReadResource("aws:imagebuilder/imageRecipe:ImageRecipe", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ImageRecipe resources.
type imageRecipeState struct {
	// (Required) Amazon Resource Name (ARN) of the image recipe.
	Arn *string `pulumi:"arn"`
	// Configuration block(s) with block device mappings for the the image recipe. Detailed below.
	BlockDeviceMappings []ImageRecipeBlockDeviceMapping `pulumi:"blockDeviceMappings"`
	// Configuration block(s) with components for the image recipe. Detailed below.
	Components []ImageRecipeComponent `pulumi:"components"`
	// Date the image recipe was created.
	DateCreated *string `pulumi:"dateCreated"`
	// Description of the image recipe.
	Description *string `pulumi:"description"`
	// Name of the image recipe.
	Name *string `pulumi:"name"`
	// Owner of the image recipe.
	Owner *string `pulumi:"owner"`
	// Platform of the image recipe.
	ParentImage *string `pulumi:"parentImage"`
	// Platform of the image recipe.
	Platform *string `pulumi:"platform"`
	// Key-value map of resource tags for the image recipe.
	Tags map[string]string `pulumi:"tags"`
	// Version of the image recipe.
	Version *string `pulumi:"version"`
}

type ImageRecipeState struct {
	// (Required) Amazon Resource Name (ARN) of the image recipe.
	Arn pulumi.StringPtrInput
	// Configuration block(s) with block device mappings for the the image recipe. Detailed below.
	BlockDeviceMappings ImageRecipeBlockDeviceMappingArrayInput
	// Configuration block(s) with components for the image recipe. Detailed below.
	Components ImageRecipeComponentArrayInput
	// Date the image recipe was created.
	DateCreated pulumi.StringPtrInput
	// Description of the image recipe.
	Description pulumi.StringPtrInput
	// Name of the image recipe.
	Name pulumi.StringPtrInput
	// Owner of the image recipe.
	Owner pulumi.StringPtrInput
	// Platform of the image recipe.
	ParentImage pulumi.StringPtrInput
	// Platform of the image recipe.
	Platform pulumi.StringPtrInput
	// Key-value map of resource tags for the image recipe.
	Tags pulumi.StringMapInput
	// Version of the image recipe.
	Version pulumi.StringPtrInput
}

func (ImageRecipeState) ElementType() reflect.Type {
	return reflect.TypeOf((*imageRecipeState)(nil)).Elem()
}

type imageRecipeArgs struct {
	// Configuration block(s) with block device mappings for the the image recipe. Detailed below.
	BlockDeviceMappings []ImageRecipeBlockDeviceMapping `pulumi:"blockDeviceMappings"`
	// Configuration block(s) with components for the image recipe. Detailed below.
	Components []ImageRecipeComponent `pulumi:"components"`
	// Description of the image recipe.
	Description *string `pulumi:"description"`
	// Name of the image recipe.
	Name *string `pulumi:"name"`
	// Platform of the image recipe.
	ParentImage string `pulumi:"parentImage"`
	// Key-value map of resource tags for the image recipe.
	Tags map[string]string `pulumi:"tags"`
	// Version of the image recipe.
	Version string `pulumi:"version"`
}

// The set of arguments for constructing a ImageRecipe resource.
type ImageRecipeArgs struct {
	// Configuration block(s) with block device mappings for the the image recipe. Detailed below.
	BlockDeviceMappings ImageRecipeBlockDeviceMappingArrayInput
	// Configuration block(s) with components for the image recipe. Detailed below.
	Components ImageRecipeComponentArrayInput
	// Description of the image recipe.
	Description pulumi.StringPtrInput
	// Name of the image recipe.
	Name pulumi.StringPtrInput
	// Platform of the image recipe.
	ParentImage pulumi.StringInput
	// Key-value map of resource tags for the image recipe.
	Tags pulumi.StringMapInput
	// Version of the image recipe.
	Version pulumi.StringInput
}

func (ImageRecipeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*imageRecipeArgs)(nil)).Elem()
}

type ImageRecipeInput interface {
	pulumi.Input

	ToImageRecipeOutput() ImageRecipeOutput
	ToImageRecipeOutputWithContext(ctx context.Context) ImageRecipeOutput
}

func (ImageRecipe) ElementType() reflect.Type {
	return reflect.TypeOf((*ImageRecipe)(nil)).Elem()
}

func (i ImageRecipe) ToImageRecipeOutput() ImageRecipeOutput {
	return i.ToImageRecipeOutputWithContext(context.Background())
}

func (i ImageRecipe) ToImageRecipeOutputWithContext(ctx context.Context) ImageRecipeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageRecipeOutput)
}

type ImageRecipeOutput struct {
	*pulumi.OutputState
}

func (ImageRecipeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ImageRecipeOutput)(nil)).Elem()
}

func (o ImageRecipeOutput) ToImageRecipeOutput() ImageRecipeOutput {
	return o
}

func (o ImageRecipeOutput) ToImageRecipeOutputWithContext(ctx context.Context) ImageRecipeOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ImageRecipeOutput{})
}
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS IVS (Interactive Video) Chat Logging Configuration.
 *
 * ## Example Usage
 * ### Basic Usage - Logging to CloudWatch
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleLogGroup = new aws.cloudwatch.LogGroup("exampleLogGroup", {});
 * const exampleLoggingConfiguration = new aws.ivschat.LoggingConfiguration("exampleLoggingConfiguration", {destinationConfiguration: {
 *     cloudwatchLogs: {
 *         logGroupName: exampleLogGroup.name,
 *     },
 * }});
 * ```
 * ### Basic Usage - Logging to Kinesis Firehose with Extended S3
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleBucketV2 = new aws.s3.BucketV2("exampleBucketV2", {bucketPrefix: "tf-ivschat-logging-bucket"});
 * const exampleRole = new aws.iam.Role("exampleRole", {assumeRolePolicy: `{
 *   "Version": "2012-10-17",
 *   "Statement": [
 *     {
 *       "Action": "sts:AssumeRole",
 *       "Principal": {
 *         "Service": "firehose.amazonaws.com"
 *       },
 *       "Effect": "Allow",
 *       "Sid": ""
 *     }
 *   ]
 * }
 * `});
 * const exampleFirehoseDeliveryStream = new aws.kinesis.FirehoseDeliveryStream("exampleFirehoseDeliveryStream", {
 *     destination: "extended_s3",
 *     extendedS3Configuration: {
 *         roleArn: exampleRole.arn,
 *         bucketArn: exampleBucketV2.arn,
 *     },
 *     tags: {
 *         LogDeliveryEnabled: "true",
 *     },
 * });
 * const exampleBucketAclV2 = new aws.s3.BucketAclV2("exampleBucketAclV2", {
 *     bucket: exampleBucketV2.id,
 *     acl: "private",
 * });
 * const exampleLoggingConfiguration = new aws.ivschat.LoggingConfiguration("exampleLoggingConfiguration", {destinationConfiguration: {
 *     firehose: {
 *         deliveryStreamName: exampleFirehoseDeliveryStream.name,
 *     },
 * }});
 * ```
 *
 * ## Import
 *
 * IVS (Interactive Video) Chat Logging Configuration can be imported using the ARN, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:ivschat/loggingConfiguration:LoggingConfiguration example arn:aws:ivschat:us-west-2:326937407773:logging-configuration/MMUQc8wcqZmC
 * ```
 */
export class LoggingConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing LoggingConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoggingConfigurationState, opts?: pulumi.CustomResourceOptions): LoggingConfiguration {
        return new LoggingConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ivschat/loggingConfiguration:LoggingConfiguration';

    /**
     * Returns true if the given object is an instance of LoggingConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoggingConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoggingConfiguration.__pulumiType;
    }

    /**
     * ARN of the Logging Configuration.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Object containing destination configuration for where chat activity will be logged. This object must contain exactly one of the following children arguments:
     */
    public readonly destinationConfiguration!: pulumi.Output<outputs.ivschat.LoggingConfigurationDestinationConfiguration | undefined>;
    /**
     * Logging Configuration name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * State of the Logging Configuration.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a LoggingConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: LoggingConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoggingConfigurationArgs | LoggingConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoggingConfigurationState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["destinationConfiguration"] = state ? state.destinationConfiguration : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as LoggingConfigurationArgs | undefined;
            resourceInputs["destinationConfiguration"] = args ? args.destinationConfiguration : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoggingConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoggingConfiguration resources.
 */
export interface LoggingConfigurationState {
    /**
     * ARN of the Logging Configuration.
     */
    arn?: pulumi.Input<string>;
    /**
     * Object containing destination configuration for where chat activity will be logged. This object must contain exactly one of the following children arguments:
     */
    destinationConfiguration?: pulumi.Input<inputs.ivschat.LoggingConfigurationDestinationConfiguration>;
    /**
     * Logging Configuration name.
     */
    name?: pulumi.Input<string>;
    /**
     * State of the Logging Configuration.
     */
    state?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a LoggingConfiguration resource.
 */
export interface LoggingConfigurationArgs {
    /**
     * Object containing destination configuration for where chat activity will be logged. This object must contain exactly one of the following children arguments:
     */
    destinationConfiguration?: pulumi.Input<inputs.ivschat.LoggingConfigurationDestinationConfiguration>;
    /**
     * Logging Configuration name.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
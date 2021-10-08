// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an AppConfig Deployment resource for an `aws.appconfig.Application` resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.appconfig.Deployment("example", {
 *     applicationId: aws_appconfig_application.example.id,
 *     configurationProfileId: aws_appconfig_configuration_profile.example.configuration_profile_id,
 *     configurationVersion: aws_appconfig_hosted_configuration_version.example.version_number,
 *     deploymentStrategyId: aws_appconfig_deployment_strategy.example.id,
 *     description: "My example deployment",
 *     environmentId: aws_appconfig_environment.example.environment_id,
 *     tags: {
 *         Type: "AppConfig Deployment",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * AppConfig Deployments can be imported by using the application ID, environment ID, and deployment number separated by a slash (`/`), e.g.
 *
 * ```sh
 *  $ pulumi import aws:appconfig/deployment:Deployment example 71abcde/11xxxxx/1
 * ```
 */
export class Deployment extends pulumi.CustomResource {
    /**
     * Get an existing Deployment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeploymentState, opts?: pulumi.CustomResourceOptions): Deployment {
        return new Deployment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:appconfig/deployment:Deployment';

    /**
     * Returns true if the given object is an instance of Deployment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Deployment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Deployment.__pulumiType;
    }

    /**
     * The application ID. Must be between 4 and 7 characters in length.
     */
    public readonly applicationId!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) of the AppConfig Deployment.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The configuration profile ID. Must be between 4 and 7 characters in length.
     */
    public readonly configurationProfileId!: pulumi.Output<string>;
    /**
     * The configuration version to deploy. Can be at most 1024 characters.
     */
    public readonly configurationVersion!: pulumi.Output<string>;
    /**
     * The deployment number.
     */
    public /*out*/ readonly deploymentNumber!: pulumi.Output<number>;
    /**
     * The deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
     */
    public readonly deploymentStrategyId!: pulumi.Output<string>;
    /**
     * The description of the deployment. Can be at most 1024 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The environment ID. Must be between 4 and 7 characters in length.
     */
    public readonly environmentId!: pulumi.Output<string>;
    /**
     * The state of the deployment.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Deployment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeploymentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeploymentArgs | DeploymentState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeploymentState | undefined;
            inputs["applicationId"] = state ? state.applicationId : undefined;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["configurationProfileId"] = state ? state.configurationProfileId : undefined;
            inputs["configurationVersion"] = state ? state.configurationVersion : undefined;
            inputs["deploymentNumber"] = state ? state.deploymentNumber : undefined;
            inputs["deploymentStrategyId"] = state ? state.deploymentStrategyId : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["environmentId"] = state ? state.environmentId : undefined;
            inputs["state"] = state ? state.state : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as DeploymentArgs | undefined;
            if ((!args || args.applicationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applicationId'");
            }
            if ((!args || args.configurationProfileId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configurationProfileId'");
            }
            if ((!args || args.configurationVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configurationVersion'");
            }
            if ((!args || args.deploymentStrategyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deploymentStrategyId'");
            }
            if ((!args || args.environmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environmentId'");
            }
            inputs["applicationId"] = args ? args.applicationId : undefined;
            inputs["configurationProfileId"] = args ? args.configurationProfileId : undefined;
            inputs["configurationVersion"] = args ? args.configurationVersion : undefined;
            inputs["deploymentStrategyId"] = args ? args.deploymentStrategyId : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["environmentId"] = args ? args.environmentId : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["arn"] = undefined /*out*/;
            inputs["deploymentNumber"] = undefined /*out*/;
            inputs["state"] = undefined /*out*/;
            inputs["tagsAll"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Deployment.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Deployment resources.
 */
export interface DeploymentState {
    /**
     * The application ID. Must be between 4 and 7 characters in length.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the AppConfig Deployment.
     */
    arn?: pulumi.Input<string>;
    /**
     * The configuration profile ID. Must be between 4 and 7 characters in length.
     */
    configurationProfileId?: pulumi.Input<string>;
    /**
     * The configuration version to deploy. Can be at most 1024 characters.
     */
    configurationVersion?: pulumi.Input<string>;
    /**
     * The deployment number.
     */
    deploymentNumber?: pulumi.Input<number>;
    /**
     * The deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
     */
    deploymentStrategyId?: pulumi.Input<string>;
    /**
     * The description of the deployment. Can be at most 1024 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * The environment ID. Must be between 4 and 7 characters in length.
     */
    environmentId?: pulumi.Input<string>;
    /**
     * The state of the deployment.
     */
    state?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Deployment resource.
 */
export interface DeploymentArgs {
    /**
     * The application ID. Must be between 4 and 7 characters in length.
     */
    applicationId: pulumi.Input<string>;
    /**
     * The configuration profile ID. Must be between 4 and 7 characters in length.
     */
    configurationProfileId: pulumi.Input<string>;
    /**
     * The configuration version to deploy. Can be at most 1024 characters.
     */
    configurationVersion: pulumi.Input<string>;
    /**
     * The deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
     */
    deploymentStrategyId: pulumi.Input<string>;
    /**
     * The description of the deployment. Can be at most 1024 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * The environment ID. Must be between 4 and 7 characters in length.
     */
    environmentId: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
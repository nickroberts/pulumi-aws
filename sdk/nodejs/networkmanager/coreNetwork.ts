// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a core network resource.
 *
 * ## Example Usage
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.networkmanager.CoreNetwork("example", {globalNetworkId: aws_networkmanager_global_network.example.id});
 * ```
 * ### With description
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.networkmanager.CoreNetwork("example", {
 *     globalNetworkId: aws_networkmanager_global_network.example.id,
 *     description: "example",
 * });
 * ```
 * ### With policy document
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.networkmanager.CoreNetwork("example", {
 *     globalNetworkId: aws_networkmanager_global_network.example.id,
 *     policyDocument: data.aws_networkmanager_core_network_policy_document.example.json,
 * });
 * ```
 * ### With tags
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.networkmanager.CoreNetwork("example", {
 *     globalNetworkId: aws_networkmanager_global_network.example.id,
 *     tags: {
 *         hello: "world",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * `aws_networkmanager_core_network` can be imported using the core network ID, e.g.
 *
 * ```sh
 *  $ pulumi import aws:networkmanager/coreNetwork:CoreNetwork example core-network-0d47f6t230mz46dy4
 * ```
 */
export class CoreNetwork extends pulumi.CustomResource {
    /**
     * Get an existing CoreNetwork resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CoreNetworkState, opts?: pulumi.CustomResourceOptions): CoreNetwork {
        return new CoreNetwork(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:networkmanager/coreNetwork:CoreNetwork';

    /**
     * Returns true if the given object is an instance of CoreNetwork.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CoreNetwork {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CoreNetwork.__pulumiType;
    }

    /**
     * Core Network Amazon Resource Name (ARN).
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Timestamp when a core network was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Description of the Core Network.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * One or more blocks detailing the edges within a core network. Detailed below.
     */
    public /*out*/ readonly edges!: pulumi.Output<outputs.networkmanager.CoreNetworkEdge[]>;
    /**
     * The ID of the global network that a core network will be a part of.
     */
    public readonly globalNetworkId!: pulumi.Output<string>;
    /**
     * Policy document for creating a core network. Note that updating this argument will result in the new policy document version being set as the `LATEST` and `LIVE` policy document. Refer to the [Core network policies documentation](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html) for more information.
     */
    public readonly policyDocument!: pulumi.Output<string | undefined>;
    /**
     * One or more blocks detailing the segments within a core network. Detailed below.
     */
    public /*out*/ readonly segments!: pulumi.Output<outputs.networkmanager.CoreNetworkSegment[]>;
    /**
     * Current state of a core network.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Key-value tags for the Core Network. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a CoreNetwork resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CoreNetworkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CoreNetworkArgs | CoreNetworkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CoreNetworkState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["edges"] = state ? state.edges : undefined;
            resourceInputs["globalNetworkId"] = state ? state.globalNetworkId : undefined;
            resourceInputs["policyDocument"] = state ? state.policyDocument : undefined;
            resourceInputs["segments"] = state ? state.segments : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as CoreNetworkArgs | undefined;
            if ((!args || args.globalNetworkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'globalNetworkId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["globalNetworkId"] = args ? args.globalNetworkId : undefined;
            resourceInputs["policyDocument"] = args ? args.policyDocument : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["edges"] = undefined /*out*/;
            resourceInputs["segments"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CoreNetwork.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CoreNetwork resources.
 */
export interface CoreNetworkState {
    /**
     * Core Network Amazon Resource Name (ARN).
     */
    arn?: pulumi.Input<string>;
    /**
     * Timestamp when a core network was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Description of the Core Network.
     */
    description?: pulumi.Input<string>;
    /**
     * One or more blocks detailing the edges within a core network. Detailed below.
     */
    edges?: pulumi.Input<pulumi.Input<inputs.networkmanager.CoreNetworkEdge>[]>;
    /**
     * The ID of the global network that a core network will be a part of.
     */
    globalNetworkId?: pulumi.Input<string>;
    /**
     * Policy document for creating a core network. Note that updating this argument will result in the new policy document version being set as the `LATEST` and `LIVE` policy document. Refer to the [Core network policies documentation](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html) for more information.
     */
    policyDocument?: pulumi.Input<string>;
    /**
     * One or more blocks detailing the segments within a core network. Detailed below.
     */
    segments?: pulumi.Input<pulumi.Input<inputs.networkmanager.CoreNetworkSegment>[]>;
    /**
     * Current state of a core network.
     */
    state?: pulumi.Input<string>;
    /**
     * Key-value tags for the Core Network. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a CoreNetwork resource.
 */
export interface CoreNetworkArgs {
    /**
     * Description of the Core Network.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the global network that a core network will be a part of.
     */
    globalNetworkId: pulumi.Input<string>;
    /**
     * Policy document for creating a core network. Note that updating this argument will result in the new policy document version being set as the `LATEST` and `LIVE` policy document. Refer to the [Core network policies documentation](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html) for more information.
     */
    policyDocument?: pulumi.Input<string>;
    /**
     * Key-value tags for the Core Network. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
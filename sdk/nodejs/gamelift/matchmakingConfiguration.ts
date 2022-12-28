// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a GameLift Alias resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleGameSessionQueue = new aws.gamelift.GameSessionQueue("exampleGameSessionQueue", {
 *     destinations: [],
 *     playerLatencyPolicies: [
 *         {
 *             maximumIndividualPlayerLatencyMilliseconds: 3,
 *             policyDurationSeconds: 7,
 *         },
 *         {
 *             maximumIndividualPlayerLatencyMilliseconds: 10,
 *         },
 *     ],
 *     timeoutInSeconds: 25,
 * });
 * const exampleMatchmakingRuleSet = new aws.gamelift.MatchmakingRuleSet("exampleMatchmakingRuleSet", {ruleSetBody: JSON.stringify({
 *     name: "test",
 *     ruleLanguageVersion: "1.0",
 *     teams: [{
 *         name: "alpha",
 *         minPlayers: 1,
 *         maxPlayers: 5,
 *     }],
 * })});
 * const exampleMatchmakingConfiguration = new aws.gamelift.MatchmakingConfiguration("exampleMatchmakingConfiguration", {
 *     acceptanceRequired: false,
 *     customEventData: "pvp",
 *     gameSessionData: "game_session_data",
 *     backfillMode: "MANUAL",
 *     requestTimeoutSeconds: 30,
 *     ruleSetName: aws_gamelift_matchmaking_rule_set.test.name,
 *     gameSessionQueueArns: [aws_gamelift_game_session_queue.test.arn],
 *     tags: {
 *         key1: "value1",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * GameLift Matchmaking Configurations can be imported using the ID, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:gamelift/matchmakingConfiguration:MatchmakingConfiguration example <matchmakingconfiguration-id>
 * ```
 */
export class MatchmakingConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing MatchmakingConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MatchmakingConfigurationState, opts?: pulumi.CustomResourceOptions): MatchmakingConfiguration {
        return new MatchmakingConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:gamelift/matchmakingConfiguration:MatchmakingConfiguration';

    /**
     * Returns true if the given object is an instance of MatchmakingConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MatchmakingConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MatchmakingConfiguration.__pulumiType;
    }

    /**
     * Specifies if the match that was created with this configuration must be accepted by matched players.
     */
    public readonly acceptanceRequired!: pulumi.Output<boolean>;
    /**
     * The length of time (in seconds) to wait for players to accept a proposed match, if acceptance is required.
     */
    public readonly acceptanceTimeoutSeconds!: pulumi.Output<number | undefined>;
    /**
     * The number of player slots in a match to keep open for future players.
     */
    public readonly additionalPlayerCount!: pulumi.Output<number | undefined>;
    /**
     * Matchmaking Configuration ARN.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The method used to backfill game sessions that are created with this matchmaking configuration.
     */
    public readonly backfillMode!: pulumi.Output<string | undefined>;
    /**
     * The time when the Matchmaking Configuration was created.
     */
    public /*out*/ readonly creationTime!: pulumi.Output<string>;
    /**
     * Information to be added to all events related to this matchmaking configuration.
     */
    public readonly customEventData!: pulumi.Output<string | undefined>;
    /**
     * A human-readable description of the matchmaking configuration.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether this matchmaking configuration is being used with GameLift hosting or as a standalone matchmaking solution.
     */
    public readonly flexMatchMode!: pulumi.Output<string>;
    /**
     * One or more custom game properties. See below.
     */
    public readonly gameProperties!: pulumi.Output<outputs.gamelift.MatchmakingConfigurationGameProperty[] | undefined>;
    /**
     * A set of custom game session properties.
     */
    public readonly gameSessionData!: pulumi.Output<string>;
    /**
     * The ARNs of the GameLift game session queue resources.
     */
    public readonly gameSessionQueueArns!: pulumi.Output<string[] | undefined>;
    /**
     * Name of the matchmaking configuration
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * An SNS topic ARN that is set up to receive matchmaking notifications.
     */
    public readonly notificationTarget!: pulumi.Output<string | undefined>;
    /**
     * The maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out.
     */
    public readonly requestTimeoutSeconds!: pulumi.Output<number>;
    public /*out*/ readonly ruleSetArn!: pulumi.Output<string>;
    /**
     * A rule set names for the matchmaking rule set to use with this configuration.
     */
    public readonly ruleSetName!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a MatchmakingConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MatchmakingConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MatchmakingConfigurationArgs | MatchmakingConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MatchmakingConfigurationState | undefined;
            resourceInputs["acceptanceRequired"] = state ? state.acceptanceRequired : undefined;
            resourceInputs["acceptanceTimeoutSeconds"] = state ? state.acceptanceTimeoutSeconds : undefined;
            resourceInputs["additionalPlayerCount"] = state ? state.additionalPlayerCount : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["backfillMode"] = state ? state.backfillMode : undefined;
            resourceInputs["creationTime"] = state ? state.creationTime : undefined;
            resourceInputs["customEventData"] = state ? state.customEventData : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["flexMatchMode"] = state ? state.flexMatchMode : undefined;
            resourceInputs["gameProperties"] = state ? state.gameProperties : undefined;
            resourceInputs["gameSessionData"] = state ? state.gameSessionData : undefined;
            resourceInputs["gameSessionQueueArns"] = state ? state.gameSessionQueueArns : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notificationTarget"] = state ? state.notificationTarget : undefined;
            resourceInputs["requestTimeoutSeconds"] = state ? state.requestTimeoutSeconds : undefined;
            resourceInputs["ruleSetArn"] = state ? state.ruleSetArn : undefined;
            resourceInputs["ruleSetName"] = state ? state.ruleSetName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as MatchmakingConfigurationArgs | undefined;
            if ((!args || args.acceptanceRequired === undefined) && !opts.urn) {
                throw new Error("Missing required property 'acceptanceRequired'");
            }
            if ((!args || args.gameSessionData === undefined) && !opts.urn) {
                throw new Error("Missing required property 'gameSessionData'");
            }
            if ((!args || args.requestTimeoutSeconds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'requestTimeoutSeconds'");
            }
            if ((!args || args.ruleSetName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ruleSetName'");
            }
            resourceInputs["acceptanceRequired"] = args ? args.acceptanceRequired : undefined;
            resourceInputs["acceptanceTimeoutSeconds"] = args ? args.acceptanceTimeoutSeconds : undefined;
            resourceInputs["additionalPlayerCount"] = args ? args.additionalPlayerCount : undefined;
            resourceInputs["backfillMode"] = args ? args.backfillMode : undefined;
            resourceInputs["customEventData"] = args ? args.customEventData : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["flexMatchMode"] = args ? args.flexMatchMode : undefined;
            resourceInputs["gameProperties"] = args ? args.gameProperties : undefined;
            resourceInputs["gameSessionData"] = args ? args.gameSessionData : undefined;
            resourceInputs["gameSessionQueueArns"] = args ? args.gameSessionQueueArns : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notificationTarget"] = args ? args.notificationTarget : undefined;
            resourceInputs["requestTimeoutSeconds"] = args ? args.requestTimeoutSeconds : undefined;
            resourceInputs["ruleSetName"] = args ? args.ruleSetName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["creationTime"] = undefined /*out*/;
            resourceInputs["ruleSetArn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MatchmakingConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MatchmakingConfiguration resources.
 */
export interface MatchmakingConfigurationState {
    /**
     * Specifies if the match that was created with this configuration must be accepted by matched players.
     */
    acceptanceRequired?: pulumi.Input<boolean>;
    /**
     * The length of time (in seconds) to wait for players to accept a proposed match, if acceptance is required.
     */
    acceptanceTimeoutSeconds?: pulumi.Input<number>;
    /**
     * The number of player slots in a match to keep open for future players.
     */
    additionalPlayerCount?: pulumi.Input<number>;
    /**
     * Matchmaking Configuration ARN.
     */
    arn?: pulumi.Input<string>;
    /**
     * The method used to backfill game sessions that are created with this matchmaking configuration.
     */
    backfillMode?: pulumi.Input<string>;
    /**
     * The time when the Matchmaking Configuration was created.
     */
    creationTime?: pulumi.Input<string>;
    /**
     * Information to be added to all events related to this matchmaking configuration.
     */
    customEventData?: pulumi.Input<string>;
    /**
     * A human-readable description of the matchmaking configuration.
     */
    description?: pulumi.Input<string>;
    /**
     * Indicates whether this matchmaking configuration is being used with GameLift hosting or as a standalone matchmaking solution.
     */
    flexMatchMode?: pulumi.Input<string>;
    /**
     * One or more custom game properties. See below.
     */
    gameProperties?: pulumi.Input<pulumi.Input<inputs.gamelift.MatchmakingConfigurationGameProperty>[]>;
    /**
     * A set of custom game session properties.
     */
    gameSessionData?: pulumi.Input<string>;
    /**
     * The ARNs of the GameLift game session queue resources.
     */
    gameSessionQueueArns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the matchmaking configuration
     */
    name?: pulumi.Input<string>;
    /**
     * An SNS topic ARN that is set up to receive matchmaking notifications.
     */
    notificationTarget?: pulumi.Input<string>;
    /**
     * The maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out.
     */
    requestTimeoutSeconds?: pulumi.Input<number>;
    ruleSetArn?: pulumi.Input<string>;
    /**
     * A rule set names for the matchmaking rule set to use with this configuration.
     */
    ruleSetName?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a MatchmakingConfiguration resource.
 */
export interface MatchmakingConfigurationArgs {
    /**
     * Specifies if the match that was created with this configuration must be accepted by matched players.
     */
    acceptanceRequired: pulumi.Input<boolean>;
    /**
     * The length of time (in seconds) to wait for players to accept a proposed match, if acceptance is required.
     */
    acceptanceTimeoutSeconds?: pulumi.Input<number>;
    /**
     * The number of player slots in a match to keep open for future players.
     */
    additionalPlayerCount?: pulumi.Input<number>;
    /**
     * The method used to backfill game sessions that are created with this matchmaking configuration.
     */
    backfillMode?: pulumi.Input<string>;
    /**
     * Information to be added to all events related to this matchmaking configuration.
     */
    customEventData?: pulumi.Input<string>;
    /**
     * A human-readable description of the matchmaking configuration.
     */
    description?: pulumi.Input<string>;
    /**
     * Indicates whether this matchmaking configuration is being used with GameLift hosting or as a standalone matchmaking solution.
     */
    flexMatchMode?: pulumi.Input<string>;
    /**
     * One or more custom game properties. See below.
     */
    gameProperties?: pulumi.Input<pulumi.Input<inputs.gamelift.MatchmakingConfigurationGameProperty>[]>;
    /**
     * A set of custom game session properties.
     */
    gameSessionData: pulumi.Input<string>;
    /**
     * The ARNs of the GameLift game session queue resources.
     */
    gameSessionQueueArns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the matchmaking configuration
     */
    name?: pulumi.Input<string>;
    /**
     * An SNS topic ARN that is set up to receive matchmaking notifications.
     */
    notificationTarget?: pulumi.Input<string>;
    /**
     * The maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out.
     */
    requestTimeoutSeconds: pulumi.Input<number>;
    /**
     * A rule set names for the matchmaking rule set to use with this configuration.
     */
    ruleSetName: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
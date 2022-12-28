// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Creates a Lightsail load balancer Certificate resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const testLb = new aws.lightsail.Lb("testLb", {
 *     healthCheckPath: "/",
 *     instancePort: 80,
 *     tags: {
 *         foo: "bar",
 *     },
 * });
 * const testLbCertificate = new aws.lightsail.LbCertificate("testLbCertificate", {
 *     lbName: testLb.id,
 *     domainName: "test.com",
 * });
 * ```
 *
 * ## Import
 *
 * `aws_lightsail_lb_certificate` can be imported by using the id attribute, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:lightsail/lbCertificate:LbCertificate test example-load-balancer,example-load-balancer-certificate
 * ```
 */
export class LbCertificate extends pulumi.CustomResource {
    /**
     * Get an existing LbCertificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LbCertificateState, opts?: pulumi.CustomResourceOptions): LbCertificate {
        return new LbCertificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:lightsail/lbCertificate:LbCertificate';

    /**
     * Returns true if the given object is an instance of LbCertificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LbCertificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LbCertificate.__pulumiType;
    }

    /**
     * The ARN of the lightsail certificate.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The timestamp when the instance was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The domain name (e.g., example.com) for your SSL/TLS certificate.
     */
    public readonly domainName!: pulumi.Output<string>;
    public /*out*/ readonly domainValidationRecords!: pulumi.Output<outputs.lightsail.LbCertificateDomainValidationRecord[]>;
    /**
     * The load balancer name where you want to create the SSL/TLS certificate.
     */
    public readonly lbName!: pulumi.Output<string>;
    /**
     * The SSL/TLS certificate name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Set of domains that should be SANs in the issued certificate. `domainName` attribute is automatically added as a Subject Alternative Name.
     */
    public readonly subjectAlternativeNames!: pulumi.Output<string[]>;
    public /*out*/ readonly supportCode!: pulumi.Output<string>;

    /**
     * Create a LbCertificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LbCertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LbCertificateArgs | LbCertificateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LbCertificateState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
            resourceInputs["domainValidationRecords"] = state ? state.domainValidationRecords : undefined;
            resourceInputs["lbName"] = state ? state.lbName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["subjectAlternativeNames"] = state ? state.subjectAlternativeNames : undefined;
            resourceInputs["supportCode"] = state ? state.supportCode : undefined;
        } else {
            const args = argsOrState as LbCertificateArgs | undefined;
            if ((!args || args.lbName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'lbName'");
            }
            resourceInputs["domainName"] = args ? args.domainName : undefined;
            resourceInputs["lbName"] = args ? args.lbName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["subjectAlternativeNames"] = args ? args.subjectAlternativeNames : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["domainValidationRecords"] = undefined /*out*/;
            resourceInputs["supportCode"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LbCertificate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LbCertificate resources.
 */
export interface LbCertificateState {
    /**
     * The ARN of the lightsail certificate.
     */
    arn?: pulumi.Input<string>;
    /**
     * The timestamp when the instance was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * The domain name (e.g., example.com) for your SSL/TLS certificate.
     */
    domainName?: pulumi.Input<string>;
    domainValidationRecords?: pulumi.Input<pulumi.Input<inputs.lightsail.LbCertificateDomainValidationRecord>[]>;
    /**
     * The load balancer name where you want to create the SSL/TLS certificate.
     */
    lbName?: pulumi.Input<string>;
    /**
     * The SSL/TLS certificate name.
     */
    name?: pulumi.Input<string>;
    /**
     * Set of domains that should be SANs in the issued certificate. `domainName` attribute is automatically added as a Subject Alternative Name.
     */
    subjectAlternativeNames?: pulumi.Input<pulumi.Input<string>[]>;
    supportCode?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LbCertificate resource.
 */
export interface LbCertificateArgs {
    /**
     * The domain name (e.g., example.com) for your SSL/TLS certificate.
     */
    domainName?: pulumi.Input<string>;
    /**
     * The load balancer name where you want to create the SSL/TLS certificate.
     */
    lbName: pulumi.Input<string>;
    /**
     * The SSL/TLS certificate name.
     */
    name?: pulumi.Input<string>;
    /**
     * Set of domains that should be SANs in the issued certificate. `domainName` attribute is automatically added as a Subject Alternative Name.
     */
    subjectAlternativeNames?: pulumi.Input<pulumi.Input<string>[]>;
}
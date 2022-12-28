// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.ResolverDnsSecConfigArgs;
import com.pulumi.aws.route53.inputs.ResolverDnsSecConfigState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Route 53 Resolver DNSSEC config resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.route53.ResolverDnsSecConfig;
 * import com.pulumi.aws.route53.ResolverDnsSecConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleVpc = new Vpc(&#34;exampleVpc&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .enableDnsSupport(true)
 *             .enableDnsHostnames(true)
 *             .build());
 * 
 *         var exampleResolverDnsSecConfig = new ResolverDnsSecConfig(&#34;exampleResolverDnsSecConfig&#34;, ResolverDnsSecConfigArgs.builder()        
 *             .resourceId(exampleVpc.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 *  Route 53 Resolver DNSSEC configs can be imported using the Route 53 Resolver DNSSEC config ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/resolverDnsSecConfig:ResolverDnsSecConfig example rdsc-be1866ecc1683e95
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverDnsSecConfig:ResolverDnsSecConfig")
public class ResolverDnsSecConfig extends com.pulumi.resources.CustomResource {
    /**
     * The ARN for a configuration for DNSSEC validation.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN for a configuration for DNSSEC validation.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The owner account ID of the virtual private cloud (VPC) for a configuration for DNSSEC validation.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return The owner account ID of the virtual private cloud (VPC) for a configuration for DNSSEC validation.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * The ID of the virtual private cloud (VPC) that you&#39;re updating the DNSSEC validation status for.
     * 
     */
    @Export(name="resourceId", refs={String.class}, tree="[0]")
    private Output<String> resourceId;

    /**
     * @return The ID of the virtual private cloud (VPC) that you&#39;re updating the DNSSEC validation status for.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }
    /**
     * The validation status for a DNSSEC configuration. The status can be one of the following: `ENABLING`, `ENABLED`, `DISABLING` and `DISABLED`.
     * 
     */
    @Export(name="validationStatus", refs={String.class}, tree="[0]")
    private Output<String> validationStatus;

    /**
     * @return The validation status for a DNSSEC configuration. The status can be one of the following: `ENABLING`, `ENABLED`, `DISABLING` and `DISABLED`.
     * 
     */
    public Output<String> validationStatus() {
        return this.validationStatus;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverDnsSecConfig(String name) {
        this(name, ResolverDnsSecConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverDnsSecConfig(String name, ResolverDnsSecConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverDnsSecConfig(String name, ResolverDnsSecConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverDnsSecConfig:ResolverDnsSecConfig", name, args == null ? ResolverDnsSecConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResolverDnsSecConfig(String name, Output<String> id, @Nullable ResolverDnsSecConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverDnsSecConfig:ResolverDnsSecConfig", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ResolverDnsSecConfig get(String name, Output<String> id, @Nullable ResolverDnsSecConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResolverDnsSecConfig(name, id, state, options);
    }
}
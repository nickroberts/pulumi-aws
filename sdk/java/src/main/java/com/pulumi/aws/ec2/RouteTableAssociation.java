// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.RouteTableAssociationArgs;
import com.pulumi.aws.ec2.inputs.RouteTableAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to create an association between a route table and a subnet or a route table and an
 * internet gateway or virtual private gateway.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.RouteTableAssociation;
 * import com.pulumi.aws.ec2.RouteTableAssociationArgs;
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
 *         var routeTableAssociation = new RouteTableAssociation(&#34;routeTableAssociation&#34;, RouteTableAssociationArgs.builder()        
 *             .subnetId(aws_subnet.foo().id())
 *             .routeTableId(aws_route_table.bar().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.RouteTableAssociation;
 * import com.pulumi.aws.ec2.RouteTableAssociationArgs;
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
 *         var routeTableAssociation = new RouteTableAssociation(&#34;routeTableAssociation&#34;, RouteTableAssociationArgs.builder()        
 *             .gatewayId(aws_internet_gateway.foo().id())
 *             .routeTableId(aws_route_table.bar().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * is already associated, will result in an error (e.g., `Resource.AlreadyAssociatedthe specified association for route table rtb-4176657279 conflicts with an existing association`) unless you first import the original association. EC2 Route Table Associations can be imported using the associated resource ID and Route Table ID separated by a forward slash (`/`). For example with EC2 Subnets
 * 
 * ```sh
 *  $ pulumi import aws:ec2/routeTableAssociation:RouteTableAssociation assoc subnet-6777656e646f6c796e/rtb-656c65616e6f72
 * ```
 * 
 *  For example with EC2 Internet Gateways
 * 
 * ```sh
 *  $ pulumi import aws:ec2/routeTableAssociation:RouteTableAssociation assoc igw-01b3a60780f8d034a/rtb-656c65616e6f72
 * ```
 * 
 */
@ResourceType(type="aws:ec2/routeTableAssociation:RouteTableAssociation")
public class RouteTableAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The gateway ID to create an association. Conflicts with `subnet_id`.
     * 
     */
    @Export(name="gatewayId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> gatewayId;

    /**
     * @return The gateway ID to create an association. Conflicts with `subnet_id`.
     * 
     */
    public Output<Optional<String>> gatewayId() {
        return Codegen.optional(this.gatewayId);
    }
    /**
     * The ID of the routing table to associate with.
     * 
     */
    @Export(name="routeTableId", refs={String.class}, tree="[0]")
    private Output<String> routeTableId;

    /**
     * @return The ID of the routing table to associate with.
     * 
     */
    public Output<String> routeTableId() {
        return this.routeTableId;
    }
    /**
     * The subnet ID to create an association. Conflicts with `gateway_id`.
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subnetId;

    /**
     * @return The subnet ID to create an association. Conflicts with `gateway_id`.
     * 
     */
    public Output<Optional<String>> subnetId() {
        return Codegen.optional(this.subnetId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouteTableAssociation(String name) {
        this(name, RouteTableAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouteTableAssociation(String name, RouteTableAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteTableAssociation(String name, RouteTableAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/routeTableAssociation:RouteTableAssociation", name, args == null ? RouteTableAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RouteTableAssociation(String name, Output<String> id, @Nullable RouteTableAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/routeTableAssociation:RouteTableAssociation", name, state, makeResourceOptions(options, id));
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
    public static RouteTableAssociation get(String name, Output<String> id, @Nullable RouteTableAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouteTableAssociation(name, id, state, options);
    }
}
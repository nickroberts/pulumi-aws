// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecs.ClusterCapacityProvidersArgs;
import com.pulumi.aws.ecs.inputs.ClusterCapacityProvidersState;
import com.pulumi.aws.ecs.outputs.ClusterCapacityProvidersDefaultCapacityProviderStrategy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages the capacity providers of an ECS Cluster.
 * 
 * More information about capacity providers can be found in the [ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-capacity-providers.html).
 * 
 * &gt; **NOTE on Clusters and Cluster Capacity Providers:** The provider provides both a standalone `aws.ecs.ClusterCapacityProviders` resource, as well as allowing the capacity providers and default strategies to be managed in-line by the `aws.ecs.Cluster` resource. You cannot use a Cluster with in-line capacity providers in conjunction with the Capacity Providers resource, nor use more than one Capacity Providers resource with a single Cluster, as doing so will cause a conflict and will lead to mutual overwrites.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.Cluster;
 * import com.pulumi.aws.ecs.ClusterCapacityProviders;
 * import com.pulumi.aws.ecs.ClusterCapacityProvidersArgs;
 * import com.pulumi.aws.ecs.inputs.ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs;
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
 *         var exampleCluster = new Cluster(&#34;exampleCluster&#34;);
 * 
 *         var exampleClusterCapacityProviders = new ClusterCapacityProviders(&#34;exampleClusterCapacityProviders&#34;, ClusterCapacityProvidersArgs.builder()        
 *             .clusterName(exampleCluster.name())
 *             .capacityProviders(&#34;FARGATE&#34;)
 *             .defaultCapacityProviderStrategies(ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs.builder()
 *                 .base(1)
 *                 .weight(100)
 *                 .capacityProvider(&#34;FARGATE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ECS cluster capacity providers can be imported using the `cluster_name` attribute. For example
 * 
 * ```sh
 *  $ pulumi import aws:ecs/clusterCapacityProviders:ClusterCapacityProviders example my-cluster
 * ```
 * 
 */
@ResourceType(type="aws:ecs/clusterCapacityProviders:ClusterCapacityProviders")
public class ClusterCapacityProviders extends com.pulumi.resources.CustomResource {
    /**
     * Set of names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
     * 
     */
    @Export(name="capacityProviders", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> capacityProviders;

    /**
     * @return Set of names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
     * 
     */
    public Output<Optional<List<String>>> capacityProviders() {
        return Codegen.optional(this.capacityProviders);
    }
    /**
     * Name of the ECS cluster to manage capacity providers for.
     * 
     */
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output<String> clusterName;

    /**
     * @return Name of the ECS cluster to manage capacity providers for.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * Set of capacity provider strategies to use by default for the cluster. Detailed below.
     * 
     */
    @Export(name="defaultCapacityProviderStrategies", refs={List.class,ClusterCapacityProvidersDefaultCapacityProviderStrategy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ClusterCapacityProvidersDefaultCapacityProviderStrategy>> defaultCapacityProviderStrategies;

    /**
     * @return Set of capacity provider strategies to use by default for the cluster. Detailed below.
     * 
     */
    public Output<Optional<List<ClusterCapacityProvidersDefaultCapacityProviderStrategy>>> defaultCapacityProviderStrategies() {
        return Codegen.optional(this.defaultCapacityProviderStrategies);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterCapacityProviders(String name) {
        this(name, ClusterCapacityProvidersArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterCapacityProviders(String name, ClusterCapacityProvidersArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterCapacityProviders(String name, ClusterCapacityProvidersArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/clusterCapacityProviders:ClusterCapacityProviders", name, args == null ? ClusterCapacityProvidersArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterCapacityProviders(String name, Output<String> id, @Nullable ClusterCapacityProvidersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/clusterCapacityProviders:ClusterCapacityProviders", name, state, makeResourceOptions(options, id));
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
    public static ClusterCapacityProviders get(String name, Output<String> id, @Nullable ClusterCapacityProvidersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterCapacityProviders(name, id, state, options);
    }
}
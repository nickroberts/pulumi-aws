// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.dynamodb.TableReplicaArgs;
import com.pulumi.aws.dynamodb.inputs.TableReplicaState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DynamoDB table replica resource for [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html).
 * 
 * &gt; **Note:** Use `lifecycle` `ignore_changes` for `replica` in the associated aws.dynamodb.Table configuration.
 * 
 * &gt; **Note:** Do not use the `replica` configuration block of aws.dynamodb.Table together with this resource as the two configuration options are mutually exclusive.
 * 
 * ## Example Usage
 * ### Basic Example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.Provider;
 * import com.pulumi.aws.ProviderArgs;
 * import com.pulumi.aws.dynamodb.Table;
 * import com.pulumi.aws.dynamodb.TableArgs;
 * import com.pulumi.aws.dynamodb.inputs.TableAttributeArgs;
 * import com.pulumi.aws.dynamodb.TableReplica;
 * import com.pulumi.aws.dynamodb.TableReplicaArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var main = new Provider(&#34;main&#34;, ProviderArgs.builder()        
 *             .region(&#34;us-west-2&#34;)
 *             .build());
 * 
 *         var alt = new Provider(&#34;alt&#34;, ProviderArgs.builder()        
 *             .region(&#34;us-east-2&#34;)
 *             .build());
 * 
 *         var exampleTable = new Table(&#34;exampleTable&#34;, TableArgs.builder()        
 *             .hashKey(&#34;BrodoBaggins&#34;)
 *             .billingMode(&#34;PAY_PER_REQUEST&#34;)
 *             .streamEnabled(true)
 *             .streamViewType(&#34;NEW_AND_OLD_IMAGES&#34;)
 *             .attributes(TableAttributeArgs.builder()
 *                 .name(&#34;BrodoBaggins&#34;)
 *                 .type(&#34;S&#34;)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(&#34;aws.main&#34;)
 *                 .build());
 * 
 *         var exampleTableReplica = new TableReplica(&#34;exampleTableReplica&#34;, TableReplicaArgs.builder()        
 *             .globalTableArn(exampleTable.arn())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Name&#34;, &#34;IZPAWS&#34;),
 *                 Map.entry(&#34;Pozo&#34;, &#34;Amargo&#34;)
 *             ))
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(&#34;aws.alt&#34;)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * DynamoDB table replicas can be imported using the `table-name:main-region`, _e.g._,
 * 
 * ```sh
 *  $ pulumi import aws:dynamodb/tableReplica:TableReplica example TestTable:us-west-2
 * ```
 * 
 */
@ResourceType(type="aws:dynamodb/tableReplica:TableReplica")
public class TableReplica extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the table replica.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the table replica.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * ARN of the _main_ or global table which this resource will replicate.
     * 
     */
    @Export(name="globalTableArn", refs={String.class}, tree="[0]")
    private Output<String> globalTableArn;

    /**
     * @return ARN of the _main_ or global table which this resource will replicate.
     * 
     */
    public Output<String> globalTableArn() {
        return this.globalTableArn;
    }
    /**
     * ARN of the CMK that should be used for the AWS KMS encryption.
     * 
     */
    @Export(name="kmsKeyArn", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyArn;

    /**
     * @return ARN of the CMK that should be used for the AWS KMS encryption.
     * 
     */
    public Output<String> kmsKeyArn() {
        return this.kmsKeyArn;
    }
    /**
     * Whether to enable Point In Time Recovery for the replica. Default is `false`.
     * 
     */
    @Export(name="pointInTimeRecovery", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> pointInTimeRecovery;

    /**
     * @return Whether to enable Point In Time Recovery for the replica. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> pointInTimeRecovery() {
        return Codegen.optional(this.pointInTimeRecovery);
    }
    /**
     * Storage class of the table replica. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`. If not used, the table replica will use the same class as the global table.
     * 
     */
    @Export(name="tableClassOverride", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tableClassOverride;

    /**
     * @return Storage class of the table replica. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`. If not used, the table replica will use the same class as the global table.
     * 
     */
    public Output<Optional<String>> tableClassOverride() {
        return Codegen.optional(this.tableClassOverride);
    }
    /**
     * Map of tags to populate on the created table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to populate on the created table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TableReplica(String name) {
        this(name, TableReplicaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TableReplica(String name, TableReplicaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TableReplica(String name, TableReplicaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/tableReplica:TableReplica", name, args == null ? TableReplicaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TableReplica(String name, Output<String> id, @Nullable TableReplicaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/tableReplica:TableReplica", name, state, makeResourceOptions(options, id));
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
    public static TableReplica get(String name, Output<String> id, @Nullable TableReplicaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TableReplica(name, id, state, options);
    }
}
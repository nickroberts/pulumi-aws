// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glacier;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.glacier.VaultArgs;
import com.pulumi.aws.glacier.inputs.VaultState;
import com.pulumi.aws.glacier.outputs.VaultNotification;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Glacier Vault Resource. You can refer to the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-vaults.html) for a full explanation of the Glacier Vault functionality
 * 
 * &gt; **NOTE:** When removing a Glacier Vault, the Vault must be empty.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sns.Topic;
 * import com.pulumi.aws.glacier.Vault;
 * import com.pulumi.aws.glacier.VaultArgs;
 * import com.pulumi.aws.glacier.inputs.VaultNotificationArgs;
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
 *         var awsSnsTopic = new Topic(&#34;awsSnsTopic&#34;);
 * 
 *         var myArchive = new Vault(&#34;myArchive&#34;, VaultArgs.builder()        
 *             .notification(VaultNotificationArgs.builder()
 *                 .snsTopic(awsSnsTopic.arn())
 *                 .events(                
 *                     &#34;ArchiveRetrievalCompleted&#34;,
 *                     &#34;InventoryRetrievalCompleted&#34;)
 *                 .build())
 *             .accessPolicy(&#34;&#34;&#34;
 * {
 *     &#34;Version&#34;:&#34;2012-10-17&#34;,
 *     &#34;Statement&#34;:[
 *        {
 *           &#34;Sid&#34;: &#34;add-read-only-perm&#34;,
 *           &#34;Principal&#34;: &#34;*&#34;,
 *           &#34;Effect&#34;: &#34;Allow&#34;,
 *           &#34;Action&#34;: [
 *              &#34;glacier:InitiateJob&#34;,
 *              &#34;glacier:GetJobOutput&#34;
 *           ],
 *           &#34;Resource&#34;: &#34;arn:aws:glacier:eu-west-1:432981146916:vaults/MyArchive&#34;
 *        }
 *     ]
 * }
 *             &#34;&#34;&#34;)
 *             .tags(Map.of(&#34;Test&#34;, &#34;MyArchive&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Glacier Vaults can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glacier/vault:Vault archive my_archive
 * ```
 * 
 */
@ResourceType(type="aws:glacier/vault:Vault")
public class Vault extends com.pulumi.resources.CustomResource {
    /**
     * The policy document. This is a JSON formatted string.
     * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
     * 
     */
    @Export(name="accessPolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accessPolicy;

    /**
     * @return The policy document. This is a JSON formatted string.
     * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
     * 
     */
    public Output<Optional<String>> accessPolicy() {
        return Codegen.optional(this.accessPolicy);
    }
    /**
     * The ARN of the vault.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the vault.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The URI of the vault that was created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The URI of the vault that was created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, &#39;_&#39; (underscore), &#39;-&#39; (hyphen), and &#39;.&#39; (period).
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, &#39;_&#39; (underscore), &#39;-&#39; (hyphen), and &#39;.&#39; (period).
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The notifications for the Vault. Fields documented below.
     * 
     */
    @Export(name="notification", refs={VaultNotification.class}, tree="[0]")
    private Output</* @Nullable */ VaultNotification> notification;

    /**
     * @return The notifications for the Vault. Fields documented below.
     * 
     */
    public Output<Optional<VaultNotification>> notification() {
        return Codegen.optional(this.notification);
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vault(String name) {
        this(name, VaultArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vault(String name, @Nullable VaultArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vault(String name, @Nullable VaultArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:glacier/vault:Vault", name, args == null ? VaultArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Vault(String name, Output<String> id, @Nullable VaultState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:glacier/vault:Vault", name, state, makeResourceOptions(options, id));
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
    public static Vault get(String name, Output<String> id, @Nullable VaultState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Vault(name, id, state, options);
    }
}
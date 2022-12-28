// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pinpoint;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.pinpoint.GcmChannelArgs;
import com.pulumi.aws.pinpoint.inputs.GcmChannelState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Pinpoint GCM Channel resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.pinpoint.App;
 * import com.pulumi.aws.pinpoint.GcmChannel;
 * import com.pulumi.aws.pinpoint.GcmChannelArgs;
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
 *         var app = new App(&#34;app&#34;);
 * 
 *         var gcm = new GcmChannel(&#34;gcm&#34;, GcmChannelArgs.builder()        
 *             .applicationId(app.applicationId())
 *             .apiKey(&#34;api_key&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Pinpoint GCM Channel can be imported using the `application-id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:pinpoint/gcmChannel:GcmChannel gcm application-id
 * ```
 * 
 */
@ResourceType(type="aws:pinpoint/gcmChannel:GcmChannel")
public class GcmChannel extends com.pulumi.resources.CustomResource {
    /**
     * Platform credential API key from Google.
     * 
     */
    @Export(name="apiKey", refs={String.class}, tree="[0]")
    private Output<String> apiKey;

    /**
     * @return Platform credential API key from Google.
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }
    /**
     * The application ID.
     * 
     */
    @Export(name="applicationId", refs={String.class}, tree="[0]")
    private Output<String> applicationId;

    /**
     * @return The application ID.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GcmChannel(String name) {
        this(name, GcmChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GcmChannel(String name, GcmChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GcmChannel(String name, GcmChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/gcmChannel:GcmChannel", name, args == null ? GcmChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GcmChannel(String name, Output<String> id, @Nullable GcmChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/gcmChannel:GcmChannel", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "apiKey"
            ))
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
    public static GcmChannel get(String name, Output<String> id, @Nullable GcmChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GcmChannel(name, id, state, options);
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.grafana;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.grafana.LicenseAssociationArgs;
import com.pulumi.aws.grafana.inputs.LicenseAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Managed Grafana workspace license association resource.
 * 
 * ## Example Usage
 * ### Basic configuration
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.grafana.Workspace;
 * import com.pulumi.aws.grafana.WorkspaceArgs;
 * import com.pulumi.aws.grafana.LicenseAssociation;
 * import com.pulumi.aws.grafana.LicenseAssociationArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var assume = new Role(&#34;assume&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;Statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Action&#34;, &#34;sts:AssumeRole&#34;),
 *                         jsonProperty(&#34;Effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;Sid&#34;, &#34;&#34;),
 *                         jsonProperty(&#34;Principal&#34;, jsonObject(
 *                             jsonProperty(&#34;Service&#34;, &#34;grafana.amazonaws.com&#34;)
 *                         ))
 *                     )))
 *                 )))
 *             .build());
 * 
 *         var exampleWorkspace = new Workspace(&#34;exampleWorkspace&#34;, WorkspaceArgs.builder()        
 *             .accountAccessType(&#34;CURRENT_ACCOUNT&#34;)
 *             .authenticationProviders(&#34;SAML&#34;)
 *             .permissionType(&#34;SERVICE_MANAGED&#34;)
 *             .roleArn(assume.arn())
 *             .build());
 * 
 *         var exampleLicenseAssociation = new LicenseAssociation(&#34;exampleLicenseAssociation&#34;, LicenseAssociationArgs.builder()        
 *             .licenseType(&#34;ENTERPRISE_FREE_TRIAL&#34;)
 *             .workspaceId(exampleWorkspace.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Grafana workspace license association can be imported using the workspace&#39;s `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:grafana/licenseAssociation:LicenseAssociation example g-2054c75a02
 * ```
 * 
 */
@ResourceType(type="aws:grafana/licenseAssociation:LicenseAssociation")
public class LicenseAssociation extends com.pulumi.resources.CustomResource {
    /**
     * If `license_type` is set to `ENTERPRISE_FREE_TRIAL`, this is the expiration date of the free trial.
     * 
     */
    @Export(name="freeTrialExpiration", refs={String.class}, tree="[0]")
    private Output<String> freeTrialExpiration;

    /**
     * @return If `license_type` is set to `ENTERPRISE_FREE_TRIAL`, this is the expiration date of the free trial.
     * 
     */
    public Output<String> freeTrialExpiration() {
        return this.freeTrialExpiration;
    }
    /**
     * If `license_type` is set to `ENTERPRISE`, this is the expiration date of the enterprise license.
     * 
     */
    @Export(name="licenseExpiration", refs={String.class}, tree="[0]")
    private Output<String> licenseExpiration;

    /**
     * @return If `license_type` is set to `ENTERPRISE`, this is the expiration date of the enterprise license.
     * 
     */
    public Output<String> licenseExpiration() {
        return this.licenseExpiration;
    }
    /**
     * The type of license for the workspace license association. Valid values are `ENTERPRISE` and `ENTERPRISE_FREE_TRIAL`.
     * 
     */
    @Export(name="licenseType", refs={String.class}, tree="[0]")
    private Output<String> licenseType;

    /**
     * @return The type of license for the workspace license association. Valid values are `ENTERPRISE` and `ENTERPRISE_FREE_TRIAL`.
     * 
     */
    public Output<String> licenseType() {
        return this.licenseType;
    }
    /**
     * The workspace id.
     * 
     */
    @Export(name="workspaceId", refs={String.class}, tree="[0]")
    private Output<String> workspaceId;

    /**
     * @return The workspace id.
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LicenseAssociation(String name) {
        this(name, LicenseAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LicenseAssociation(String name, LicenseAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LicenseAssociation(String name, LicenseAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:grafana/licenseAssociation:LicenseAssociation", name, args == null ? LicenseAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LicenseAssociation(String name, Output<String> id, @Nullable LicenseAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:grafana/licenseAssociation:LicenseAssociation", name, state, makeResourceOptions(options, id));
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
    public static LicenseAssociation get(String name, Output<String> id, @Nullable LicenseAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LicenseAssociation(name, id, state, options);
    }
}
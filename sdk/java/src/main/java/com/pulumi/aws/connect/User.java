// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.connect.UserArgs;
import com.pulumi.aws.connect.inputs.UserState;
import com.pulumi.aws.connect.outputs.UserIdentityInfo;
import com.pulumi.aws.connect.outputs.UserPhoneConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect User resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 * 
 * ## Example Usage
 * ### Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.User;
 * import com.pulumi.aws.connect.UserArgs;
 * import com.pulumi.aws.connect.inputs.UserIdentityInfoArgs;
 * import com.pulumi.aws.connect.inputs.UserPhoneConfigArgs;
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
 *         var example = new User(&#34;example&#34;, UserArgs.builder()        
 *             .instanceId(aws_connect_instance.example().id())
 *             .password(&#34;Password123&#34;)
 *             .routingProfileId(aws_connect_routing_profile.example().routing_profile_id())
 *             .securityProfileIds(aws_connect_security_profile.example().security_profile_id())
 *             .identityInfo(UserIdentityInfoArgs.builder()
 *                 .firstName(&#34;example&#34;)
 *                 .lastName(&#34;example2&#34;)
 *                 .build())
 *             .phoneConfig(UserPhoneConfigArgs.builder()
 *                 .afterContactWorkTimeLimit(0)
 *                 .phoneType(&#34;SOFT_PHONE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With hierarchy_group_id
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.User;
 * import com.pulumi.aws.connect.UserArgs;
 * import com.pulumi.aws.connect.inputs.UserIdentityInfoArgs;
 * import com.pulumi.aws.connect.inputs.UserPhoneConfigArgs;
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
 *         var example = new User(&#34;example&#34;, UserArgs.builder()        
 *             .instanceId(aws_connect_instance.example().id())
 *             .password(&#34;Password123&#34;)
 *             .routingProfileId(aws_connect_routing_profile.example().routing_profile_id())
 *             .hierarchyGroupId(aws_connect_user_hierarchy_group.example().hierarchy_group_id())
 *             .securityProfileIds(aws_connect_security_profile.example().security_profile_id())
 *             .identityInfo(UserIdentityInfoArgs.builder()
 *                 .firstName(&#34;example&#34;)
 *                 .lastName(&#34;example2&#34;)
 *                 .build())
 *             .phoneConfig(UserPhoneConfigArgs.builder()
 *                 .afterContactWorkTimeLimit(0)
 *                 .phoneType(&#34;SOFT_PHONE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With identity_info filled
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.User;
 * import com.pulumi.aws.connect.UserArgs;
 * import com.pulumi.aws.connect.inputs.UserIdentityInfoArgs;
 * import com.pulumi.aws.connect.inputs.UserPhoneConfigArgs;
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
 *         var example = new User(&#34;example&#34;, UserArgs.builder()        
 *             .instanceId(aws_connect_instance.example().id())
 *             .password(&#34;Password123&#34;)
 *             .routingProfileId(aws_connect_routing_profile.example().routing_profile_id())
 *             .securityProfileIds(aws_connect_security_profile.example().security_profile_id())
 *             .identityInfo(UserIdentityInfoArgs.builder()
 *                 .email(&#34;example@example.com&#34;)
 *                 .firstName(&#34;example&#34;)
 *                 .lastName(&#34;example2&#34;)
 *                 .build())
 *             .phoneConfig(UserPhoneConfigArgs.builder()
 *                 .afterContactWorkTimeLimit(0)
 *                 .phoneType(&#34;SOFT_PHONE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With phone_config phone type as desk phone
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.User;
 * import com.pulumi.aws.connect.UserArgs;
 * import com.pulumi.aws.connect.inputs.UserPhoneConfigArgs;
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
 *         var example = new User(&#34;example&#34;, UserArgs.builder()        
 *             .instanceId(aws_connect_instance.example().id())
 *             .password(&#34;Password123&#34;)
 *             .routingProfileId(aws_connect_routing_profile.example().routing_profile_id())
 *             .securityProfileIds(aws_connect_security_profile.example().security_profile_id())
 *             .phoneConfig(UserPhoneConfigArgs.builder()
 *                 .afterContactWorkTimeLimit(0)
 *                 .phoneType(&#34;SOFT_PHONE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With multiple Security profile ids specified in security_profile_ids
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.User;
 * import com.pulumi.aws.connect.UserArgs;
 * import com.pulumi.aws.connect.inputs.UserPhoneConfigArgs;
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
 *         var example = new User(&#34;example&#34;, UserArgs.builder()        
 *             .instanceId(aws_connect_instance.example().id())
 *             .password(&#34;Password123&#34;)
 *             .routingProfileId(aws_connect_routing_profile.example().routing_profile_id())
 *             .securityProfileIds(            
 *                 aws_connect_security_profile.example().security_profile_id(),
 *                 aws_connect_security_profile.example2().security_profile_id())
 *             .phoneConfig(UserPhoneConfigArgs.builder()
 *                 .afterContactWorkTimeLimit(0)
 *                 .autoAccept(false)
 *                 .deskPhoneNumber(&#34;+112345678912&#34;)
 *                 .phoneType(&#34;DESK_PHONE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Amazon Connect Users can be imported using the `instance_id` and `user_id` separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:connect/user:User example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
 * ```
 * 
 */
@ResourceType(type="aws:connect/user:User")
public class User extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the user.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the user.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate users from your directory. This parameter is required if you are using an existing directory for identity management in Amazon Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management and include this parameter, an error is returned.
     * 
     */
    @Export(name="directoryUserId", refs={String.class}, tree="[0]")
    private Output<String> directoryUserId;

    /**
     * @return The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate users from your directory. This parameter is required if you are using an existing directory for identity management in Amazon Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management and include this parameter, an error is returned.
     * 
     */
    public Output<String> directoryUserId() {
        return this.directoryUserId;
    }
    /**
     * The identifier of the hierarchy group for the user.
     * 
     */
    @Export(name="hierarchyGroupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hierarchyGroupId;

    /**
     * @return The identifier of the hierarchy group for the user.
     * 
     */
    public Output<Optional<String>> hierarchyGroupId() {
        return Codegen.optional(this.hierarchyGroupId);
    }
    /**
     * A block that contains information about the identity of the user. Documented below.
     * 
     */
    @Export(name="identityInfo", refs={UserIdentityInfo.class}, tree="[0]")
    private Output</* @Nullable */ UserIdentityInfo> identityInfo;

    /**
     * @return A block that contains information about the identity of the user. Documented below.
     * 
     */
    public Output<Optional<UserIdentityInfo>> identityInfo() {
        return Codegen.optional(this.identityInfo);
    }
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The user name for the account. For instances not using SAML for identity management, the user name can include up to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters from `[a-zA-Z0-9_-.\@]+`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The user name for the account. For instances not using SAML for identity management, the user name can include up to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters from `[a-zA-Z0-9_-.\@]+`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * A block that contains information about the phone settings for the user. Documented below.
     * 
     */
    @Export(name="phoneConfig", refs={UserPhoneConfig.class}, tree="[0]")
    private Output<UserPhoneConfig> phoneConfig;

    /**
     * @return A block that contains information about the phone settings for the user. Documented below.
     * 
     */
    public Output<UserPhoneConfig> phoneConfig() {
        return this.phoneConfig;
    }
    /**
     * The identifier of the routing profile for the user.
     * 
     */
    @Export(name="routingProfileId", refs={String.class}, tree="[0]")
    private Output<String> routingProfileId;

    /**
     * @return The identifier of the routing profile for the user.
     * 
     */
    public Output<String> routingProfileId() {
        return this.routingProfileId;
    }
    /**
     * A list of identifiers for the security profiles for the user. Specify a minimum of 1 and maximum of 10 security profile ids. For more information, see [Best Practices for Security Profiles](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html) in the Amazon Connect Administrator Guide.
     * 
     */
    @Export(name="securityProfileIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityProfileIds;

    /**
     * @return A list of identifiers for the security profiles for the user. Specify a minimum of 1 and maximum of 10 security profile ids. For more information, see [Best Practices for Security Profiles](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html) in the Amazon Connect Administrator Guide.
     * 
     */
    public Output<List<String>> securityProfileIds() {
        return this.securityProfileIds;
    }
    /**
     * Tags to apply to the user. If configured with a provider
     * `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the user. If configured with a provider
     * `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The identifier for the user.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return The identifier for the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/user:User", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
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
    public static User get(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
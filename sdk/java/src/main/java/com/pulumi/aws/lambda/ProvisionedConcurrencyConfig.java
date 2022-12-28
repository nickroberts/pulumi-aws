// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lambda.ProvisionedConcurrencyConfigArgs;
import com.pulumi.aws.lambda.inputs.ProvisionedConcurrencyConfigState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Lambda Provisioned Concurrency Configuration.
 * 
 * ## Example Usage
 * ### Alias Name
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lambda.ProvisionedConcurrencyConfig;
 * import com.pulumi.aws.lambda.ProvisionedConcurrencyConfigArgs;
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
 *         var example = new ProvisionedConcurrencyConfig(&#34;example&#34;, ProvisionedConcurrencyConfigArgs.builder()        
 *             .functionName(aws_lambda_alias.example().function_name())
 *             .provisionedConcurrentExecutions(1)
 *             .qualifier(aws_lambda_alias.example().name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Function Version
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lambda.ProvisionedConcurrencyConfig;
 * import com.pulumi.aws.lambda.ProvisionedConcurrencyConfigArgs;
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
 *         var example = new ProvisionedConcurrencyConfig(&#34;example&#34;, ProvisionedConcurrencyConfigArgs.builder()        
 *             .functionName(aws_lambda_function.example().function_name())
 *             .provisionedConcurrentExecutions(1)
 *             .qualifier(aws_lambda_function.example().version())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Lambda Provisioned Concurrency Configs can be imported using the `function_name` and `qualifier` separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:lambda/provisionedConcurrencyConfig:ProvisionedConcurrencyConfig example my_function:production
 * ```
 * 
 */
@ResourceType(type="aws:lambda/provisionedConcurrencyConfig:ProvisionedConcurrencyConfig")
public class ProvisionedConcurrencyConfig extends com.pulumi.resources.CustomResource {
    /**
     * Name or Amazon Resource Name (ARN) of the Lambda Function.
     * 
     */
    @Export(name="functionName", refs={String.class}, tree="[0]")
    private Output<String> functionName;

    /**
     * @return Name or Amazon Resource Name (ARN) of the Lambda Function.
     * 
     */
    public Output<String> functionName() {
        return this.functionName;
    }
    /**
     * Amount of capacity to allocate. Must be greater than or equal to `1`.
     * 
     */
    @Export(name="provisionedConcurrentExecutions", refs={Integer.class}, tree="[0]")
    private Output<Integer> provisionedConcurrentExecutions;

    /**
     * @return Amount of capacity to allocate. Must be greater than or equal to `1`.
     * 
     */
    public Output<Integer> provisionedConcurrentExecutions() {
        return this.provisionedConcurrentExecutions;
    }
    /**
     * Lambda Function version or Lambda Alias name.
     * 
     */
    @Export(name="qualifier", refs={String.class}, tree="[0]")
    private Output<String> qualifier;

    /**
     * @return Lambda Function version or Lambda Alias name.
     * 
     */
    public Output<String> qualifier() {
        return this.qualifier;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProvisionedConcurrencyConfig(String name) {
        this(name, ProvisionedConcurrencyConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProvisionedConcurrencyConfig(String name, ProvisionedConcurrencyConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProvisionedConcurrencyConfig(String name, ProvisionedConcurrencyConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/provisionedConcurrencyConfig:ProvisionedConcurrencyConfig", name, args == null ? ProvisionedConcurrencyConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProvisionedConcurrencyConfig(String name, Output<String> id, @Nullable ProvisionedConcurrencyConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/provisionedConcurrencyConfig:ProvisionedConcurrencyConfig", name, state, makeResourceOptions(options, id));
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
    public static ProvisionedConcurrencyConfig get(String name, Output<String> id, @Nullable ProvisionedConcurrencyConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProvisionedConcurrencyConfig(name, id, state, options);
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.transfer.WorkflowArgs;
import com.pulumi.aws.transfer.inputs.WorkflowState;
import com.pulumi.aws.transfer.outputs.WorkflowOnExceptionStep;
import com.pulumi.aws.transfer.outputs.WorkflowStep;
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
 * Provides a AWS Transfer Workflow resource.
 * 
 * ## Example Usage
 * ### Basic single step example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.transfer.Workflow;
 * import com.pulumi.aws.transfer.WorkflowArgs;
 * import com.pulumi.aws.transfer.inputs.WorkflowStepArgs;
 * import com.pulumi.aws.transfer.inputs.WorkflowStepDeleteStepDetailsArgs;
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
 *         var example = new Workflow(&#34;example&#34;, WorkflowArgs.builder()        
 *             .steps(WorkflowStepArgs.builder()
 *                 .deleteStepDetails(WorkflowStepDeleteStepDetailsArgs.builder()
 *                     .name(&#34;example&#34;)
 *                     .sourceFileLocation(&#34;${original.file}&#34;)
 *                     .build())
 *                 .type(&#34;DELETE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Multistep example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.transfer.Workflow;
 * import com.pulumi.aws.transfer.WorkflowArgs;
 * import com.pulumi.aws.transfer.inputs.WorkflowStepArgs;
 * import com.pulumi.aws.transfer.inputs.WorkflowStepCustomStepDetailsArgs;
 * import com.pulumi.aws.transfer.inputs.WorkflowStepTagStepDetailsArgs;
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
 *         var example = new Workflow(&#34;example&#34;, WorkflowArgs.builder()        
 *             .steps(            
 *                 WorkflowStepArgs.builder()
 *                     .customStepDetails(WorkflowStepCustomStepDetailsArgs.builder()
 *                         .name(&#34;example&#34;)
 *                         .sourceFileLocation(&#34;${original.file}&#34;)
 *                         .target(aws_lambda_function.example().arn())
 *                         .timeoutSeconds(60)
 *                         .build())
 *                     .type(&#34;CUSTOM&#34;)
 *                     .build(),
 *                 WorkflowStepArgs.builder()
 *                     .tagStepDetails(WorkflowStepTagStepDetailsArgs.builder()
 *                         .name(&#34;example&#34;)
 *                         .sourceFileLocation(&#34;${original.file}&#34;)
 *                         .tags(WorkflowStepTagStepDetailsTagArgs.builder()
 *                             .key(&#34;Name&#34;)
 *                             .value(&#34;Hello World&#34;)
 *                             .build())
 *                         .build())
 *                     .type(&#34;TAG&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Transfer Workflows can be imported using the `worflow_id`.
 * 
 * ```sh
 *  $ pulumi import aws:transfer/workflow:Workflow example example
 * ```
 * 
 */
@ResourceType(type="aws:transfer/workflow:Workflow")
public class Workflow extends com.pulumi.resources.CustomResource {
    /**
     * The Workflow ARN.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Workflow ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A textual description for the workflow.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A textual description for the workflow.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
     * 
     */
    @Export(name="onExceptionSteps", refs={List.class,WorkflowOnExceptionStep.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WorkflowOnExceptionStep>> onExceptionSteps;

    /**
     * @return Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
     * 
     */
    public Output<Optional<List<WorkflowOnExceptionStep>>> onExceptionSteps() {
        return Codegen.optional(this.onExceptionSteps);
    }
    /**
     * Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
     * 
     */
    @Export(name="steps", refs={List.class,WorkflowStep.class}, tree="[0,1]")
    private Output<List<WorkflowStep>> steps;

    /**
     * @return Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
     * 
     */
    public Output<List<WorkflowStep>> steps() {
        return this.steps;
    }
    /**
     * Array that contains from 1 to 10 key/value pairs. See S3 Tags below.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Array that contains from 1 to 10 key/value pairs. See S3 Tags below.
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
    public Workflow(String name) {
        this(name, WorkflowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workflow(String name, WorkflowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workflow(String name, WorkflowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:transfer/workflow:Workflow", name, args == null ? WorkflowArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Workflow(String name, Output<String> id, @Nullable WorkflowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:transfer/workflow:Workflow", name, state, makeResourceOptions(options, id));
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
    public static Workflow get(String name, Output<String> id, @Nullable WorkflowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Workflow(name, id, state, options);
    }
}
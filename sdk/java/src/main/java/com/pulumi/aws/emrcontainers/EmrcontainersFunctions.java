// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emrcontainers;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterArgs;
import com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterPlainArgs;
import com.pulumi.aws.emrcontainers.outputs.GetVirtualClusterResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EmrcontainersFunctions {
    /**
     * Retrieve information about an EMR Containers (EMR on EKS) Virtual Cluster.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emrcontainers.EmrcontainersFunctions;
     * import com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterArgs;
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
     *         final var example = EmrcontainersFunctions.getVirtualCluster(GetVirtualClusterArgs.builder()
     *             .virtualClusterId(&#34;example id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;name&#34;, example.applyValue(getVirtualClusterResult -&gt; getVirtualClusterResult.name()));
     *         ctx.export(&#34;arn&#34;, example.applyValue(getVirtualClusterResult -&gt; getVirtualClusterResult.arn()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetVirtualClusterResult> getVirtualCluster(GetVirtualClusterArgs args) {
        return getVirtualCluster(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about an EMR Containers (EMR on EKS) Virtual Cluster.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emrcontainers.EmrcontainersFunctions;
     * import com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterArgs;
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
     *         final var example = EmrcontainersFunctions.getVirtualCluster(GetVirtualClusterArgs.builder()
     *             .virtualClusterId(&#34;example id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;name&#34;, example.applyValue(getVirtualClusterResult -&gt; getVirtualClusterResult.name()));
     *         ctx.export(&#34;arn&#34;, example.applyValue(getVirtualClusterResult -&gt; getVirtualClusterResult.arn()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetVirtualClusterResult> getVirtualClusterPlain(GetVirtualClusterPlainArgs args) {
        return getVirtualClusterPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about an EMR Containers (EMR on EKS) Virtual Cluster.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emrcontainers.EmrcontainersFunctions;
     * import com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterArgs;
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
     *         final var example = EmrcontainersFunctions.getVirtualCluster(GetVirtualClusterArgs.builder()
     *             .virtualClusterId(&#34;example id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;name&#34;, example.applyValue(getVirtualClusterResult -&gt; getVirtualClusterResult.name()));
     *         ctx.export(&#34;arn&#34;, example.applyValue(getVirtualClusterResult -&gt; getVirtualClusterResult.arn()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetVirtualClusterResult> getVirtualCluster(GetVirtualClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:emrcontainers/getVirtualCluster:getVirtualCluster", TypeShape.of(GetVirtualClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about an EMR Containers (EMR on EKS) Virtual Cluster.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emrcontainers.EmrcontainersFunctions;
     * import com.pulumi.aws.emrcontainers.inputs.GetVirtualClusterArgs;
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
     *         final var example = EmrcontainersFunctions.getVirtualCluster(GetVirtualClusterArgs.builder()
     *             .virtualClusterId(&#34;example id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;name&#34;, example.applyValue(getVirtualClusterResult -&gt; getVirtualClusterResult.name()));
     *         ctx.export(&#34;arn&#34;, example.applyValue(getVirtualClusterResult -&gt; getVirtualClusterResult.arn()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetVirtualClusterResult> getVirtualClusterPlain(GetVirtualClusterPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:emrcontainers/getVirtualCluster:getVirtualCluster", TypeShape.of(GetVirtualClusterResult.class), args, Utilities.withVersion(options));
    }
}
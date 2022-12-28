// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2clientvpn;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs;
import com.pulumi.aws.ec2clientvpn.inputs.GetEndpointPlainArgs;
import com.pulumi.aws.ec2clientvpn.outputs.GetEndpointResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class Ec2clientvpnFunctions {
    /**
     * Get information on an EC2 Client VPN endpoint.
     * 
     * ## Example Usage
     * ### By Filter
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions;
     * import com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs;
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
     *         final var example = Ec2clientvpnFunctions.getEndpoint(GetEndpointArgs.builder()
     *             .filters(GetEndpointFilterArgs.builder()
     *                 .name(&#34;tag:Name&#34;)
     *                 .values(&#34;ExampleVpn&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### By Identifier
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions;
     * import com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs;
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
     *         final var example = Ec2clientvpnFunctions.getEndpoint(GetEndpointArgs.builder()
     *             .clientVpnEndpointId(&#34;cvpn-endpoint-083cf50d6eb314f21&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetEndpointResult> getEndpoint() {
        return getEndpoint(GetEndpointArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Get information on an EC2 Client VPN endpoint.
     * 
     * ## Example Usage
     * ### By Filter
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions;
     * import com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs;
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
     *         final var example = Ec2clientvpnFunctions.getEndpoint(GetEndpointArgs.builder()
     *             .filters(GetEndpointFilterArgs.builder()
     *                 .name(&#34;tag:Name&#34;)
     *                 .values(&#34;ExampleVpn&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### By Identifier
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions;
     * import com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs;
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
     *         final var example = Ec2clientvpnFunctions.getEndpoint(GetEndpointArgs.builder()
     *             .clientVpnEndpointId(&#34;cvpn-endpoint-083cf50d6eb314f21&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetEndpointResult> getEndpointPlain() {
        return getEndpointPlain(GetEndpointPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Get information on an EC2 Client VPN endpoint.
     * 
     * ## Example Usage
     * ### By Filter
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions;
     * import com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs;
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
     *         final var example = Ec2clientvpnFunctions.getEndpoint(GetEndpointArgs.builder()
     *             .filters(GetEndpointFilterArgs.builder()
     *                 .name(&#34;tag:Name&#34;)
     *                 .values(&#34;ExampleVpn&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### By Identifier
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions;
     * import com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs;
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
     *         final var example = Ec2clientvpnFunctions.getEndpoint(GetEndpointArgs.builder()
     *             .clientVpnEndpointId(&#34;cvpn-endpoint-083cf50d6eb314f21&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetEndpointResult> getEndpoint(GetEndpointArgs args) {
        return getEndpoint(args, InvokeOptions.Empty);
    }
    /**
     * Get information on an EC2 Client VPN endpoint.
     * 
     * ## Example Usage
     * ### By Filter
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions;
     * import com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs;
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
     *         final var example = Ec2clientvpnFunctions.getEndpoint(GetEndpointArgs.builder()
     *             .filters(GetEndpointFilterArgs.builder()
     *                 .name(&#34;tag:Name&#34;)
     *                 .values(&#34;ExampleVpn&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### By Identifier
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions;
     * import com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs;
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
     *         final var example = Ec2clientvpnFunctions.getEndpoint(GetEndpointArgs.builder()
     *             .clientVpnEndpointId(&#34;cvpn-endpoint-083cf50d6eb314f21&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetEndpointResult> getEndpointPlain(GetEndpointPlainArgs args) {
        return getEndpointPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get information on an EC2 Client VPN endpoint.
     * 
     * ## Example Usage
     * ### By Filter
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions;
     * import com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs;
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
     *         final var example = Ec2clientvpnFunctions.getEndpoint(GetEndpointArgs.builder()
     *             .filters(GetEndpointFilterArgs.builder()
     *                 .name(&#34;tag:Name&#34;)
     *                 .values(&#34;ExampleVpn&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### By Identifier
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions;
     * import com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs;
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
     *         final var example = Ec2clientvpnFunctions.getEndpoint(GetEndpointArgs.builder()
     *             .clientVpnEndpointId(&#34;cvpn-endpoint-083cf50d6eb314f21&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetEndpointResult> getEndpoint(GetEndpointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ec2clientvpn/getEndpoint:getEndpoint", TypeShape.of(GetEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get information on an EC2 Client VPN endpoint.
     * 
     * ## Example Usage
     * ### By Filter
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions;
     * import com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs;
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
     *         final var example = Ec2clientvpnFunctions.getEndpoint(GetEndpointArgs.builder()
     *             .filters(GetEndpointFilterArgs.builder()
     *                 .name(&#34;tag:Name&#34;)
     *                 .values(&#34;ExampleVpn&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### By Identifier
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions;
     * import com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs;
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
     *         final var example = Ec2clientvpnFunctions.getEndpoint(GetEndpointArgs.builder()
     *             .clientVpnEndpointId(&#34;cvpn-endpoint-083cf50d6eb314f21&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetEndpointResult> getEndpointPlain(GetEndpointPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2clientvpn/getEndpoint:getEndpoint", TypeShape.of(GetEndpointResult.class), args, Utilities.withVersion(options));
    }
}
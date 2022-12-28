// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.backup.inputs.GetFrameworkArgs;
import com.pulumi.aws.backup.inputs.GetFrameworkPlainArgs;
import com.pulumi.aws.backup.inputs.GetPlanArgs;
import com.pulumi.aws.backup.inputs.GetPlanPlainArgs;
import com.pulumi.aws.backup.inputs.GetReportPlanArgs;
import com.pulumi.aws.backup.inputs.GetReportPlanPlainArgs;
import com.pulumi.aws.backup.inputs.GetSelectionArgs;
import com.pulumi.aws.backup.inputs.GetSelectionPlainArgs;
import com.pulumi.aws.backup.inputs.GetVaultArgs;
import com.pulumi.aws.backup.inputs.GetVaultPlainArgs;
import com.pulumi.aws.backup.outputs.GetFrameworkResult;
import com.pulumi.aws.backup.outputs.GetPlanResult;
import com.pulumi.aws.backup.outputs.GetReportPlanResult;
import com.pulumi.aws.backup.outputs.GetSelectionResult;
import com.pulumi.aws.backup.outputs.GetVaultResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class BackupFunctions {
    /**
     * Use this data source to get information on an existing backup framework.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetFrameworkArgs;
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
     *         final var example = BackupFunctions.getFramework(GetFrameworkArgs.builder()
     *             .name(&#34;my_example_backup_framework_name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetFrameworkResult> getFramework(GetFrameworkArgs args) {
        return getFramework(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information on an existing backup framework.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetFrameworkArgs;
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
     *         final var example = BackupFunctions.getFramework(GetFrameworkArgs.builder()
     *             .name(&#34;my_example_backup_framework_name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFrameworkResult> getFrameworkPlain(GetFrameworkPlainArgs args) {
        return getFrameworkPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information on an existing backup framework.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetFrameworkArgs;
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
     *         final var example = BackupFunctions.getFramework(GetFrameworkArgs.builder()
     *             .name(&#34;my_example_backup_framework_name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetFrameworkResult> getFramework(GetFrameworkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:backup/getFramework:getFramework", TypeShape.of(GetFrameworkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information on an existing backup framework.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetFrameworkArgs;
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
     *         final var example = BackupFunctions.getFramework(GetFrameworkArgs.builder()
     *             .name(&#34;my_example_backup_framework_name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFrameworkResult> getFrameworkPlain(GetFrameworkPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:backup/getFramework:getFramework", TypeShape.of(GetFrameworkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information on an existing backup plan.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetPlanArgs;
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
     *         final var example = BackupFunctions.getPlan(GetPlanArgs.builder()
     *             .planId(&#34;my_example_backup_plan_id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetPlanResult> getPlan(GetPlanArgs args) {
        return getPlan(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information on an existing backup plan.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetPlanArgs;
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
     *         final var example = BackupFunctions.getPlan(GetPlanArgs.builder()
     *             .planId(&#34;my_example_backup_plan_id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPlanResult> getPlanPlain(GetPlanPlainArgs args) {
        return getPlanPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information on an existing backup plan.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetPlanArgs;
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
     *         final var example = BackupFunctions.getPlan(GetPlanArgs.builder()
     *             .planId(&#34;my_example_backup_plan_id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetPlanResult> getPlan(GetPlanArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:backup/getPlan:getPlan", TypeShape.of(GetPlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information on an existing backup plan.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetPlanArgs;
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
     *         final var example = BackupFunctions.getPlan(GetPlanArgs.builder()
     *             .planId(&#34;my_example_backup_plan_id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPlanResult> getPlanPlain(GetPlanPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:backup/getPlan:getPlan", TypeShape.of(GetPlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information on an existing backup report plan.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetReportPlanArgs;
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
     *         final var example = BackupFunctions.getReportPlan(GetReportPlanArgs.builder()
     *             .name(&#34;my_example_backup_report_plan_name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetReportPlanResult> getReportPlan(GetReportPlanArgs args) {
        return getReportPlan(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information on an existing backup report plan.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetReportPlanArgs;
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
     *         final var example = BackupFunctions.getReportPlan(GetReportPlanArgs.builder()
     *             .name(&#34;my_example_backup_report_plan_name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetReportPlanResult> getReportPlanPlain(GetReportPlanPlainArgs args) {
        return getReportPlanPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information on an existing backup report plan.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetReportPlanArgs;
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
     *         final var example = BackupFunctions.getReportPlan(GetReportPlanArgs.builder()
     *             .name(&#34;my_example_backup_report_plan_name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetReportPlanResult> getReportPlan(GetReportPlanArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:backup/getReportPlan:getReportPlan", TypeShape.of(GetReportPlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information on an existing backup report plan.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetReportPlanArgs;
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
     *         final var example = BackupFunctions.getReportPlan(GetReportPlanArgs.builder()
     *             .name(&#34;my_example_backup_report_plan_name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetReportPlanResult> getReportPlanPlain(GetReportPlanPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:backup/getReportPlan:getReportPlan", TypeShape.of(GetReportPlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information on an existing backup selection.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetSelectionArgs;
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
     *         final var example = BackupFunctions.getSelection(GetSelectionArgs.builder()
     *             .planId(data.aws_backup_plan().example().id())
     *             .selectionId(&#34;selection-id-example&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSelectionResult> getSelection(GetSelectionArgs args) {
        return getSelection(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information on an existing backup selection.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetSelectionArgs;
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
     *         final var example = BackupFunctions.getSelection(GetSelectionArgs.builder()
     *             .planId(data.aws_backup_plan().example().id())
     *             .selectionId(&#34;selection-id-example&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSelectionResult> getSelectionPlain(GetSelectionPlainArgs args) {
        return getSelectionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information on an existing backup selection.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetSelectionArgs;
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
     *         final var example = BackupFunctions.getSelection(GetSelectionArgs.builder()
     *             .planId(data.aws_backup_plan().example().id())
     *             .selectionId(&#34;selection-id-example&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSelectionResult> getSelection(GetSelectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:backup/getSelection:getSelection", TypeShape.of(GetSelectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information on an existing backup selection.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetSelectionArgs;
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
     *         final var example = BackupFunctions.getSelection(GetSelectionArgs.builder()
     *             .planId(data.aws_backup_plan().example().id())
     *             .selectionId(&#34;selection-id-example&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSelectionResult> getSelectionPlain(GetSelectionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:backup/getSelection:getSelection", TypeShape.of(GetSelectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information on an existing backup vault.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetVaultArgs;
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
     *         final var example = BackupFunctions.getVault(GetVaultArgs.builder()
     *             .name(&#34;example_backup_vault&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetVaultResult> getVault(GetVaultArgs args) {
        return getVault(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information on an existing backup vault.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetVaultArgs;
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
     *         final var example = BackupFunctions.getVault(GetVaultArgs.builder()
     *             .name(&#34;example_backup_vault&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetVaultResult> getVaultPlain(GetVaultPlainArgs args) {
        return getVaultPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information on an existing backup vault.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetVaultArgs;
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
     *         final var example = BackupFunctions.getVault(GetVaultArgs.builder()
     *             .name(&#34;example_backup_vault&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetVaultResult> getVault(GetVaultArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:backup/getVault:getVault", TypeShape.of(GetVaultResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information on an existing backup vault.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.backup.BackupFunctions;
     * import com.pulumi.aws.backup.inputs.GetVaultArgs;
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
     *         final var example = BackupFunctions.getVault(GetVaultArgs.builder()
     *             .name(&#34;example_backup_vault&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetVaultResult> getVaultPlain(GetVaultPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:backup/getVault:getVault", TypeShape.of(GetVaultResult.class), args, Utilities.withVersion(options));
    }
}
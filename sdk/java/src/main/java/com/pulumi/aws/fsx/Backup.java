// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.fsx.BackupArgs;
import com.pulumi.aws.fsx.inputs.BackupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a FSx Backup resource.
 * 
 * ## Lustre Example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.fsx.LustreFileSystem;
 * import com.pulumi.aws.fsx.LustreFileSystemArgs;
 * import com.pulumi.aws.fsx.Backup;
 * import com.pulumi.aws.fsx.BackupArgs;
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
 *         var exampleLustreFileSystem = new LustreFileSystem(&#34;exampleLustreFileSystem&#34;, LustreFileSystemArgs.builder()        
 *             .storageCapacity(1200)
 *             .subnetIds(aws_subnet.example().id())
 *             .deploymentType(&#34;PERSISTENT_1&#34;)
 *             .perUnitStorageThroughput(50)
 *             .build());
 * 
 *         var exampleBackup = new Backup(&#34;exampleBackup&#34;, BackupArgs.builder()        
 *             .fileSystemId(exampleLustreFileSystem.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Windows Example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.fsx.WindowsFileSystem;
 * import com.pulumi.aws.fsx.WindowsFileSystemArgs;
 * import com.pulumi.aws.fsx.Backup;
 * import com.pulumi.aws.fsx.BackupArgs;
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
 *         var exampleWindowsFileSystem = new WindowsFileSystem(&#34;exampleWindowsFileSystem&#34;, WindowsFileSystemArgs.builder()        
 *             .activeDirectoryId(aws_directory_service_directory.eample().id())
 *             .skipFinalBackup(true)
 *             .storageCapacity(32)
 *             .subnetIds(aws_subnet.example1().id())
 *             .throughputCapacity(8)
 *             .build());
 * 
 *         var exampleBackup = new Backup(&#34;exampleBackup&#34;, BackupArgs.builder()        
 *             .fileSystemId(exampleWindowsFileSystem.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## ONTAP Example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.fsx.OntapVolume;
 * import com.pulumi.aws.fsx.OntapVolumeArgs;
 * import com.pulumi.aws.fsx.Backup;
 * import com.pulumi.aws.fsx.BackupArgs;
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
 *         var exampleOntapVolume = new OntapVolume(&#34;exampleOntapVolume&#34;, OntapVolumeArgs.builder()        
 *             .junctionPath(&#34;/example&#34;)
 *             .sizeInMegabytes(1024)
 *             .storageEfficiencyEnabled(true)
 *             .storageVirtualMachineId(aws_fsx_ontap_storage_virtual_machine.test().id())
 *             .build());
 * 
 *         var exampleBackup = new Backup(&#34;exampleBackup&#34;, BackupArgs.builder()        
 *             .volumeId(exampleOntapVolume.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## OpenZFS Example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.fsx.OpenZfsFileSystem;
 * import com.pulumi.aws.fsx.OpenZfsFileSystemArgs;
 * import com.pulumi.aws.fsx.Backup;
 * import com.pulumi.aws.fsx.BackupArgs;
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
 *         var exampleOpenZfsFileSystem = new OpenZfsFileSystem(&#34;exampleOpenZfsFileSystem&#34;, OpenZfsFileSystemArgs.builder()        
 *             .storageCapacity(64)
 *             .subnetIds(aws_subnet.example().id())
 *             .deploymentType(&#34;SINGLE_AZ_1&#34;)
 *             .throughputCapacity(64)
 *             .build());
 * 
 *         var exampleBackup = new Backup(&#34;exampleBackup&#34;, BackupArgs.builder()        
 *             .fileSystemId(exampleOpenZfsFileSystem.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * FSx Backups can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:fsx/backup:Backup example fs-543ab12b1ca672f33
 * ```
 * 
 */
@ResourceType(type="aws:fsx/backup:Backup")
public class Backup extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name of the backup.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name of the backup.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ID of the file system to back up. Required if backing up Lustre or Windows file systems.
     * 
     */
    @Export(name="fileSystemId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> fileSystemId;

    /**
     * @return The ID of the file system to back up. Required if backing up Lustre or Windows file systems.
     * 
     */
    public Output<Optional<String>> fileSystemId() {
        return Codegen.optional(this.fileSystemId);
    }
    /**
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the backup of the Amazon FSx file system&#39;s data at rest.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyId;

    /**
     * @return The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the backup of the Amazon FSx file system&#39;s data at rest.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * AWS account identifier that created the file system.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return AWS account identifier that created the file system.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     * 
     */
    public Output<Map<String,String>> tags() {
        return this.tags;
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
     * The type of the file system backup.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of the file system backup.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The ID of the volume to back up. Required if backing up a ONTAP Volume.
     * 
     */
    @Export(name="volumeId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> volumeId;

    /**
     * @return The ID of the volume to back up. Required if backing up a ONTAP Volume.
     * 
     */
    public Output<Optional<String>> volumeId() {
        return Codegen.optional(this.volumeId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Backup(String name) {
        this(name, BackupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Backup(String name, @Nullable BackupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Backup(String name, @Nullable BackupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/backup:Backup", name, args == null ? BackupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Backup(String name, Output<String> id, @Nullable BackupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/backup:Backup", name, state, makeResourceOptions(options, id));
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
    public static Backup get(String name, Output<String> id, @Nullable BackupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Backup(name, id, state, options);
    }
}
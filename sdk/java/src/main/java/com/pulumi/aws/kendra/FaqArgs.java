// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra;

import com.pulumi.aws.kendra.inputs.FaqS3PathArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FaqArgs extends com.pulumi.resources.ResourceArgs {

    public static final FaqArgs Empty = new FaqArgs();

    /**
     * The description for a FAQ.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for a FAQ.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
     * 
     */
    @Import(name="fileFormat")
    private @Nullable Output<String> fileFormat;

    /**
     * @return The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
     * 
     */
    public Optional<Output<String>> fileFormat() {
        return Optional.ofNullable(this.fileFormat);
    }

    /**
     * The identifier of the index for a FAQ.
     * 
     */
    @Import(name="indexId", required=true)
    private Output<String> indexId;

    /**
     * @return The identifier of the index for a FAQ.
     * 
     */
    public Output<String> indexId() {
        return this.indexId;
    }

    /**
     * The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
     * 
     */
    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    /**
     * @return The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
     * 
     */
    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    /**
     * The name that should be associated with the FAQ.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name that should be associated with the FAQ.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * The S3 location of the FAQ input data. Detailed below.
     * 
     */
    @Import(name="s3Path", required=true)
    private Output<FaqS3PathArgs> s3Path;

    /**
     * @return The S3 location of the FAQ input data. Detailed below.
     * 
     */
    public Output<FaqS3PathArgs> s3Path() {
        return this.s3Path;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private FaqArgs() {}

    private FaqArgs(FaqArgs $) {
        this.description = $.description;
        this.fileFormat = $.fileFormat;
        this.indexId = $.indexId;
        this.languageCode = $.languageCode;
        this.name = $.name;
        this.roleArn = $.roleArn;
        this.s3Path = $.s3Path;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FaqArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FaqArgs $;

        public Builder() {
            $ = new FaqArgs();
        }

        public Builder(FaqArgs defaults) {
            $ = new FaqArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description for a FAQ.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for a FAQ.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fileFormat The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
         * 
         * @return builder
         * 
         */
        public Builder fileFormat(@Nullable Output<String> fileFormat) {
            $.fileFormat = fileFormat;
            return this;
        }

        /**
         * @param fileFormat The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
         * 
         * @return builder
         * 
         */
        public Builder fileFormat(String fileFormat) {
            return fileFormat(Output.of(fileFormat));
        }

        /**
         * @param indexId The identifier of the index for a FAQ.
         * 
         * @return builder
         * 
         */
        public Builder indexId(Output<String> indexId) {
            $.indexId = indexId;
            return this;
        }

        /**
         * @param indexId The identifier of the index for a FAQ.
         * 
         * @return builder
         * 
         */
        public Builder indexId(String indexId) {
            return indexId(Output.of(indexId));
        }

        /**
         * @param languageCode The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
         * 
         * @return builder
         * 
         */
        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
         * 
         * @return builder
         * 
         */
        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        /**
         * @param name The name that should be associated with the FAQ.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name that should be associated with the FAQ.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param s3Path The S3 location of the FAQ input data. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder s3Path(Output<FaqS3PathArgs> s3Path) {
            $.s3Path = s3Path;
            return this;
        }

        /**
         * @param s3Path The S3 location of the FAQ input data. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder s3Path(FaqS3PathArgs s3Path) {
            return s3Path(Output.of(s3Path));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public FaqArgs build() {
            $.indexId = Objects.requireNonNull($.indexId, "expected parameter 'indexId' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.s3Path = Objects.requireNonNull($.s3Path, "expected parameter 's3Path' to be non-null");
            return $;
        }
    }

}
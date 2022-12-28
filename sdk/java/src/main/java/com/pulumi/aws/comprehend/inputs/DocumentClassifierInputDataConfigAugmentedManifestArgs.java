// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.comprehend.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DocumentClassifierInputDataConfigAugmentedManifestArgs extends com.pulumi.resources.ResourceArgs {

    public static final DocumentClassifierInputDataConfigAugmentedManifestArgs Empty = new DocumentClassifierInputDataConfigAugmentedManifestArgs();

    /**
     * Location of annotation files.
     * 
     */
    @Import(name="annotationDataS3Uri")
    private @Nullable Output<String> annotationDataS3Uri;

    /**
     * @return Location of annotation files.
     * 
     */
    public Optional<Output<String>> annotationDataS3Uri() {
        return Optional.ofNullable(this.annotationDataS3Uri);
    }

    /**
     * The JSON attribute that contains the annotations for the training documents.
     * 
     */
    @Import(name="attributeNames", required=true)
    private Output<List<String>> attributeNames;

    /**
     * @return The JSON attribute that contains the annotations for the training documents.
     * 
     */
    public Output<List<String>> attributeNames() {
        return this.attributeNames;
    }

    /**
     * Type of augmented manifest.
     * One of `PLAIN_TEXT_DOCUMENT` or `SEMI_STRUCTURED_DOCUMENT`.
     * 
     */
    @Import(name="documentType")
    private @Nullable Output<String> documentType;

    /**
     * @return Type of augmented manifest.
     * One of `PLAIN_TEXT_DOCUMENT` or `SEMI_STRUCTURED_DOCUMENT`.
     * 
     */
    public Optional<Output<String>> documentType() {
        return Optional.ofNullable(this.documentType);
    }

    /**
     * Destination path for the output documents.
     * The full path to the output file will be returned in `output_s3_uri`.
     * 
     */
    @Import(name="s3Uri", required=true)
    private Output<String> s3Uri;

    /**
     * @return Destination path for the output documents.
     * The full path to the output file will be returned in `output_s3_uri`.
     * 
     */
    public Output<String> s3Uri() {
        return this.s3Uri;
    }

    /**
     * Location of source PDF files.
     * 
     */
    @Import(name="sourceDocumentsS3Uri")
    private @Nullable Output<String> sourceDocumentsS3Uri;

    /**
     * @return Location of source PDF files.
     * 
     */
    public Optional<Output<String>> sourceDocumentsS3Uri() {
        return Optional.ofNullable(this.sourceDocumentsS3Uri);
    }

    /**
     * Purpose of data in augmented manifest.
     * One of `TRAIN` or `TEST`.
     * 
     */
    @Import(name="split")
    private @Nullable Output<String> split;

    /**
     * @return Purpose of data in augmented manifest.
     * One of `TRAIN` or `TEST`.
     * 
     */
    public Optional<Output<String>> split() {
        return Optional.ofNullable(this.split);
    }

    private DocumentClassifierInputDataConfigAugmentedManifestArgs() {}

    private DocumentClassifierInputDataConfigAugmentedManifestArgs(DocumentClassifierInputDataConfigAugmentedManifestArgs $) {
        this.annotationDataS3Uri = $.annotationDataS3Uri;
        this.attributeNames = $.attributeNames;
        this.documentType = $.documentType;
        this.s3Uri = $.s3Uri;
        this.sourceDocumentsS3Uri = $.sourceDocumentsS3Uri;
        this.split = $.split;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentClassifierInputDataConfigAugmentedManifestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentClassifierInputDataConfigAugmentedManifestArgs $;

        public Builder() {
            $ = new DocumentClassifierInputDataConfigAugmentedManifestArgs();
        }

        public Builder(DocumentClassifierInputDataConfigAugmentedManifestArgs defaults) {
            $ = new DocumentClassifierInputDataConfigAugmentedManifestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotationDataS3Uri Location of annotation files.
         * 
         * @return builder
         * 
         */
        public Builder annotationDataS3Uri(@Nullable Output<String> annotationDataS3Uri) {
            $.annotationDataS3Uri = annotationDataS3Uri;
            return this;
        }

        /**
         * @param annotationDataS3Uri Location of annotation files.
         * 
         * @return builder
         * 
         */
        public Builder annotationDataS3Uri(String annotationDataS3Uri) {
            return annotationDataS3Uri(Output.of(annotationDataS3Uri));
        }

        /**
         * @param attributeNames The JSON attribute that contains the annotations for the training documents.
         * 
         * @return builder
         * 
         */
        public Builder attributeNames(Output<List<String>> attributeNames) {
            $.attributeNames = attributeNames;
            return this;
        }

        /**
         * @param attributeNames The JSON attribute that contains the annotations for the training documents.
         * 
         * @return builder
         * 
         */
        public Builder attributeNames(List<String> attributeNames) {
            return attributeNames(Output.of(attributeNames));
        }

        /**
         * @param attributeNames The JSON attribute that contains the annotations for the training documents.
         * 
         * @return builder
         * 
         */
        public Builder attributeNames(String... attributeNames) {
            return attributeNames(List.of(attributeNames));
        }

        /**
         * @param documentType Type of augmented manifest.
         * One of `PLAIN_TEXT_DOCUMENT` or `SEMI_STRUCTURED_DOCUMENT`.
         * 
         * @return builder
         * 
         */
        public Builder documentType(@Nullable Output<String> documentType) {
            $.documentType = documentType;
            return this;
        }

        /**
         * @param documentType Type of augmented manifest.
         * One of `PLAIN_TEXT_DOCUMENT` or `SEMI_STRUCTURED_DOCUMENT`.
         * 
         * @return builder
         * 
         */
        public Builder documentType(String documentType) {
            return documentType(Output.of(documentType));
        }

        /**
         * @param s3Uri Destination path for the output documents.
         * The full path to the output file will be returned in `output_s3_uri`.
         * 
         * @return builder
         * 
         */
        public Builder s3Uri(Output<String> s3Uri) {
            $.s3Uri = s3Uri;
            return this;
        }

        /**
         * @param s3Uri Destination path for the output documents.
         * The full path to the output file will be returned in `output_s3_uri`.
         * 
         * @return builder
         * 
         */
        public Builder s3Uri(String s3Uri) {
            return s3Uri(Output.of(s3Uri));
        }

        /**
         * @param sourceDocumentsS3Uri Location of source PDF files.
         * 
         * @return builder
         * 
         */
        public Builder sourceDocumentsS3Uri(@Nullable Output<String> sourceDocumentsS3Uri) {
            $.sourceDocumentsS3Uri = sourceDocumentsS3Uri;
            return this;
        }

        /**
         * @param sourceDocumentsS3Uri Location of source PDF files.
         * 
         * @return builder
         * 
         */
        public Builder sourceDocumentsS3Uri(String sourceDocumentsS3Uri) {
            return sourceDocumentsS3Uri(Output.of(sourceDocumentsS3Uri));
        }

        /**
         * @param split Purpose of data in augmented manifest.
         * One of `TRAIN` or `TEST`.
         * 
         * @return builder
         * 
         */
        public Builder split(@Nullable Output<String> split) {
            $.split = split;
            return this;
        }

        /**
         * @param split Purpose of data in augmented manifest.
         * One of `TRAIN` or `TEST`.
         * 
         * @return builder
         * 
         */
        public Builder split(String split) {
            return split(Output.of(split));
        }

        public DocumentClassifierInputDataConfigAugmentedManifestArgs build() {
            $.attributeNames = Objects.requireNonNull($.attributeNames, "expected parameter 'attributeNames' to be non-null");
            $.s3Uri = Objects.requireNonNull($.s3Uri, "expected parameter 's3Uri' to be non-null");
            return $;
        }
    }

}
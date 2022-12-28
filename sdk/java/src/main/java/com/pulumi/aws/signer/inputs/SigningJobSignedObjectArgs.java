// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.inputs;

import com.pulumi.aws.signer.inputs.SigningJobSignedObjectS3Args;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SigningJobSignedObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final SigningJobSignedObjectArgs Empty = new SigningJobSignedObjectArgs();

    /**
     * A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
     */
    @Import(name="s3s")
    private @Nullable Output<List<SigningJobSignedObjectS3Args>> s3s;

    /**
     * @return A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
     */
    public Optional<Output<List<SigningJobSignedObjectS3Args>>> s3s() {
        return Optional.ofNullable(this.s3s);
    }

    private SigningJobSignedObjectArgs() {}

    private SigningJobSignedObjectArgs(SigningJobSignedObjectArgs $) {
        this.s3s = $.s3s;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SigningJobSignedObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SigningJobSignedObjectArgs $;

        public Builder() {
            $ = new SigningJobSignedObjectArgs();
        }

        public Builder(SigningJobSignedObjectArgs defaults) {
            $ = new SigningJobSignedObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param s3s A configuration block describing the S3 Destination object: See S3 Destination below for details.
         * 
         * @return builder
         * 
         */
        public Builder s3s(@Nullable Output<List<SigningJobSignedObjectS3Args>> s3s) {
            $.s3s = s3s;
            return this;
        }

        /**
         * @param s3s A configuration block describing the S3 Destination object: See S3 Destination below for details.
         * 
         * @return builder
         * 
         */
        public Builder s3s(List<SigningJobSignedObjectS3Args> s3s) {
            return s3s(Output.of(s3s));
        }

        /**
         * @param s3s A configuration block describing the S3 Destination object: See S3 Destination below for details.
         * 
         * @return builder
         * 
         */
        public Builder s3s(SigningJobSignedObjectS3Args... s3s) {
            return s3s(List.of(s3s));
        }

        public SigningJobSignedObjectArgs build() {
            return $;
        }
    }

}
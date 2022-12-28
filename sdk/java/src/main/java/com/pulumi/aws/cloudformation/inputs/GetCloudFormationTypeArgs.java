// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudFormationTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudFormationTypeArgs Empty = new GetCloudFormationTypeArgs();

    /**
     * ARN of the CloudFormation Type. For example, `arn:aws:cloudformation:us-west-2::type/resource/AWS-EC2-VPC`.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the CloudFormation Type. For example, `arn:aws:cloudformation:us-west-2::type/resource/AWS-EC2-VPC`.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * CloudFormation Registry Type. For example, `RESOURCE`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return CloudFormation Registry Type. For example, `RESOURCE`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * CloudFormation Type name. For example, `AWS::EC2::VPC`.
     * 
     */
    @Import(name="typeName")
    private @Nullable Output<String> typeName;

    /**
     * @return CloudFormation Type name. For example, `AWS::EC2::VPC`.
     * 
     */
    public Optional<Output<String>> typeName() {
        return Optional.ofNullable(this.typeName);
    }

    /**
     * Identifier of the CloudFormation Type version.
     * 
     */
    @Import(name="versionId")
    private @Nullable Output<String> versionId;

    /**
     * @return Identifier of the CloudFormation Type version.
     * 
     */
    public Optional<Output<String>> versionId() {
        return Optional.ofNullable(this.versionId);
    }

    private GetCloudFormationTypeArgs() {}

    private GetCloudFormationTypeArgs(GetCloudFormationTypeArgs $) {
        this.arn = $.arn;
        this.type = $.type;
        this.typeName = $.typeName;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudFormationTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudFormationTypeArgs $;

        public Builder() {
            $ = new GetCloudFormationTypeArgs();
        }

        public Builder(GetCloudFormationTypeArgs defaults) {
            $ = new GetCloudFormationTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the CloudFormation Type. For example, `arn:aws:cloudformation:us-west-2::type/resource/AWS-EC2-VPC`.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the CloudFormation Type. For example, `arn:aws:cloudformation:us-west-2::type/resource/AWS-EC2-VPC`.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param type CloudFormation Registry Type. For example, `RESOURCE`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type CloudFormation Registry Type. For example, `RESOURCE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param typeName CloudFormation Type name. For example, `AWS::EC2::VPC`.
         * 
         * @return builder
         * 
         */
        public Builder typeName(@Nullable Output<String> typeName) {
            $.typeName = typeName;
            return this;
        }

        /**
         * @param typeName CloudFormation Type name. For example, `AWS::EC2::VPC`.
         * 
         * @return builder
         * 
         */
        public Builder typeName(String typeName) {
            return typeName(Output.of(typeName));
        }

        /**
         * @param versionId Identifier of the CloudFormation Type version.
         * 
         * @return builder
         * 
         */
        public Builder versionId(@Nullable Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        /**
         * @param versionId Identifier of the CloudFormation Type version.
         * 
         * @return builder
         * 
         */
        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public GetCloudFormationTypeArgs build() {
            return $;
        }
    }

}
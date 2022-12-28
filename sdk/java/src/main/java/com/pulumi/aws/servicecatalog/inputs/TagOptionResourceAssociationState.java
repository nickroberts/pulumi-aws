// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagOptionResourceAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final TagOptionResourceAssociationState Empty = new TagOptionResourceAssociationState();

    /**
     * ARN of the resource.
     * 
     */
    @Import(name="resourceArn")
    private @Nullable Output<String> resourceArn;

    /**
     * @return ARN of the resource.
     * 
     */
    public Optional<Output<String>> resourceArn() {
        return Optional.ofNullable(this.resourceArn);
    }

    /**
     * Creation time of the resource.
     * 
     */
    @Import(name="resourceCreatedTime")
    private @Nullable Output<String> resourceCreatedTime;

    /**
     * @return Creation time of the resource.
     * 
     */
    public Optional<Output<String>> resourceCreatedTime() {
        return Optional.ofNullable(this.resourceCreatedTime);
    }

    /**
     * Description of the resource.
     * 
     */
    @Import(name="resourceDescription")
    private @Nullable Output<String> resourceDescription;

    /**
     * @return Description of the resource.
     * 
     */
    public Optional<Output<String>> resourceDescription() {
        return Optional.ofNullable(this.resourceDescription);
    }

    /**
     * Resource identifier.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return Resource identifier.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * Description of the resource.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return Description of the resource.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * Tag Option identifier.
     * 
     */
    @Import(name="tagOptionId")
    private @Nullable Output<String> tagOptionId;

    /**
     * @return Tag Option identifier.
     * 
     */
    public Optional<Output<String>> tagOptionId() {
        return Optional.ofNullable(this.tagOptionId);
    }

    private TagOptionResourceAssociationState() {}

    private TagOptionResourceAssociationState(TagOptionResourceAssociationState $) {
        this.resourceArn = $.resourceArn;
        this.resourceCreatedTime = $.resourceCreatedTime;
        this.resourceDescription = $.resourceDescription;
        this.resourceId = $.resourceId;
        this.resourceName = $.resourceName;
        this.tagOptionId = $.tagOptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagOptionResourceAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagOptionResourceAssociationState $;

        public Builder() {
            $ = new TagOptionResourceAssociationState();
        }

        public Builder(TagOptionResourceAssociationState defaults) {
            $ = new TagOptionResourceAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceArn ARN of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(@Nullable Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        /**
         * @param resourceArn ARN of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        /**
         * @param resourceCreatedTime Creation time of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceCreatedTime(@Nullable Output<String> resourceCreatedTime) {
            $.resourceCreatedTime = resourceCreatedTime;
            return this;
        }

        /**
         * @param resourceCreatedTime Creation time of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceCreatedTime(String resourceCreatedTime) {
            return resourceCreatedTime(Output.of(resourceCreatedTime));
        }

        /**
         * @param resourceDescription Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceDescription(@Nullable Output<String> resourceDescription) {
            $.resourceDescription = resourceDescription;
            return this;
        }

        /**
         * @param resourceDescription Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceDescription(String resourceDescription) {
            return resourceDescription(Output.of(resourceDescription));
        }

        /**
         * @param resourceId Resource identifier.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId Resource identifier.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param resourceName Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param tagOptionId Tag Option identifier.
         * 
         * @return builder
         * 
         */
        public Builder tagOptionId(@Nullable Output<String> tagOptionId) {
            $.tagOptionId = tagOptionId;
            return this;
        }

        /**
         * @param tagOptionId Tag Option identifier.
         * 
         * @return builder
         * 
         */
        public Builder tagOptionId(String tagOptionId) {
            return tagOptionId(Output.of(tagOptionId));
        }

        public TagOptionResourceAssociationState build() {
            return $;
        }
    }

}
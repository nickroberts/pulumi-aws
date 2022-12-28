// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMeshPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMeshPlainArgs Empty = new GetMeshPlainArgs();

    /**
     * AWS account ID of the service mesh&#39;s owner.
     * 
     */
    @Import(name="meshOwner")
    private @Nullable String meshOwner;

    /**
     * @return AWS account ID of the service mesh&#39;s owner.
     * 
     */
    public Optional<String> meshOwner() {
        return Optional.ofNullable(this.meshOwner);
    }

    /**
     * Name of the service mesh.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the service mesh.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Map of tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Map of tags.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetMeshPlainArgs() {}

    private GetMeshPlainArgs(GetMeshPlainArgs $) {
        this.meshOwner = $.meshOwner;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMeshPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMeshPlainArgs $;

        public Builder() {
            $ = new GetMeshPlainArgs();
        }

        public Builder(GetMeshPlainArgs defaults) {
            $ = new GetMeshPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param meshOwner AWS account ID of the service mesh&#39;s owner.
         * 
         * @return builder
         * 
         */
        public Builder meshOwner(@Nullable String meshOwner) {
            $.meshOwner = meshOwner;
            return this;
        }

        /**
         * @param name Name of the service mesh.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags Map of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetMeshPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IndexingConfigurationThingIndexingConfigurationManagedFieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final IndexingConfigurationThingIndexingConfigurationManagedFieldArgs Empty = new IndexingConfigurationThingIndexingConfigurationManagedFieldArgs();

    /**
     * The name of the field.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the field.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The data type of the field. Valid values: `Number`, `String`, `Boolean`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The data type of the field. Valid values: `Number`, `String`, `Boolean`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private IndexingConfigurationThingIndexingConfigurationManagedFieldArgs() {}

    private IndexingConfigurationThingIndexingConfigurationManagedFieldArgs(IndexingConfigurationThingIndexingConfigurationManagedFieldArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IndexingConfigurationThingIndexingConfigurationManagedFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IndexingConfigurationThingIndexingConfigurationManagedFieldArgs $;

        public Builder() {
            $ = new IndexingConfigurationThingIndexingConfigurationManagedFieldArgs();
        }

        public Builder(IndexingConfigurationThingIndexingConfigurationManagedFieldArgs defaults) {
            $ = new IndexingConfigurationThingIndexingConfigurationManagedFieldArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the field.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the field.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The data type of the field. Valid values: `Number`, `String`, `Boolean`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The data type of the field. Valid values: `Number`, `String`, `Boolean`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public IndexingConfigurationThingIndexingConfigurationManagedFieldArgs build() {
            return $;
        }
    }

}
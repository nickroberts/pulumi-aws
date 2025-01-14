// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSetLogicalTableMapDataTransformTagColumnOperationTagColumnDescription {
    /**
     * @return The text of a description for a column.
     * 
     */
    private @Nullable String text;

    private DataSetLogicalTableMapDataTransformTagColumnOperationTagColumnDescription() {}
    /**
     * @return The text of a description for a column.
     * 
     */
    public Optional<String> text() {
        return Optional.ofNullable(this.text);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetLogicalTableMapDataTransformTagColumnOperationTagColumnDescription defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String text;
        public Builder() {}
        public Builder(DataSetLogicalTableMapDataTransformTagColumnOperationTagColumnDescription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        @CustomType.Setter
        public Builder text(@Nullable String text) {
            this.text = text;
            return this;
        }
        public DataSetLogicalTableMapDataTransformTagColumnOperationTagColumnDescription build() {
            final var o = new DataSetLogicalTableMapDataTransformTagColumnOperationTagColumnDescription();
            o.text = text;
            return o;
        }
    }
}

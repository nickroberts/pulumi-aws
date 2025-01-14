// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDataSetFieldFolder {
    private List<String> columns;
    private String description;
    private String fieldFoldersId;

    private GetDataSetFieldFolder() {}
    public List<String> columns() {
        return this.columns;
    }
    public String description() {
        return this.description;
    }
    public String fieldFoldersId() {
        return this.fieldFoldersId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataSetFieldFolder defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> columns;
        private String description;
        private String fieldFoldersId;
        public Builder() {}
        public Builder(GetDataSetFieldFolder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.description = defaults.description;
    	      this.fieldFoldersId = defaults.fieldFoldersId;
        }

        @CustomType.Setter
        public Builder columns(List<String> columns) {
            this.columns = Objects.requireNonNull(columns);
            return this;
        }
        public Builder columns(String... columns) {
            return columns(List.of(columns));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder fieldFoldersId(String fieldFoldersId) {
            this.fieldFoldersId = Objects.requireNonNull(fieldFoldersId);
            return this;
        }
        public GetDataSetFieldFolder build() {
            final var o = new GetDataSetFieldFolder();
            o.columns = columns;
            o.description = description;
            o.fieldFoldersId = fieldFoldersId;
            return o;
        }
    }
}

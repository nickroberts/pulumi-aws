// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.aws.kinesis.outputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat {
    /**
     * @return The Mapping Information for the record format.
     * See Mapping Parameters below for more details.
     * 
     */
    private @Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters mappingParameters;
    /**
     * @return The type of Record Format. Can be `CSV` or `JSON`.
     * 
     */
    private @Nullable String recordFormatType;

    private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat() {}
    /**
     * @return The Mapping Information for the record format.
     * See Mapping Parameters below for more details.
     * 
     */
    public Optional<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters> mappingParameters() {
        return Optional.ofNullable(this.mappingParameters);
    }
    /**
     * @return The type of Record Format. Can be `CSV` or `JSON`.
     * 
     */
    public Optional<String> recordFormatType() {
        return Optional.ofNullable(this.recordFormatType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters mappingParameters;
        private @Nullable String recordFormatType;
        public Builder() {}
        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mappingParameters = defaults.mappingParameters;
    	      this.recordFormatType = defaults.recordFormatType;
        }

        @CustomType.Setter
        public Builder mappingParameters(@Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters mappingParameters) {
            this.mappingParameters = mappingParameters;
            return this;
        }
        @CustomType.Setter
        public Builder recordFormatType(@Nullable String recordFormatType) {
            this.recordFormatType = recordFormatType;
            return this;
        }
        public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat build() {
            final var o = new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat();
            o.mappingParameters = mappingParameters;
            o.recordFormatType = recordFormatType;
            return o;
        }
    }
}
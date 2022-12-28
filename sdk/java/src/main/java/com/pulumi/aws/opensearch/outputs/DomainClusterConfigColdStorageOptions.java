// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainClusterConfigColdStorageOptions {
    /**
     * @return Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`. Enabling node-to-node encryption of a new domain requires an `engine_version` of `OpenSearch_X.Y` or `Elasticsearch_6.0` or greater.
     * 
     */
    private @Nullable Boolean enabled;

    private DomainClusterConfigColdStorageOptions() {}
    /**
     * @return Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`. Enabling node-to-node encryption of a new domain requires an `engine_version` of `OpenSearch_X.Y` or `Elasticsearch_6.0` or greater.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainClusterConfigColdStorageOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(DomainClusterConfigColdStorageOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public DomainClusterConfigColdStorageOptions build() {
            final var o = new DomainClusterConfigColdStorageOptions();
            o.enabled = enabled;
            return o;
        }
    }
}
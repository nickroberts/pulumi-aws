// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.outputs;

import com.pulumi.aws.ecr.outputs.ReplicationConfigurationReplicationConfigurationRule;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ReplicationConfigurationReplicationConfiguration {
    /**
     * @return The replication rules for a replication configuration. A maximum of 10 are allowed per `replication_configuration`. See Rule
     * 
     */
    private List<ReplicationConfigurationReplicationConfigurationRule> rules;

    private ReplicationConfigurationReplicationConfiguration() {}
    /**
     * @return The replication rules for a replication configuration. A maximum of 10 are allowed per `replication_configuration`. See Rule
     * 
     */
    public List<ReplicationConfigurationReplicationConfigurationRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ReplicationConfigurationReplicationConfigurationRule> rules;
        public Builder() {}
        public Builder(ReplicationConfigurationReplicationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder rules(List<ReplicationConfigurationReplicationConfigurationRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(ReplicationConfigurationReplicationConfigurationRule... rules) {
            return rules(List.of(rules));
        }
        public ReplicationConfigurationReplicationConfiguration build() {
            final var o = new ReplicationConfigurationReplicationConfiguration();
            o.rules = rules;
            return o;
        }
    }
}
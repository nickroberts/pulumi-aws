// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb.outputs;

import com.pulumi.aws.memorydb.outputs.GetClusterClusterEndpoint;
import com.pulumi.aws.memorydb.outputs.GetClusterShard;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClusterResult {
    /**
     * @return Name of the Access Control List associated with the cluster.
     * 
     */
    private String aclName;
    /**
     * @return ARN of the cluster.
     * 
     */
    private String arn;
    /**
     * @return True when the cluster allows automatic minor version upgrades.
     * * `cluster_endpoint`
     * 
     */
    private Boolean autoMinorVersionUpgrade;
    private List<GetClusterClusterEndpoint> clusterEndpoints;
    /**
     * @return True when data tiering is enabled.
     * 
     */
    private Boolean dataTiering;
    /**
     * @return Description for the cluster.
     * 
     */
    private String description;
    /**
     * @return Patch version number of the Redis engine used by the cluster.
     * 
     */
    private String enginePatchVersion;
    /**
     * @return Version number of the Redis engine used by the cluster.
     * 
     */
    private String engineVersion;
    /**
     * @return Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
     * 
     */
    private String finalSnapshotName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return ARN of the KMS key used to encrypt the cluster at rest.
     * 
     */
    private String kmsKeyArn;
    /**
     * @return Weekly time range during which maintenance on the cluster is performed. Specify as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). Example: `sun:23:00-mon:01:30`.
     * 
     */
    private String maintenanceWindow;
    /**
     * @return Name of this node.
     * * `endpoint`
     * 
     */
    private String name;
    /**
     * @return Compute and memory capacity of the nodes in the cluster.
     * 
     */
    private String nodeType;
    /**
     * @return The number of replicas to apply to each shard.
     * 
     */
    private Integer numReplicasPerShard;
    /**
     * @return Number of shards in the cluster.
     * 
     */
    private Integer numShards;
    /**
     * @return The name of the parameter group associated with the cluster.
     * 
     */
    private String parameterGroupName;
    /**
     * @return Port number that this node is listening on.
     * 
     */
    private Integer port;
    /**
     * @return Set of VPC Security Group ID-s associated with this cluster.
     * 
     */
    private List<String> securityGroupIds;
    /**
     * @return Set of shards in this cluster.
     * 
     */
    private List<GetClusterShard> shards;
    /**
     * @return The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled.
     * 
     */
    private Integer snapshotRetentionLimit;
    /**
     * @return Daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
     * 
     */
    private String snapshotWindow;
    /**
     * @return ARN of the SNS topic to which cluster notifications are sent.
     * * `subnet_group_name` -The name of the subnet group used for the cluster.
     * 
     */
    private String snsTopicArn;
    private String subnetGroupName;
    /**
     * @return Map of tags assigned to the cluster.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return When true, in-transit encryption is enabled for the cluster.
     * 
     */
    private Boolean tlsEnabled;

    private GetClusterResult() {}
    /**
     * @return Name of the Access Control List associated with the cluster.
     * 
     */
    public String aclName() {
        return this.aclName;
    }
    /**
     * @return ARN of the cluster.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return True when the cluster allows automatic minor version upgrades.
     * * `cluster_endpoint`
     * 
     */
    public Boolean autoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }
    public List<GetClusterClusterEndpoint> clusterEndpoints() {
        return this.clusterEndpoints;
    }
    /**
     * @return True when data tiering is enabled.
     * 
     */
    public Boolean dataTiering() {
        return this.dataTiering;
    }
    /**
     * @return Description for the cluster.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Patch version number of the Redis engine used by the cluster.
     * 
     */
    public String enginePatchVersion() {
        return this.enginePatchVersion;
    }
    /**
     * @return Version number of the Redis engine used by the cluster.
     * 
     */
    public String engineVersion() {
        return this.engineVersion;
    }
    /**
     * @return Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
     * 
     */
    public String finalSnapshotName() {
        return this.finalSnapshotName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return ARN of the KMS key used to encrypt the cluster at rest.
     * 
     */
    public String kmsKeyArn() {
        return this.kmsKeyArn;
    }
    /**
     * @return Weekly time range during which maintenance on the cluster is performed. Specify as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). Example: `sun:23:00-mon:01:30`.
     * 
     */
    public String maintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * @return Name of this node.
     * * `endpoint`
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Compute and memory capacity of the nodes in the cluster.
     * 
     */
    public String nodeType() {
        return this.nodeType;
    }
    /**
     * @return The number of replicas to apply to each shard.
     * 
     */
    public Integer numReplicasPerShard() {
        return this.numReplicasPerShard;
    }
    /**
     * @return Number of shards in the cluster.
     * 
     */
    public Integer numShards() {
        return this.numShards;
    }
    /**
     * @return The name of the parameter group associated with the cluster.
     * 
     */
    public String parameterGroupName() {
        return this.parameterGroupName;
    }
    /**
     * @return Port number that this node is listening on.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Set of VPC Security Group ID-s associated with this cluster.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * @return Set of shards in this cluster.
     * 
     */
    public List<GetClusterShard> shards() {
        return this.shards;
    }
    /**
     * @return The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled.
     * 
     */
    public Integer snapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }
    /**
     * @return Daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
     * 
     */
    public String snapshotWindow() {
        return this.snapshotWindow;
    }
    /**
     * @return ARN of the SNS topic to which cluster notifications are sent.
     * * `subnet_group_name` -The name of the subnet group used for the cluster.
     * 
     */
    public String snsTopicArn() {
        return this.snsTopicArn;
    }
    public String subnetGroupName() {
        return this.subnetGroupName;
    }
    /**
     * @return Map of tags assigned to the cluster.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return When true, in-transit encryption is enabled for the cluster.
     * 
     */
    public Boolean tlsEnabled() {
        return this.tlsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String aclName;
        private String arn;
        private Boolean autoMinorVersionUpgrade;
        private List<GetClusterClusterEndpoint> clusterEndpoints;
        private Boolean dataTiering;
        private String description;
        private String enginePatchVersion;
        private String engineVersion;
        private String finalSnapshotName;
        private String id;
        private String kmsKeyArn;
        private String maintenanceWindow;
        private String name;
        private String nodeType;
        private Integer numReplicasPerShard;
        private Integer numShards;
        private String parameterGroupName;
        private Integer port;
        private List<String> securityGroupIds;
        private List<GetClusterShard> shards;
        private Integer snapshotRetentionLimit;
        private String snapshotWindow;
        private String snsTopicArn;
        private String subnetGroupName;
        private Map<String,String> tags;
        private Boolean tlsEnabled;
        public Builder() {}
        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclName = defaults.aclName;
    	      this.arn = defaults.arn;
    	      this.autoMinorVersionUpgrade = defaults.autoMinorVersionUpgrade;
    	      this.clusterEndpoints = defaults.clusterEndpoints;
    	      this.dataTiering = defaults.dataTiering;
    	      this.description = defaults.description;
    	      this.enginePatchVersion = defaults.enginePatchVersion;
    	      this.engineVersion = defaults.engineVersion;
    	      this.finalSnapshotName = defaults.finalSnapshotName;
    	      this.id = defaults.id;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.name = defaults.name;
    	      this.nodeType = defaults.nodeType;
    	      this.numReplicasPerShard = defaults.numReplicasPerShard;
    	      this.numShards = defaults.numShards;
    	      this.parameterGroupName = defaults.parameterGroupName;
    	      this.port = defaults.port;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.shards = defaults.shards;
    	      this.snapshotRetentionLimit = defaults.snapshotRetentionLimit;
    	      this.snapshotWindow = defaults.snapshotWindow;
    	      this.snsTopicArn = defaults.snsTopicArn;
    	      this.subnetGroupName = defaults.subnetGroupName;
    	      this.tags = defaults.tags;
    	      this.tlsEnabled = defaults.tlsEnabled;
        }

        @CustomType.Setter
        public Builder aclName(String aclName) {
            this.aclName = Objects.requireNonNull(aclName);
            return this;
        }
        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder autoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = Objects.requireNonNull(autoMinorVersionUpgrade);
            return this;
        }
        @CustomType.Setter
        public Builder clusterEndpoints(List<GetClusterClusterEndpoint> clusterEndpoints) {
            this.clusterEndpoints = Objects.requireNonNull(clusterEndpoints);
            return this;
        }
        public Builder clusterEndpoints(GetClusterClusterEndpoint... clusterEndpoints) {
            return clusterEndpoints(List.of(clusterEndpoints));
        }
        @CustomType.Setter
        public Builder dataTiering(Boolean dataTiering) {
            this.dataTiering = Objects.requireNonNull(dataTiering);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder enginePatchVersion(String enginePatchVersion) {
            this.enginePatchVersion = Objects.requireNonNull(enginePatchVersion);
            return this;
        }
        @CustomType.Setter
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }
        @CustomType.Setter
        public Builder finalSnapshotName(String finalSnapshotName) {
            this.finalSnapshotName = Objects.requireNonNull(finalSnapshotName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }
        @CustomType.Setter
        public Builder maintenanceWindow(String maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }
        @CustomType.Setter
        public Builder numReplicasPerShard(Integer numReplicasPerShard) {
            this.numReplicasPerShard = Objects.requireNonNull(numReplicasPerShard);
            return this;
        }
        @CustomType.Setter
        public Builder numShards(Integer numShards) {
            this.numShards = Objects.requireNonNull(numShards);
            return this;
        }
        @CustomType.Setter
        public Builder parameterGroupName(String parameterGroupName) {
            this.parameterGroupName = Objects.requireNonNull(parameterGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        @CustomType.Setter
        public Builder shards(List<GetClusterShard> shards) {
            this.shards = Objects.requireNonNull(shards);
            return this;
        }
        public Builder shards(GetClusterShard... shards) {
            return shards(List.of(shards));
        }
        @CustomType.Setter
        public Builder snapshotRetentionLimit(Integer snapshotRetentionLimit) {
            this.snapshotRetentionLimit = Objects.requireNonNull(snapshotRetentionLimit);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotWindow(String snapshotWindow) {
            this.snapshotWindow = Objects.requireNonNull(snapshotWindow);
            return this;
        }
        @CustomType.Setter
        public Builder snsTopicArn(String snsTopicArn) {
            this.snsTopicArn = Objects.requireNonNull(snsTopicArn);
            return this;
        }
        @CustomType.Setter
        public Builder subnetGroupName(String subnetGroupName) {
            this.subnetGroupName = Objects.requireNonNull(subnetGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder tlsEnabled(Boolean tlsEnabled) {
            this.tlsEnabled = Objects.requireNonNull(tlsEnabled);
            return this;
        }
        public GetClusterResult build() {
            final var o = new GetClusterResult();
            o.aclName = aclName;
            o.arn = arn;
            o.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            o.clusterEndpoints = clusterEndpoints;
            o.dataTiering = dataTiering;
            o.description = description;
            o.enginePatchVersion = enginePatchVersion;
            o.engineVersion = engineVersion;
            o.finalSnapshotName = finalSnapshotName;
            o.id = id;
            o.kmsKeyArn = kmsKeyArn;
            o.maintenanceWindow = maintenanceWindow;
            o.name = name;
            o.nodeType = nodeType;
            o.numReplicasPerShard = numReplicasPerShard;
            o.numShards = numShards;
            o.parameterGroupName = parameterGroupName;
            o.port = port;
            o.securityGroupIds = securityGroupIds;
            o.shards = shards;
            o.snapshotRetentionLimit = snapshotRetentionLimit;
            o.snapshotWindow = snapshotWindow;
            o.snsTopicArn = snsTopicArn;
            o.subnetGroupName = subnetGroupName;
            o.tags = tags;
            o.tlsEnabled = tlsEnabled;
            return o;
        }
    }
}
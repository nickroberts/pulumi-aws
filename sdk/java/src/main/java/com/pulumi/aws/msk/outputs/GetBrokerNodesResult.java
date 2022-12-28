// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.outputs;

import com.pulumi.aws.msk.outputs.GetBrokerNodesNodeInfoList;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBrokerNodesResult {
    private String clusterArn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetBrokerNodesNodeInfoList> nodeInfoLists;

    private GetBrokerNodesResult() {}
    public String clusterArn() {
        return this.clusterArn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetBrokerNodesNodeInfoList> nodeInfoLists() {
        return this.nodeInfoLists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerNodesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterArn;
        private String id;
        private List<GetBrokerNodesNodeInfoList> nodeInfoLists;
        public Builder() {}
        public Builder(GetBrokerNodesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterArn = defaults.clusterArn;
    	      this.id = defaults.id;
    	      this.nodeInfoLists = defaults.nodeInfoLists;
        }

        @CustomType.Setter
        public Builder clusterArn(String clusterArn) {
            this.clusterArn = Objects.requireNonNull(clusterArn);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder nodeInfoLists(List<GetBrokerNodesNodeInfoList> nodeInfoLists) {
            this.nodeInfoLists = Objects.requireNonNull(nodeInfoLists);
            return this;
        }
        public Builder nodeInfoLists(GetBrokerNodesNodeInfoList... nodeInfoLists) {
            return nodeInfoLists(List.of(nodeInfoLists));
        }
        public GetBrokerNodesResult build() {
            final var o = new GetBrokerNodesResult();
            o.clusterArn = clusterArn;
            o.id = id;
            o.nodeInfoLists = nodeInfoLists;
            return o;
        }
    }
}
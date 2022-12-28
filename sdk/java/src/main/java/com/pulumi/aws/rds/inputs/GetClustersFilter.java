// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetClustersFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetClustersFilter Empty = new GetClustersFilter();

    /**
     * Name of the filter field. Valid values can be found in the [RDS DescribeDBClusters API Reference](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusters.html).
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the filter field. Valid values can be found in the [RDS DescribeDBClusters API Reference](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusters.html).
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetClustersFilter() {}

    private GetClustersFilter(GetClustersFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClustersFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClustersFilter $;

        public Builder() {
            $ = new GetClustersFilter();
        }

        public Builder(GetClustersFilter defaults) {
            $ = new GetClustersFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the filter field. Valid values can be found in the [RDS DescribeDBClusters API Reference](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusters.html).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param values Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetClustersFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
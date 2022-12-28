// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetVpcIamPoolsFilter;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcIamPoolsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcIamPoolsPlainArgs Empty = new GetVpcIamPoolsPlainArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetVpcIamPoolsFilter> filters;

    /**
     * @return Custom filter block as described below.
     * 
     */
    public Optional<List<GetVpcIamPoolsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetVpcIamPoolsPlainArgs() {}

    private GetVpcIamPoolsPlainArgs(GetVpcIamPoolsPlainArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcIamPoolsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcIamPoolsPlainArgs $;

        public Builder() {
            $ = new GetVpcIamPoolsPlainArgs();
        }

        public Builder(GetVpcIamPoolsPlainArgs defaults) {
            $ = new GetVpcIamPoolsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetVpcIamPoolsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetVpcIamPoolsFilter... filters) {
            return filters(List.of(filters));
        }

        public GetVpcIamPoolsPlainArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionRestrictionsGeoRestrictionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionRestrictionsGeoRestrictionArgs Empty = new DistributionRestrictionsGeoRestrictionArgs();

    /**
     * The [ISO 3166-1-alpha-2 codes][4] for which you
     * want CloudFront either to distribute your content (`whitelist`) or not
     * distribute your content (`blacklist`). If the type is specified as `none` an empty array can be used.
     * 
     */
    @Import(name="locations")
    private @Nullable Output<List<String>> locations;

    /**
     * @return The [ISO 3166-1-alpha-2 codes][4] for which you
     * want CloudFront either to distribute your content (`whitelist`) or not
     * distribute your content (`blacklist`). If the type is specified as `none` an empty array can be used.
     * 
     */
    public Optional<Output<List<String>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    /**
     * The method that you want to use to restrict
     * distribution of your content by country: `none`, `whitelist`, or
     * `blacklist`.
     * 
     */
    @Import(name="restrictionType", required=true)
    private Output<String> restrictionType;

    /**
     * @return The method that you want to use to restrict
     * distribution of your content by country: `none`, `whitelist`, or
     * `blacklist`.
     * 
     */
    public Output<String> restrictionType() {
        return this.restrictionType;
    }

    private DistributionRestrictionsGeoRestrictionArgs() {}

    private DistributionRestrictionsGeoRestrictionArgs(DistributionRestrictionsGeoRestrictionArgs $) {
        this.locations = $.locations;
        this.restrictionType = $.restrictionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionRestrictionsGeoRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionRestrictionsGeoRestrictionArgs $;

        public Builder() {
            $ = new DistributionRestrictionsGeoRestrictionArgs();
        }

        public Builder(DistributionRestrictionsGeoRestrictionArgs defaults) {
            $ = new DistributionRestrictionsGeoRestrictionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param locations The [ISO 3166-1-alpha-2 codes][4] for which you
         * want CloudFront either to distribute your content (`whitelist`) or not
         * distribute your content (`blacklist`). If the type is specified as `none` an empty array can be used.
         * 
         * @return builder
         * 
         */
        public Builder locations(@Nullable Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations The [ISO 3166-1-alpha-2 codes][4] for which you
         * want CloudFront either to distribute your content (`whitelist`) or not
         * distribute your content (`blacklist`). If the type is specified as `none` an empty array can be used.
         * 
         * @return builder
         * 
         */
        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations The [ISO 3166-1-alpha-2 codes][4] for which you
         * want CloudFront either to distribute your content (`whitelist`) or not
         * distribute your content (`blacklist`). If the type is specified as `none` an empty array can be used.
         * 
         * @return builder
         * 
         */
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        /**
         * @param restrictionType The method that you want to use to restrict
         * distribution of your content by country: `none`, `whitelist`, or
         * `blacklist`.
         * 
         * @return builder
         * 
         */
        public Builder restrictionType(Output<String> restrictionType) {
            $.restrictionType = restrictionType;
            return this;
        }

        /**
         * @param restrictionType The method that you want to use to restrict
         * distribution of your content by country: `none`, `whitelist`, or
         * `blacklist`.
         * 
         * @return builder
         * 
         */
        public Builder restrictionType(String restrictionType) {
            return restrictionType(Output.of(restrictionType));
        }

        public DistributionRestrictionsGeoRestrictionArgs build() {
            $.restrictionType = Objects.requireNonNull($.restrictionType, "expected parameter 'restrictionType' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementArgs Empty = new WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementArgs();

    /**
     * Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs> fieldToMatch;

    /**
     * @return Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * Area within the portion of a web request that you want AWS WAF to search for `search_string`. Valid values include the following: `EXACTLY`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CONTAINS_WORD`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchStatement.html) for more information.
     * 
     */
    @Import(name="positionalConstraint", required=true)
    private Output<String> positionalConstraint;

    /**
     * @return Area within the portion of a web request that you want AWS WAF to search for `search_string`. Valid values include the following: `EXACTLY`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CONTAINS_WORD`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchStatement.html) for more information.
     * 
     */
    public Output<String> positionalConstraint() {
        return this.positionalConstraint;
    }

    /**
     * String value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you designate for inspection in `field_to_match`. The maximum length of the value is 50 bytes.
     * 
     */
    @Import(name="searchString", required=true)
    private Output<String> searchString;

    /**
     * @return String value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you designate for inspection in `field_to_match`. The maximum length of the value is 50 bytes.
     * 
     */
    public Output<String> searchString() {
        return this.searchString;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementTextTransformationArgs>> textTransformations;

    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    public Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementArgs() {}

    private WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementArgs(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.positionalConstraint = $.positionalConstraint;
        this.searchString = $.searchString;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        /**
         * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        /**
         * @param positionalConstraint Area within the portion of a web request that you want AWS WAF to search for `search_string`. Valid values include the following: `EXACTLY`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CONTAINS_WORD`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchStatement.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder positionalConstraint(Output<String> positionalConstraint) {
            $.positionalConstraint = positionalConstraint;
            return this;
        }

        /**
         * @param positionalConstraint Area within the portion of a web request that you want AWS WAF to search for `search_string`. Valid values include the following: `EXACTLY`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CONTAINS_WORD`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchStatement.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder positionalConstraint(String positionalConstraint) {
            return positionalConstraint(Output.of(positionalConstraint));
        }

        /**
         * @param searchString String value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you designate for inspection in `field_to_match`. The maximum length of the value is 50 bytes.
         * 
         * @return builder
         * 
         */
        public Builder searchString(Output<String> searchString) {
            $.searchString = searchString;
            return this;
        }

        /**
         * @param searchString String value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you designate for inspection in `field_to_match`. The maximum length of the value is 50 bytes.
         * 
         * @return builder
         * 
         */
        public Builder searchString(String searchString) {
            return searchString(Output.of(searchString));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementArgs build() {
            $.positionalConstraint = Objects.requireNonNull($.positionalConstraint, "expected parameter 'positionalConstraint' to be non-null");
            $.searchString = Objects.requireNonNull($.searchString, "expected parameter 'searchString' to be non-null");
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
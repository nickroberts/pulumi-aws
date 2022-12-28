// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs();

    /**
     * Name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the query header to inspect. This setting must be provided as lower case characters.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the query header to inspect. This setting must be provided as lower case characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
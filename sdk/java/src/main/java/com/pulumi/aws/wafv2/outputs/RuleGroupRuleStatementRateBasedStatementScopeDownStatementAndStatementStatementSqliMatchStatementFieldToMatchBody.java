// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementFieldToMatchBody {
    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementFieldToMatchBody() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementFieldToMatchBody defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementFieldToMatchBody defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementFieldToMatchBody build() {
            final var o = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementFieldToMatchBody();
            return o;
        }
    }
}
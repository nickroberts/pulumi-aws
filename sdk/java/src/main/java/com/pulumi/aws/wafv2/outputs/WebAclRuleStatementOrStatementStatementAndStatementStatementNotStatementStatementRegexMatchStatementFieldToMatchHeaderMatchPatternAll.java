// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAll {
    private WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAll() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAll defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAll defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAll build() {
            final var o = new WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAll();
            return o;
        }
    }
}
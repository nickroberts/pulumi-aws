// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatement {
    /**
     * @return Statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    private List<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatement> statements;

    private WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatement() {}
    /**
     * @return Statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatement> statements;
        public Builder() {}
        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        @CustomType.Setter
        public Builder statements(List<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatement... statements) {
            return statements(List.of(statements));
        }
        public WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatement build() {
            final var o = new WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatement();
            o.statements = statements;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementArgs();

    /**
     * Statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementArgs>> statements;

    /**
     * @return Statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementArgs>> statements() {
        return this.statements;
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementArgs() {}

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementArgs(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementArgs();
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementArgs defaults) {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements Statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements Statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements Statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
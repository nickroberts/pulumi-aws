// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementNotStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementRateBasedStatementScopeDownStatement {
    /**
     * @return A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatement andStatement;
    /**
     * @return A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatement byteMatchStatement;
    /**
     * @return A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatement geoMatchStatement;
    /**
     * @return A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * @return A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatement labelMatchStatement;
    /**
     * @return A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementNotStatement notStatement;
    /**
     * @return A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatement orStatement;
    /**
     * @return A rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatement regexMatchStatement;
    /**
     * @return A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * @return A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatement sqliMatchStatement;
    /**
     * @return A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatement xssMatchStatement;

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatement() {}
    /**
     * @return A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatement> andStatement() {
        return Optional.ofNullable(this.andStatement);
    }
    /**
     * @return A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatement> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * @return A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatement> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * @return A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatement> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * @return A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatement> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * @return A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementNotStatement> notStatement() {
        return Optional.ofNullable(this.notStatement);
    }
    /**
     * @return A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatement> orStatement() {
        return Optional.ofNullable(this.orStatement);
    }
    /**
     * @return A rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatement> regexMatchStatement() {
        return Optional.ofNullable(this.regexMatchStatement);
    }
    /**
     * @return A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * @return A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatement> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatement> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * @return A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatement> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatement andStatement;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatement byteMatchStatement;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatement geoMatchStatement;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatement labelMatchStatement;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementNotStatement notStatement;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatement orStatement;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatement regexMatchStatement;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatement xssMatchStatement;
        public Builder() {}
        public Builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.regexMatchStatement = defaults.regexMatchStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        @CustomType.Setter
        public Builder andStatement(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatement andStatement) {
            this.andStatement = andStatement;
            return this;
        }
        @CustomType.Setter
        public Builder byteMatchStatement(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder geoMatchStatement(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder ipSetReferenceStatement(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        @CustomType.Setter
        public Builder labelMatchStatement(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder notStatement(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementNotStatement notStatement) {
            this.notStatement = notStatement;
            return this;
        }
        @CustomType.Setter
        public Builder orStatement(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatement orStatement) {
            this.orStatement = orStatement;
            return this;
        }
        @CustomType.Setter
        public Builder regexMatchStatement(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatement regexMatchStatement) {
            this.regexMatchStatement = regexMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder regexPatternSetReferenceStatement(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        @CustomType.Setter
        public Builder sizeConstraintStatement(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        @CustomType.Setter
        public Builder sqliMatchStatement(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder xssMatchStatement(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public RuleGroupRuleStatementRateBasedStatementScopeDownStatement build() {
            final var o = new RuleGroupRuleStatementRateBasedStatementScopeDownStatement();
            o.andStatement = andStatement;
            o.byteMatchStatement = byteMatchStatement;
            o.geoMatchStatement = geoMatchStatement;
            o.ipSetReferenceStatement = ipSetReferenceStatement;
            o.labelMatchStatement = labelMatchStatement;
            o.notStatement = notStatement;
            o.orStatement = orStatement;
            o.regexMatchStatement = regexMatchStatement;
            o.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            o.sizeConstraintStatement = sizeConstraintStatement;
            o.sqliMatchStatement = sqliMatchStatement;
            o.xssMatchStatement = xssMatchStatement;
            return o;
        }
    }
}
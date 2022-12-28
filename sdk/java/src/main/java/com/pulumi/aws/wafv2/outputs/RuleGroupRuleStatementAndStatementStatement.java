// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementAndStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementByteMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementGeoMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementIpSetReferenceStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementLabelMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementOrStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementRegexMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementSizeConstraintStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementSqliMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementAndStatementStatement {
    /**
     * @return A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementAndStatementStatementAndStatement andStatement;
    /**
     * @return A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementAndStatementStatementByteMatchStatement byteMatchStatement;
    /**
     * @return A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
    /**
     * @return A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * @return A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
    /**
     * @return A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatement notStatement;
    /**
     * @return A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementAndStatementStatementOrStatement orStatement;
    /**
     * @return A rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementAndStatementStatementRegexMatchStatement regexMatchStatement;
    /**
     * @return A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * @return A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    private @Nullable RuleGroupRuleStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
    /**
     * @return A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatement xssMatchStatement;

    private RuleGroupRuleStatementAndStatementStatement() {}
    /**
     * @return A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementAndStatement> andStatement() {
        return Optional.ofNullable(this.andStatement);
    }
    /**
     * @return A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementByteMatchStatement> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * @return A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementGeoMatchStatement> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * @return A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementIpSetReferenceStatement> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * @return A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementLabelMatchStatement> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * @return A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatement> notStatement() {
        return Optional.ofNullable(this.notStatement);
    }
    /**
     * @return A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementOrStatement> orStatement() {
        return Optional.ofNullable(this.orStatement);
    }
    /**
     * @return A rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementRegexMatchStatement> regexMatchStatement() {
        return Optional.ofNullable(this.regexMatchStatement);
    }
    /**
     * @return A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * @return A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementSizeConstraintStatement> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementSqliMatchStatement> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * @return A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementXssMatchStatement> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleGroupRuleStatementAndStatementStatementAndStatement andStatement;
        private @Nullable RuleGroupRuleStatementAndStatementStatementByteMatchStatement byteMatchStatement;
        private @Nullable RuleGroupRuleStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
        private @Nullable RuleGroupRuleStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatement notStatement;
        private @Nullable RuleGroupRuleStatementAndStatementStatementOrStatement orStatement;
        private @Nullable RuleGroupRuleStatementAndStatementStatementRegexMatchStatement regexMatchStatement;
        private @Nullable RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable RuleGroupRuleStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatement xssMatchStatement;
        public Builder() {}
        public Builder(RuleGroupRuleStatementAndStatementStatement defaults) {
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
        public Builder andStatement(@Nullable RuleGroupRuleStatementAndStatementStatementAndStatement andStatement) {
            this.andStatement = andStatement;
            return this;
        }
        @CustomType.Setter
        public Builder byteMatchStatement(@Nullable RuleGroupRuleStatementAndStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder geoMatchStatement(@Nullable RuleGroupRuleStatementAndStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder ipSetReferenceStatement(@Nullable RuleGroupRuleStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        @CustomType.Setter
        public Builder labelMatchStatement(@Nullable RuleGroupRuleStatementAndStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder notStatement(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatement notStatement) {
            this.notStatement = notStatement;
            return this;
        }
        @CustomType.Setter
        public Builder orStatement(@Nullable RuleGroupRuleStatementAndStatementStatementOrStatement orStatement) {
            this.orStatement = orStatement;
            return this;
        }
        @CustomType.Setter
        public Builder regexMatchStatement(@Nullable RuleGroupRuleStatementAndStatementStatementRegexMatchStatement regexMatchStatement) {
            this.regexMatchStatement = regexMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder regexPatternSetReferenceStatement(@Nullable RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        @CustomType.Setter
        public Builder sizeConstraintStatement(@Nullable RuleGroupRuleStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        @CustomType.Setter
        public Builder sqliMatchStatement(@Nullable RuleGroupRuleStatementAndStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder xssMatchStatement(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public RuleGroupRuleStatementAndStatementStatement build() {
            final var o = new RuleGroupRuleStatementAndStatementStatement();
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
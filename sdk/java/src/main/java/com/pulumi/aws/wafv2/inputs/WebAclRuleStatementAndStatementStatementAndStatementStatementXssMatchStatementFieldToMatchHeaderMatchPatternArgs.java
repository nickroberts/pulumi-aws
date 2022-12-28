// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs();

    /**
     * An empty configuration block that is used for inspecting all headers.
     * 
     */
    @Import(name="all")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs> all;

    /**
     * @return An empty configuration block that is used for inspecting all headers.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs>> all() {
        return Optional.ofNullable(this.all);
    }

    /**
     * An array of strings that will be used for inspecting headers that do not have a key that matches one of the provided values.
     * 
     */
    @Import(name="excludedHeaders")
    private @Nullable Output<List<String>> excludedHeaders;

    /**
     * @return An array of strings that will be used for inspecting headers that do not have a key that matches one of the provided values.
     * 
     */
    public Optional<Output<List<String>>> excludedHeaders() {
        return Optional.ofNullable(this.excludedHeaders);
    }

    /**
     * An array of strings that will be used for inspecting headers that have a key that matches one of the provided values.
     * 
     */
    @Import(name="includedHeaders")
    private @Nullable Output<List<String>> includedHeaders;

    /**
     * @return An array of strings that will be used for inspecting headers that have a key that matches one of the provided values.
     * 
     */
    public Optional<Output<List<String>>> includedHeaders() {
        return Optional.ofNullable(this.includedHeaders);
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs() {}

    private WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs(WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs $) {
        this.all = $.all;
        this.excludedHeaders = $.excludedHeaders;
        this.includedHeaders = $.includedHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param all An empty configuration block that is used for inspecting all headers.
         * 
         * @return builder
         * 
         */
        public Builder all(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs> all) {
            $.all = all;
            return this;
        }

        /**
         * @param all An empty configuration block that is used for inspecting all headers.
         * 
         * @return builder
         * 
         */
        public Builder all(WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs all) {
            return all(Output.of(all));
        }

        /**
         * @param excludedHeaders An array of strings that will be used for inspecting headers that do not have a key that matches one of the provided values.
         * 
         * @return builder
         * 
         */
        public Builder excludedHeaders(@Nullable Output<List<String>> excludedHeaders) {
            $.excludedHeaders = excludedHeaders;
            return this;
        }

        /**
         * @param excludedHeaders An array of strings that will be used for inspecting headers that do not have a key that matches one of the provided values.
         * 
         * @return builder
         * 
         */
        public Builder excludedHeaders(List<String> excludedHeaders) {
            return excludedHeaders(Output.of(excludedHeaders));
        }

        /**
         * @param excludedHeaders An array of strings that will be used for inspecting headers that do not have a key that matches one of the provided values.
         * 
         * @return builder
         * 
         */
        public Builder excludedHeaders(String... excludedHeaders) {
            return excludedHeaders(List.of(excludedHeaders));
        }

        /**
         * @param includedHeaders An array of strings that will be used for inspecting headers that have a key that matches one of the provided values.
         * 
         * @return builder
         * 
         */
        public Builder includedHeaders(@Nullable Output<List<String>> includedHeaders) {
            $.includedHeaders = includedHeaders;
            return this;
        }

        /**
         * @param includedHeaders An array of strings that will be used for inspecting headers that have a key that matches one of the provided values.
         * 
         * @return builder
         * 
         */
        public Builder includedHeaders(List<String> includedHeaders) {
            return includedHeaders(Output.of(includedHeaders));
        }

        /**
         * @param includedHeaders An array of strings that will be used for inspecting headers that have a key that matches one of the provided values.
         * 
         * @return builder
         * 
         */
        public Builder includedHeaders(String... includedHeaders) {
            return includedHeaders(List.of(includedHeaders));
        }

        public WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketWebsiteConfigurationV2RoutingRuleRedirect {
    /**
     * @return The host name to use in the redirect request.
     * 
     */
    private @Nullable String hostName;
    /**
     * @return The HTTP redirect code to use on the response.
     * 
     */
    private @Nullable String httpRedirectCode;
    /**
     * @return Protocol to use when redirecting requests. The default is the protocol that is used in the original request. Valid values: `http`, `https`.
     * 
     */
    private @Nullable String protocol;
    /**
     * @return The object key prefix to use in the redirect request. For example, to redirect requests for all pages with prefix `docs/` (objects in the `docs/` folder) to `documents/`, you can set a `condition` block with `key_prefix_equals` set to `docs/` and in the `redirect` set `replace_key_prefix_with` to `/documents`.
     * 
     */
    private @Nullable String replaceKeyPrefixWith;
    /**
     * @return The specific object key to use in the redirect request. For example, redirect request to `error.html`.
     * 
     */
    private @Nullable String replaceKeyWith;

    private BucketWebsiteConfigurationV2RoutingRuleRedirect() {}
    /**
     * @return The host name to use in the redirect request.
     * 
     */
    public Optional<String> hostName() {
        return Optional.ofNullable(this.hostName);
    }
    /**
     * @return The HTTP redirect code to use on the response.
     * 
     */
    public Optional<String> httpRedirectCode() {
        return Optional.ofNullable(this.httpRedirectCode);
    }
    /**
     * @return Protocol to use when redirecting requests. The default is the protocol that is used in the original request. Valid values: `http`, `https`.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return The object key prefix to use in the redirect request. For example, to redirect requests for all pages with prefix `docs/` (objects in the `docs/` folder) to `documents/`, you can set a `condition` block with `key_prefix_equals` set to `docs/` and in the `redirect` set `replace_key_prefix_with` to `/documents`.
     * 
     */
    public Optional<String> replaceKeyPrefixWith() {
        return Optional.ofNullable(this.replaceKeyPrefixWith);
    }
    /**
     * @return The specific object key to use in the redirect request. For example, redirect request to `error.html`.
     * 
     */
    public Optional<String> replaceKeyWith() {
        return Optional.ofNullable(this.replaceKeyWith);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketWebsiteConfigurationV2RoutingRuleRedirect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String hostName;
        private @Nullable String httpRedirectCode;
        private @Nullable String protocol;
        private @Nullable String replaceKeyPrefixWith;
        private @Nullable String replaceKeyWith;
        public Builder() {}
        public Builder(BucketWebsiteConfigurationV2RoutingRuleRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.httpRedirectCode = defaults.httpRedirectCode;
    	      this.protocol = defaults.protocol;
    	      this.replaceKeyPrefixWith = defaults.replaceKeyPrefixWith;
    	      this.replaceKeyWith = defaults.replaceKeyWith;
        }

        @CustomType.Setter
        public Builder hostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }
        @CustomType.Setter
        public Builder httpRedirectCode(@Nullable String httpRedirectCode) {
            this.httpRedirectCode = httpRedirectCode;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder replaceKeyPrefixWith(@Nullable String replaceKeyPrefixWith) {
            this.replaceKeyPrefixWith = replaceKeyPrefixWith;
            return this;
        }
        @CustomType.Setter
        public Builder replaceKeyWith(@Nullable String replaceKeyWith) {
            this.replaceKeyWith = replaceKeyWith;
            return this;
        }
        public BucketWebsiteConfigurationV2RoutingRuleRedirect build() {
            final var o = new BucketWebsiteConfigurationV2RoutingRuleRedirect();
            o.hostName = hostName;
            o.httpRedirectCode = httpRedirectCode;
            o.protocol = protocol;
            o.replaceKeyPrefixWith = replaceKeyPrefixWith;
            o.replaceKeyWith = replaceKeyWith;
            return o;
        }
    }
}
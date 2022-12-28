// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames;
import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsValidationTrust;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecListenerTlsValidation {
    /**
     * @return SANs for a virtual gateway&#39;s listener&#39;s Transport Layer Security (TLS) validation context.
     * 
     */
    private @Nullable VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames subjectAlternativeNames;
    /**
     * @return TLS validation context trust.
     * 
     */
    private VirtualGatewaySpecListenerTlsValidationTrust trust;

    private VirtualGatewaySpecListenerTlsValidation() {}
    /**
     * @return SANs for a virtual gateway&#39;s listener&#39;s Transport Layer Security (TLS) validation context.
     * 
     */
    public Optional<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames> subjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }
    /**
     * @return TLS validation context trust.
     * 
     */
    public VirtualGatewaySpecListenerTlsValidationTrust trust() {
        return this.trust;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsValidation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames subjectAlternativeNames;
        private VirtualGatewaySpecListenerTlsValidationTrust trust;
        public Builder() {}
        public Builder(VirtualGatewaySpecListenerTlsValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trust = defaults.trust;
        }

        @CustomType.Setter
        public Builder subjectAlternativeNames(@Nullable VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        @CustomType.Setter
        public Builder trust(VirtualGatewaySpecListenerTlsValidationTrust trust) {
            this.trust = Objects.requireNonNull(trust);
            return this;
        }
        public VirtualGatewaySpecListenerTlsValidation build() {
            final var o = new VirtualGatewaySpecListenerTlsValidation();
            o.subjectAlternativeNames = subjectAlternativeNames;
            o.trust = trust;
            return o;
        }
    }
}
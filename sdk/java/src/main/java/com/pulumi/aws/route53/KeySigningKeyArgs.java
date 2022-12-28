// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeySigningKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeySigningKeyArgs Empty = new KeySigningKeyArgs();

    /**
     * Identifier of the Route 53 Hosted Zone.
     * 
     */
    @Import(name="hostedZoneId", required=true)
    private Output<String> hostedZoneId;

    /**
     * @return Identifier of the Route 53 Hosted Zone.
     * 
     */
    public Output<String> hostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
     * 
     */
    @Import(name="keyManagementServiceArn", required=true)
    private Output<String> keyManagementServiceArn;

    /**
     * @return Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
     * 
     */
    public Output<String> keyManagementServiceArn() {
        return this.keyManagementServiceArn;
    }

    /**
     * Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private KeySigningKeyArgs() {}

    private KeySigningKeyArgs(KeySigningKeyArgs $) {
        this.hostedZoneId = $.hostedZoneId;
        this.keyManagementServiceArn = $.keyManagementServiceArn;
        this.name = $.name;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeySigningKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeySigningKeyArgs $;

        public Builder() {
            $ = new KeySigningKeyArgs();
        }

        public Builder(KeySigningKeyArgs defaults) {
            $ = new KeySigningKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostedZoneId Identifier of the Route 53 Hosted Zone.
         * 
         * @return builder
         * 
         */
        public Builder hostedZoneId(Output<String> hostedZoneId) {
            $.hostedZoneId = hostedZoneId;
            return this;
        }

        /**
         * @param hostedZoneId Identifier of the Route 53 Hosted Zone.
         * 
         * @return builder
         * 
         */
        public Builder hostedZoneId(String hostedZoneId) {
            return hostedZoneId(Output.of(hostedZoneId));
        }

        /**
         * @param keyManagementServiceArn Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
         * 
         * @return builder
         * 
         */
        public Builder keyManagementServiceArn(Output<String> keyManagementServiceArn) {
            $.keyManagementServiceArn = keyManagementServiceArn;
            return this;
        }

        /**
         * @param keyManagementServiceArn Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
         * 
         * @return builder
         * 
         */
        public Builder keyManagementServiceArn(String keyManagementServiceArn) {
            return keyManagementServiceArn(Output.of(keyManagementServiceArn));
        }

        /**
         * @param name Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param status Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public KeySigningKeyArgs build() {
            $.hostedZoneId = Objects.requireNonNull($.hostedZoneId, "expected parameter 'hostedZoneId' to be non-null");
            $.keyManagementServiceArn = Objects.requireNonNull($.keyManagementServiceArn, "expected parameter 'keyManagementServiceArn' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InboundConnectionAccepterArgs extends com.pulumi.resources.ResourceArgs {

    public static final InboundConnectionAccepterArgs Empty = new InboundConnectionAccepterArgs();

    /**
     * Specifies the ID of the connection to accept.
     * 
     */
    @Import(name="connectionId", required=true)
    private Output<String> connectionId;

    /**
     * @return Specifies the ID of the connection to accept.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }

    private InboundConnectionAccepterArgs() {}

    private InboundConnectionAccepterArgs(InboundConnectionAccepterArgs $) {
        this.connectionId = $.connectionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InboundConnectionAccepterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InboundConnectionAccepterArgs $;

        public Builder() {
            $ = new InboundConnectionAccepterArgs();
        }

        public Builder(InboundConnectionAccepterArgs defaults) {
            $ = new InboundConnectionAccepterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionId Specifies the ID of the connection to accept.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId Specifies the ID of the connection to accept.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        public InboundConnectionAccepterArgs build() {
            $.connectionId = Objects.requireNonNull($.connectionId, "expected parameter 'connectionId' to be non-null");
            return $;
        }
    }

}
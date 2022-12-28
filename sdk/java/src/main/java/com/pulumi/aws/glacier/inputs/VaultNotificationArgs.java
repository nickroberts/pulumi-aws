// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glacier.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VaultNotificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VaultNotificationArgs Empty = new VaultNotificationArgs();

    /**
     * You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
     * 
     */
    @Import(name="events", required=true)
    private Output<List<String>> events;

    /**
     * @return You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
     * 
     */
    public Output<List<String>> events() {
        return this.events;
    }

    /**
     * The SNS Topic ARN.
     * 
     */
    @Import(name="snsTopic", required=true)
    private Output<String> snsTopic;

    /**
     * @return The SNS Topic ARN.
     * 
     */
    public Output<String> snsTopic() {
        return this.snsTopic;
    }

    private VaultNotificationArgs() {}

    private VaultNotificationArgs(VaultNotificationArgs $) {
        this.events = $.events;
        this.snsTopic = $.snsTopic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VaultNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VaultNotificationArgs $;

        public Builder() {
            $ = new VaultNotificationArgs();
        }

        public Builder(VaultNotificationArgs defaults) {
            $ = new VaultNotificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param events You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
         * 
         * @return builder
         * 
         */
        public Builder events(Output<List<String>> events) {
            $.events = events;
            return this;
        }

        /**
         * @param events You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
         * 
         * @return builder
         * 
         */
        public Builder events(List<String> events) {
            return events(Output.of(events));
        }

        /**
         * @param events You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
         * 
         * @return builder
         * 
         */
        public Builder events(String... events) {
            return events(List.of(events));
        }

        /**
         * @param snsTopic The SNS Topic ARN.
         * 
         * @return builder
         * 
         */
        public Builder snsTopic(Output<String> snsTopic) {
            $.snsTopic = snsTopic;
            return this;
        }

        /**
         * @param snsTopic The SNS Topic ARN.
         * 
         * @return builder
         * 
         */
        public Builder snsTopic(String snsTopic) {
            return snsTopic(Output.of(snsTopic));
        }

        public VaultNotificationArgs build() {
            $.events = Objects.requireNonNull($.events, "expected parameter 'events' to be non-null");
            $.snsTopic = Objects.requireNonNull($.snsTopic, "expected parameter 'snsTopic' to be non-null");
            return $;
        }
    }

}
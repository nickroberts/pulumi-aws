// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.aws.lex.inputs.BotAliasConversationLogsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BotAliasState extends com.pulumi.resources.ResourceArgs {

    public static final BotAliasState Empty = new BotAliasState();

    /**
     * The ARN of the bot alias.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the bot alias.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name of the bot.
     * 
     */
    @Import(name="botName")
    private @Nullable Output<String> botName;

    /**
     * @return The name of the bot.
     * 
     */
    public Optional<Output<String>> botName() {
        return Optional.ofNullable(this.botName);
    }

    /**
     * The name of the bot.
     * 
     */
    @Import(name="botVersion")
    private @Nullable Output<String> botVersion;

    /**
     * @return The name of the bot.
     * 
     */
    public Optional<Output<String>> botVersion() {
        return Optional.ofNullable(this.botVersion);
    }

    /**
     * Checksum of the bot alias.
     * 
     */
    @Import(name="checksum")
    private @Nullable Output<String> checksum;

    /**
     * @return Checksum of the bot alias.
     * 
     */
    public Optional<Output<String>> checksum() {
        return Optional.ofNullable(this.checksum);
    }

    /**
     * The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
     * 
     */
    @Import(name="conversationLogs")
    private @Nullable Output<BotAliasConversationLogsArgs> conversationLogs;

    /**
     * @return The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
     * 
     */
    public Optional<Output<BotAliasConversationLogsArgs>> conversationLogs() {
        return Optional.ofNullable(this.conversationLogs);
    }

    /**
     * The date that the bot alias was created.
     * 
     */
    @Import(name="createdDate")
    private @Nullable Output<String> createdDate;

    /**
     * @return The date that the bot alias was created.
     * 
     */
    public Optional<Output<String>> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }

    /**
     * A description of the alias. Must be less than or equal to 200 characters in length.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the alias. Must be less than or equal to 200 characters in length.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
     * 
     */
    @Import(name="lastUpdatedDate")
    private @Nullable Output<String> lastUpdatedDate;

    /**
     * @return The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
     * 
     */
    public Optional<Output<String>> lastUpdatedDate() {
        return Optional.ofNullable(this.lastUpdatedDate);
    }

    /**
     * The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private BotAliasState() {}

    private BotAliasState(BotAliasState $) {
        this.arn = $.arn;
        this.botName = $.botName;
        this.botVersion = $.botVersion;
        this.checksum = $.checksum;
        this.conversationLogs = $.conversationLogs;
        this.createdDate = $.createdDate;
        this.description = $.description;
        this.lastUpdatedDate = $.lastUpdatedDate;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotAliasState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasState $;

        public Builder() {
            $ = new BotAliasState();
        }

        public Builder(BotAliasState defaults) {
            $ = new BotAliasState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the bot alias.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the bot alias.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param botName The name of the bot.
         * 
         * @return builder
         * 
         */
        public Builder botName(@Nullable Output<String> botName) {
            $.botName = botName;
            return this;
        }

        /**
         * @param botName The name of the bot.
         * 
         * @return builder
         * 
         */
        public Builder botName(String botName) {
            return botName(Output.of(botName));
        }

        /**
         * @param botVersion The name of the bot.
         * 
         * @return builder
         * 
         */
        public Builder botVersion(@Nullable Output<String> botVersion) {
            $.botVersion = botVersion;
            return this;
        }

        /**
         * @param botVersion The name of the bot.
         * 
         * @return builder
         * 
         */
        public Builder botVersion(String botVersion) {
            return botVersion(Output.of(botVersion));
        }

        /**
         * @param checksum Checksum of the bot alias.
         * 
         * @return builder
         * 
         */
        public Builder checksum(@Nullable Output<String> checksum) {
            $.checksum = checksum;
            return this;
        }

        /**
         * @param checksum Checksum of the bot alias.
         * 
         * @return builder
         * 
         */
        public Builder checksum(String checksum) {
            return checksum(Output.of(checksum));
        }

        /**
         * @param conversationLogs The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
         * 
         * @return builder
         * 
         */
        public Builder conversationLogs(@Nullable Output<BotAliasConversationLogsArgs> conversationLogs) {
            $.conversationLogs = conversationLogs;
            return this;
        }

        /**
         * @param conversationLogs The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
         * 
         * @return builder
         * 
         */
        public Builder conversationLogs(BotAliasConversationLogsArgs conversationLogs) {
            return conversationLogs(Output.of(conversationLogs));
        }

        /**
         * @param createdDate The date that the bot alias was created.
         * 
         * @return builder
         * 
         */
        public Builder createdDate(@Nullable Output<String> createdDate) {
            $.createdDate = createdDate;
            return this;
        }

        /**
         * @param createdDate The date that the bot alias was created.
         * 
         * @return builder
         * 
         */
        public Builder createdDate(String createdDate) {
            return createdDate(Output.of(createdDate));
        }

        /**
         * @param description A description of the alias. Must be less than or equal to 200 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the alias. Must be less than or equal to 200 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param lastUpdatedDate The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedDate(@Nullable Output<String> lastUpdatedDate) {
            $.lastUpdatedDate = lastUpdatedDate;
            return this;
        }

        /**
         * @param lastUpdatedDate The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedDate(String lastUpdatedDate) {
            return lastUpdatedDate(Output.of(lastUpdatedDate));
        }

        /**
         * @param name The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public BotAliasState build() {
            return $;
        }
    }

}
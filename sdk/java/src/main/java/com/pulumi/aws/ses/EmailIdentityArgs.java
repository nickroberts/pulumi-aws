// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EmailIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final EmailIdentityArgs Empty = new EmailIdentityArgs();

    /**
     * The email address to assign to SES.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The email address to assign to SES.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    private EmailIdentityArgs() {}

    private EmailIdentityArgs(EmailIdentityArgs $) {
        this.email = $.email;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailIdentityArgs $;

        public Builder() {
            $ = new EmailIdentityArgs();
        }

        public Builder(EmailIdentityArgs defaults) {
            $ = new EmailIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email The email address to assign to SES.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email address to assign to SES.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        public EmailIdentityArgs build() {
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkspaceLoggingConfiguration {
    /**
     * @return The ARN of the CloudWatch log group to which the vended log data will be published. This log group must exist.
     * 
     */
    private String logGroupArn;

    private WorkspaceLoggingConfiguration() {}
    /**
     * @return The ARN of the CloudWatch log group to which the vended log data will be published. This log group must exist.
     * 
     */
    public String logGroupArn() {
        return this.logGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceLoggingConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String logGroupArn;
        public Builder() {}
        public Builder(WorkspaceLoggingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupArn = defaults.logGroupArn;
        }

        @CustomType.Setter
        public Builder logGroupArn(String logGroupArn) {
            this.logGroupArn = Objects.requireNonNull(logGroupArn);
            return this;
        }
        public WorkspaceLoggingConfiguration build() {
            final var o = new WorkspaceLoggingConfiguration();
            o.logGroupArn = logGroupArn;
            return o;
        }
    }
}
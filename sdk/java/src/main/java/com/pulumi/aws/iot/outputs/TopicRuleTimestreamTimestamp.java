// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TopicRuleTimestreamTimestamp {
    /**
     * @return The precision of the timestamp value that results from the expression described in value. Valid values: `SECONDS`, `MILLISECONDS`, `MICROSECONDS`, `NANOSECONDS`.
     * 
     */
    private String unit;
    /**
     * @return The value of the HTTP header.
     * 
     */
    private String value;

    private TopicRuleTimestreamTimestamp() {}
    /**
     * @return The precision of the timestamp value that results from the expression described in value. Valid values: `SECONDS`, `MILLISECONDS`, `MICROSECONDS`, `NANOSECONDS`.
     * 
     */
    public String unit() {
        return this.unit;
    }
    /**
     * @return The value of the HTTP header.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleTimestreamTimestamp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String unit;
        private String value;
        public Builder() {}
        public Builder(TopicRuleTimestreamTimestamp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder unit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public TopicRuleTimestreamTimestamp build() {
            final var o = new TopicRuleTimestreamTimestamp();
            o.unit = unit;
            o.value = value;
            return o;
        }
    }
}
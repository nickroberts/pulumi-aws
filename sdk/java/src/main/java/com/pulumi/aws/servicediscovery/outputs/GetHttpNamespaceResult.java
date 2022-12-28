// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetHttpNamespaceResult {
    /**
     * @return ARN that Amazon Route 53 assigns to the namespace when you create it.
     * 
     */
    private String arn;
    /**
     * @return Description that you specify for the namespace when you create it.
     * 
     */
    private String description;
    /**
     * @return Name of an HTTP namespace.
     * 
     */
    private String httpName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    /**
     * @return Map of tags for the resource.
     * 
     */
    private Map<String,String> tags;

    private GetHttpNamespaceResult() {}
    /**
     * @return ARN that Amazon Route 53 assigns to the namespace when you create it.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Description that you specify for the namespace when you create it.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Name of an HTTP namespace.
     * 
     */
    public String httpName() {
        return this.httpName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Map of tags for the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHttpNamespaceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String description;
        private String httpName;
        private String id;
        private String name;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetHttpNamespaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.httpName = defaults.httpName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder httpName(String httpName) {
            this.httpName = Objects.requireNonNull(httpName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetHttpNamespaceResult build() {
            final var o = new GetHttpNamespaceResult();
            o.arn = arn;
            o.description = description;
            o.httpName = httpName;
            o.id = id;
            o.name = name;
            o.tags = tags;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.outputs;

import com.pulumi.aws.lambda.outputs.GetFunctionUrlCor;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFunctionUrlResult {
    /**
     * @return Type of authentication that the function URL uses.
     * 
     */
    private String authorizationType;
    /**
     * @return The [cross-origin resource sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) settings for the function URL. See the `aws.lambda.FunctionUrl` resource documentation for more details.
     * 
     */
    private List<GetFunctionUrlCor> cors;
    /**
     * @return When the function URL was created, in [ISO-8601 format](https://www.w3.org/TR/NOTE-datetime).
     * 
     */
    private String creationTime;
    /**
     * @return ARN of the function.
     * 
     */
    private String functionArn;
    private String functionName;
    /**
     * @return HTTP URL endpoint for the function in the format `https://&lt;url_id&gt;.lambda-url.&lt;region&gt;.on.aws`.
     * 
     */
    private String functionUrl;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return When the function URL configuration was last updated, in [ISO-8601 format](https://www.w3.org/TR/NOTE-datetime).
     * 
     */
    private String lastModifiedTime;
    private @Nullable String qualifier;
    /**
     * @return Generated ID for the endpoint.
     * 
     */
    private String urlId;

    private GetFunctionUrlResult() {}
    /**
     * @return Type of authentication that the function URL uses.
     * 
     */
    public String authorizationType() {
        return this.authorizationType;
    }
    /**
     * @return The [cross-origin resource sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) settings for the function URL. See the `aws.lambda.FunctionUrl` resource documentation for more details.
     * 
     */
    public List<GetFunctionUrlCor> cors() {
        return this.cors;
    }
    /**
     * @return When the function URL was created, in [ISO-8601 format](https://www.w3.org/TR/NOTE-datetime).
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return ARN of the function.
     * 
     */
    public String functionArn() {
        return this.functionArn;
    }
    public String functionName() {
        return this.functionName;
    }
    /**
     * @return HTTP URL endpoint for the function in the format `https://&lt;url_id&gt;.lambda-url.&lt;region&gt;.on.aws`.
     * 
     */
    public String functionUrl() {
        return this.functionUrl;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return When the function URL configuration was last updated, in [ISO-8601 format](https://www.w3.org/TR/NOTE-datetime).
     * 
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    public Optional<String> qualifier() {
        return Optional.ofNullable(this.qualifier);
    }
    /**
     * @return Generated ID for the endpoint.
     * 
     */
    public String urlId() {
        return this.urlId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionUrlResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authorizationType;
        private List<GetFunctionUrlCor> cors;
        private String creationTime;
        private String functionArn;
        private String functionName;
        private String functionUrl;
        private String id;
        private String lastModifiedTime;
        private @Nullable String qualifier;
        private String urlId;
        public Builder() {}
        public Builder(GetFunctionUrlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationType = defaults.authorizationType;
    	      this.cors = defaults.cors;
    	      this.creationTime = defaults.creationTime;
    	      this.functionArn = defaults.functionArn;
    	      this.functionName = defaults.functionName;
    	      this.functionUrl = defaults.functionUrl;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.qualifier = defaults.qualifier;
    	      this.urlId = defaults.urlId;
        }

        @CustomType.Setter
        public Builder authorizationType(String authorizationType) {
            this.authorizationType = Objects.requireNonNull(authorizationType);
            return this;
        }
        @CustomType.Setter
        public Builder cors(List<GetFunctionUrlCor> cors) {
            this.cors = Objects.requireNonNull(cors);
            return this;
        }
        public Builder cors(GetFunctionUrlCor... cors) {
            return cors(List.of(cors));
        }
        @CustomType.Setter
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        @CustomType.Setter
        public Builder functionArn(String functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }
        @CustomType.Setter
        public Builder functionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }
        @CustomType.Setter
        public Builder functionUrl(String functionUrl) {
            this.functionUrl = Objects.requireNonNull(functionUrl);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        @CustomType.Setter
        public Builder qualifier(@Nullable String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        @CustomType.Setter
        public Builder urlId(String urlId) {
            this.urlId = Objects.requireNonNull(urlId);
            return this;
        }
        public GetFunctionUrlResult build() {
            final var o = new GetFunctionUrlResult();
            o.authorizationType = authorizationType;
            o.cors = cors;
            o.creationTime = creationTime;
            o.functionArn = functionArn;
            o.functionName = functionName;
            o.functionUrl = functionUrl;
            o.id = id;
            o.lastModifiedTime = lastModifiedTime;
            o.qualifier = qualifier;
            o.urlId = urlId;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigateway.AuthorizerArgs;
import com.pulumi.aws.apigateway.inputs.AuthorizerState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an API Gateway Authorizer.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigateway.RestApi;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.lambda.Function;
 * import com.pulumi.aws.lambda.FunctionArgs;
 * import com.pulumi.aws.apigateway.Authorizer;
 * import com.pulumi.aws.apigateway.AuthorizerArgs;
 * import com.pulumi.aws.iam.RolePolicy;
 * import com.pulumi.aws.iam.RolePolicyArgs;
 * import com.pulumi.asset.FileArchive;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var demoRestApi = new RestApi(&#34;demoRestApi&#34;);
 * 
 *         var invocationRole = new Role(&#34;invocationRole&#34;, RoleArgs.builder()        
 *             .path(&#34;/&#34;)
 *             .assumeRolePolicy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Action&#34;: &#34;sts:AssumeRole&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;Service&#34;: &#34;apigateway.amazonaws.com&#34;
 *       },
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Sid&#34;: &#34;&#34;
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var lambda = new Role(&#34;lambda&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Action&#34;: &#34;sts:AssumeRole&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;Service&#34;: &#34;lambda.amazonaws.com&#34;
 *       },
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Sid&#34;: &#34;&#34;
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var authorizer = new Function(&#34;authorizer&#34;, FunctionArgs.builder()        
 *             .code(new FileArchive(&#34;lambda-function.zip&#34;))
 *             .role(lambda.arn())
 *             .handler(&#34;exports.example&#34;)
 *             .build());
 * 
 *         var demoAuthorizer = new Authorizer(&#34;demoAuthorizer&#34;, AuthorizerArgs.builder()        
 *             .restApi(demoRestApi.id())
 *             .authorizerUri(authorizer.invokeArn())
 *             .authorizerCredentials(invocationRole.arn())
 *             .build());
 * 
 *         var invocationPolicy = new RolePolicy(&#34;invocationPolicy&#34;, RolePolicyArgs.builder()        
 *             .role(invocationRole.id())
 *             .policy(authorizer.arn().applyValue(arn -&gt; &#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Action&#34;: &#34;lambda:InvokeFunction&#34;,
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Resource&#34;: &#34;%s&#34;
 *     }
 *   ]
 * }
 * &#34;, arn)))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * AWS API Gateway Authorizer can be imported using the `REST-API-ID/AUTHORIZER-ID`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/authorizer:Authorizer authorizer 12345abcde/example
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/authorizer:Authorizer")
public class Authorizer extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the API Gateway Authorizer
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the API Gateway Authorizer
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
     * 
     */
    @Export(name="authorizerCredentials", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authorizerCredentials;

    /**
     * @return Credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
     * 
     */
    public Output<Optional<String>> authorizerCredentials() {
        return Codegen.optional(this.authorizerCredentials);
    }
    /**
     * TTL of cached authorizer results in seconds. Defaults to `300`.
     * 
     */
    @Export(name="authorizerResultTtlInSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> authorizerResultTtlInSeconds;

    /**
     * @return TTL of cached authorizer results in seconds. Defaults to `300`.
     * 
     */
    public Output<Optional<Integer>> authorizerResultTtlInSeconds() {
        return Codegen.optional(this.authorizerResultTtlInSeconds);
    }
    /**
     * Authorizer&#39;s Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
     * e.g., `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
     * 
     */
    @Export(name="authorizerUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authorizerUri;

    /**
     * @return Authorizer&#39;s Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
     * e.g., `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
     * 
     */
    public Output<Optional<String>> authorizerUri() {
        return Codegen.optional(this.authorizerUri);
    }
    /**
     * Source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g., `&#34;method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName&#34;`
     * 
     */
    @Export(name="identitySource", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> identitySource;

    /**
     * @return Source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g., `&#34;method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName&#34;`
     * 
     */
    public Output<Optional<String>> identitySource() {
        return Codegen.optional(this.identitySource);
    }
    /**
     * Validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn&#39;t match, the client receives a 401 Unauthorized response.
     * 
     */
    @Export(name="identityValidationExpression", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> identityValidationExpression;

    /**
     * @return Validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn&#39;t match, the client receives a 401 Unauthorized response.
     * 
     */
    public Output<Optional<String>> identityValidationExpression() {
        return Codegen.optional(this.identityValidationExpression);
    }
    /**
     * Name of the authorizer
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the authorizer
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
     * 
     */
    @Export(name="providerArns", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> providerArns;

    /**
     * @return List of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
     * 
     */
    public Output<Optional<List<String>>> providerArns() {
        return Codegen.optional(this.providerArns);
    }
    /**
     * ID of the associated REST API
     * 
     */
    @Export(name="restApi", refs={String.class}, tree="[0]")
    private Output<String> restApi;

    /**
     * @return ID of the associated REST API
     * 
     */
    public Output<String> restApi() {
        return this.restApi;
    }
    /**
     * Type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return Type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Authorizer(String name) {
        this(name, AuthorizerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Authorizer(String name, AuthorizerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Authorizer(String name, AuthorizerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/authorizer:Authorizer", name, args == null ? AuthorizerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Authorizer(String name, Output<String> id, @Nullable AuthorizerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/authorizer:Authorizer", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Authorizer get(String name, Output<String> id, @Nullable AuthorizerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Authorizer(name, id, state, options);
    }
}
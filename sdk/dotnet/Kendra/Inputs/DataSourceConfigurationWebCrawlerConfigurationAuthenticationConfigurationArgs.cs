// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kendra.Inputs
{

    public sealed class DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationArgs : global::Pulumi.ResourceArgs
    {
        [Input("basicAuthentications")]
        private InputList<Inputs.DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs>? _basicAuthentications;

        /// <summary>
        /// The list of configuration information that's required to connect to and crawl a website host using basic authentication credentials. The list includes the name and port number of the website host. Detailed below.
        /// </summary>
        public InputList<Inputs.DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs> BasicAuthentications
        {
            get => _basicAuthentications ?? (_basicAuthentications = new InputList<Inputs.DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs>());
            set => _basicAuthentications = value;
        }

        public DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationArgs()
        {
        }
        public static new DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationArgs Empty => new DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationArgs();
    }
}
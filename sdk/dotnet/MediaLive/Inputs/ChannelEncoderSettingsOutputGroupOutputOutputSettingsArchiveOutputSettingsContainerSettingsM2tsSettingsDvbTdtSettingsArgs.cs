// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbTdtSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("repInterval")]
        public Input<int>? RepInterval { get; set; }

        public ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbTdtSettingsArgs()
        {
        }
        public static new ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbTdtSettingsArgs Empty => new ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbTdtSettingsArgs();
    }
}
# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'TrustAnchorSource',
    'TrustAnchorSourceSourceData',
]

@pulumi.output_type
class TrustAnchorSource(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "sourceData":
            suggest = "source_data"
        elif key == "sourceType":
            suggest = "source_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in TrustAnchorSource. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        TrustAnchorSource.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        TrustAnchorSource.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 source_data: 'outputs.TrustAnchorSourceSourceData',
                 source_type: str):
        """
        :param 'TrustAnchorSourceSourceDataArgs' source_data: The data denoting the source of trust, documented below
        :param str source_type: The type of the source of trust. Must be either `AWS_ACM_PCA` or `CERTIFICATE_BUNDLE`.
        """
        pulumi.set(__self__, "source_data", source_data)
        pulumi.set(__self__, "source_type", source_type)

    @property
    @pulumi.getter(name="sourceData")
    def source_data(self) -> 'outputs.TrustAnchorSourceSourceData':
        """
        The data denoting the source of trust, documented below
        """
        return pulumi.get(self, "source_data")

    @property
    @pulumi.getter(name="sourceType")
    def source_type(self) -> str:
        """
        The type of the source of trust. Must be either `AWS_ACM_PCA` or `CERTIFICATE_BUNDLE`.
        """
        return pulumi.get(self, "source_type")


@pulumi.output_type
class TrustAnchorSourceSourceData(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "acmPcaArn":
            suggest = "acm_pca_arn"
        elif key == "x509CertificateData":
            suggest = "x509_certificate_data"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in TrustAnchorSourceSourceData. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        TrustAnchorSourceSourceData.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        TrustAnchorSourceSourceData.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 acm_pca_arn: Optional[str] = None,
                 x509_certificate_data: Optional[str] = None):
        """
        :param str acm_pca_arn: The ARN of an ACM Private Certificate Authority.
        """
        if acm_pca_arn is not None:
            pulumi.set(__self__, "acm_pca_arn", acm_pca_arn)
        if x509_certificate_data is not None:
            pulumi.set(__self__, "x509_certificate_data", x509_certificate_data)

    @property
    @pulumi.getter(name="acmPcaArn")
    def acm_pca_arn(self) -> Optional[str]:
        """
        The ARN of an ACM Private Certificate Authority.
        """
        return pulumi.get(self, "acm_pca_arn")

    @property
    @pulumi.getter(name="x509CertificateData")
    def x509_certificate_data(self) -> Optional[str]:
        return pulumi.get(self, "x509_certificate_data")


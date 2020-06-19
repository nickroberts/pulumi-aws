# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetAccessPointResult:
    """
    A collection of values returned by getAccessPoint.
    """
    def __init__(__self__, access_point_id=None, arn=None, file_system_arn=None, file_system_id=None, id=None, owner_id=None, posix_users=None, root_directories=None, tags=None):
        if access_point_id and not isinstance(access_point_id, str):
            raise TypeError("Expected argument 'access_point_id' to be a str")
        __self__.access_point_id = access_point_id
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        __self__.arn = arn
        """
        Amazon Resource Name of the file system.
        """
        if file_system_arn and not isinstance(file_system_arn, str):
            raise TypeError("Expected argument 'file_system_arn' to be a str")
        __self__.file_system_arn = file_system_arn
        """
        Amazon Resource Name of the file system.
        """
        if file_system_id and not isinstance(file_system_id, str):
            raise TypeError("Expected argument 'file_system_id' to be a str")
        __self__.file_system_id = file_system_id
        """
        The ID of the file system for which the access point is intended.
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if owner_id and not isinstance(owner_id, str):
            raise TypeError("Expected argument 'owner_id' to be a str")
        __self__.owner_id = owner_id
        if posix_users and not isinstance(posix_users, list):
            raise TypeError("Expected argument 'posix_users' to be a list")
        __self__.posix_users = posix_users
        """
        Single element list containing operating system user and group applied to all file system requests made using the access point.
        """
        if root_directories and not isinstance(root_directories, list):
            raise TypeError("Expected argument 'root_directories' to be a list")
        __self__.root_directories = root_directories
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        __self__.tags = tags
        """
        Key-value mapping of resource tags.
        """
class AwaitableGetAccessPointResult(GetAccessPointResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccessPointResult(
            access_point_id=self.access_point_id,
            arn=self.arn,
            file_system_arn=self.file_system_arn,
            file_system_id=self.file_system_id,
            id=self.id,
            owner_id=self.owner_id,
            posix_users=self.posix_users,
            root_directories=self.root_directories,
            tags=self.tags)

def get_access_point(access_point_id=None,tags=None,opts=None):
    """
    Provides information about an Elastic File System (EFS) Access Point.

    ## Example Usage



    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.efs.get_access_point(access_point_id="fsap-12345678")
    ```


    :param str access_point_id: The ID that identifies the file system.
    :param dict tags: Key-value mapping of resource tags.
    """
    __args__ = dict()


    __args__['accessPointId'] = access_point_id
    __args__['tags'] = tags
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:efs/getAccessPoint:getAccessPoint', __args__, opts=opts).value

    return AwaitableGetAccessPointResult(
        access_point_id=__ret__.get('accessPointId'),
        arn=__ret__.get('arn'),
        file_system_arn=__ret__.get('fileSystemArn'),
        file_system_id=__ret__.get('fileSystemId'),
        id=__ret__.get('id'),
        owner_id=__ret__.get('ownerId'),
        posix_users=__ret__.get('posixUsers'),
        root_directories=__ret__.get('rootDirectories'),
        tags=__ret__.get('tags'))
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.outputs;

import com.pulumi.aws.guardduty.outputs.OrganizationConfigurationDatasourcesKubernetesAuditLogs;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class OrganizationConfigurationDatasourcesKubernetes {
    /**
     * @return Enable Kubernetes Audit Logs Monitoring automatically for new member accounts. [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
     * See Kubernetes Audit Logs below for more details.
     * 
     */
    private OrganizationConfigurationDatasourcesKubernetesAuditLogs auditLogs;

    private OrganizationConfigurationDatasourcesKubernetes() {}
    /**
     * @return Enable Kubernetes Audit Logs Monitoring automatically for new member accounts. [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
     * See Kubernetes Audit Logs below for more details.
     * 
     */
    public OrganizationConfigurationDatasourcesKubernetesAuditLogs auditLogs() {
        return this.auditLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConfigurationDatasourcesKubernetes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private OrganizationConfigurationDatasourcesKubernetesAuditLogs auditLogs;
        public Builder() {}
        public Builder(OrganizationConfigurationDatasourcesKubernetes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogs = defaults.auditLogs;
        }

        @CustomType.Setter
        public Builder auditLogs(OrganizationConfigurationDatasourcesKubernetesAuditLogs auditLogs) {
            this.auditLogs = Objects.requireNonNull(auditLogs);
            return this;
        }
        public OrganizationConfigurationDatasourcesKubernetes build() {
            final var o = new OrganizationConfigurationDatasourcesKubernetes();
            o.auditLogs = auditLogs;
            return o;
        }
    }
}
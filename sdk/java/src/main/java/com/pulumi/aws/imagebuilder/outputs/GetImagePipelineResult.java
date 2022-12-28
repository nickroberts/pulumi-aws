// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.aws.imagebuilder.outputs.GetImagePipelineImageTestsConfiguration;
import com.pulumi.aws.imagebuilder.outputs.GetImagePipelineSchedule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetImagePipelineResult {
    private String arn;
    /**
     * @return ARN of the container recipe.
     * 
     */
    private String containerRecipeArn;
    /**
     * @return Date the image pipeline was created.
     * 
     */
    private String dateCreated;
    /**
     * @return Date the image pipeline was last run.
     * 
     */
    private String dateLastRun;
    /**
     * @return Date the image pipeline will run next.
     * 
     */
    private String dateNextRun;
    /**
     * @return Date the image pipeline was updated.
     * 
     */
    private String dateUpdated;
    /**
     * @return Description of the image pipeline.
     * 
     */
    private String description;
    /**
     * @return ARN of the Image Builder Distribution Configuration.
     * 
     */
    private String distributionConfigurationArn;
    /**
     * @return Whether additional information about the image being created is collected.
     * 
     */
    private Boolean enhancedImageMetadataEnabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return ARN of the image recipe.
     * 
     */
    private String imageRecipeArn;
    /**
     * @return List of an object with image tests configuration.
     * 
     */
    private List<GetImagePipelineImageTestsConfiguration> imageTestsConfigurations;
    /**
     * @return ARN of the Image Builder Infrastructure Configuration.
     * 
     */
    private String infrastructureConfigurationArn;
    /**
     * @return Name of the image pipeline.
     * 
     */
    private String name;
    /**
     * @return Platform of the image pipeline.
     * 
     */
    private String platform;
    /**
     * @return List of an object with schedule settings.
     * 
     */
    private List<GetImagePipelineSchedule> schedules;
    /**
     * @return Status of the image pipeline.
     * 
     */
    private String status;
    /**
     * @return Key-value map of resource tags for the image pipeline.
     * 
     */
    private Map<String,String> tags;

    private GetImagePipelineResult() {}
    public String arn() {
        return this.arn;
    }
    /**
     * @return ARN of the container recipe.
     * 
     */
    public String containerRecipeArn() {
        return this.containerRecipeArn;
    }
    /**
     * @return Date the image pipeline was created.
     * 
     */
    public String dateCreated() {
        return this.dateCreated;
    }
    /**
     * @return Date the image pipeline was last run.
     * 
     */
    public String dateLastRun() {
        return this.dateLastRun;
    }
    /**
     * @return Date the image pipeline will run next.
     * 
     */
    public String dateNextRun() {
        return this.dateNextRun;
    }
    /**
     * @return Date the image pipeline was updated.
     * 
     */
    public String dateUpdated() {
        return this.dateUpdated;
    }
    /**
     * @return Description of the image pipeline.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return ARN of the Image Builder Distribution Configuration.
     * 
     */
    public String distributionConfigurationArn() {
        return this.distributionConfigurationArn;
    }
    /**
     * @return Whether additional information about the image being created is collected.
     * 
     */
    public Boolean enhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return ARN of the image recipe.
     * 
     */
    public String imageRecipeArn() {
        return this.imageRecipeArn;
    }
    /**
     * @return List of an object with image tests configuration.
     * 
     */
    public List<GetImagePipelineImageTestsConfiguration> imageTestsConfigurations() {
        return this.imageTestsConfigurations;
    }
    /**
     * @return ARN of the Image Builder Infrastructure Configuration.
     * 
     */
    public String infrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }
    /**
     * @return Name of the image pipeline.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Platform of the image pipeline.
     * 
     */
    public String platform() {
        return this.platform;
    }
    /**
     * @return List of an object with schedule settings.
     * 
     */
    public List<GetImagePipelineSchedule> schedules() {
        return this.schedules;
    }
    /**
     * @return Status of the image pipeline.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Key-value map of resource tags for the image pipeline.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagePipelineResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String containerRecipeArn;
        private String dateCreated;
        private String dateLastRun;
        private String dateNextRun;
        private String dateUpdated;
        private String description;
        private String distributionConfigurationArn;
        private Boolean enhancedImageMetadataEnabled;
        private String id;
        private String imageRecipeArn;
        private List<GetImagePipelineImageTestsConfiguration> imageTestsConfigurations;
        private String infrastructureConfigurationArn;
        private String name;
        private String platform;
        private List<GetImagePipelineSchedule> schedules;
        private String status;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetImagePipelineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.containerRecipeArn = defaults.containerRecipeArn;
    	      this.dateCreated = defaults.dateCreated;
    	      this.dateLastRun = defaults.dateLastRun;
    	      this.dateNextRun = defaults.dateNextRun;
    	      this.dateUpdated = defaults.dateUpdated;
    	      this.description = defaults.description;
    	      this.distributionConfigurationArn = defaults.distributionConfigurationArn;
    	      this.enhancedImageMetadataEnabled = defaults.enhancedImageMetadataEnabled;
    	      this.id = defaults.id;
    	      this.imageRecipeArn = defaults.imageRecipeArn;
    	      this.imageTestsConfigurations = defaults.imageTestsConfigurations;
    	      this.infrastructureConfigurationArn = defaults.infrastructureConfigurationArn;
    	      this.name = defaults.name;
    	      this.platform = defaults.platform;
    	      this.schedules = defaults.schedules;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder containerRecipeArn(String containerRecipeArn) {
            this.containerRecipeArn = Objects.requireNonNull(containerRecipeArn);
            return this;
        }
        @CustomType.Setter
        public Builder dateCreated(String dateCreated) {
            this.dateCreated = Objects.requireNonNull(dateCreated);
            return this;
        }
        @CustomType.Setter
        public Builder dateLastRun(String dateLastRun) {
            this.dateLastRun = Objects.requireNonNull(dateLastRun);
            return this;
        }
        @CustomType.Setter
        public Builder dateNextRun(String dateNextRun) {
            this.dateNextRun = Objects.requireNonNull(dateNextRun);
            return this;
        }
        @CustomType.Setter
        public Builder dateUpdated(String dateUpdated) {
            this.dateUpdated = Objects.requireNonNull(dateUpdated);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder distributionConfigurationArn(String distributionConfigurationArn) {
            this.distributionConfigurationArn = Objects.requireNonNull(distributionConfigurationArn);
            return this;
        }
        @CustomType.Setter
        public Builder enhancedImageMetadataEnabled(Boolean enhancedImageMetadataEnabled) {
            this.enhancedImageMetadataEnabled = Objects.requireNonNull(enhancedImageMetadataEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder imageRecipeArn(String imageRecipeArn) {
            this.imageRecipeArn = Objects.requireNonNull(imageRecipeArn);
            return this;
        }
        @CustomType.Setter
        public Builder imageTestsConfigurations(List<GetImagePipelineImageTestsConfiguration> imageTestsConfigurations) {
            this.imageTestsConfigurations = Objects.requireNonNull(imageTestsConfigurations);
            return this;
        }
        public Builder imageTestsConfigurations(GetImagePipelineImageTestsConfiguration... imageTestsConfigurations) {
            return imageTestsConfigurations(List.of(imageTestsConfigurations));
        }
        @CustomType.Setter
        public Builder infrastructureConfigurationArn(String infrastructureConfigurationArn) {
            this.infrastructureConfigurationArn = Objects.requireNonNull(infrastructureConfigurationArn);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder platform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }
        @CustomType.Setter
        public Builder schedules(List<GetImagePipelineSchedule> schedules) {
            this.schedules = Objects.requireNonNull(schedules);
            return this;
        }
        public Builder schedules(GetImagePipelineSchedule... schedules) {
            return schedules(List.of(schedules));
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetImagePipelineResult build() {
            final var o = new GetImagePipelineResult();
            o.arn = arn;
            o.containerRecipeArn = containerRecipeArn;
            o.dateCreated = dateCreated;
            o.dateLastRun = dateLastRun;
            o.dateNextRun = dateNextRun;
            o.dateUpdated = dateUpdated;
            o.description = description;
            o.distributionConfigurationArn = distributionConfigurationArn;
            o.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
            o.id = id;
            o.imageRecipeArn = imageRecipeArn;
            o.imageTestsConfigurations = imageTestsConfigurations;
            o.infrastructureConfigurationArn = infrastructureConfigurationArn;
            o.name = name;
            o.platform = platform;
            o.schedules = schedules;
            o.status = status;
            o.tags = tags;
            return o;
        }
    }
}
package com.github.platan.idea.dependencies.gradle;

import com.google.common.base.Optional;

import java.util.ArrayList;
import java.util.List;

public class DependencyBuilder {
    private String group;
    private String name;
    private String version;
    private Optional<String> classifier = Optional.absent();
    private String configuration;
    private List<Exclusion> exclusions = new ArrayList<Exclusion>();
    private boolean transitive = true;

    private DependencyBuilder() {
    }

    public static DependencyBuilder aDependency(String group, String name) {
        return new DependencyBuilder().withGroup(group).withName(name);
    }

    public DependencyBuilder withGroup(String group) {
        this.group = group;
        return this;
    }

    public DependencyBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public DependencyBuilder withVersion(String version) {
        this.version = version;
        return this;
    }

    public DependencyBuilder withClassifier(Optional<String> classifier) {
        this.classifier = classifier;
        return this;
    }

    public DependencyBuilder withConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }

    public DependencyBuilder withExclusions(List<Exclusion> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    public DependencyBuilder withTransitive(boolean transitive) {
        this.transitive = transitive;
        return this;
    }

    public Dependency build() {
        Dependency dependency = new Dependency(group, name, version, classifier, configuration, exclusions, transitive);
        return dependency;
    }
}

folder('team_a') {
    displayName('team_a')
    description(null)
    authorization {
        permissions('bosun-infra-ci', [
            'hudson.model.Item.Build',
            'hudson.model.Item.Cancel',
            'hudson.model.Item.Discover',
            'hudson.model.Item.Read',
            'hudson.model.View.Read'
        ])
    }
    properties {
        // we may want to try to configure permissions inheritance here
        // https://issues.jenkins-ci.org/browse/JENKINS-49199
    }
}

folder('team_b') {
    displayName('team_b')
    description(null)
    authorization {
        permissions('andyspiers', [
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

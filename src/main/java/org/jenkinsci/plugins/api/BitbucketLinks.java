package org.jenkinsci.plugins.api;

public class BitbucketLinks {
    private BitbucketLink repositories;
    private BitbucketLink html;
    private BitbucketLink followers;
    private BitbucketLink avatar;
    private BitbucketLink following;
    private BitbucketLink self;

    public BitbucketLink getSelf() {
        return self;
    }

    public BitbucketLink getRepositories() {
        return repositories;
    }

    public BitbucketLink getHtml() {
        return html;
    }

    public BitbucketLink getFollowers() {
        return followers;
    }

    public BitbucketLink getAvatar() {
        return avatar;
    }

    public BitbucketLink getFollowing() {
        return following;
    }
}

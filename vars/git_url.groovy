#!/usr/bin/env groovy

def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}

return this 
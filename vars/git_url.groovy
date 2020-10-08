#!/usr/bin/env groovy

def checkOutFrom(repo) {
  git url: "git@github.com:tvanatha/${repo}"
}

return this 

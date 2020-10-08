#!/usr/bin/env groovy

def checkOutFrom(repo) {
  git url: "git@github.com:tvanantha/${repo}"
}

return this 
